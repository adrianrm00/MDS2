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

public class ProductorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idProductor;
	public final StringExpression nombre;
	public final CollectionExpression cancion;
	
	public ProductorDetachedCriteria() {
		super(basededatos.Productor.class, basededatos.ProductorCriteria.class);
		idProductor = new IntegerExpression("idProductor", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		cancion = new CollectionExpression("ORM_cancion", this.getDetachedCriteria());
	}
	
	public ProductorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ProductorCriteria.class);
		idProductor = new IntegerExpression("idProductor", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		cancion = new CollectionExpression("ORM_cancion", this.getDetachedCriteria());
	}
	
	public basededatos.CancionDetachedCriteria createCancionCriteria() {
		return new basededatos.CancionDetachedCriteria(createCriteria("ORM_cancion"));
	}
	
	public Productor uniqueProductor(PersistentSession session) {
		return (Productor) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Productor[] listProductor(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Productor[]) list.toArray(new Productor[list.size()]);
	}
}

