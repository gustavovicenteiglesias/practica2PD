package com.unsada.practica2.ejercicio1.modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "fventas")
public class Fventas implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id_fventas")
    private Integer idFventas;
    
    @Column(name = "cantidad")
    private Integer cantidad;
    
    @Column(name = "importe")
    private Float importe;
    
    @Column(name = "subtotal")
    private Double subtotal;
    
    @Column(name = "total")
    private Double total;
    
    @Column(name = "iva")
    private Double iva;
    
    @JoinColumn(name = "id_articulo", referencedColumnName = "id_articulo")
    @ManyToOne(optional = false)
    private Articulo idArticulo;
    
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false)
    private Cliente idCliente;

	public Fventas() {
		super();
	}

	public Fventas(Integer idFventas, Integer cantidad, Float importe, Double subtotal, Double total, Double iva,
			Articulo idArticulo, Cliente idCliente) {
		super();
		this.idFventas = idFventas;
		this.cantidad = cantidad;
		this.importe = importe;
		this.subtotal = subtotal;
		this.total = total;
		this.iva = iva;
		this.idArticulo = idArticulo;
		this.idCliente = idCliente;
	}

	public Integer getIdFventas() {
		return idFventas;
	}

	public void setIdFventas(Integer idFventas) {
		this.idFventas = idFventas;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Float getImporte() {
		return importe;
	}

	public void setImporte(Float importe) {
		this.importe = importe;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public Articulo getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(Articulo idArticulo) {
		this.idArticulo = idArticulo;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idFventas == null) ? 0 : idFventas.hashCode());
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
		Fventas other = (Fventas) obj;
		if (idFventas == null) {
			if (other.idFventas != null)
				return false;
		} else if (!idFventas.equals(other.idFventas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fventas [idFventas=" + idFventas + ", cantidad=" + cantidad + ", importe=" + importe + ", subtotal="
				+ subtotal + ", total=" + total + ", iva=" + iva + ", idArticulo=" + idArticulo + ", idCliente="
				+ idCliente + "]";
	}
    
    
    

    
}
