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

public class ListaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idLista;
	public final IntegerExpression bibliotecaId;
	public final AssociationExpression biblioteca;
	public final StringExpression nombre;
	public final CollectionExpression usuario;
	public final CollectionExpression cancion;
	
	public ListaDetachedCriteria() {
		super(basededatos.Lista.class, basededatos.ListaCriteria.class);
		idLista = new IntegerExpression("idLista", this.getDetachedCriteria());
		bibliotecaId = new IntegerExpression("biblioteca.ID", this.getDetachedCriteria());
		biblioteca = new AssociationExpression("biblioteca", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_usuario", this.getDetachedCriteria());
		cancion = new CollectionExpression("ORM_cancion", this.getDetachedCriteria());
	}
	
	public ListaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ListaCriteria.class);
		idLista = new IntegerExpression("idLista", this.getDetachedCriteria());
		bibliotecaId = new IntegerExpression("biblioteca.ID", this.getDetachedCriteria());
		biblioteca = new AssociationExpression("biblioteca", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		usuario = new CollectionExpression("ORM_usuario", this.getDetachedCriteria());
		cancion = new CollectionExpression("ORM_cancion", this.getDetachedCriteria());
	}
	
	public BibliotecaDetachedCriteria createBibliotecaCriteria() {
		return new BibliotecaDetachedCriteria(createCriteria("biblioteca"));
	}
	
	public basededatos.UsuarioDetachedCriteria createUsuarioCriteria() {
		return new basededatos.UsuarioDetachedCriteria(createCriteria("ORM_usuario"));
	}
	
	public basededatos.CancionDetachedCriteria createCancionCriteria() {
		return new basededatos.CancionDetachedCriteria(createCriteria("ORM_cancion"));
	}
	
	public Lista uniqueLista(PersistentSession session) {
		return (Lista) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Lista[] listLista(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Lista[]) list.toArray(new Lista[list.size()]);
	}
}

