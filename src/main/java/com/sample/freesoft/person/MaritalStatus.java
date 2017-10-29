package com.sample.freesoft.person;

public enum MaritalStatus {
	SINGLE(1), MARRIED_FILING_JOINTLY(2), MARRIED_FILING_SEPARATELY(3), HEAD_OF_HOUSEHOLD(4);

	private final int value;

	MaritalStatus(final int newValue) {
		value = newValue;
	}

	public int getValue() {
		return value;
	}
}
