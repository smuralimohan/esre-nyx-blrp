package com.paypal.esrenyxblrp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "status")
public class Status {
    @Id
    //@GeneratedValue(generator = "question_generator")
    //@SequenceGenerator(
    //        name = "question_generator",
    //        sequenceName = "question_sequence",
    //        initialValue = 1000
    //)
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String name;

    @Override
	public String toString() {
		return "Status [id=" + id + ", name=" + name + ", priority=" + priority + "]";
	}

	@NotBlank
    private int priority;

    //@Column(columnDefinition = "text")
    //private String description;
    
    // Getters and Setters (Omitted for brevity)
}