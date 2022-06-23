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

public class AdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression mensajeId;
	public final AssociationExpression mensaje;
	public final StringExpression email;
	public final StringExpression contraseña;
	
	public AdministradorDetachedCriteria() {
		super(basededatos.Administrador.class, basededatos.AdministradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		mensajeId = new IntegerExpression("mensaje.ID", this.getDetachedCriteria());
		mensaje = new AssociationExpression("mensaje", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.AdministradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		mensajeId = new IntegerExpression("mensaje.ID", this.getDetachedCriteria());
		mensaje = new AssociationExpression("mensaje", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria createMensajeCriteria() {
		return new MensajeDetachedCriteria(createCriteria("mensaje"));
	}
	
	public Administrador uniqueAdministrador(PersistentSession session) {
		return (Administrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrador[] listAdministrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

