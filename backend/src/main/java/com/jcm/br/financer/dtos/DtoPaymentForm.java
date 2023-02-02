package com.jcm.br.financer.dtos;

import java.io.Serializable;

import javax.persistence.Column;

import com.jcm.br.financer.entity.PaymentForm;

import lombok.Data;

@Data
public class DtoPaymentForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String description;
	
	public DtoPaymentForm() {
		
	}

	public DtoPaymentForm(Long id, String description) {
		this.id = id;
		this.description = description;
	}

	public DtoPaymentForm(PaymentForm paymentForm) {
		id = paymentForm.getPaymentFormId();
		description = paymentForm.getDescription();
	}
	
}
