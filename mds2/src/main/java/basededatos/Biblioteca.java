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
@Table(name="Biblioteca")
public class Biblioteca implements Serializable {
	public Biblioteca() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_BIBLIOTECA_LISTA) {
			return ORM_lista;
		}
		else if (key == basededatos.ORMConstants.KEY_BIBLIOTECA_ALBUM) {
			return ORM_album;
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
	@GeneratedValue(generator="BASEDEDATOS_BIBLIOTECA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_BIBLIOTECA_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@OneToOne(optional=false, targetEntity=basededatos.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioIdUsuario", referencedColumnName="IdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKBiblioteca359247"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Usuario usuario;
	
	@OneToMany(mappedBy="biblioteca", targetEntity=basededatos.Lista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_lista = new java.util.HashSet();
	
	@OneToMany(mappedBy="biblioteca", targetEntity=basededatos.Album.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_album = new java.util.HashSet();
	
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
		if (this.usuario != value) {
			basededatos.Usuario lusuario = this.usuario;
			this.usuario = value;
			if (value != null) {
				usuario.setBiblioteca(this);
			}
			if (lusuario != null && lusuario.getBiblioteca() == this) {
				lusuario.setBiblioteca(null);
			}
		}
	}
	
	public basededatos.Usuario getUsuario() {
		return usuario;
	}
	
	private void setORM_Lista(java.util.Set value) {
		this.ORM_lista = value;
	}
	
	private java.util.Set getORM_Lista() {
		return ORM_lista;
	}
	
	@Transient	
	public final basededatos.ListaSetCollection lista = new basededatos.ListaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_BIBLIOTECA_LISTA, basededatos.ORMConstants.KEY_LISTA_BIBLIOTECA, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Album(java.util.Set value) {
		this.ORM_album = value;
	}
	
	private java.util.Set getORM_Album() {
		return ORM_album;
	}
	
	@Transient	
	public final basededatos.AlbumSetCollection album = new basededatos.AlbumSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_BIBLIOTECA_ALBUM, basededatos.ORMConstants.KEY_ALBUM_BIBLIOTECA, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
