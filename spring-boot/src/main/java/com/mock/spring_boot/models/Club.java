package com.mock.spring_boot.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "clubs") // Not necessary. Just to be a bit more explicit.
public class Club {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String photoURL;
	private String content;
	@CreationTimestamp // Will initialize the date object and assign it to the entry based on the actual time
	private LocalDateTime createdOn;
	@UpdateTimestamp // Will change the date object and assign it to the entry based on the actual time
	private LocalDateTime updatedOn;
	
	// The join column 	is the foreign key from the user. this is here because there will be many clubs, but only one user can own a club.
	// As this is the many side, we'll need a column to tie the club to the user.
	@JoinColumn(name = "created_by", nullable = false)
	@ManyToOne
	private UserEntity createdBy;
	
	@JoinColumn(name = "last_updated_by", nullable = false)
	@ManyToOne
	private UserEntity lastUpdatedBy;

	@OneToMany(mappedBy = "club", cascade = CascadeType.REMOVE)
	@Builder.Default
	private List<Event> events = new ArrayList<>();
}