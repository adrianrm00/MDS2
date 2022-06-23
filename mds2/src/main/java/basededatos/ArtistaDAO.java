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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ArtistaDAO {
	public static Artista loadArtistaByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadArtistaByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return getArtistaByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadArtistaByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return getArtistaByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Artista) session.load(basededatos.Artista.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Artista) session.get(basededatos.Artista.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Artista) session.load(basededatos.Artista.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Artista) session.get(basededatos.Artista.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return queryArtista(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return queryArtista(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return listArtistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return listArtistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Artista", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryArtista(session, condition, orderBy);
			return (Artista[]) list.toArray(new Artista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryArtista(session, condition, orderBy, lockMode);
			return (Artista[]) list.toArray(new Artista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadArtistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadArtistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Artista[] artistas = listArtistaByQuery(session, condition, orderBy);
		if (artistas != null && artistas.length > 0)
			return artistas[0];
		else
			return null;
	}
	
	public static Artista loadArtistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Artista[] artistas = listArtistaByQuery(session, condition, orderBy, lockMode);
		if (artistas != null && artistas.length > 0)
			return artistas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateArtistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return iterateArtistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArtistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return iterateArtistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArtistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArtistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Artista", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista createArtista() {
		return new basededatos.Artista();
	}
	
	public static boolean save(basededatos.Artista artista) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().saveObject(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Artista artista) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().deleteObject(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Artista artista)throws PersistentException {
		try {
			basededatos.Usuario[] lSeguidors = artista.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].seguido.remove(artista);
			}
			basededatos.Album[] lAlbums = artista.album.toArray();
			for(int i = 0; i < lAlbums.length; i++) {
				lAlbums[i].artista.remove(artista);
			}
			basededatos.EstilosMusica[] lEstilos = artista.estilo.toArray();
			for(int i = 0; i < lEstilos.length; i++) {
				lEstilos[i].setArtista(null);
			}
			basededatos.Evento[] lEventos = artista.evento.toArray();
			for(int i = 0; i < lEventos.length; i++) {
				lEventos[i].setArtista(null);
			}
			if (artista.getNotificacion() != null) {
				artista.getNotificacion().usuario.remove(artista);
			}
			
			basededatos.Lista[] lListas = artista.lista.toArray();
			for(int i = 0; i < lListas.length; i++) {
				lListas[i].usuario.remove(artista);
			}
			basededatos.CancionesFav[] lCancionesFavs = artista.cancionesFav.toArray();
			for(int i = 0; i < lCancionesFavs.length; i++) {
				lCancionesFavs[i].setUsuario(null);
			}
			if (artista.getBiblioteca() != null) {
				artista.getBiblioteca().setUsuario(null);
			}
			
			basededatos.Artista[] lSeguidos = artista.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor.remove(artista);
			}
			return delete(artista);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Artista artista, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Usuario[] lSeguidors = artista.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].seguido.remove(artista);
			}
			basededatos.Album[] lAlbums = artista.album.toArray();
			for(int i = 0; i < lAlbums.length; i++) {
				lAlbums[i].artista.remove(artista);
			}
			basededatos.EstilosMusica[] lEstilos = artista.estilo.toArray();
			for(int i = 0; i < lEstilos.length; i++) {
				lEstilos[i].setArtista(null);
			}
			basededatos.Evento[] lEventos = artista.evento.toArray();
			for(int i = 0; i < lEventos.length; i++) {
				lEventos[i].setArtista(null);
			}
			if (artista.getNotificacion() != null) {
				artista.getNotificacion().usuario.remove(artista);
			}
			
			basededatos.Lista[] lListas = artista.lista.toArray();
			for(int i = 0; i < lListas.length; i++) {
				lListas[i].usuario.remove(artista);
			}
			basededatos.CancionesFav[] lCancionesFavs = artista.cancionesFav.toArray();
			for(int i = 0; i < lCancionesFavs.length; i++) {
				lCancionesFavs[i].setUsuario(null);
			}
			if (artista.getBiblioteca() != null) {
				artista.getBiblioteca().setUsuario(null);
			}
			
			basededatos.Artista[] lSeguidos = artista.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor.remove(artista);
			}
			try {
				session.delete(artista);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(basededatos.Artista artista) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().refresh(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Artista artista) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().evict(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByCriteria(ArtistaCriteria artistaCriteria) {
		Artista[] artistas = listArtistaByCriteria(artistaCriteria);
		if(artistas == null || artistas.length == 0) {
			return null;
		}
		return artistas[0];
	}
	
	public static Artista[] listArtistaByCriteria(ArtistaCriteria artistaCriteria) {
		return artistaCriteria.listArtista();
	}
}
