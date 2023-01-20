package com.jcm.br.financer.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "tb_expense")
@Entity
public class Expense implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long titleId;
	
	@Column(nullable = false, length = 50)
	private String title;
	
	private LocalDate registrationDate = LocalDate.now();
	
	@Column(nullable = false, length = 10)
	private LocalDate purchaseDate;
	
	@Column(nullable = false, length = 10)
	private LocalDate dueDate;
	
	@Column(nullable = false, length = 10)
	private double value;
	
	@Column(nullable = false, length = 50)
	private Category category;
	
	@Column(nullable = false, length = 50)
	private PaymentForm paymentFor;
	
	@Column(nullable = false, length = 10)
	private StatusExpense Status;
	
	@Column(nullable = false, length = 500)
	private String observation;
	
}
