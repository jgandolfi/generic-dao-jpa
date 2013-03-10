package br.com.alexandre.genericdaojpa.dao;

import java.io.Serializable;

public interface DAO<T, ID extends Serializable> {
	void create(T t);

	T read(ID id);

	void update(T t);

	void delete(T t);
}
