package com.mock.spring_boot.models;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	@OneToMany(mappedBy = "club", cascade = CascadeType.REMOVE)
	@Builder.Default
	private Set<Event> events = new HashSet<>();
}