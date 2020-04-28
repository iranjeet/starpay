package com.example.STARPAY.dto.Request;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RequestUserDetails {

	private String firstName, lastName, mobileNumber, status;
	private String gender, companyName;

	String fullAddress,zipcode,province,city,addressType;
	Long UserId;
	
	private Set<Feature> feature = new TreeSet<RequestUserDetails.Feature>();
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

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	

	


	public static class Feature {
		private Long retailerFeatureUserId;
		private Long FeatureId;
		private String features;
		private String Status;

		public Long getRetailerFeatureUserId() {
			return retailerFeatureUserId;
		}

		public void setRetailerFeatureUserId(Long retailerFeatureUserId) {
			this.retailerFeatureUserId = retailerFeatureUserId;
		}

		public Long getFeatureId() {
			return FeatureId;
		}

		public void setFeatureId(Long featureId) {
			FeatureId = featureId;
		}

		public String getFeatures() {
			return features;
		}

		public void setFeatures(String features) {
			this.features = features;
		}

		public String getStatus() {
			return Status;
		}

		public void setStatus(String status) {
			Status = status;
		}
	}

	public Set<Feature> getFeature() {
		return feature;
	}

	public void setFeature(Set<Feature> feature) {
		this.feature = feature;
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
	
	
	
//	private List<Address> address=new ArrayList<RequestUserDetails.Address>();
//	private List<Feature> feature=new ArrayList<RequestUserDetails.Feature>();

//	private Set<Address> address;
//	public Set<Address> getAddress() {
//		return address;
//	}
//
//	public void setAddress(Set<Address> address) {
//		this.address = address;
//	}
	// public List<Address> getAddress() {
//	return address;
//}
//public void setAddress(List<Address> address) {
//	this.address = address;
//}
//public List<Feature> getFeature() {
//	return feature;
//}
//public void setFeature(List<Feature> feature) {
//	this.feature = feature;
//}
//	public static class Address {
//
//		String fullAddress, zincode, province, city, addressType;
//		Long UserId;
//
//		public Long getUserId() {
//			return UserId;
//		}
//
//		public void setUserId(Long userId) {
//			UserId = userId;
//		}
//
//		public String getFullAddress() {
//			return fullAddress;
//		}
//
//		public void setFullAddress(String fullAddress) {
//			this.fullAddress = fullAddress;
//		}
//
//		public String getZincode() {
//			return zincode;
//		}
//
//		public void setZincode(String zincode) {
//			this.zincode = zincode;
//		}
//
//		public String getProvince() {
//			return province;
//		}
//
//		public void setProvince(String province) {
//			this.province = province;
//		}
//
//		public String getCity() {
//			return city;
//		}
//
//		public void setCity(String city) {
//			this.city = city;
//		}
//
//		public String getAddressType() {
//			return addressType;
//		}
//
//		public void setAddressType(String addressType) {
//			this.addressType = addressType;
//		}
//
//	}

}
