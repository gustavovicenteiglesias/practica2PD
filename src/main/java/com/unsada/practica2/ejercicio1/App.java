package com.unsada.practica2.ejercicio1;

import com.unsada.practica2.ejercicio1.dao.ClienteDao;
import com.unsada.practica2.ejercicio1.dao.ClienteDaoImpl;
import com.unsada.practica2.ejercicio1.modelo.Cliente;


public class App 
{
    

	public static void main( String[] args )
    {
    	ClienteDao cliente=new ClienteDaoImpl();
    	Cliente cli= new Cliente("Atila",1234,"Gustavo",556677,"gustavo@unsada.com",
    			"Martinez",911,"San Antonio de Areco","Buenos Aires");
    	cliente.saveCliente(cli);
    	
        
        Cliente cli1=cliente.getClienteById((long) 1);
        System.out.println(cli1);
    }
}
