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

public class CancionesFavCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression cancionId;
	public final AssociationExpression cancion;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	
	public CancionesFavCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		cancionId = new IntegerExpression("cancion.idCancion", this);
		cancion = new AssociationExpression("cancion", this);
		usuarioId = new IntegerExpression("usuario.idUsuario", this);
		usuario = new AssociationExpression("usuario", this);
	}
	
	public CancionesFavCriteria(PersistentSession session) {
		this(session.createCriteria(CancionesFav.class));
	}
	
	public CancionesFavCriteria() throws PersistentException {
		this(basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession());
	}
	
	public CancionCriteria createCancionCriteria() {
		return new CancionCriteria(createCriteria("cancion"));
	}
	
	public UsuarioCriteria createUsuarioCriteria() {
		return new UsuarioCriteria(createCriteria("usuario"));
	}
	
	public CancionesFav uniqueCancionesFav() {
		return (CancionesFav) super.uniqueResult();
	}
	
	public CancionesFav[] listCancionesFav() {
		java.util.List list = super.list();
		return (CancionesFav[]) list.toArray(new CancionesFav[list.size()]);
	}
}

