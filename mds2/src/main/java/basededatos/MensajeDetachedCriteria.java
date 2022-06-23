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

public class MensajeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression usuario_RegId;
	public final AssociationExpression usuario_Reg;
	public final StringExpression texto;
	public final CollectionExpression administrador;
	
	public MensajeDetachedCriteria() {
		super(basededatos.Mensaje.class, basededatos.MensajeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		usuario_RegId = new IntegerExpression("usuario_Reg.", this.getDetachedCriteria());
		usuario_Reg = new AssociationExpression("usuario_Reg", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		administrador = new CollectionExpression("ORM_administrador", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.MensajeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		usuario_RegId = new IntegerExpression("usuario_Reg.", this.getDetachedCriteria());
		usuario_Reg = new AssociationExpression("usuario_Reg", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		administrador = new CollectionExpression("ORM_administrador", this.getDetachedCriteria());
	}
	
	public Usuario_RegDetachedCriteria createUsuario_RegCriteria() {
		return new Usuario_RegDetachedCriteria(createCriteria("usuario_Reg"));
	}
	
	public basededatos.AdministradorDetachedCriteria createAdministradorCriteria() {
		return new basededatos.AdministradorDetachedCriteria(createCriteria("ORM_administrador"));
	}
	
	public Mensaje uniqueMensaje(PersistentSession session) {
		return (Mensaje) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Mensaje[] listMensaje(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

