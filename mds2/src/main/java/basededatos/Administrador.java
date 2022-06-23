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
@Table(name="Administrador")
public class Administrador implements Serializable {
	public Administrador() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_ADMINISTRADOR_MENSAJE) {
			this.mensaje = (basededatos.Mensaje) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_ADMINISTRADOR_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_ADMINISTRADOR_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=basededatos.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="MensajeID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="FKAdministra796166"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Mensaje mensaje;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Contraseña", nullable=true, length=255)	
	private String contraseña;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setContraseña(String value) {
		this.contraseña = value;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	
	public void setMensaje(basededatos.Mensaje value) {
		if (mensaje != null) {
			mensaje.administrador.remove(this);
		}
		if (value != null) {
			value.administrador.add(this);
		}
	}
	
	public basededatos.Mensaje getMensaje() {
		return mensaje;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Mensaje(basededatos.Mensaje value) {
		this.mensaje = value;
	}
	
	private basededatos.Mensaje getORM_Mensaje() {
		return mensaje;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
