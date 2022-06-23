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

public class AlbumCriteria extends AbstractORMCriteria {
	public final IntegerExpression idAlbum;
	public final IntegerExpression bibliotecaId;
	public final AssociationExpression biblioteca;
	public final StringExpression nombre;
	public final StringExpression fotoAlbum;
	public final CollectionExpression artista;
	public final CollectionExpression cancion;
	
	public AlbumCriteria(Criteria criteria) {
		super(criteria);
		idAlbum = new IntegerExpression("idAlbum", this);
		bibliotecaId = new IntegerExpression("biblioteca.ID", this);
		biblioteca = new AssociationExpression("biblioteca", this);
		nombre = new StringExpression("nombre", this);
		fotoAlbum = new StringExpression("fotoAlbum", this);
		artista = new CollectionExpression("ORM_artista", this);
		cancion = new CollectionExpression("ORM_cancion", this);
	}
	
	public AlbumCriteria(PersistentSession session) {
		this(session.createCriteria(Album.class));
	}
	
	public AlbumCriteria() throws PersistentException {
		this(basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession());
	}
	
	public BibliotecaCriteria createBibliotecaCriteria() {
		return new BibliotecaCriteria(createCriteria("biblioteca"));
	}
	
	public basededatos.ArtistaCriteria createArtistaCriteria() {
		return new basededatos.ArtistaCriteria(createCriteria("ORM_artista"));
	}
	
	public basededatos.CancionCriteria createCancionCriteria() {
		return new basededatos.CancionCriteria(createCriteria("ORM_cancion"));
	}
	
	public Album uniqueAlbum() {
		return (Album) super.uniqueResult();
	}
	
	public Album[] listAlbum() {
		java.util.List list = super.list();
		return (Album[]) list.toArray(new Album[list.size()]);
	}
}

