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

public class AlbumDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idAlbum;
	public final IntegerExpression bibliotecaId;
	public final AssociationExpression biblioteca;
	public final StringExpression nombre;
	public final StringExpression fotoAlbum;
	public final CollectionExpression artista;
	public final CollectionExpression cancion;
	
	public AlbumDetachedCriteria() {
		super(basededatos.Album.class, basededatos.AlbumCriteria.class);
		idAlbum = new IntegerExpression("idAlbum", this.getDetachedCriteria());
		bibliotecaId = new IntegerExpression("biblioteca.ID", this.getDetachedCriteria());
		biblioteca = new AssociationExpression("biblioteca", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		fotoAlbum = new StringExpression("fotoAlbum", this.getDetachedCriteria());
		artista = new CollectionExpression("ORM_artista", this.getDetachedCriteria());
		cancion = new CollectionExpression("ORM_cancion", this.getDetachedCriteria());
	}
	
	public AlbumDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.AlbumCriteria.class);
		idAlbum = new IntegerExpression("idAlbum", this.getDetachedCriteria());
		bibliotecaId = new IntegerExpression("biblioteca.ID", this.getDetachedCriteria());
		biblioteca = new AssociationExpression("biblioteca", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		fotoAlbum = new StringExpression("fotoAlbum", this.getDetachedCriteria());
		artista = new CollectionExpression("ORM_artista", this.getDetachedCriteria());
		cancion = new CollectionExpression("ORM_cancion", this.getDetachedCriteria());
	}
	
	public BibliotecaDetachedCriteria createBibliotecaCriteria() {
		return new BibliotecaDetachedCriteria(createCriteria("biblioteca"));
	}
	
	public basededatos.ArtistaDetachedCriteria createArtistaCriteria() {
		return new basededatos.ArtistaDetachedCriteria(createCriteria("ORM_artista"));
	}
	
	public basededatos.CancionDetachedCriteria createCancionCriteria() {
		return new basededatos.CancionDetachedCriteria(createCriteria("ORM_cancion"));
	}
	
	public Album uniqueAlbum(PersistentSession session) {
		return (Album) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Album[] listAlbum(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Album[]) list.toArray(new Album[list.size()]);
	}
}

