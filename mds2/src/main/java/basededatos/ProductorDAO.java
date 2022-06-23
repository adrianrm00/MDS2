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

public class ProductorDAO {
	public static Productor loadProductorByORMID(int idProductor) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadProductorByORMID(session, idProductor);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Productor getProductorByORMID(int idProductor) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return getProductorByORMID(session, idProductor);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Productor loadProductorByORMID(int idProductor, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadProductorByORMID(session, idProductor, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Productor getProductorByORMID(int idProductor, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return getProductorByORMID(session, idProductor, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Productor loadProductorByORMID(PersistentSession session, int idProductor) throws PersistentException {
		try {
			return (Productor) session.load(basededatos.Productor.class, Integer.valueOf(idProductor));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Productor getProductorByORMID(PersistentSession session, int idProductor) throws PersistentException {
		try {
			return (Productor) session.get(basededatos.Productor.class, Integer.valueOf(idProductor));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Productor loadProductorByORMID(PersistentSession session, int idProductor, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Productor) session.load(basededatos.Productor.class, Integer.valueOf(idProductor), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Productor getProductorByORMID(PersistentSession session, int idProductor, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Productor) session.get(basededatos.Productor.class, Integer.valueOf(idProductor), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProductor(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return queryProductor(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProductor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return queryProductor(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Productor[] listProductorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return listProductorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Productor[] listProductorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return listProductorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProductor(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Productor as Productor");
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
	
	public static List queryProductor(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Productor as Productor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Productor", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Productor[] listProductorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProductor(session, condition, orderBy);
			return (Productor[]) list.toArray(new Productor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Productor[] listProductorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProductor(session, condition, orderBy, lockMode);
			return (Productor[]) list.toArray(new Productor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Productor loadProductorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadProductorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Productor loadProductorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadProductorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Productor loadProductorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Productor[] productors = listProductorByQuery(session, condition, orderBy);
		if (productors != null && productors.length > 0)
			return productors[0];
		else
			return null;
	}
	
	public static Productor loadProductorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Productor[] productors = listProductorByQuery(session, condition, orderBy, lockMode);
		if (productors != null && productors.length > 0)
			return productors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProductorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return iterateProductorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProductorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return iterateProductorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProductorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Productor as Productor");
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
	
	public static java.util.Iterator iterateProductorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Productor as Productor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Productor", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Productor createProductor() {
		return new basededatos.Productor();
	}
	
	public static boolean save(basededatos.Productor productor) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().saveObject(productor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Productor productor) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().deleteObject(productor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Productor productor)throws PersistentException {
		try {
			basededatos.Cancion[] lCancions = productor.cancion.toArray();
			for(int i = 0; i < lCancions.length; i++) {
				lCancions[i].productor.remove(productor);
			}
			return delete(productor);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Productor productor, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Cancion[] lCancions = productor.cancion.toArray();
			for(int i = 0; i < lCancions.length; i++) {
				lCancions[i].productor.remove(productor);
			}
			try {
				session.delete(productor);
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
	
	public static boolean refresh(basededatos.Productor productor) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().refresh(productor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Productor productor) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().evict(productor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Productor loadProductorByCriteria(ProductorCriteria productorCriteria) {
		Productor[] productors = listProductorByCriteria(productorCriteria);
		if(productors == null || productors.length == 0) {
			return null;
		}
		return productors[0];
	}
	
	public static Productor[] listProductorByCriteria(ProductorCriteria productorCriteria) {
		return productorCriteria.listProductor();
	}
}
