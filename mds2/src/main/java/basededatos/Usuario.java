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
@Table(name="Usuario")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_USUARIO_LISTA) {
			return ORM_lista;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_CANCIONESFAV) {
			return ORM_cancionesFav;
		}
		else if (key == basededatos.ORMConstants.KEY_USUARIO_SEGUIDO) {
			return ORM_seguido;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_USUARIO_NOTIFICACION) {
			this.notificacion = (basededatos.Notificacion) owner;
		}
		
		else if (key == basededatos.ORMConstants.KEY_USUARIO_BIBLIOTECA) {
			this.biblioteca = (basededatos.Biblioteca) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdUsuario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_USUARIO_IDUSUARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_USUARIO_IDUSUARIO_GENERATOR", strategy="native")	
	private int idUsuario;
	
	@ManyToOne(targetEntity=basededatos.Notificacion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="NotificacionIdNotificacion", referencedColumnName="IdNotificacion", nullable=false) }, foreignKey=@ForeignKey(name="FKUsuario103987"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Notificacion notificacion;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Apellidos", nullable=true, length=255)	
	private String apellidos;
	
	@Column(name="NomUsuario", nullable=true, length=255)	
	private String nomUsuario;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Contraseña", nullable=true, length=255)	
	private String contraseña;
	
	@Column(name="Foto", nullable=true, length=255)	
	private String foto;
	
	@Column(name="FechaCreacion", nullable=true, length=255)	
	private String fechaCreacion;
	
	@Column(name="Estadisticas", nullable=true, length=255)	
	private String estadisticas;
	
	@ManyToMany(mappedBy="ORM_usuario", targetEntity=basededatos.Lista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_lista = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuario", targetEntity=basededatos.CancionesFav.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cancionesFav = new java.util.HashSet();
	
	@OneToOne(mappedBy="usuario", targetEntity=basededatos.Biblioteca.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Biblioteca biblioteca;
	
	@ManyToMany(mappedBy="ORM_seguidor", targetEntity=basededatos.Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seguido = new java.util.HashSet();
	
	private void setIdUsuario(int value) {
		this.idUsuario = value;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public int getORMID() {
		return getIdUsuario();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellidos(String value) {
		this.apellidos = value;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setNomUsuario(String value) {
		this.nomUsuario = value;
	}
	
	public String getNomUsuario() {
		return nomUsuario;
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
	
	public void setFoto(String value) {
		this.foto = value;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setFechaCreacion(String value) {
		this.fechaCreacion = value;
	}
	
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	
	public void setEstadisticas(String value) {
		this.estadisticas = value;
	}
	
	public String getEstadisticas() {
		return estadisticas;
	}
	
	public void setNotificacion(basededatos.Notificacion value) {
		if (notificacion != null) {
			notificacion.usuario.remove(this);
		}
		if (value != null) {
			value.usuario.add(this);
		}
	}
	
	public basededatos.Notificacion getNotificacion() {
		return notificacion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Notificacion(basededatos.Notificacion value) {
		this.notificacion = value;
	}
	
	private basededatos.Notificacion getORM_Notificacion() {
		return notificacion;
	}
	
	private void setORM_Lista(java.util.Set value) {
		this.ORM_lista = value;
	}
	
	private java.util.Set getORM_Lista() {
		return ORM_lista;
	}
	
	@Transient	
	public final basededatos.ListaSetCollection lista = new basededatos.ListaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_LISTA, basededatos.ORMConstants.KEY_LISTA_USUARIO, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_CancionesFav(java.util.Set value) {
		this.ORM_cancionesFav = value;
	}
	
	private java.util.Set getORM_CancionesFav() {
		return ORM_cancionesFav;
	}
	
	@Transient	
	public final basededatos.CancionesFavSetCollection cancionesFav = new basededatos.CancionesFavSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_CANCIONESFAV, basededatos.ORMConstants.KEY_CANCIONESFAV_USUARIO, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setBiblioteca(basededatos.Biblioteca value) {
		if (this.biblioteca != value) {
			basededatos.Biblioteca lbiblioteca = this.biblioteca;
			this.biblioteca = value;
			if (value != null) {
				biblioteca.setUsuario(this);
			}
			if (lbiblioteca != null && lbiblioteca.getUsuario() == this) {
				lbiblioteca.setUsuario(null);
			}
		}
	}
	
	public basededatos.Biblioteca getBiblioteca() {
		return biblioteca;
	}
	
	private void setORM_Seguido(java.util.Set value) {
		this.ORM_seguido = value;
	}
	
	private java.util.Set getORM_Seguido() {
		return ORM_seguido;
	}
	
	@Transient	
	public final basededatos.ArtistaSetCollection seguido = new basededatos.ArtistaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_USUARIO_SEGUIDO, basededatos.ORMConstants.KEY_ARTISTA_SEGUIDOR, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdUsuario());
	}
	
}
