package br.com.alexandre.genericdaojpa.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Component
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = DAOException.class)
public abstract class AbstractDAO<T, ID extends Serializable> implements
		DAO<T, ID> {

	@PersistenceContext
	protected EntityManager entityManager;

	protected Class<T> classe;

	protected Logger logger;

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init() {
		this.classe = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
		this.logger = Logger.getLogger(classe);
	}

	public void create(T t) {
		if (t == null) {
			throw new IllegalArgumentException("Entidade nula");
		}
		try {
			this.entityManager.persist(t);
		} catch (Exception e) {
			String message = "Nao foi possivel cadastrar a entidade";
			logger.error(message);
			throw new DAOException(message, e);
		}

	}

	public T read(ID id) {
		if (id == null) {
			throw new IllegalArgumentException("ID nulo");
		}
		try {
			return this.entityManager.find(classe, id);
		} catch (Exception e) {
			String message = "Nao foi possivel buscar a entidade";
			logger.error(message);
			throw new DAOException(message, e);
		}
	}

	public void update(T t) {
		if (t == null) {
			throw new IllegalArgumentException("Entidade nula");
		}
		try {
			this.entityManager.merge(t);
		} catch (Exception e) {
			String message = "Nao foi possivel atualizar a entidade";
			logger.error(message);
			throw new DAOException(message, e);
		}
	}

	public void delete(T t) {
		if (t == null) {
			throw new IllegalArgumentException("Entidade nula");
		}
		try {
			this.entityManager.remove(this.entityManager.merge(t));
		} catch (Exception e) {
			String message = "Nao foi possivel excluir a entidade";
			logger.error(message);
			throw new DAOException(message, e);
		}
	}

}
