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

public class CompositorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idCompositor;
	public final StringExpression nombre;
	public final CollectionExpression cancion;
	
	public CompositorDetachedCriteria() {
		super(basededatos.Compositor.class, basededatos.CompositorCriteria.class);
		idCompositor = new IntegerExpression("idCompositor", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		cancion = new CollectionExpression("ORM_cancion", this.getDetachedCriteria());
	}
	
	public CompositorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.CompositorCriteria.class);
		idCompositor = new IntegerExpression("idCompositor", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		cancion = new CollectionExpression("ORM_cancion", this.getDetachedCriteria());
	}
	
	public basededatos.CancionDetachedCriteria createCancionCriteria() {
		return new basededatos.CancionDetachedCriteria(createCriteria("ORM_cancion"));
	}
	
	public Compositor uniqueCompositor(PersistentSession session) {
		return (Compositor) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Compositor[] listCompositor(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Compositor[]) list.toArray(new Compositor[list.size()]);
	}
}

