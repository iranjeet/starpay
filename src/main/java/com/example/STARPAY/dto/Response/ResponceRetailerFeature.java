package com.example.STARPAY.dto.Response;

import java.util.ArrayList;
import java.util.List;

public class ResponceRetailerFeature {
	List<Buttons> buttons=new ArrayList<ResponceRetailerFeature.Buttons>();

	public List<Buttons> getButtons() {
		return buttons;
	}

	public void setButtons(List<Buttons> buttons) {
		this.buttons = buttons;
	}

	public static class Buttons{
		private Long Id;
		private Boolean isActive;
		private String Status;
		private String featureName;

		public Long getId() {
			return Id;
		}

		public void setId(Long id) {
			Id = id;
		}

		public Boolean getIsActive() {
			return isActive;
		}

		public void setIsActive(Boolean isActive) {
			this.isActive = isActive;
		}

		public String getStatus() {
			return Status;
		}

		public void setStatus(String status) {
			Status = status;
		}

		public String getFeatureName() {
			return featureName;
		}

		public void setFeatureName(String featureName) {
			this.featureName = featureName;
		}

	}
}
