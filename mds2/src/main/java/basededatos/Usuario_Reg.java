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
@Table(name="Usuario_Reg")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioIdUsuario", referencedColumnName="IdUsuario")
public class Usuario_Reg extends basededatos.Usuario implements Serializable {
	public Usuario_Reg() {
	}
	
	@OneToOne(mappedBy="usuario_Reg", targetEntity=basededatos.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Mensaje mensaje;
	
	public void setMensaje(basededatos.Mensaje value) {
		if (this.mensaje != value) {
			basededatos.Mensaje lmensaje = this.mensaje;
			this.mensaje = value;
			if (value != null) {
				mensaje.setUsuario_Reg(this);
			}
			if (lmensaje != null && lmensaje.getUsuario_Reg() == this) {
				lmensaje.setUsuario_Reg(null);
			}
		}
	}
	
	public basededatos.Mensaje getMensaje() {
		return mensaje;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
