package com.example.STARPAY.domain;

public enum UserStatus {
	Active("Active"), InActive("In_Active"), Suspended("Suspended"), NotVerified("Not_Verified"),
	Verified("Verified")/* ,True("True"), False("false") */;
	
	private final String name;

	public String getName() {
		return name;
	}

	private UserStatus(String name) {
		this.name = name;
	}


}
