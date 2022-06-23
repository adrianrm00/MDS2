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

public class BibliotecaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final CollectionExpression lista;
	public final CollectionExpression album;
	
	public BibliotecaDetachedCriteria() {
		super(basededatos.Biblioteca.class, basededatos.BibliotecaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.idUsuario", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		lista = new CollectionExpression("ORM_lista", this.getDetachedCriteria());
		album = new CollectionExpression("ORM_album", this.getDetachedCriteria());
	}
	
	public BibliotecaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.BibliotecaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.idUsuario", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		lista = new CollectionExpression("ORM_lista", this.getDetachedCriteria());
		album = new CollectionExpression("ORM_album", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createUsuarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuario"));
	}
	
	public basededatos.ListaDetachedCriteria createListaCriteria() {
		return new basededatos.ListaDetachedCriteria(createCriteria("ORM_lista"));
	}
	
	public basededatos.AlbumDetachedCriteria createAlbumCriteria() {
		return new basededatos.AlbumDetachedCriteria(createCriteria("ORM_album"));
	}
	
	public Biblioteca uniqueBiblioteca(PersistentSession session) {
		return (Biblioteca) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Biblioteca[] listBiblioteca(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Biblioteca[]) list.toArray(new Biblioteca[list.size()]);
	}
}

