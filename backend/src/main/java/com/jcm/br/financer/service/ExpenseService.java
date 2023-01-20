package com.jcm.br.financer.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcm.br.financer.entity.Expense;
import com.jcm.br.financer.repository.ExpenseRepository;

@Service
public class ExpenseService implements IService{
	
	@Autowired
	private ExpenseRepository repository;

	@Override
	public Object create(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Expense> get(Long id) {
		return repository.findById(id);
	}

	@Override
	public Expense update(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}


}
