package com.unsada.practica2.ejercicio1.modelo;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Long idCliente;
   
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name="cuit")
    private Integer cuit;
   
    @Column(name = "contacto")
    private String contacto;
    @Column(name = "telefono")
    private Integer telefono;
    
    @Column(name = "email")
    private String email;
   
    @Column(name = "calle")
    private String calle;
    
    @Column(name = "numero")
    private Integer numero;
   
    @Column(name = "localidad")
    private String localidad;
   
    @Column(name = "provincia")
    private String provincia;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private Collection<Fventas> fventasCollection;

	public Cliente() {
		super();
	}
	
	
	

	public Cliente( String nombre, Integer cuit, String contacto, Integer telefono, String email,
			String calle, Integer numero, String localidad, String provincia) {
		super();
		
		this.nombre = nombre;
		this.cuit = cuit;
		this.contacto = contacto;
		this.telefono = telefono;
		this.email = email;
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.provincia = provincia;
		
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCuit() {
		return cuit;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (idCliente == null) {
			if (other.idCliente != null)
				return false;
		} else if (!idCliente.equals(other.idCliente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", cuit=" + cuit + ", contacto=" + contacto
				+ ", telefono=" + telefono + ", email=" + email + ", calle=" + calle + ", numero=" + numero
				+ ", localidad=" + localidad + ", provincia=" + provincia + "]";
	}
    
    

	
	
    
    
    
}
