package com.jcm.br.financer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcm.br.financer.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
