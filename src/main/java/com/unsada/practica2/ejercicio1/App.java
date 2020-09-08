package com.unsada.practica2.ejercicio1;


import java.util.List;

import com.unsada.practica2.ejercicio1.dao.Dao;
import com.unsada.practica2.ejercicio1.dao.DaoImpl;
import com.unsada.practica2.ejercicio1.modelo.Articulo;
import com.unsada.practica2.ejercicio1.modelo.Cliente;


public class App 
{
    
	//Test 
	public static void main( String[] args )
    {
    	Dao<Object> dao=new DaoImpl<Object>();
    	Cliente cli= new Cliente("Atila",1234,"Gustavo",556677,"gustavo@unsada.com",
    			"Martinez",911,"San Antonio de Areco","Buenos Aires");
    	dao.save(cli);
    	
    	
    	Object cli1=dao.getById(cli.getIdCliente(), Cliente.class);
    	System.out.println(cli1);
    	
    	List cli2=dao.getAll("Cliente");
    	System.out.println(cli2);
    	
    	dao.delete(cli.getIdCliente(),Cliente.class);
    	
    	Articulo art=new Articulo("Cuaderno",  (float) 100, "espiralado");
    	dao.save(art);
    	
    	Object art1=dao.getById(art.getIdArticulo(), Articulo.class);
    	System.out.println(art1);
    	
    	List art2=dao.getAll("Articulo");
    	System.out.println(art2);
    	
    	dao.delete(art.getIdArticulo(), Articulo.class);
    	
    }
}
