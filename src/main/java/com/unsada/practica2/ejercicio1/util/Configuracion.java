package com.unsada.practica2.ejercicio1.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.unsada.practica2.ejercicio1.modelo.Articulo;
import com.unsada.practica2.ejercicio1.modelo.Cliente;
import com.unsada.practica2.ejercicio1.modelo.Fcompras;
import com.unsada.practica2.ejercicio1.modelo.Fventas;
import com.unsada.practica2.ejercicio1.modelo.Proveedor;

public class Configuracion {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                // Hibernate es equivalente a hibernate.cfg.xml's properties
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/ejercicio2?serverTimezone=UTC");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "1234");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

                settings.put(Environment.SHOW_SQL, "true");

                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                settings.put(Environment.HBM2DDL_AUTO, "update");

                configuration.setProperties(settings);

                configuration.addAnnotatedClass(Articulo.class);
                configuration.addAnnotatedClass(Cliente.class);
                configuration.addAnnotatedClass(Fcompras.class);
                configuration.addAnnotatedClass(Fventas.class);
                configuration.addAnnotatedClass(Proveedor.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
