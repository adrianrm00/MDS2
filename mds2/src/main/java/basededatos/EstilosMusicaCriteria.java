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

public class EstilosMusicaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idEstilo;
	public final IntegerExpression artistaId;
	public final AssociationExpression artista;
	public final StringExpression nombreEstilo;
	public final CollectionExpression cancion;
	
	public EstilosMusicaCriteria(Criteria criteria) {
		super(criteria);
		idEstilo = new IntegerExpression("idEstilo", this);
		artistaId = new IntegerExpression("artista.", this);
		artista = new AssociationExpression("artista", this);
		nombreEstilo = new StringExpression("nombreEstilo", this);
		cancion = new CollectionExpression("ORM_cancion", this);
	}
	
	public EstilosMusicaCriteria(PersistentSession session) {
		this(session.createCriteria(EstilosMusica.class));
	}
	
	public EstilosMusicaCriteria() throws PersistentException {
		this(basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession());
	}
	
	public ArtistaCriteria createArtistaCriteria() {
		return new ArtistaCriteria(createCriteria("artista"));
	}
	
	public basededatos.CancionCriteria createCancionCriteria() {
		return new basededatos.CancionCriteria(createCriteria("ORM_cancion"));
	}
	
	public EstilosMusica uniqueEstilosMusica() {
		return (EstilosMusica) super.uniqueResult();
	}
	
	public EstilosMusica[] listEstilosMusica() {
		java.util.List list = super.list();
		return (EstilosMusica[]) list.toArray(new EstilosMusica[list.size()]);
	}
}

