package com.jcm.br.financer.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcm.br.financer.dtos.DtoCategory;
import com.jcm.br.financer.entity.Category;
import com.jcm.br.financer.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;

	public Category create(Category category) {
		return repository.save(category);
	}

	public Optional<Category> get(Long id) {
		return repository.findById(id);
		
	}

	public Object update(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Long id) {
		repository.deleteById(id);	
	}
	
	/*retornando uma lista de DtoCategory*/
	
	public List<DtoCategory> findAll(){
		List<Category> result = repository.findAll();
		return result.stream().map(x -> new DtoCategory(x)).collect(Collectors.toList());
	}

}
