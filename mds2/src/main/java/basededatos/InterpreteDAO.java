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

public class InterpreteDAO {
	public static Interprete loadInterpreteByORMID(int idInterprete) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadInterpreteByORMID(session, idInterprete);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Interprete getInterpreteByORMID(int idInterprete) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return getInterpreteByORMID(session, idInterprete);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Interprete loadInterpreteByORMID(int idInterprete, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadInterpreteByORMID(session, idInterprete, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Interprete getInterpreteByORMID(int idInterprete, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return getInterpreteByORMID(session, idInterprete, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Interprete loadInterpreteByORMID(PersistentSession session, int idInterprete) throws PersistentException {
		try {
			return (Interprete) session.load(basededatos.Interprete.class, Integer.valueOf(idInterprete));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Interprete getInterpreteByORMID(PersistentSession session, int idInterprete) throws PersistentException {
		try {
			return (Interprete) session.get(basededatos.Interprete.class, Integer.valueOf(idInterprete));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Interprete loadInterpreteByORMID(PersistentSession session, int idInterprete, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Interprete) session.load(basededatos.Interprete.class, Integer.valueOf(idInterprete), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Interprete getInterpreteByORMID(PersistentSession session, int idInterprete, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Interprete) session.get(basededatos.Interprete.class, Integer.valueOf(idInterprete), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInterprete(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return queryInterprete(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInterprete(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return queryInterprete(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Interprete[] listInterpreteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return listInterpreteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Interprete[] listInterpreteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return listInterpreteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryInterprete(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Interprete as Interprete");
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
	
	public static List queryInterprete(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Interprete as Interprete");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Interprete", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Interprete[] listInterpreteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryInterprete(session, condition, orderBy);
			return (Interprete[]) list.toArray(new Interprete[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Interprete[] listInterpreteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryInterprete(session, condition, orderBy, lockMode);
			return (Interprete[]) list.toArray(new Interprete[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Interprete loadInterpreteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadInterpreteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Interprete loadInterpreteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadInterpreteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Interprete loadInterpreteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Interprete[] interpretes = listInterpreteByQuery(session, condition, orderBy);
		if (interpretes != null && interpretes.length > 0)
			return interpretes[0];
		else
			return null;
	}
	
	public static Interprete loadInterpreteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Interprete[] interpretes = listInterpreteByQuery(session, condition, orderBy, lockMode);
		if (interpretes != null && interpretes.length > 0)
			return interpretes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateInterpreteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return iterateInterpreteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInterpreteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return iterateInterpreteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInterpreteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Interprete as Interprete");
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
	
	public static java.util.Iterator iterateInterpreteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Interprete as Interprete");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Interprete", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Interprete createInterprete() {
		return new basededatos.Interprete();
	}
	
	public static boolean save(basededatos.Interprete interprete) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().saveObject(interprete);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Interprete interprete) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().deleteObject(interprete);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Interprete interprete)throws PersistentException {
		try {
			basededatos.Cancion[] lCancions = interprete.cancion.toArray();
			for(int i = 0; i < lCancions.length; i++) {
				lCancions[i].interprete.remove(interprete);
			}
			return delete(interprete);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Interprete interprete, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Cancion[] lCancions = interprete.cancion.toArray();
			for(int i = 0; i < lCancions.length; i++) {
				lCancions[i].interprete.remove(interprete);
			}
			try {
				session.delete(interprete);
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
	
	public static boolean refresh(basededatos.Interprete interprete) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().refresh(interprete);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Interprete interprete) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().evict(interprete);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Interprete loadInterpreteByCriteria(InterpreteCriteria interpreteCriteria) {
		Interprete[] interpretes = listInterpreteByCriteria(interpreteCriteria);
		if(interpretes == null || interpretes.length == 0) {
			return null;
		}
		return interpretes[0];
	}
	
	public static Interprete[] listInterpreteByCriteria(InterpreteCriteria interpreteCriteria) {
		return interpreteCriteria.listInterprete();
	}
}
