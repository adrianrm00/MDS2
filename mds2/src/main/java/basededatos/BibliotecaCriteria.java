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

public class BibliotecaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final CollectionExpression lista;
	public final CollectionExpression album;
	
	public BibliotecaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		usuarioId = new IntegerExpression("usuario.idUsuario", this);
		usuario = new AssociationExpression("usuario", this);
		lista = new CollectionExpression("ORM_lista", this);
		album = new CollectionExpression("ORM_album", this);
	}
	
	public BibliotecaCriteria(PersistentSession session) {
		this(session.createCriteria(Biblioteca.class));
	}
	
	public BibliotecaCriteria() throws PersistentException {
		this(basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createUsuarioCriteria() {
		return new UsuarioCriteria(createCriteria("usuario"));
	}
	
	public basededatos.ListaCriteria createListaCriteria() {
		return new basededatos.ListaCriteria(createCriteria("ORM_lista"));
	}
	
	public basededatos.AlbumCriteria createAlbumCriteria() {
		return new basededatos.AlbumCriteria(createCriteria("ORM_album"));
	}
	
	public Biblioteca uniqueBiblioteca() {
		return (Biblioteca) super.uniqueResult();
	}
	
	public Biblioteca[] listBiblioteca() {
		java.util.List list = super.list();
		return (Biblioteca[]) list.toArray(new Biblioteca[list.size()]);
	}
}

