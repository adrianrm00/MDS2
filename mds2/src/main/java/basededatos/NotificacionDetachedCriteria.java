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

public class NotificacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idNotificacion;
	public final StringExpression texto;
	public final CollectionExpression usuario;
	
	public NotificacionDetachedCriteria() {
		super(basededatos.Notificacion.class, basededatos.NotificacionCriteria.class);
		idNotificacion = new IntegerExpression("idNotificacion", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_usuario", this.getDetachedCriteria());
	}
	
	public NotificacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.NotificacionCriteria.class);
		idNotificacion = new IntegerExpression("idNotificacion", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_usuario", this.getDetachedCriteria());
	}
	
	public basededatos.UsuarioDetachedCriteria createUsuarioCriteria() {
		return new basededatos.UsuarioDetachedCriteria(createCriteria("ORM_usuario"));
	}
	
	public Notificacion uniqueNotificacion(PersistentSession session) {
		return (Notificacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Notificacion[] listNotificacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

