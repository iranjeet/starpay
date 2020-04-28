package com.example.STARPAY.dto.Request;

public class RequestRetailerFeature {
	private Long id;
	
	private String FeatureName;
	private String Status;

	public String getFeatureName() {
		return FeatureName;
	}

	public void setFeatureName(String featureName) {
		FeatureName = featureName;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
