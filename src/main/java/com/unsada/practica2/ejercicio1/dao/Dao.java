package com.unsada.practica2.ejercicio1.dao;

import java.util.List;


public interface Dao<T> {
	void save(T t);

	void updateCliente(T t);

	List<T> getAll(String clase);

	void delete(Long id,T clase);

	T getById(Long id, T clase);

	
}
