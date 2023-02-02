package com.jcm.br.financer.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_paymentform")
@Entity
public class PaymentForm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long paymentFormId;
	
	private String description;
	
	private LocalDate registrationDate = LocalDate.now();
	
	@OneToMany(mappedBy = "paymentForm")
	private List<Expense> expenses = new ArrayList<>();

	public Long getPaymentFormId() {
		return paymentFormId;
	}

	public void setPaymentFormId(Long paymentFormId) {
		this.paymentFormId = paymentFormId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public List<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
	}
	
	

}
