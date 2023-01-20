package com.jcm.br.financer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcm.br.financer.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
