package com.example.STARPAY.dto.Request;

import com.example.STARPAY.domain.AccessType;

public class RequestPortalUserManagement {

	private String firstName, lastName, mobileNumber, status, gender, companyName, fullAddress, zipcode, province, city,
			addressType;

	private AccessType portalAccess, bayaditoAccess, pdAccess, rdAccess, eMoneyServiceAccess, billPaymentAccess,
			eMoneySetLimitAccess, PortalUserHistoryAccess, walletAccess;

	public AccessType getWalletAccess() {
		return walletAccess;
	}

	public void setWalletAccess(AccessType walletAccess) {
		this.walletAccess = walletAccess;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public AccessType getPortalAccess() {
		return portalAccess;
	}

	public void setPortalAccess(AccessType portalAccess) {
		this.portalAccess = portalAccess;
	}

	public AccessType getBayaditoAccess() {
		return bayaditoAccess;
	}

	public void setBayaditoAccess(AccessType bayaditoAccess) {
		this.bayaditoAccess = bayaditoAccess;
	}

	public AccessType getPdAccess() {
		return pdAccess;
	}

	public void setPdAccess(AccessType pdAccess) {
		this.pdAccess = pdAccess;
	}

	public AccessType getRdAccess() {
		return rdAccess;
	}

	public void setRdAccess(AccessType rdAccess) {
		this.rdAccess = rdAccess;
	}

	public AccessType geteMoneyServiceAccess() {
		return eMoneyServiceAccess;
	}

	public void seteMoneyServiceAccess(AccessType eMoneyServiceAccess) {
		this.eMoneyServiceAccess = eMoneyServiceAccess;
	}

	public AccessType getBillPaymentAccess() {
		return billPaymentAccess;
	}

	public void setBillPaymentAccess(AccessType billPaymentAccess) {
		this.billPaymentAccess = billPaymentAccess;
	}

	public AccessType geteMoneySetLimitAccess() {
		return eMoneySetLimitAccess;
	}

	public void seteMoneySetLimitAccess(AccessType eMoneySetLimitAccess) {
		this.eMoneySetLimitAccess = eMoneySetLimitAccess;
	}

	public AccessType getPortalUserHistoryAccess() {
		return PortalUserHistoryAccess;
	}

	public void setPortalUserHistoryAccess(AccessType portalUserHistoryAccess) {
		PortalUserHistoryAccess = portalUserHistoryAccess;
	}

}
