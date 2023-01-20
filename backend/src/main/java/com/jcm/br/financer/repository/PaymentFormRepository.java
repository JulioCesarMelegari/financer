package com.jcm.br.financer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcm.br.financer.entity.PaymentForm;

public interface PaymentFormRepository extends JpaRepository<PaymentForm, Long>{

}
