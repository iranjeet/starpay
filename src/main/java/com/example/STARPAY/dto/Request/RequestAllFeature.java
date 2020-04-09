package com.example.STARPAY.dto.Request;

import java.sql.Timestamp;
import java.util.List;

public class RequestAllFeature {
	private List<Feature> feature;

	public List<Feature> getFeature() {
		return feature;
	}

	public void setFeature(List<Feature> feature) {
		this.feature = feature;
	}

	public static class Feature {

		private Long FeatureId;

		private String featureName;

		private String Status;

		private Boolean isActive;

		public Long getFeatureId() {
			return FeatureId;
		}

		public void setFeatureId(Long featureId) {
			FeatureId = featureId;
		}

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

		public Boolean getIsActive() {
			return isActive;
		}

		public void setIsActive(Boolean isActive) {
			this.isActive = isActive;
		}

		public Timestamp getCreateDate() {
			return createDate;
		}

		public void setCreateDate(Timestamp createDate) {
			this.createDate = createDate;
		}

		private Timestamp createDate;

	}

}
