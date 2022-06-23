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
@Table(name="CancionesFav")
public class CancionesFav implements Serializable {
	public CancionesFav() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_CANCIONESFAV_USUARIO) {
			this.usuario = (basededatos.Usuario) owner;
		}
		
		else if (key == basededatos.ORMConstants.KEY_CANCIONESFAV_CANCION) {
			this.cancion = (basededatos.Cancion) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_CANCIONESFAV_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_CANCIONESFAV_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=basededatos.Cancion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="CancionIdCancion", referencedColumnName="IdCancion", nullable=false) }, foreignKey=@ForeignKey(name="FKCancionesF771948"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Cancion cancion;
	
	@ManyToOne(targetEntity=basededatos.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioIdUsuario", referencedColumnName="IdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKCancionesF925192"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Usuario usuario;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setUsuario(basededatos.Usuario value) {
		if (usuario != null) {
			usuario.cancionesFav.remove(this);
		}
		if (value != null) {
			value.cancionesFav.add(this);
		}
	}
	
	public basededatos.Usuario getUsuario() {
		return usuario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuario(basededatos.Usuario value) {
		this.usuario = value;
	}
	
	private basededatos.Usuario getORM_Usuario() {
		return usuario;
	}
	
	public void setCancion(basededatos.Cancion value) {
		if (cancion != null) {
			cancion.cancionesfav.remove(this);
		}
		if (value != null) {
			value.cancionesfav.add(this);
		}
	}
	
	public basededatos.Cancion getCancion() {
		return cancion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cancion(basededatos.Cancion value) {
		this.cancion = value;
	}
	
	private basededatos.Cancion getORM_Cancion() {
		return cancion;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
