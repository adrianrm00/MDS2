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
@Table(name="EstilosMusica")
public class EstilosMusica implements Serializable {
	public EstilosMusica() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == basededatos.ORMConstants.KEY_ESTILOSMUSICA_CANCION) {
			return ORM_cancion;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == basededatos.ORMConstants.KEY_ESTILOSMUSICA_ARTISTA) {
			this.artista = (basededatos.Artista) owner;
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
	
	@Column(name="IdEstilo", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_ESTILOSMUSICA_IDESTILO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_ESTILOSMUSICA_IDESTILO_GENERATOR", strategy="native")	
	private int idEstilo;
	
	@ManyToOne(targetEntity=basededatos.Artista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ArtistaUsuarioIdUsuario", referencedColumnName="UsuarioIdUsuario", nullable=false) }, foreignKey=@ForeignKey(name="FKEstilosMus610582"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Artista artista;
	
	@Column(name="NombreEstilo", nullable=true, length=255)	
	private String nombreEstilo;
	
	@ManyToMany(targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Cancion_EstilosMusica", joinColumns={ @JoinColumn(name="EstilosMusicaIdEstilo") }, inverseJoinColumns={ @JoinColumn(name="CancionIdCancion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cancion = new java.util.HashSet();
	
	private void setIdEstilo(int value) {
		this.idEstilo = value;
	}
	
	public int getIdEstilo() {
		return idEstilo;
	}
	
	public int getORMID() {
		return getIdEstilo();
	}
	
	public void setNombreEstilo(String value) {
		this.nombreEstilo = value;
	}
	
	public String getNombreEstilo() {
		return nombreEstilo;
	}
	
	private void setORM_Cancion(java.util.Set value) {
		this.ORM_cancion = value;
	}
	
	private java.util.Set getORM_Cancion() {
		return ORM_cancion;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection cancion = new basededatos.CancionSetCollection(this, _ormAdapter, basededatos.ORMConstants.KEY_ESTILOSMUSICA_CANCION, basededatos.ORMConstants.KEY_CANCION_ESTILO, basededatos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setArtista(basededatos.Artista value) {
		if (artista != null) {
			artista.estilo.remove(this);
		}
		if (value != null) {
			value.estilo.add(this);
		}
	}
	
	public basededatos.Artista getArtista() {
		return artista;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Artista(basededatos.Artista value) {
		this.artista = value;
	}
	
	private basededatos.Artista getORM_Artista() {
		return artista;
	}
	
	public String toString() {
		return String.valueOf(getIdEstilo());
	}
	
}
