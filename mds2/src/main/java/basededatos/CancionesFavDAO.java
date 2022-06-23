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

public class CancionesFavDAO {
	public static CancionesFav loadCancionesFavByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadCancionesFavByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static CancionesFav getCancionesFavByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return getCancionesFavByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static CancionesFav loadCancionesFavByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadCancionesFavByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static CancionesFav getCancionesFavByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return getCancionesFavByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static CancionesFav loadCancionesFavByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (CancionesFav) session.load(basededatos.CancionesFav.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static CancionesFav getCancionesFavByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (CancionesFav) session.get(basededatos.CancionesFav.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static CancionesFav loadCancionesFavByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (CancionesFav) session.load(basededatos.CancionesFav.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static CancionesFav getCancionesFavByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (CancionesFav) session.get(basededatos.CancionesFav.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancionesFav(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return queryCancionesFav(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancionesFav(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return queryCancionesFav(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static CancionesFav[] listCancionesFavByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return listCancionesFavByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static CancionesFav[] listCancionesFavByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return listCancionesFavByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancionesFav(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.CancionesFav as CancionesFav");
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
	
	public static List queryCancionesFav(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.CancionesFav as CancionesFav");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("CancionesFav", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static CancionesFav[] listCancionesFavByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCancionesFav(session, condition, orderBy);
			return (CancionesFav[]) list.toArray(new CancionesFav[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static CancionesFav[] listCancionesFavByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCancionesFav(session, condition, orderBy, lockMode);
			return (CancionesFav[]) list.toArray(new CancionesFav[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static CancionesFav loadCancionesFavByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadCancionesFavByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static CancionesFav loadCancionesFavByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadCancionesFavByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static CancionesFav loadCancionesFavByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		CancionesFav[] cancionesFavs = listCancionesFavByQuery(session, condition, orderBy);
		if (cancionesFavs != null && cancionesFavs.length > 0)
			return cancionesFavs[0];
		else
			return null;
	}
	
	public static CancionesFav loadCancionesFavByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		CancionesFav[] cancionesFavs = listCancionesFavByQuery(session, condition, orderBy, lockMode);
		if (cancionesFavs != null && cancionesFavs.length > 0)
			return cancionesFavs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCancionesFavByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return iterateCancionesFavByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCancionesFavByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return iterateCancionesFavByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCancionesFavByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.CancionesFav as CancionesFav");
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
	
	public static java.util.Iterator iterateCancionesFavByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.CancionesFav as CancionesFav");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("CancionesFav", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static CancionesFav createCancionesFav() {
		return new basededatos.CancionesFav();
	}
	
	public static boolean save(basededatos.CancionesFav cancionesFav) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().saveObject(cancionesFav);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.CancionesFav cancionesFav) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().deleteObject(cancionesFav);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.CancionesFav cancionesFav)throws PersistentException {
		try {
			if (cancionesFav.getCancion() != null) {
				cancionesFav.getCancion().cancionesfav.remove(cancionesFav);
			}
			
			if (cancionesFav.getUsuario() != null) {
				cancionesFav.getUsuario().cancionesFav.remove(cancionesFav);
			}
			
			return delete(cancionesFav);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.CancionesFav cancionesFav, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (cancionesFav.getCancion() != null) {
				cancionesFav.getCancion().cancionesfav.remove(cancionesFav);
			}
			
			if (cancionesFav.getUsuario() != null) {
				cancionesFav.getUsuario().cancionesFav.remove(cancionesFav);
			}
			
			try {
				session.delete(cancionesFav);
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
	
	public static boolean refresh(basededatos.CancionesFav cancionesFav) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().refresh(cancionesFav);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.CancionesFav cancionesFav) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().evict(cancionesFav);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static CancionesFav loadCancionesFavByCriteria(CancionesFavCriteria cancionesFavCriteria) {
		CancionesFav[] cancionesFavs = listCancionesFavByCriteria(cancionesFavCriteria);
		if(cancionesFavs == null || cancionesFavs.length == 0) {
			return null;
		}
		return cancionesFavs[0];
	}
	
	public static CancionesFav[] listCancionesFavByCriteria(CancionesFavCriteria cancionesFavCriteria) {
		return cancionesFavCriteria.listCancionesFav();
	}
}
