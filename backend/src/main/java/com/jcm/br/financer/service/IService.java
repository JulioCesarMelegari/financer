package com.jcm.br.financer.service;



public interface IService {
	
	/**
	 * cria a entidade e salva no banco
	 * @param obj - formulario referente aos dados para criacao da entidade no banco de dados
	 * @return - entidade criada
	 */
	Object create(Object obj);
	
	/**
	 * retorna a entidade que esta no banco de acordo com o id
	 * @param id - id da entidade que será exibida
	 * @return - entidade com o id fornecido
	 */
	Object get(Long id);
	
	/**
	 * atualiza a entidade que esta no banco de acordo com o id
	 * @param id - id da entidade que será atualizada
	 * @return - entidade com dados atualizados de acordo com o id fornecido
	 */
	Object update(Long id);
	
	/**
	 * deleta a entidade que esta no banco de acordo com o id
	 * @param id - id da entidade que será excluida do banco
	 * @return - vazio
	 */
	void delete(Long id);

	
}
