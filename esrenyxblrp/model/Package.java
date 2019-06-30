package com.paypal.esrenyxblrp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "package")
public class Package {
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
    @Column(name="package_name")
    private String packageName;

    @NotBlank
    @Column(name="domain")
    private String domain;
    
    @OneToOne(targetEntity=Status.class, cascade=CascadeType.ALL)
    private Status status;
    
    @Column(name="owner_tech_lead_name")
    private String ownerTechLeadName;
    
    @Column(name="owner_manager_name")
    private String ownerManagerName;
    
    @Column(name="owner_tech_lead_email")
    private String ownerTechLeadEmail;
    
    @Column(name="owner_manager_email")
    private String ownerManagerEmail;
   
    @Column(name="blacklist_reason")
    private String blacklistReason;
    
    @Override
	public String toString() {
		return "Status [id=" + id + ", name=" + packageName + ", priority=" + priority + "]";
	}

	@NotBlank
    private int priority;

    //@Column(columnDefinition = "text")
    //private String description;
    
    // Getters and Setters (Omitted for brevity)
}