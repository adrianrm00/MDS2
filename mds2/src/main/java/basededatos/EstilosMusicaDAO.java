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

public class EstilosMusicaDAO {
	public static EstilosMusica loadEstilosMusicaByORMID(int idEstilo) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadEstilosMusicaByORMID(session, idEstilo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EstilosMusica getEstilosMusicaByORMID(int idEstilo) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return getEstilosMusicaByORMID(session, idEstilo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EstilosMusica loadEstilosMusicaByORMID(int idEstilo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadEstilosMusicaByORMID(session, idEstilo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EstilosMusica getEstilosMusicaByORMID(int idEstilo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return getEstilosMusicaByORMID(session, idEstilo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EstilosMusica loadEstilosMusicaByORMID(PersistentSession session, int idEstilo) throws PersistentException {
		try {
			return (EstilosMusica) session.load(basededatos.EstilosMusica.class, Integer.valueOf(idEstilo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EstilosMusica getEstilosMusicaByORMID(PersistentSession session, int idEstilo) throws PersistentException {
		try {
			return (EstilosMusica) session.get(basededatos.EstilosMusica.class, Integer.valueOf(idEstilo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EstilosMusica loadEstilosMusicaByORMID(PersistentSession session, int idEstilo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EstilosMusica) session.load(basededatos.EstilosMusica.class, Integer.valueOf(idEstilo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EstilosMusica getEstilosMusicaByORMID(PersistentSession session, int idEstilo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EstilosMusica) session.get(basededatos.EstilosMusica.class, Integer.valueOf(idEstilo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstilosMusica(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return queryEstilosMusica(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstilosMusica(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return queryEstilosMusica(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EstilosMusica[] listEstilosMusicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return listEstilosMusicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EstilosMusica[] listEstilosMusicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return listEstilosMusicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstilosMusica(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.EstilosMusica as EstilosMusica");
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
	
	public static List queryEstilosMusica(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.EstilosMusica as EstilosMusica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EstilosMusica", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EstilosMusica[] listEstilosMusicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEstilosMusica(session, condition, orderBy);
			return (EstilosMusica[]) list.toArray(new EstilosMusica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EstilosMusica[] listEstilosMusicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEstilosMusica(session, condition, orderBy, lockMode);
			return (EstilosMusica[]) list.toArray(new EstilosMusica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EstilosMusica loadEstilosMusicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadEstilosMusicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EstilosMusica loadEstilosMusicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadEstilosMusicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EstilosMusica loadEstilosMusicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EstilosMusica[] estilosMusicas = listEstilosMusicaByQuery(session, condition, orderBy);
		if (estilosMusicas != null && estilosMusicas.length > 0)
			return estilosMusicas[0];
		else
			return null;
	}
	
	public static EstilosMusica loadEstilosMusicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EstilosMusica[] estilosMusicas = listEstilosMusicaByQuery(session, condition, orderBy, lockMode);
		if (estilosMusicas != null && estilosMusicas.length > 0)
			return estilosMusicas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEstilosMusicaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return iterateEstilosMusicaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstilosMusicaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return iterateEstilosMusicaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstilosMusicaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.EstilosMusica as EstilosMusica");
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
	
	public static java.util.Iterator iterateEstilosMusicaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.EstilosMusica as EstilosMusica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EstilosMusica", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EstilosMusica createEstilosMusica() {
		return new basededatos.EstilosMusica();
	}
	
	public static boolean save(basededatos.EstilosMusica estilosMusica) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().saveObject(estilosMusica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.EstilosMusica estilosMusica) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().deleteObject(estilosMusica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.EstilosMusica estilosMusica)throws PersistentException {
		try {
			if (estilosMusica.getArtista() != null) {
				estilosMusica.getArtista().estilo.remove(estilosMusica);
			}
			
			basededatos.Cancion[] lCancions = estilosMusica.cancion.toArray();
			for(int i = 0; i < lCancions.length; i++) {
				lCancions[i].estilo.remove(estilosMusica);
			}
			return delete(estilosMusica);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.EstilosMusica estilosMusica, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (estilosMusica.getArtista() != null) {
				estilosMusica.getArtista().estilo.remove(estilosMusica);
			}
			
			basededatos.Cancion[] lCancions = estilosMusica.cancion.toArray();
			for(int i = 0; i < lCancions.length; i++) {
				lCancions[i].estilo.remove(estilosMusica);
			}
			try {
				session.delete(estilosMusica);
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
	
	public static boolean refresh(basededatos.EstilosMusica estilosMusica) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().refresh(estilosMusica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.EstilosMusica estilosMusica) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().evict(estilosMusica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EstilosMusica loadEstilosMusicaByCriteria(EstilosMusicaCriteria estilosMusicaCriteria) {
		EstilosMusica[] estilosMusicas = listEstilosMusicaByCriteria(estilosMusicaCriteria);
		if(estilosMusicas == null || estilosMusicas.length == 0) {
			return null;
		}
		return estilosMusicas[0];
	}
	
	public static EstilosMusica[] listEstilosMusicaByCriteria(EstilosMusicaCriteria estilosMusicaCriteria) {
		return estilosMusicaCriteria.listEstilosMusica();
	}
}
