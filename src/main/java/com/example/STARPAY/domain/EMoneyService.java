package com.example.STARPAY.domain;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import com.example.STARPAY.domain.AccessType;

@Entity
@Table(name = "EMoney_service")
public class EMoneyService {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long Id;
	@Column(name = "type")
	private String transactionType;

	@Column(name = "sender_no")
	private String senderNumber;
	@Column(name = "reciver_no")
	private String receiverNo;
	@Column(name = "amount")
	private Long amount;
	@Column(name = "isActive", columnDefinition = "tinyint(1) default 1")
	private Boolean isActive = true;
	@Column(name = "CanEdit", columnDefinition = "tinyint(0) default 0")
	private Boolean canEdit=false;

	@ManyToOne
	@JoinColumn(name = "UserId")
	private StarPayUser starPayUser;
	@Enumerated(EnumType.STRING)
	@Column(name = "acess_type", columnDefinition = "varchar(255) default 'VIEW'")
	private AccessType acess=AccessType.VIEW;
	
	public AccessType getAcess() {
		return acess;
	}

	public void setAcess(AccessType acess) {
		this.acess = acess;
	}

	public Boolean getCanEdit() {
		return canEdit;
	}

	public void setCanEdit(Boolean canEdit) {
		this.canEdit = canEdit;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getSenderNumber() {
		return senderNumber;
	}

	public void setSenderNumber(String senderNumber) {
		this.senderNumber = senderNumber;
	}

	public String getReceiverNo() {
		return receiverNo;
	}

	public void setReceiverNo(String receiverNo) {
		this.receiverNo = receiverNo;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public StarPayUser getStarPayUser() {
		return starPayUser;
	}

	public void setStarPayUser(StarPayUser starPayUser) {
		this.starPayUser = starPayUser;
	}

}
