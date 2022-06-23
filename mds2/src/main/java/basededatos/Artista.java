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
@Table(name="Artista")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioIdUsuario", referencedColumnName="IdUsuario")
public class Artista extends basededatos.Usuario implements Serializable {
	public Artista() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_ARTISTA_SEGUIDOR) {
			return ORM_seguidor;
		}
		else if (key == basededatos.ORMConstants.KEY_ARTISTA_ALBUM) {
			return ORM_album;
		}
		else if (key == basededatos.ORMConstants.KEY_ARTISTA_ESTILO) {
			return ORM_estilo;
		}
		else if (key == basededatos.ORMConstants.KEY_ARTISTA_EVENTO) {
			return ORM_evento;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IdArtista", nullable=false, length=10)	
	private int idArtista;
	
	@Column(name="NombreArtista", nullable=true, length=255)	
	private String nombreArtista;
	
	@Column(name="FechaNacimiento", nullable=true)	
	private Date fechaNacimiento;
	
	@ManyToMany(targetEntity=basededatos.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Artista", joinColumns={ @JoinColumn(name="ArtistaUsuarioIdUsuario") }, inverseJoinColumns={ @JoinColumn(name="UsuarioIdUsuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_seguidor = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_artista", targetEntity=basededatos.Album.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_album = new java.util.HashSet();
	
	@OneToMany(mappedBy="artista", targetEntity=basededatos.EstilosMusica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_estilo = new java.util.HashSet();
	
	@OneToMany(mappedBy="artista", targetEntity=basededatos.Evento.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_evento = new java.util.HashSet();
	
	public void setIdArtista(int value) {
		this.idArtista = value;
	}
	
	public int getIdArtista() {
		return idArtista;
	}
	
	public void setNombreArtista(String value) {
		this.nombreArtista = value;
	}
	
	public String getNombreArtista() {
		return nombreArtista;
	}
	
	public void setFechaNacimiento(Date value) {
		this.fechaNacimiento = value;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	private void setORM_Seguidor(java.util.Set value) {
		this.ORM_seguidor = value;
	}
	
	private java.util.Set getORM_Seguidor() {
		return ORM_seguidor;
	}
	
	@Transient	
	public final basededatos.UsuarioSetCollection seguidor = new basededatos.UsuarioSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_ARTISTA_SEGUIDOR, basededatos.ORMConstants.KEY_USUARIO_SEGUIDO, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Album(java.util.Set value) {
		this.ORM_album = value;
	}
	
	private java.util.Set getORM_Album() {
		return ORM_album;
	}
	
	@Transient	
	public final basededatos.AlbumSetCollection album = new basededatos.AlbumSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_ARTISTA_ALBUM, basededatos.ORMConstants.KEY_ALBUM_ARTISTA, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Estilo(java.util.Set value) {
		this.ORM_estilo = value;
	}
	
	private java.util.Set getORM_Estilo() {
		return ORM_estilo;
	}
	
	@Transient	
	public final basededatos.EstilosMusicaSetCollection estilo = new basededatos.EstilosMusicaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_ARTISTA_ESTILO, basededatos.ORMConstants.KEY_ESTILOSMUSICA_ARTISTA, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Evento(java.util.Set value) {
		this.ORM_evento = value;
	}
	
	private java.util.Set getORM_Evento() {
		return ORM_evento;
	}
	
	@Transient	
	public final basededatos.EventoSetCollection evento = new basededatos.EventoSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_ARTISTA_EVENTO, basededatos.ORMConstants.KEY_EVENTO_ARTISTA, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
