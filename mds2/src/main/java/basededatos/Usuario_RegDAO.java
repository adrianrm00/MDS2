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

public class Usuario_RegDAO {
	public static Usuario_Reg loadUsuario_RegByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadUsuario_RegByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Reg getUsuario_RegByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return getUsuario_RegByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Reg loadUsuario_RegByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadUsuario_RegByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Reg getUsuario_RegByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return getUsuario_RegByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Reg loadUsuario_RegByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario_Reg) session.load(basededatos.Usuario_Reg.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Reg getUsuario_RegByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario_Reg) session.get(basededatos.Usuario_Reg.class, Integer.valueOf(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Reg loadUsuario_RegByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_Reg) session.load(basededatos.Usuario_Reg.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Reg getUsuario_RegByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_Reg) session.get(basededatos.Usuario_Reg.class, Integer.valueOf(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Reg(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return queryUsuario_Reg(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Reg(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return queryUsuario_Reg(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Reg[] listUsuario_RegByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return listUsuario_RegByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Reg[] listUsuario_RegByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return listUsuario_RegByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Reg(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_Reg as Usuario_Reg");
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
	
	public static List queryUsuario_Reg(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_Reg as Usuario_Reg");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_Reg", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Reg[] listUsuario_RegByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_Reg(session, condition, orderBy);
			return (Usuario_Reg[]) list.toArray(new Usuario_Reg[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Reg[] listUsuario_RegByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_Reg(session, condition, orderBy, lockMode);
			return (Usuario_Reg[]) list.toArray(new Usuario_Reg[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Reg loadUsuario_RegByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadUsuario_RegByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Reg loadUsuario_RegByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return loadUsuario_RegByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Reg loadUsuario_RegByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_Reg[] usuario_Regs = listUsuario_RegByQuery(session, condition, orderBy);
		if (usuario_Regs != null && usuario_Regs.length > 0)
			return usuario_Regs[0];
		else
			return null;
	}
	
	public static Usuario_Reg loadUsuario_RegByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_Reg[] usuario_Regs = listUsuario_RegByQuery(session, condition, orderBy, lockMode);
		if (usuario_Regs != null && usuario_Regs.length > 0)
			return usuario_Regs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_RegByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return iterateUsuario_RegByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_RegByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession();
			return iterateUsuario_RegByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_RegByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_Reg as Usuario_Reg");
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
	
	public static java.util.Iterator iterateUsuario_RegByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_Reg as Usuario_Reg");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_Reg", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Reg createUsuario_Reg() {
		return new basededatos.Usuario_Reg();
	}
	
	public static boolean save(basededatos.Usuario_Reg usuario_Reg) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().saveObject(usuario_Reg);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Usuario_Reg usuario_Reg) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().deleteObject(usuario_Reg);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Usuario_Reg usuario_Reg)throws PersistentException {
		try {
			if (usuario_Reg.getMensaje() != null) {
				usuario_Reg.getMensaje().setUsuario_Reg(null);
			}
			
			if (usuario_Reg.getNotificacion() != null) {
				usuario_Reg.getNotificacion().usuario.remove(usuario_Reg);
			}
			
			basededatos.Lista[] lListas = usuario_Reg.lista.toArray();
			for(int i = 0; i < lListas.length; i++) {
				lListas[i].usuario.remove(usuario_Reg);
			}
			basededatos.CancionesFav[] lCancionesFavs = usuario_Reg.cancionesFav.toArray();
			for(int i = 0; i < lCancionesFavs.length; i++) {
				lCancionesFavs[i].setUsuario(null);
			}
			if (usuario_Reg.getBiblioteca() != null) {
				usuario_Reg.getBiblioteca().setUsuario(null);
			}
			
			basededatos.Artista[] lSeguidos = usuario_Reg.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor.remove(usuario_Reg);
			}
			return delete(usuario_Reg);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Usuario_Reg usuario_Reg, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (usuario_Reg.getMensaje() != null) {
				usuario_Reg.getMensaje().setUsuario_Reg(null);
			}
			
			if (usuario_Reg.getNotificacion() != null) {
				usuario_Reg.getNotificacion().usuario.remove(usuario_Reg);
			}
			
			basededatos.Lista[] lListas = usuario_Reg.lista.toArray();
			for(int i = 0; i < lListas.length; i++) {
				lListas[i].usuario.remove(usuario_Reg);
			}
			basededatos.CancionesFav[] lCancionesFavs = usuario_Reg.cancionesFav.toArray();
			for(int i = 0; i < lCancionesFavs.length; i++) {
				lCancionesFavs[i].setUsuario(null);
			}
			if (usuario_Reg.getBiblioteca() != null) {
				usuario_Reg.getBiblioteca().setUsuario(null);
			}
			
			basededatos.Artista[] lSeguidos = usuario_Reg.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor.remove(usuario_Reg);
			}
			try {
				session.delete(usuario_Reg);
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
	
	public static boolean refresh(basededatos.Usuario_Reg usuario_Reg) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().refresh(usuario_Reg);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Usuario_Reg usuario_Reg) throws PersistentException {
		try {
			basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().evict(usuario_Reg);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Reg loadUsuario_RegByCriteria(Usuario_RegCriteria usuario_RegCriteria) {
		Usuario_Reg[] usuario_Regs = listUsuario_RegByCriteria(usuario_RegCriteria);
		if(usuario_Regs == null || usuario_Regs.length == 0) {
			return null;
		}
		return usuario_Regs[0];
	}
	
	public static Usuario_Reg[] listUsuario_RegByCriteria(Usuario_RegCriteria usuario_RegCriteria) {
		return usuario_RegCriteria.listUsuario_Reg();
	}
}
