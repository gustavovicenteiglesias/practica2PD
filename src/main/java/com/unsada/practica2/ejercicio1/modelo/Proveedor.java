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
@Table(name = "proveedor")
public class Proveedor implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id_proveedor")
    private Integer idProveedor;
   
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name="cuit")
    private Long cuit;
   
    @Column(name = "contacto")
    private String contacto;
    @Column(name = "telefono")
    private Integer telefono;
    
    @Column(name = "email")
    private String email;
   
    public Proveedor(Integer idProveedor, String nombre, Long cuit, String contacto, Integer telefono, String email,
			String calle, Integer numero, String localidad, String provincia, Collection<Articulo> articuloCollection,
			Collection<Fcompras> fcomprasCollection) {
		super();
		this.idProveedor = idProveedor;
		this.nombre = nombre;
		this.cuit = cuit;
		this.contacto = contacto;
		this.telefono = telefono;
		this.email = email;
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.provincia = provincia;
		this.articuloCollection = articuloCollection;
		this.fcomprasCollection = fcomprasCollection;
	}

	@Column(name = "calle")
    private String calle;
    
    @Column(name = "numero")
    private Integer numero;
   
    @Column(name = "localidad")
    private String localidad;
   
    @Column(name = "provincia")
    private String provincia;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idArticulo")
    private Collection<Articulo> articuloCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFcompras")
    private Collection<Fcompras> fcomprasCollection;

	public Proveedor() {
		super();
	}

	public Integer getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) {
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

	public Collection<Articulo> getArticuloCollection() {
		return articuloCollection;
	}

	public void setArticuloCollection(Collection<Articulo> articuloCollection) {
		this.articuloCollection = articuloCollection;
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
		result = prime * result + ((idProveedor == null) ? 0 : idProveedor.hashCode());
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
		Proveedor other = (Proveedor) obj;
		if (idProveedor == null) {
			if (other.idProveedor != null)
				return false;
		} else if (!idProveedor.equals(other.idProveedor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Proveedor [idProveedor=" + idProveedor + ", nombre=" + nombre + ", cuit=" + cuit + ", contacto="
				+ contacto + ", telefono=" + telefono + ", email=" + email + ", calle=" + calle + ", numero=" + numero
				+ ", localidad=" + localidad + ", provincia=" + provincia + ", articuloCollection=" + articuloCollection
				+ ", fcomprasCollection=" + fcomprasCollection + "]";
	}
    
    
}
