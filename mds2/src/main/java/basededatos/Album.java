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
@Table(name="Album")
public class Album implements Serializable {
	public Album() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_ALBUM_ARTISTA) {
			return ORM_artista;
		}
		else if (key == basededatos.ORMConstants.KEY_ALBUM_CANCION) {
			return ORM_cancion;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_ALBUM_BIBLIOTECA) {
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
	
	@Column(name="IdAlbum", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_ALBUM_IDALBUM_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_ALBUM_IDALBUM_GENERATOR", strategy="native")	
	private int idAlbum;
	
	@ManyToOne(targetEntity=basededatos.Biblioteca.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="BibliotecaID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="FKAlbum804944"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Biblioteca biblioteca;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="FechaLanzamiento", nullable=true)	
	private Date fechaLanzamiento;
	
	@Column(name="FotoAlbum", nullable=true, length=255)	
	private String fotoAlbum;
	
	@ManyToMany(targetEntity=basededatos.Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Artista_Album", joinColumns={ @JoinColumn(name="AlbumIdAlbum") }, inverseJoinColumns={ @JoinColumn(name="ArtistaUsuarioIdUsuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_artista = new java.util.HashSet();
	
	@OneToMany(mappedBy="album", targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cancion = new java.util.HashSet();
	
	private void setIdAlbum(int value) {
		this.idAlbum = value;
	}
	
	public int getIdAlbum() {
		return idAlbum;
	}
	
	public int getORMID() {
		return getIdAlbum();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setFechaLanzamiento(Date value) {
		this.fechaLanzamiento = value;
	}
	
	public Date getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	
	public void setFotoAlbum(String value) {
		this.fotoAlbum = value;
	}
	
	public String getFotoAlbum() {
		return fotoAlbum;
	}
	
	private void setORM_Artista(java.util.Set value) {
		this.ORM_artista = value;
	}
	
	private java.util.Set getORM_Artista() {
		return ORM_artista;
	}
	
	@Transient	
	public final basededatos.ArtistaSetCollection artista = new basededatos.ArtistaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_ALBUM_ARTISTA, basededatos.ORMConstants.KEY_ARTISTA_ALBUM, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setBiblioteca(basededatos.Biblioteca value) {
		if (biblioteca != null) {
			biblioteca.album.remove(this);
		}
		if (value != null) {
			value.album.add(this);
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
	
	private void setORM_Cancion(java.util.Set value) {
		this.ORM_cancion = value;
	}
	
	private java.util.Set getORM_Cancion() {
		return ORM_cancion;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection cancion = new basededatos.CancionSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_ALBUM_CANCION, basededatos.ORMConstants.KEY_CANCION_ALBUM, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdAlbum());
	}
	
}
