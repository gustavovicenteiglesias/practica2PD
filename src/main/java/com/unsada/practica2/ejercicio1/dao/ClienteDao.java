package com.unsada.practica2.ejercicio1.dao;

import java.util.List;

import com.unsada.practica2.ejercicio1.modelo.Cliente;

public interface ClienteDao {
	void saveCliente(Cliente cliente);

	 void updateCliente(Cliente cliente);

	

	 List<Cliente> getAllClientes();

	 void deleteCliente(Long id);

	Cliente getClienteById(Long id);
}
