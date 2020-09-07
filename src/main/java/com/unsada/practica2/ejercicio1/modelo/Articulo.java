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
@Table(name = "articulo")
public class Articulo implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id_articulo")
    private Integer idArticulo;
   
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name="precio")
    private Float cuit;
   
    @Column(name = "descripcion")
    private String descripcion;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFventas")
    private Collection<Fventas> fventasCollection;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProveedor")
    private Collection<Proveedor> proveedorCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFcompras")
    private Collection<Fcompras> fcomprasCollection;

    
	public Articulo() {
		super();
	}


	public Articulo(Integer idArticulo, String nombre, Float cuit, String descripcion,
			Collection<Fventas> fventasCollection, Collection<Proveedor> proveedorCollection,
			Collection<Fcompras> fcomprasCollection) {
		super();
		this.idArticulo = idArticulo;
		this.nombre = nombre;
		this.cuit = cuit;
		this.descripcion = descripcion;
		this.fventasCollection = fventasCollection;
		this.proveedorCollection = proveedorCollection;
		this.fcomprasCollection = fcomprasCollection;
	}


	public Integer getIdArticulo() {
		return idArticulo;
	}


	public void setIdArticulo(Integer idArticulo) {
		this.idArticulo = idArticulo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Float getCuit() {
		return cuit;
	}


	public void setCuit(Float cuit) {
		this.cuit = cuit;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Collection<Fventas> getFventasCollection() {
		return fventasCollection;
	}


	public void setFventasCollection(Collection<Fventas> fventasCollection) {
		this.fventasCollection = fventasCollection;
	}


	public Collection<Proveedor> getProveedorCollection() {
		return proveedorCollection;
	}


	public void setProveedorCollection(Collection<Proveedor> proveedorCollection) {
		this.proveedorCollection = proveedorCollection;
	}


	public Collection<Fcompras> getFcomprasCollection() {
		return fcomprasCollection;
	}


	public void setFcomprasCollection(Collection<Fcompras> fcomprasCollection) {
		this.fcomprasCollection = fcomprasCollection;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idArticulo == null) ? 0 : idArticulo.hashCode());
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
		Articulo other = (Articulo) obj;
		if (idArticulo == null) {
			if (other.idArticulo != null)
				return false;
		} else if (!idArticulo.equals(other.idArticulo))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Articulo [idArticulo=" + idArticulo + ", nombre=" + nombre + ", cuit=" + cuit + ", descripcion="
				+ descripcion + ", fventasCollection=" + fventasCollection + ", proveedorCollection="
				+ proveedorCollection + ", fcomprasCollection=" + fcomprasCollection + "]";
	}
    
    
    
    
}
