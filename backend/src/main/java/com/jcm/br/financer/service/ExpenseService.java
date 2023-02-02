package com.jcm.br.financer.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import com.jcm.br.financer.dtos.DtoExpense;
import com.jcm.br.financer.entity.Expense;
import com.jcm.br.financer.repository.ExpenseRepository;

@Service
public class ExpenseService {
	
	@Autowired
	private ExpenseRepository repository;

	public Expense create(Expense expense) {
		return repository.save(expense);
	}

	public Optional<Expense> get(Long id) {
		return repository.findById(id);
	}

	public Expense update(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	/*retornando lista dtoExpense*/
	public List<DtoExpense> findAll(){
		List<Expense> result = repository.findAll();
		return result.stream().map(x -> new DtoExpense(x)).collect(Collectors.toList());
	}

}
