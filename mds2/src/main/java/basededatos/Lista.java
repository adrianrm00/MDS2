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
@Table(name="Lista")
public class Lista implements Serializable {
	public Lista() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_LISTA_USUARIO) {
			return ORM_usuario;
		}
		else if (key == basededatos.ORMConstants.KEY_LISTA_CANCION) {
			return ORM_cancion;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_LISTA_BIBLIOTECA) {
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
	
	@Column(name="IdLista", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_LISTA_IDLISTA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_LISTA_IDLISTA_GENERATOR", strategy="native")	
	private int idLista;
	
	@ManyToOne(targetEntity=basededatos.Biblioteca.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="BibliotecaID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="FKLista890606"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Biblioteca biblioteca;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@ManyToMany(targetEntity=basededatos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Lista", joinColumns={ @JoinColumn(name="ListaIdLista") }, inverseJoinColumns={ @JoinColumn(name="UsuarioIdUsuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuario = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Cancion_Lista", joinColumns={ @JoinColumn(name="ListaIdLista") }, inverseJoinColumns={ @JoinColumn(name="CancionIdCancion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cancion = new java.util.HashSet();
	
	private void setIdLista(int value) {
		this.idLista = value;
	}
	
	public int getIdLista() {
		return idLista;
	}
	
	public int getORMID() {
		return getIdLista();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Usuario(java.util.Set value) {
		this.ORM_usuario = value;
	}
	
	private java.util.Set getORM_Usuario() {
		return ORM_usuario;
	}
	
	@Transient	
	public final basededatos.UsuarioSetCollection usuario = new basededatos.UsuarioSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_LISTA_USUARIO, basededatos.ORMConstants.KEY_USUARIO_LISTA, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Cancion(java.util.Set value) {
		this.ORM_cancion = value;
	}
	
	private java.util.Set getORM_Cancion() {
		return ORM_cancion;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection cancion = new basededatos.CancionSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_LISTA_CANCION, basededatos.ORMConstants.KEY_CANCION_LISTA, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setBiblioteca(basededatos.Biblioteca value) {
		if (biblioteca != null) {
			biblioteca.lista.remove(this);
		}
		if (value != null) {
			value.lista.add(this);
		}
	}
	
	public basededatos.Biblioteca getBiblioteca() {
		return biblioteca;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Biblioteca(basededatos.Biblioteca value) {
		this.biblioteca = value;
	}
	
	private basededatos.Biblioteca getORM_Biblioteca() {
		return biblioteca;
	}
	
	public String toString() {
		return String.valueOf(getIdLista());
	}
	
}
