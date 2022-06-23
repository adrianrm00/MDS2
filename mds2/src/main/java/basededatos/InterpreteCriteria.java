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

public class InterpreteCriteria extends AbstractORMCriteria {
	public final IntegerExpression idInterprete;
	public final StringExpression nombre;
	public final CollectionExpression cancion;
	
	public InterpreteCriteria(Criteria criteria) {
		super(criteria);
		idInterprete = new IntegerExpression("idInterprete", this);
		nombre = new StringExpression("nombre", this);
		cancion = new CollectionExpression("ORM_cancion", this);
	}
	
	public InterpreteCriteria(PersistentSession session) {
		this(session.createCriteria(Interprete.class));
	}
	
	public InterpreteCriteria() throws PersistentException {
		this(basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession());
	}
	
	public basededatos.CancionCriteria createCancionCriteria() {
		return new basededatos.CancionCriteria(createCriteria("ORM_cancion"));
	}
	
	public Interprete uniqueInterprete() {
		return (Interprete) super.uniqueResult();
	}
	
	public Interprete[] listInterprete() {
		java.util.List list = super.list();
		return (Interprete[]) list.toArray(new Interprete[list.size()]);
	}
}

