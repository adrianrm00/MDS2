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
@Table(name="Cancion")
public class Cancion implements Serializable {
	public Cancion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_CANCION_INTERPRETE) {
			return ORM_interprete;
		}
		else if (key == basededatos.ORMConstants.KEY_CANCION_COMPOSITOR) {
			return ORM_compositor;
		}
		else if (key == basededatos.ORMConstants.KEY_CANCION_PRODUCTOR) {
			return ORM_productor;
		}
		else if (key == basededatos.ORMConstants.KEY_CANCION_ESTILO) {
			return ORM_estilo;
		}
		else if (key == basededatos.ORMConstants.KEY_CANCION_LISTA) {
			return ORM_lista;
		}
		else if (key == basededatos.ORMConstants.KEY_CANCION_CANCIONESFAV) {
			return ORM_cancionesfav;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_CANCION_ALBUM) {
			this.album = (basededatos.Album) owner;
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
	
	@Column(name="IdCancion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_CANCION_IDCANCION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_CANCION_IDCANCION_GENERATOR", strategy="native")	
	private int idCancion;
	
	@ManyToOne(targetEntity=basededatos.Album.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AlbumIdAlbum", referencedColumnName="IdAlbum", nullable=false) }, foreignKey=@ForeignKey(name="FKCancion48941"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Album album;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="EstiloMusica", nullable=true, length=255)	
	private String estiloMusica;
	
	@Column(name="Duracion", nullable=false, length=10)	
	private int duracion;
	
	@Column(name="FicheroAudio", nullable=true, length=255)	
	private String ficheroAudio;
	
	@Column(name="NumReproducciones", nullable=false, length=10)	
	private int numReproducciones;
	
	@ManyToMany(mappedBy="ORM_cancion", targetEntity=basededatos.Interprete.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_interprete = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_cancion", targetEntity=basededatos.Compositor.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_compositor = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_cancion", targetEntity=basededatos.Productor.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_productor = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_cancion", targetEntity=basededatos.EstilosMusica.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_estilo = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_cancion", targetEntity=basededatos.Lista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_lista = new java.util.HashSet();
	
	@OneToMany(mappedBy="cancion", targetEntity=basededatos.CancionesFav.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cancionesfav = new java.util.HashSet();
	
	private void setIdCancion(int value) {
		this.idCancion = value;
	}
	
	public int getIdCancion() {
		return idCancion;
	}
	
	public int getORMID() {
		return getIdCancion();
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setEstiloMusica(String value) {
		this.estiloMusica = value;
	}
	
	public String getEstiloMusica() {
		return estiloMusica;
	}
	
	public void setDuracion(int value) {
		this.duracion = value;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setFicheroAudio(String value) {
		this.ficheroAudio = value;
	}
	
	public String getFicheroAudio() {
		return ficheroAudio;
	}
	
	public void setNumReproducciones(int value) {
		this.numReproducciones = value;
	}
	
	public int getNumReproducciones() {
		return numReproducciones;
	}
	
	public void setAlbum(basededatos.Album value) {
		if (album != null) {
			album.cancion.remove(this);
		}
		if (value != null) {
			value.cancion.add(this);
		}
	}
	
	public basededatos.Album getAlbum() {
		return album;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Album(basededatos.Album value) {
		this.album = value;
	}
	
	private basededatos.Album getORM_Album() {
		return album;
	}
	
	private void setORM_Interprete(java.util.Set value) {
		this.ORM_interprete = value;
	}
	
	private java.util.Set getORM_Interprete() {
		return ORM_interprete;
	}
	
	@Transient	
	public final basededatos.InterpreteSetCollection interprete = new basededatos.InterpreteSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_CANCION_INTERPRETE, basededatos.ORMConstants.KEY_INTERPRETE_CANCION, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Compositor(java.util.Set value) {
		this.ORM_compositor = value;
	}
	
	private java.util.Set getORM_Compositor() {
		return ORM_compositor;
	}
	
	@Transient	
	public final basededatos.CompositorSetCollection compositor = new basededatos.CompositorSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_CANCION_COMPOSITOR, basededatos.ORMConstants.KEY_COMPOSITOR_CANCION, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Productor(java.util.Set value) {
		this.ORM_productor = value;
	}
	
	private java.util.Set getORM_Productor() {
		return ORM_productor;
	}
	
	@Transient	
	public final basededatos.ProductorSetCollection productor = new basededatos.ProductorSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_CANCION_PRODUCTOR, basededatos.ORMConstants.KEY_PRODUCTOR_CANCION, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Estilo(java.util.Set value) {
		this.ORM_estilo = value;
	}
	
	private java.util.Set getORM_Estilo() {
		return ORM_estilo;
	}
	
	@Transient	
	public final basededatos.EstilosMusicaSetCollection estilo = new basededatos.EstilosMusicaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_CANCION_ESTILO, basededatos.ORMConstants.KEY_ESTILOSMUSICA_CANCION, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Lista(java.util.Set value) {
		this.ORM_lista = value;
	}
	
	private java.util.Set getORM_Lista() {
		return ORM_lista;
	}
	
	@Transient	
	public final basededatos.ListaSetCollection lista = new basededatos.ListaSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_CANCION_LISTA, basededatos.ORMConstants.KEY_LISTA_CANCION, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Cancionesfav(java.util.Set value) {
		this.ORM_cancionesfav = value;
	}
	
	private java.util.Set getORM_Cancionesfav() {
		return ORM_cancionesfav;
	}
	
	@Transient	
	public final basededatos.CancionesFavSetCollection cancionesfav = new basededatos.CancionesFavSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_CANCION_CANCIONESFAV, basededatos.ORMConstants.KEY_CANCIONESFAV_CANCION, basededatos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdCancion());
	}
	
}
