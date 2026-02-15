package com.mock.spring_boot.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "users") // We specify the name to follow good practices.
public class UserEntity {
// This name because "User" is a reserved keyword in SQL, so we can't name the table "User".
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String email;
	private String password;
	// Do not use cascade ALL because we don't want to delete the roles when we delete a user.
	// As cascade propagates the operations to the entities on the persistence context.
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
			name = "user_roles",
			joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
			// It's inverse because the annotation is on the UserEntity class, so the other side is the Role class.
			// So to create the joint table, we need to specify the join columns for both sides
			// join for the side of the annotation and inverse join for the other side that doesn't have the annotation.
			inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")}
	)
	// If you don't initialize the list, you will get a NullPointerException when you try to add a role to the user.
	// Hibernate doesn't initialize the collection for you, so you need to do it yourself.
	// And every time you need to create a user, you'd need to initialize the list of roles, which is not a good practice. Code duplication.
	private List<Role> roles = new ArrayList<>();
}
