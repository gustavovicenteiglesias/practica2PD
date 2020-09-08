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
@Table(name = "fcompras")
public class Fcompras implements Serializable {
	private static final long serialVersionUID = 1L;
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Basic(optional = false)
	    @Column(name = "id_fcompras")
	    private Long idFcompras;
	    
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
	    
	    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor")
	    @ManyToOne(optional = false)
	    private Proveedor idProveedor;

		public Fcompras() {
			super();
		}

		public Fcompras( Integer cantidad, Float importe, Double subtotal, Double total, Double iva,
				Articulo idArticulo, Proveedor idProveedor) {
			super();
			
			this.cantidad = cantidad;
			this.importe = importe;
			this.subtotal = subtotal;
			this.total = total;
			this.iva = iva;
			this.idArticulo = idArticulo;
			this.idProveedor = idProveedor;
		}

		public Long getIdFcompras() {
			return idFcompras;
		}

		public void setIdFcompras(Long idFcompras) {
			this.idFcompras = idFcompras;
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

		public Proveedor getIdProveedor() {
			return idProveedor;
		}

		public void setIdProveedor(Proveedor idProveedor) {
			this.idProveedor = idProveedor;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((idFcompras == null) ? 0 : idFcompras.hashCode());
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
			Fcompras other = (Fcompras) obj;
			if (idFcompras == null) {
				if (other.idFcompras != null)
					return false;
			} else if (!idFcompras.equals(other.idFcompras))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Fcompras [idFcompras=" + idFcompras + ", cantidad=" + cantidad + ", importe=" + importe
					+ ", subtotal=" + subtotal + ", total=" + total + ", iva=" + iva + ", idArticulo=" + idArticulo
					+ ", idProveedor=" + idProveedor + "]";
		}
	    
	    
}
