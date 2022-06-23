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

public class CompositorDAO {
	public static Compositor loadCompositorByORMID(int idCompositor) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadCompositorByORMID(session, idCompositor);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compositor getCompositorByORMID(int idCompositor) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return getCompositorByORMID(session, idCompositor);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compositor loadCompositorByORMID(int idCompositor, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadCompositorByORMID(session, idCompositor, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compositor getCompositorByORMID(int idCompositor, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return getCompositorByORMID(session, idCompositor, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compositor loadCompositorByORMID(PersistentSession session, int idCompositor) throws PersistentException {
		try {
			return (Compositor) session.load(basededatos.Compositor.class, Integer.valueOf(idCompositor));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compositor getCompositorByORMID(PersistentSession session, int idCompositor) throws PersistentException {
		try {
			return (Compositor) session.get(basededatos.Compositor.class, Integer.valueOf(idCompositor));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compositor loadCompositorByORMID(PersistentSession session, int idCompositor, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Compositor) session.load(basededatos.Compositor.class, Integer.valueOf(idCompositor), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compositor getCompositorByORMID(PersistentSession session, int idCompositor, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Compositor) session.get(basededatos.Compositor.class, Integer.valueOf(idCompositor), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompositor(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return queryCompositor(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompositor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return queryCompositor(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compositor[] listCompositorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return listCompositorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compositor[] listCompositorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return listCompositorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCompositor(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compositor as Compositor");
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
	
	public static List queryCompositor(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compositor as Compositor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Compositor", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compositor[] listCompositorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCompositor(session, condition, orderBy);
			return (Compositor[]) list.toArray(new Compositor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compositor[] listCompositorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCompositor(session, condition, orderBy, lockMode);
			return (Compositor[]) list.toArray(new Compositor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compositor loadCompositorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadCompositorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compositor loadCompositorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadCompositorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compositor loadCompositorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Compositor[] compositors = listCompositorByQuery(session, condition, orderBy);
		if (compositors != null && compositors.length > 0)
			return compositors[0];
		else
			return null;
	}
	
	public static Compositor loadCompositorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Compositor[] compositors = listCompositorByQuery(session, condition, orderBy, lockMode);
		if (compositors != null && compositors.length > 0)
			return compositors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCompositorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return iterateCompositorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompositorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return iterateCompositorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCompositorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compositor as Compositor");
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
	
	public static java.util.Iterator iterateCompositorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Compositor as Compositor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Compositor", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compositor createCompositor() {
		return new basededatos.Compositor();
	}
	
	public static boolean save(basededatos.Compositor compositor) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().saveObject(compositor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Compositor compositor) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().deleteObject(compositor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Compositor compositor)throws PersistentException {
		try {
			basededatos.Cancion[] lCancions = compositor.cancion.toArray();
			for(int i = 0; i < lCancions.length; i++) {
				lCancions[i].compositor.remove(compositor);
			}
			return delete(compositor);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Compositor compositor, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Cancion[] lCancions = compositor.cancion.toArray();
			for(int i = 0; i < lCancions.length; i++) {
				lCancions[i].compositor.remove(compositor);
			}
			try {
				session.delete(compositor);
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
	
	public static boolean refresh(basededatos.Compositor compositor) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().refresh(compositor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Compositor compositor) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().evict(compositor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Compositor loadCompositorByCriteria(CompositorCriteria compositorCriteria) {
		Compositor[] compositors = listCompositorByCriteria(compositorCriteria);
		if(compositors == null || compositors.length == 0) {
			return null;
		}
		return compositors[0];
	}
	
	public static Compositor[] listCompositorByCriteria(CompositorCriteria compositorCriteria) {
		return compositorCriteria.listCompositor();
	}
}
