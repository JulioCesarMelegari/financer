package com.jcm.br.financer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.jcm.br.financer.entity.PaymentForm;
import com.jcm.br.financer.repository.PaymentFormRepository;

public class PaymentFormService implements IService {
	
	@Autowired
	PaymentFormRepository repository;

	@Override
	public PaymentForm create(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<PaymentForm> get(Long id) {
		return repository.findById(id);
	}

	@Override
	public PaymentForm update(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);	
	}

}
