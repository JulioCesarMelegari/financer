package com.jcm.br.financer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.stream.Collectors;
import com.jcm.br.financer.dtos.DtoPaymentForm;
import com.jcm.br.financer.entity.PaymentForm;
import com.jcm.br.financer.repository.PaymentFormRepository;

public class PaymentFormService {
	
	@Autowired
	private PaymentFormRepository repository;


	public PaymentForm create(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<PaymentForm> get(Long id) {
		return repository.findById(id);
	}

	public PaymentForm update(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Long id) {
		repository.deleteById(id);	
	}
	
	/*retornando lista dtoPaymentForm*/
	public List<DtoPaymentForm> findAll(){
		List<PaymentForm> result = repository.findAll();
		return result.stream().map(x -> new DtoPaymentForm(x)).collect(Collectors.toList());
	}

}
