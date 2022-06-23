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

public class Usuario_RegDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final IntegerExpression mensajeId;
	public final AssociationExpression mensaje;
	
	public Usuario_RegDetachedCriteria() {
		super(basededatos.Usuario_Reg.class, basededatos.Usuario_RegCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		notificacionId = new IntegerExpression("notificacion.idNotificacion", this.getDetachedCriteria());
		notificacion = new AssociationExpression("notificacion", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		nomUsuario = new StringExpression("nomUsuario", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		fechaCreacion = new StringExpression("fechaCreacion", this.getDetachedCriteria());
		estadisticas = new StringExpression("estadisticas", this.getDetachedCriteria());
		lista = new CollectionExpression("ORM_lista", this.getDetachedCriteria());
		cancionesFav = new CollectionExpression("ORM_cancionesFav", this.getDetachedCriteria());
		bibliotecaId = new IntegerExpression("biblioteca.idUsuario", this.getDetachedCriteria());
		biblioteca = new AssociationExpression("biblioteca", this.getDetachedCriteria());
		seguido = new CollectionExpression("ORM_seguido", this.getDetachedCriteria());
		mensajeId = new IntegerExpression("mensaje.", this.getDetachedCriteria());
		mensaje = new AssociationExpression("mensaje", this.getDetachedCriteria());
	}
	
	public Usuario_RegDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Usuario_RegCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		notificacionId = new IntegerExpression("notificacion.idNotificacion", this.getDetachedCriteria());
		notificacion = new AssociationExpression("notificacion", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		nomUsuario = new StringExpression("nomUsuario", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		fechaCreacion = new StringExpression("fechaCreacion", this.getDetachedCriteria());
		estadisticas = new StringExpression("estadisticas", this.getDetachedCriteria());
		lista = new CollectionExpression("ORM_lista", this.getDetachedCriteria());
		cancionesFav = new CollectionExpression("ORM_cancionesFav", this.getDetachedCriteria());
		bibliotecaId = new IntegerExpression("biblioteca.idUsuario", this.getDetachedCriteria());
		biblioteca = new AssociationExpression("biblioteca", this.getDetachedCriteria());
		seguido = new CollectionExpression("ORM_seguido", this.getDetachedCriteria());
		mensajeId = new IntegerExpression("mensaje.", this.getDetachedCriteria());
		mensaje = new AssociationExpression("mensaje", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria createMensajeCriteria() {
		return new MensajeDetachedCriteria(createCriteria("mensaje"));
	}
	
	public NotificacionDetachedCriteria createNotificacionCriteria() {
		return new NotificacionDetachedCriteria(createCriteria("notificacion"));
	}
	
	public basededatos.ListaDetachedCriteria createListaCriteria() {
		return new basededatos.ListaDetachedCriteria(createCriteria("ORM_lista"));
	}
	
	public basededatos.CancionesFavDetachedCriteria createCancionesFavCriteria() {
		return new basededatos.CancionesFavDetachedCriteria(createCriteria("ORM_cancionesFav"));
	}
	
	public BibliotecaDetachedCriteria createBibliotecaCriteria() {
		return new BibliotecaDetachedCriteria(createCriteria("biblioteca"));
	}
	
	public basededatos.ArtistaDetachedCriteria createSeguidoCriteria() {
		return new basededatos.ArtistaDetachedCriteria(createCriteria("ORM_seguido"));
	}
	
	public Usuario_Reg uniqueUsuario_Reg(PersistentSession session) {
		return (Usuario_Reg) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario_Reg[] listUsuario_Reg(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario_Reg[]) list.toArray(new Usuario_Reg[list.size()]);
	}
}

