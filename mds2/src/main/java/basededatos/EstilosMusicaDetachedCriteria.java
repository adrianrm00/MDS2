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

public class EstilosMusicaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idEstilo;
	public final IntegerExpression artistaId;
	public final AssociationExpression artista;
	public final StringExpression nombreEstilo;
	public final CollectionExpression cancion;
	
	public EstilosMusicaDetachedCriteria() {
		super(basededatos.EstilosMusica.class, basededatos.EstilosMusicaCriteria.class);
		idEstilo = new IntegerExpression("idEstilo", this.getDetachedCriteria());
		artistaId = new IntegerExpression("artista.", this.getDetachedCriteria());
		artista = new AssociationExpression("artista", this.getDetachedCriteria());
		nombreEstilo = new StringExpression("nombreEstilo", this.getDetachedCriteria());
		cancion = new CollectionExpression("ORM_cancion", this.getDetachedCriteria());
	}
	
	public EstilosMusicaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.EstilosMusicaCriteria.class);
		idEstilo = new IntegerExpression("idEstilo", this.getDetachedCriteria());
		artistaId = new IntegerExpression("artista.", this.getDetachedCriteria());
		artista = new AssociationExpression("artista", this.getDetachedCriteria());
		nombreEstilo = new StringExpression("nombreEstilo", this.getDetachedCriteria());
		cancion = new CollectionExpression("ORM_cancion", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria createArtistaCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("artista"));
	}
	
	public basededatos.CancionDetachedCriteria createCancionCriteria() {
		return new basededatos.CancionDetachedCriteria(createCriteria("ORM_cancion"));
	}
	
	public EstilosMusica uniqueEstilosMusica(PersistentSession session) {
		return (EstilosMusica) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EstilosMusica[] listEstilosMusica(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EstilosMusica[]) list.toArray(new EstilosMusica[list.size()]);
	}
}

