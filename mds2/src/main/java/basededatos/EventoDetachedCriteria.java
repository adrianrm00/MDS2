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

public class EventoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression artistaId;
	public final AssociationExpression artista;
	public final StringExpression nombreEvento;
	public final StringExpression ciudad;
	
	public EventoDetachedCriteria() {
		super(basededatos.Evento.class, basededatos.EventoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		artistaId = new IntegerExpression("artista.", this.getDetachedCriteria());
		artista = new AssociationExpression("artista", this.getDetachedCriteria());
		nombreEvento = new StringExpression("nombreEvento", this.getDetachedCriteria());
		ciudad = new StringExpression("ciudad", this.getDetachedCriteria());
	}
	
	public EventoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.EventoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		artistaId = new IntegerExpression("artista.", this.getDetachedCriteria());
		artista = new AssociationExpression("artista", this.getDetachedCriteria());
		nombreEvento = new StringExpression("nombreEvento", this.getDetachedCriteria());
		ciudad = new StringExpression("ciudad", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria createArtistaCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("artista"));
	}
	
	public Evento uniqueEvento(PersistentSession session) {
		return (Evento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Evento[] listEvento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Evento[]) list.toArray(new Evento[list.size()]);
	}
}

