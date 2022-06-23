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
@Table(name="Mensaje")
public class Mensaje implements Serializable {
	public Mensaje() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_MENSAJE_ADMINISTRADOR) {
			return ORM_administrador;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_MENSAJE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_MENSAJE_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@OneToOne(optional=false, targetEntity=basededatos.Usuario_Reg.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Usuario_RegUsuarioIdUsuario", referencedColumnName="UsuarioIdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje423873"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Usuario_Reg usuario_Reg;
	
	@Column(name="Texto", nullable=true, length=255)	
	private String texto;
	
	@OneToMany(mappedBy="mensaje", targetEntity=basededatos.Administrador.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_administrador = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTexto(String value) {
		this.texto = value;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setUsuario_Reg(basededatos.Usuario_Reg value) {
		if (this.usuario_Reg != value) {
			basededatos.Usuario_Reg lusuario_Reg = this.usuario_Reg;
			this.usuario_Reg = value;
			if (value != null) {
				usuario_Reg.setMensaje(this);
			}
			if (lusuario_Reg != null && lusuario_Reg.getMensaje() == this) {
				lusuario_Reg.setMensaje(null);
			}
		}
	}
	
	public basededatos.Usuario_Reg getUsuario_Reg() {
		return usuario_Reg;
	}
	
	private void setORM_Administrador(java.util.Set value) {
		this.ORM_administrador = value;
	}
	
	private java.util.Set getORM_Administrador() {
		return ORM_administrador;
	}
	
	@Transient	
	public final basededatos.AdministradorSetCollection administrador = new basededatos.AdministradorSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_MENSAJE_ADMINISTRADOR, basededatos.ORMConstants.KEY_ADMINISTRADOR_MENSAJE, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
