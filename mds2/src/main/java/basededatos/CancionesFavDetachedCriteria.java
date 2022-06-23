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

public class CancionesFavDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression cancionId;
	public final AssociationExpression cancion;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	
	public CancionesFavDetachedCriteria() {
		super(basededatos.CancionesFav.class, basededatos.CancionesFavCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		cancionId = new IntegerExpression("cancion.idCancion", this.getDetachedCriteria());
		cancion = new AssociationExpression("cancion", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.idUsuario", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
	}
	
	public CancionesFavDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.CancionesFavCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		cancionId = new IntegerExpression("cancion.idCancion", this.getDetachedCriteria());
		cancion = new AssociationExpression("cancion", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.idUsuario", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
	}
	
	public CancionDetachedCriteria createCancionCriteria() {
		return new CancionDetachedCriteria(createCriteria("cancion"));
	}
	
	public UsuarioDetachedCriteria createUsuarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuario"));
	}
	
	public CancionesFav uniqueCancionesFav(PersistentSession session) {
		return (CancionesFav) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public CancionesFav[] listCancionesFav(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (CancionesFav[]) list.toArray(new CancionesFav[list.size()]);
	}
}

