package com.jcm.br.financer.entity;

public enum StatusExpense {
	
	PENDING("Pending"),
	SETTLED("Settled"),
	EXTENDED("Extended");
	
	private String description;
	
	private StatusExpense(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
