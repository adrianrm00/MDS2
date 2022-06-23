/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: jaime(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Evento")
public class Evento implements Serializable {
	public Evento() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_EVENTO_ARTISTA) {
			this.artista = (basededatos.Artista) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_EVENTO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_EVENTO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=basededatos.Artista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ArtistaUsuarioIdUsuario", referencedColumnName="UsuarioIdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKEvento664595"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Artista artista;
	
	@Column(name="NombreEvento", nullable=true, length=255)	
	private String nombreEvento;
	
	@Column(name="Ciudad", nullable=true, length=255)	
	private String ciudad;
	
	@Column(name="Fecha", nullable=true)	
	private Date fecha;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombreEvento(String value) {
		this.nombreEvento = value;
	}
	
	public String getNombreEvento() {
		return nombreEvento;
	}
	
	public void setCiudad(String value) {
		this.ciudad = value;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setFecha(Date value) {
		this.fecha = value;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setArtista(basededatos.Artista value) {
		if (artista != null) {
			artista.evento.remove(this);
		}
		if (value != null) {
			value.evento.add(this);
		}
	}
	
	public basededatos.Artista getArtista() {
		return artista;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Artista(basededatos.Artista value) {
		this.artista = value;
	}
	
	private basededatos.Artista getORM_Artista() {
		return artista;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
