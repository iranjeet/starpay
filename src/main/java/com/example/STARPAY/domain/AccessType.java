package com.example.STARPAY.domain;

public enum AccessType {
	EDIT("edit"), VIEW("view"), NO_ACCESS("no-access");

	private final String name;

	public String getName() {
		return name;
	}

	private AccessType(String name) {
		this.name = name;
	}

}
