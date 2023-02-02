package com.jcm.br.financer.dtos;

import java.io.Serializable;

import javax.persistence.Column;

import com.jcm.br.financer.entity.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoCategory implements Serializable{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String description;

	public DtoCategory() {
	}

	public DtoCategory(Long id, String description) {
		this.id = id;
		this.description = description;
	}
	
	public DtoCategory(Category category) {
		id = category.getCategoryId();
		description = category.getDescription();
	}
	
}
