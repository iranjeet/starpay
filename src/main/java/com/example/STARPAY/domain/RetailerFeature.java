package com.example.STARPAY.domain;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="retailerFeatures")
public class RetailerFeature {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long Id;

//	@Column(name = "FeatureId")
//	private Long FeatureId;
	
	@Column(name = "featureName")
	private String featureName;

	@Column(name = "Status")
	private String Status="Active";

	@Column(name = "createDate")
	private Timestamp createDate=new Timestamp(System.currentTimeMillis());

	@Column(name = "isActive")
	private Boolean isActive=true;
	
	@ManyToOne
	@JoinColumn(name="UserId")
	private StarPayUser starPayUser;
	
//    @OneToMany(fetch = FetchType.LAZY,  cascade = CascadeType.ALL)//mappedBy = "r_feature",
//	private Set<Assn_User_Features> assn_User_Features=new TreeSet<Assn_User_Features>();
	@Column(name = "acess", columnDefinition = "varchar(255) default 'VIEW' ")
	@Enumerated(EnumType.STRING)
	private AccessType acess;
	
	public AccessType getAcess() {
		return acess;
	}

	public void setAcess(AccessType acess) {
		this.acess = acess;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

//	public Set<Assn_User_Features> getAssn_User_Features() {
//		return assn_User_Features;
//	}
//
//	public void setAssn_User_Features(Set<Assn_User_Features> assn_User_Features) {
//		this.assn_User_Features = assn_User_Features;
//	}

//	public Long getFeatureId() {
//		return FeatureId;
//	}
//
//	public void setFeatureId(Long featureId) {
//		FeatureId = featureId;
//	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}
