package com.unsada.practica2.ejercicio1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.unsada.practica2.ejercicio1.modelo.Cliente;
import com.unsada.practica2.ejercicio1.util.Configuracion;

public class ClienteDaoImpl implements ClienteDao{

	public void saveCliente(Cliente cliente) {
		Transaction transaction = null;
        try (Session session = Configuracion.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.save(cliente);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
		
	}

	public void updateCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
	
	public Cliente getClienteById(Long id) {
		 Transaction transaction = null;
	        Cliente cliente = null;
	        try (Session session = Configuracion.getSessionFactory().openSession()) {
	            // start the transaction
	            transaction = session.beginTransaction();

	            // get student object
	            cliente = session.get(Cliente.class, id);
	           
	            // commit the transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	        }
		return cliente;
	}

	public List<Cliente> getAllClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void deleteCliente(Long id) {
		// TODO Auto-generated method stub
		
	}

	
	

}
