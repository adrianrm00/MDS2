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
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Productor")
public class Productor implements Serializable {
	public Productor() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_PRODUCTOR_CANCION) {
			return ORM_cancion;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IdProductor", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_PRODUCTOR_IDPRODUCTOR_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_PRODUCTOR_IDPRODUCTOR_GENERATOR", strategy="native")	
	private int idProductor;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@ManyToMany(targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Cancion_Productor", joinColumns={ @JoinColumn(name="ProductorIdProductor") }, inverseJoinColumns={ @JoinColumn(name="CancionIdCancion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cancion = new java.util.HashSet();
	
	private void setIdProductor(int value) {
		this.idProductor = value;
	}
	
	public int getIdProductor() {
		return idProductor;
	}
	
	public int getORMID() {
		return getIdProductor();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Cancion(java.util.Set value) {
		this.ORM_cancion = value;
	}
	
	private java.util.Set getORM_Cancion() {
		return ORM_cancion;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection cancion = new basededatos.CancionSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_PRODUCTOR_CANCION, basededatos.ORMConstants.KEY_CANCION_PRODUCTOR, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdProductor());
	}
	
}
