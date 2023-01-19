package com.jcm.br.financer.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long titleId;
	
	private String title;
	private LocalDate registrationDate;
	private LocalDate purchaseDate;
	private LocalDate dueDate;
	private double value;
	private Category category;
	private PaymentForm paymentFor;	
	
}
