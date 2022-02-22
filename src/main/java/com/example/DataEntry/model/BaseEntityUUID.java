package com.example.DataEntry.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.mongodb.core.index.Indexed;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

	
	@Getter
	@Setter
	@MappedSuperclass
	@NoArgsConstructor
	@AllArgsConstructor
	@EntityListeners(AuditingEntityListener.class)
	public abstract class BaseEntityUUID<U> implements Serializable {

	    private static final long serialVersionUID = -4745361891080083335L;

	    @Id
	    @Audited
	    @JsonIgnore
	    @Generated(GenerationTime.INSERT)
	    @GeneratedValue(generator = "UUID")
	    @GenericGenerator(
	            name = "UUID",
	            strategy = "org.hibernate.id.UUIDGenerator"
	    )
	    @Column(name = "id", columnDefinition = "UUID", updatable = false, nullable = false, unique = true)
	    private UUID id;


	    @JsonIgnore
	    private boolean deleted = false;

	    @JsonIgnore
	    private boolean updated = false;

	    @JsonIgnore
	    private  boolean isActive = false;

	    @CreatedBy
	    private String createdByUser;

	    @Indexed
	    @CreatedDate
	    private Date creationDate = new Date();

	    @LastModifiedDate
	    private Date lastModifiedDate;

	    @LastModifiedBy
	    private String lastModifiedUserId;
	    
	 


}
