package com.jcm.br.financer.dtos;

import java.io.Serializable;

import javax.persistence.Column;

import com.jcm.br.financer.entity.Expense;

import lombok.Data;

@Data
public class DtoExpense implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String title;
	
	@Column(nullable = false, length = 10)
	private String purchaseDate;
	
	@Column(nullable = false, length = 10)
	private String dueDate;
	
	@Column(nullable = false, length = 10)
	private double value;
	
	@Column(nullable = false)
	private String category;
	
	@Column(nullable = false, length = 50)
	private String paymentFor;
	
	@Column(nullable = false, length = 10)
	private String Status;
	
	@Column(nullable = false, length = 500)
	private String observation;
	
	public DtoExpense() {

	}

	public DtoExpense(Long id, String title, String purchaseDate, String dueDate, double value, String category,
			String paymentFor, String status, String observation) {
		this.id = id;
		this.title = title;
		this.purchaseDate = purchaseDate;
		this.dueDate = dueDate;
		this.value = value;
		this.category = category;
		this.paymentFor = paymentFor;
		Status = status;
		this.observation = observation;
	}
	
	public DtoExpense(Expense expense) {
		id = expense.getTitleId();
		title = expense.getTitle();
		purchaseDate = expense.getPurchaseDate().toString();
		dueDate = expense.getDueDate().toString();
		value = expense.getValue();
		category = expense.getCategory().toString();
		paymentFor = expense.getPaymentForm().toString();
		Status = expense.getStatus().getDescription();
		observation = expense.getObservation();
	}	
	
}