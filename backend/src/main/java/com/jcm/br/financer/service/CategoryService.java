package com.jcm.br.financer.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcm.br.financer.entity.Category;
import com.jcm.br.financer.repository.CategoryRepository;

@Service
public class CategoryService implements IService{
	
	@Autowired
	private CategoryRepository repository;

	@Override
	public Object create(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Category> get(Long id) {
		return repository.findById(id);
		
	}

	@Override
	public Object update(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);	
	}

}
