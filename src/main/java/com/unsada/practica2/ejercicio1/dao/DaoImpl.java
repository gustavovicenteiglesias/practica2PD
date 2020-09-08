package com.unsada.practica2.ejercicio1.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;


import com.unsada.practica2.ejercicio1.util.Configuracion;

public class DaoImpl<T> implements Dao<Object>  {

	@Override
	public void save(Object t) {
		Transaction transaction = null;
        try (Session session = Configuracion.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.save(t);

            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
		
	}

	@Override
	public void updateCliente(Object t) {
		// TODO Auto-generated method stub
		
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Object> getAll(String clase) {
		Transaction transaction = null;
		
		
        List<Object>  dao = null;
        try (Session session = Configuracion.getSessionFactory().openSession()) {
          
            transaction = session.beginTransaction();

           
            dao = session.createQuery("from "+clase).list();
           
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return  dao;
	}

	@Override
	public void delete(Long id,Object clase) {
		Transaction transaction = null;
		@SuppressWarnings("unchecked")
		Class<T> cla=(Class<T>) clase;
        Object t = null;
        try (Session session = Configuracion.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            t = session.get(cla, id);
            // get student object
            session.delete(t);
            //student = session.load(Student.class, id);
            // commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
		
	

	@Override
	public Object getById(Long id,Object clase) {
		 Transaction transaction = null;
		 
		 
	       @SuppressWarnings("unchecked")
		Class<T> cla=(Class<T>) clase;
			Object t=null;
			try (Session session = Configuracion.getSessionFactory().openSession()) {
	            // start the transaction
	            transaction = session.beginTransaction();

	            // get student object
	            t =  session.get( cla, id);
	           
	            // commit the transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	        }
		return   t;
	}

	

	

}
