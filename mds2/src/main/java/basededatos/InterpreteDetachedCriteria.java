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

public class InterpreteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idInterprete;
	public final StringExpression nombre;
	public final CollectionExpression cancion;
	
	public InterpreteDetachedCriteria() {
		super(basededatos.Interprete.class, basededatos.InterpreteCriteria.class);
		idInterprete = new IntegerExpression("idInterprete", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		cancion = new CollectionExpression("ORM_cancion", this.getDetachedCriteria());
	}
	
	public InterpreteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.InterpreteCriteria.class);
		idInterprete = new IntegerExpression("idInterprete", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		cancion = new CollectionExpression("ORM_cancion", this.getDetachedCriteria());
	}
	
	public basededatos.CancionDetachedCriteria createCancionCriteria() {
		return new basededatos.CancionDetachedCriteria(createCriteria("ORM_cancion"));
	}
	
	public Interprete uniqueInterprete(PersistentSession session) {
		return (Interprete) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Interprete[] listInterprete(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Interprete[]) list.toArray(new Interprete[list.size()]);
	}
}

