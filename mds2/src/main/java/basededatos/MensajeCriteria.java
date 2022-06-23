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

public class MensajeCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression usuario_RegId;
	public final AssociationExpression usuario_Reg;
	public final StringExpression texto;
	public final CollectionExpression administrador;
	
	public MensajeCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		usuario_RegId = new IntegerExpression("usuario_Reg.", this);
		usuario_Reg = new AssociationExpression("usuario_Reg", this);
		texto = new StringExpression("texto", this);
		administrador = new CollectionExpression("ORM_administrador", this);
	}
	
	public MensajeCriteria(PersistentSession session) {
		this(session.createCriteria(Mensaje.class));
	}
	
	public MensajeCriteria() throws PersistentException {
		this(basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession());
	}
	
	public Usuario_RegCriteria createUsuario_RegCriteria() {
		return new Usuario_RegCriteria(createCriteria("usuario_Reg"));
	}
	
	public basededatos.AdministradorCriteria createAdministradorCriteria() {
		return new basededatos.AdministradorCriteria(createCriteria("ORM_administrador"));
	}
	
	public Mensaje uniqueMensaje() {
		return (Mensaje) super.uniqueResult();
	}
	
	public Mensaje[] listMensaje() {
		java.util.List list = super.list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

