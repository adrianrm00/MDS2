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

public class ProductorCriteria extends AbstractORMCriteria {
	public final IntegerExpression idProductor;
	public final StringExpression nombre;
	public final CollectionExpression cancion;
	
	public ProductorCriteria(Criteria criteria) {
		super(criteria);
		idProductor = new IntegerExpression("idProductor", this);
		nombre = new StringExpression("nombre", this);
		cancion = new CollectionExpression("ORM_cancion", this);
	}
	
	public ProductorCriteria(PersistentSession session) {
		this(session.createCriteria(Productor.class));
	}
	
	public ProductorCriteria() throws PersistentException {
		this(basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession());
	}
	
	public basededatos.CancionCriteria createCancionCriteria() {
		return new basededatos.CancionCriteria(createCriteria("ORM_cancion"));
	}
	
	public Productor uniqueProductor() {
		return (Productor) super.uniqueResult();
	}
	
	public Productor[] listProductor() {
		java.util.List list = super.list();
		return (Productor[]) list.toArray(new Productor[list.size()]);
	}
}

