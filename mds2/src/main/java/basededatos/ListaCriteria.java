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

public class ListaCriteria extends AbstractORMCriteria {
	public final IntegerExpression idLista;
	public final IntegerExpression bibliotecaId;
	public final AssociationExpression biblioteca;
	public final StringExpression nombre;
	public final CollectionExpression usuario;
	public final CollectionExpression cancion;
	
	public ListaCriteria(Criteria criteria) {
		super(criteria);
		idLista = new IntegerExpression("idLista", this);
		bibliotecaId = new IntegerExpression("biblioteca.ID", this);
		biblioteca = new AssociationExpression("biblioteca", this);
		nombre = new StringExpression("nombre", this);
		usuario = new CollectionExpression("ORM_usuario", this);
		cancion = new CollectionExpression("ORM_cancion", this);
	}
	
	public ListaCriteria(PersistentSession session) {
		this(session.createCriteria(Lista.class));
	}
	
	public ListaCriteria() throws PersistentException {
		this(basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession());
	}
	
	public BibliotecaCriteria createBibliotecaCriteria() {
		return new BibliotecaCriteria(createCriteria("biblioteca"));
	}
	
	public basededatos.UsuarioCriteria createUsuarioCriteria() {
		return new basededatos.UsuarioCriteria(createCriteria("ORM_usuario"));
	}
	
	public basededatos.CancionCriteria createCancionCriteria() {
		return new basededatos.CancionCriteria(createCriteria("ORM_cancion"));
	}
	
	public Lista uniqueLista() {
		return (Lista) super.uniqueResult();
	}
	
	public Lista[] listLista() {
		java.util.List list = super.list();
		return (Lista[]) list.toArray(new Lista[list.size()]);
	}
}

