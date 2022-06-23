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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CancionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idCancion;
	public final IntegerExpression albumId;
	public final AssociationExpression album;
	public final StringExpression titulo;
	public final StringExpression estiloMusica;
	public final IntegerExpression duracion;
	public final StringExpression ficheroAudio;
	public final IntegerExpression numReproducciones;
	public final CollectionExpression interprete;
	public final CollectionExpression compositor;
	public final CollectionExpression productor;
	public final CollectionExpression estilo;
	public final CollectionExpression lista;
	public final CollectionExpression cancionesfav;
	
	public CancionDetachedCriteria() {
		super(basededatos.Cancion.class, basededatos.CancionCriteria.class);
		idCancion = new IntegerExpression("idCancion", this.getDetachedCriteria());
		albumId = new IntegerExpression("album.idAlbum", this.getDetachedCriteria());
		album = new AssociationExpression("album", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		estiloMusica = new StringExpression("estiloMusica", this.getDetachedCriteria());
		duracion = new IntegerExpression("duracion", this.getDetachedCriteria());
		ficheroAudio = new StringExpression("ficheroAudio", this.getDetachedCriteria());
		numReproducciones = new IntegerExpression("numReproducciones", this.getDetachedCriteria());
		interprete = new CollectionExpression("ORM_interprete", this.getDetachedCriteria());
		compositor = new CollectionExpression("ORM_compositor", this.getDetachedCriteria());
		productor = new CollectionExpression("ORM_productor", this.getDetachedCriteria());
		estilo = new CollectionExpression("ORM_estilo", this.getDetachedCriteria());
		lista = new CollectionExpression("ORM_lista", this.getDetachedCriteria());
		cancionesfav = new CollectionExpression("ORM_cancionesfav", this.getDetachedCriteria());
	}
	
	public CancionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.CancionCriteria.class);
		idCancion = new IntegerExpression("idCancion", this.getDetachedCriteria());
		albumId = new IntegerExpression("album.idAlbum", this.getDetachedCriteria());
		album = new AssociationExpression("album", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		estiloMusica = new StringExpression("estiloMusica", this.getDetachedCriteria());
		duracion = new IntegerExpression("duracion", this.getDetachedCriteria());
		ficheroAudio = new StringExpression("ficheroAudio", this.getDetachedCriteria());
		numReproducciones = new IntegerExpression("numReproducciones", this.getDetachedCriteria());
		interprete = new CollectionExpression("ORM_interprete", this.getDetachedCriteria());
		compositor = new CollectionExpression("ORM_compositor", this.getDetachedCriteria());
		productor = new CollectionExpression("ORM_productor", this.getDetachedCriteria());
		estilo = new CollectionExpression("ORM_estilo", this.getDetachedCriteria());
		lista = new CollectionExpression("ORM_lista", this.getDetachedCriteria());
		cancionesfav = new CollectionExpression("ORM_cancionesfav", this.getDetachedCriteria());
	}
	
	public AlbumDetachedCriteria createAlbumCriteria() {
		return new AlbumDetachedCriteria(createCriteria("album"));
	}
	
	public basededatos.InterpreteDetachedCriteria createInterpreteCriteria() {
		return new basededatos.InterpreteDetachedCriteria(createCriteria("ORM_interprete"));
	}
	
	public basededatos.CompositorDetachedCriteria createCompositorCriteria() {
		return new basededatos.CompositorDetachedCriteria(createCriteria("ORM_compositor"));
	}
	
	public basededatos.ProductorDetachedCriteria createProductorCriteria() {
		return new basededatos.ProductorDetachedCriteria(createCriteria("ORM_productor"));
	}
	
	public basededatos.EstilosMusicaDetachedCriteria createEstiloCriteria() {
		return new basededatos.EstilosMusicaDetachedCriteria(createCriteria("ORM_estilo"));
	}
	
	public basededatos.ListaDetachedCriteria createListaCriteria() {
		return new basededatos.ListaDetachedCriteria(createCriteria("ORM_lista"));
	}
	
	public basededatos.CancionesFavDetachedCriteria createCancionesfavCriteria() {
		return new basededatos.CancionesFavDetachedCriteria(createCriteria("ORM_cancionesfav"));
	}
	
	public Cancion uniqueCancion(PersistentSession session) {
		return (Cancion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cancion[] listCancion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cancion[]) list.toArray(new Cancion[list.size()]);
	}
}

