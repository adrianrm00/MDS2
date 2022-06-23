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
@Table(name="Notificacion")
public class Notificacion implements Serializable {
	public Notificacion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_NOTIFICACION_USUARIO) {
			return ORM_usuario;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IdNotificacion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_NOTIFICACION_IDNOTIFICACION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_NOTIFICACION_IDNOTIFICACION_GENERATOR", strategy="native")	
	private int idNotificacion;
	
	@Column(name="Texto", nullable=true, length=255)	
	private String texto;
	
	@OneToMany(mappedBy="notificacion", targetEntity=basededatos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuario = new java.util.HashSet();
	
	private void setIdNotificacion(int value) {
		this.idNotificacion = value;
	}
	
	public int getIdNotificacion() {
		return idNotificacion;
	}
	
	public int getORMID() {
		return getIdNotificacion();
	}
	
	public void setTexto(String value) {
		this.texto = value;
	}
	
	public String getTexto() {
		return texto;
	}
	
	private void setORM_Usuario(java.util.Set value) {
		this.ORM_usuario = value;
	}
	
	private java.util.Set getORM_Usuario() {
		return ORM_usuario;
	}
	
	@Transient	
	public final basededatos.UsuarioSetCollection usuario = new basededatos.UsuarioSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_NOTIFICACION_USUARIO, basededatos.ORMConstants.KEY_USUARIO_NOTIFICACION, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdNotificacion());
	}
	
}
