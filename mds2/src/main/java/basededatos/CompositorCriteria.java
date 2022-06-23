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

public class CompositorCriteria extends AbstractORMCriteria {
	public final IntegerExpression idCompositor;
	public final StringExpression nombre;
	public final CollectionExpression cancion;
	
	public CompositorCriteria(Criteria criteria) {
		super(criteria);
		idCompositor = new IntegerExpression("idCompositor", this);
		nombre = new StringExpression("nombre", this);
		cancion = new CollectionExpression("ORM_cancion", this);
	}
	
	public CompositorCriteria(PersistentSession session) {
		this(session.createCriteria(Compositor.class));
	}
	
	public CompositorCriteria() throws PersistentException {
		this(basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession());
	}
	
	public basededatos.CancionCriteria createCancionCriteria() {
		return new basededatos.CancionCriteria(createCriteria("ORM_cancion"));
	}
	
	public Compositor uniqueCompositor() {
		return (Compositor) super.uniqueResult();
	}
	
	public Compositor[] listCompositor() {
		java.util.List list = super.list();
		return (Compositor[]) list.toArray(new Compositor[list.size()]);
	}
}

