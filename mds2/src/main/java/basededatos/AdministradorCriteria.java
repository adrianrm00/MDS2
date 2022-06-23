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

public class AdministradorCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression mensajeId;
	public final AssociationExpression mensaje;
	public final StringExpression email;
	public final StringExpression contraseña;
	
	public AdministradorCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		mensajeId = new IntegerExpression("mensaje.ID", this);
		mensaje = new AssociationExpression("mensaje", this);
		email = new StringExpression("email", this);
		contraseña = new StringExpression("contraseña", this);
	}
	
	public AdministradorCriteria(PersistentSession session) {
		this(session.createCriteria(Administrador.class));
	}
	
	public AdministradorCriteria() throws PersistentException {
		this(basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession());
	}
	
	public MensajeCriteria createMensajeCriteria() {
		return new MensajeCriteria(createCriteria("mensaje"));
	}
	
	public Administrador uniqueAdministrador() {
		return (Administrador) super.uniqueResult();
	}
	
	public Administrador[] listAdministrador() {
		java.util.List list = super.list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

