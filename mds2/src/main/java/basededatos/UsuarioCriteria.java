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

public class UsuarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression idUsuario;
	public final IntegerExpression notificacionId;
	public final AssociationExpression notificacion;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression nomUsuario;
	public final StringExpression email;
	public final StringExpression contraseña;
	public final StringExpression foto;
	public final StringExpression fechaCreacion;
	public final StringExpression estadisticas;
	public final CollectionExpression lista;
	public final CollectionExpression cancionesFav;
	public final IntegerExpression bibliotecaId;
	public final AssociationExpression biblioteca;
	public final CollectionExpression seguido;
	
	public UsuarioCriteria(Criteria criteria) {
		super(criteria);
		idUsuario = new IntegerExpression("idUsuario", this);
		notificacionId = new IntegerExpression("notificacion.idNotificacion", this);
		notificacion = new AssociationExpression("notificacion", this);
		nombre = new StringExpression("nombre", this);
		apellidos = new StringExpression("apellidos", this);
		nomUsuario = new StringExpression("nomUsuario", this);
		email = new StringExpression("email", this);
		contraseña = new StringExpression("contraseña", this);
		foto = new StringExpression("foto", this);
		fechaCreacion = new StringExpression("fechaCreacion", this);
		estadisticas = new StringExpression("estadisticas", this);
		lista = new CollectionExpression("ORM_lista", this);
		cancionesFav = new CollectionExpression("ORM_cancionesFav", this);
		bibliotecaId = new IntegerExpression("biblioteca.idUsuario", this);
		biblioteca = new AssociationExpression("biblioteca", this);
		seguido = new CollectionExpression("ORM_seguido", this);
	}
	
	public UsuarioCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario.class));
	}
	
	public UsuarioCriteria() throws PersistentException {
		this(basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession());
	}
	
	public NotificacionCriteria createNotificacionCriteria() {
		return new NotificacionCriteria(createCriteria("notificacion"));
	}
	
	public basededatos.ListaCriteria createListaCriteria() {
		return new basededatos.ListaCriteria(createCriteria("ORM_lista"));
	}
	
	public basededatos.CancionesFavCriteria createCancionesFavCriteria() {
		return new basededatos.CancionesFavCriteria(createCriteria("ORM_cancionesFav"));
	}
	
	public BibliotecaCriteria createBibliotecaCriteria() {
		return new BibliotecaCriteria(createCriteria("biblioteca"));
	}
	
	public basededatos.ArtistaCriteria createSeguidoCriteria() {
		return new basededatos.ArtistaCriteria(createCriteria("ORM_seguido"));
	}
	
	public Usuario uniqueUsuario() {
		return (Usuario) super.uniqueResult();
	}
	
	public Usuario[] listUsuario() {
		java.util.List list = super.list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

