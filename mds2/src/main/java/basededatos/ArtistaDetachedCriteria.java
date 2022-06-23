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

public class ArtistaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final IntegerExpression idArtista;
	public final StringExpression nombreArtista;
	public final CollectionExpression seguidor;
	public final CollectionExpression album;
	public final CollectionExpression estilo;
	public final CollectionExpression evento;
	
	public ArtistaDetachedCriteria() {
		super(basededatos.Artista.class, basededatos.ArtistaCriteria.class);
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
		idArtista = new IntegerExpression("idArtista", this.getDetachedCriteria());
		nombreArtista = new StringExpression("nombreArtista", this.getDetachedCriteria());
		seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		album = new CollectionExpression("ORM_album", this.getDetachedCriteria());
		estilo = new CollectionExpression("ORM_estilo", this.getDetachedCriteria());
		evento = new CollectionExpression("ORM_evento", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ArtistaCriteria.class);
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
		idArtista = new IntegerExpression("idArtista", this.getDetachedCriteria());
		nombreArtista = new StringExpression("nombreArtista", this.getDetachedCriteria());
		seguidor = new CollectionExpression("ORM_seguidor", this.getDetachedCriteria());
		album = new CollectionExpression("ORM_album", this.getDetachedCriteria());
		estilo = new CollectionExpression("ORM_estilo", this.getDetachedCriteria());
		evento = new CollectionExpression("ORM_evento", this.getDetachedCriteria());
	}
	
	public basededatos.UsuarioDetachedCriteria createSeguidorCriteria() {
		return new basededatos.UsuarioDetachedCriteria(createCriteria("ORM_seguidor"));
	}
	
	public basededatos.AlbumDetachedCriteria createAlbumCriteria() {
		return new basededatos.AlbumDetachedCriteria(createCriteria("ORM_album"));
	}
	
	public basededatos.EstilosMusicaDetachedCriteria createEstiloCriteria() {
		return new basededatos.EstilosMusicaDetachedCriteria(createCriteria("ORM_estilo"));
	}
	
	public basededatos.EventoDetachedCriteria createEventoCriteria() {
		return new basededatos.EventoDetachedCriteria(createCriteria("ORM_evento"));
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
	
	public Artista uniqueArtista(PersistentSession session) {
		return (Artista) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Artista[] listArtista(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Artista[]) list.toArray(new Artista[list.size()]);
	}
}

