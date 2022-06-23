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

public class NotificacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idNotificacion;
	public final StringExpression texto;
	public final CollectionExpression usuario;
	
	public NotificacionCriteria(Criteria criteria) {
		super(criteria);
		idNotificacion = new IntegerExpression("idNotificacion", this);
		texto = new StringExpression("texto", this);
		usuario = new CollectionExpression("ORM_usuario", this);
	}
	
	public NotificacionCriteria(PersistentSession session) {
		this(session.createCriteria(Notificacion.class));
	}
	
	public NotificacionCriteria() throws PersistentException {
		this(basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession());
	}
	
	public basededatos.UsuarioCriteria createUsuarioCriteria() {
		return new basededatos.UsuarioCriteria(createCriteria("ORM_usuario"));
	}
	
	public Notificacion uniqueNotificacion() {
		return (Notificacion) super.uniqueResult();
	}
	
	public Notificacion[] listNotificacion() {
		java.util.List list = super.list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

