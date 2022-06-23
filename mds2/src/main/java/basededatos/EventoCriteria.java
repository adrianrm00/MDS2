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

public class EventoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression artistaId;
	public final AssociationExpression artista;
	public final StringExpression nombreEvento;
	public final StringExpression ciudad;
	
	public EventoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		artistaId = new IntegerExpression("artista.", this);
		artista = new AssociationExpression("artista", this);
		nombreEvento = new StringExpression("nombreEvento", this);
		ciudad = new StringExpression("ciudad", this);
	}
	
	public EventoCriteria(PersistentSession session) {
		this(session.createCriteria(Evento.class));
	}
	
	public EventoCriteria() throws PersistentException {
		this(basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession());
	}
	
	public ArtistaCriteria createArtistaCriteria() {
		return new ArtistaCriteria(createCriteria("artista"));
	}
	
	public Evento uniqueEvento() {
		return (Evento) super.uniqueResult();
	}
	
	public Evento[] listEvento() {
		java.util.List list = super.list();
		return (Evento[]) list.toArray(new Evento[list.size()]);
	}
}

