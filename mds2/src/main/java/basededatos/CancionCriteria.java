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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CancionCriteria extends AbstractORMCriteria {
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
	
	public CancionCriteria(Criteria criteria) {
		super(criteria);
		idCancion = new IntegerExpression("idCancion", this);
		albumId = new IntegerExpression("album.idAlbum", this);
		album = new AssociationExpression("album", this);
		titulo = new StringExpression("titulo", this);
		estiloMusica = new StringExpression("estiloMusica", this);
		duracion = new IntegerExpression("duracion", this);
		ficheroAudio = new StringExpression("ficheroAudio", this);
		numReproducciones = new IntegerExpression("numReproducciones", this);
		interprete = new CollectionExpression("ORM_interprete", this);
		compositor = new CollectionExpression("ORM_compositor", this);
		productor = new CollectionExpression("ORM_productor", this);
		estilo = new CollectionExpression("ORM_estilo", this);
		lista = new CollectionExpression("ORM_lista", this);
		cancionesfav = new CollectionExpression("ORM_cancionesfav", this);
	}
	
	public CancionCriteria(PersistentSession session) {
		this(session.createCriteria(Cancion.class));
	}
	
	public CancionCriteria() throws PersistentException {
		this(basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession());
	}
	
	public AlbumCriteria createAlbumCriteria() {
		return new AlbumCriteria(createCriteria("album"));
	}
	
	public basededatos.InterpreteCriteria createInterpreteCriteria() {
		return new basededatos.InterpreteCriteria(createCriteria("ORM_interprete"));
	}
	
	public basededatos.CompositorCriteria createCompositorCriteria() {
		return new basededatos.CompositorCriteria(createCriteria("ORM_compositor"));
	}
	
	public basededatos.ProductorCriteria createProductorCriteria() {
		return new basededatos.ProductorCriteria(createCriteria("ORM_productor"));
	}
	
	public basededatos.EstilosMusicaCriteria createEstiloCriteria() {
		return new basededatos.EstilosMusicaCriteria(createCriteria("ORM_estilo"));
	}
	
	public basededatos.ListaCriteria createListaCriteria() {
		return new basededatos.ListaCriteria(createCriteria("ORM_lista"));
	}
	
	public basededatos.CancionesFavCriteria createCancionesfavCriteria() {
		return new basededatos.CancionesFavCriteria(createCriteria("ORM_cancionesfav"));
	}
	
	public Cancion uniqueCancion() {
		return (Cancion) super.uniqueResult();
	}
	
	public Cancion[] listCancion() {
		java.util.List list = super.list();
		return (Cancion[]) list.toArray(new Cancion[list.size()]);
	}
}

