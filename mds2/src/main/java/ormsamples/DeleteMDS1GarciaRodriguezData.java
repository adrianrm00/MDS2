/**
 * Licensee: jaime(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteMDS1GarciaRodriguezData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Usuario baseDeDatosUsuario = basededatos.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			basededatos.UsuarioDAO.delete(baseDeDatosUsuario);
			basededatos.Usuario_Reg baseDeDatosUsuario_Reg = basededatos.Usuario_RegDAO.loadUsuario_RegByQuery(null, null);
			// Delete the persistent object
			basededatos.Usuario_RegDAO.delete(baseDeDatosUsuario_Reg);
			basededatos.Artista baseDeDatosArtista = basededatos.ArtistaDAO.loadArtistaByQuery(null, null);
			// Delete the persistent object
			basededatos.ArtistaDAO.delete(baseDeDatosArtista);
			basededatos.Compositor baseDeDatosCompositor = basededatos.CompositorDAO.loadCompositorByQuery(null, null);
			// Delete the persistent object
			basededatos.CompositorDAO.delete(baseDeDatosCompositor);
			basededatos.Productor baseDeDatosProductor = basededatos.ProductorDAO.loadProductorByQuery(null, null);
			// Delete the persistent object
			basededatos.ProductorDAO.delete(baseDeDatosProductor);
			basededatos.Administrador baseDeDatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			basededatos.AdministradorDAO.delete(baseDeDatosAdministrador);
			basededatos.Album baseDeDatosAlbum = basededatos.AlbumDAO.loadAlbumByQuery(null, null);
			// Delete the persistent object
			basededatos.AlbumDAO.delete(baseDeDatosAlbum);
			basededatos.Notificacion baseDeDatosNotificacion = basededatos.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Delete the persistent object
			basededatos.NotificacionDAO.delete(baseDeDatosNotificacion);
			basededatos.Cancion baseDeDatosCancion = basededatos.CancionDAO.loadCancionByQuery(null, null);
			// Delete the persistent object
			basededatos.CancionDAO.delete(baseDeDatosCancion);
			basededatos.Evento baseDeDatosEvento = basededatos.EventoDAO.loadEventoByQuery(null, null);
			// Delete the persistent object
			basededatos.EventoDAO.delete(baseDeDatosEvento);
			basededatos.Interprete baseDeDatosInterprete = basededatos.InterpreteDAO.loadInterpreteByQuery(null, null);
			// Delete the persistent object
			basededatos.InterpreteDAO.delete(baseDeDatosInterprete);
			basededatos.Mensaje baseDeDatosMensaje = basededatos.MensajeDAO.loadMensajeByQuery(null, null);
			// Delete the persistent object
			basededatos.MensajeDAO.delete(baseDeDatosMensaje);
			basededatos.Lista baseDeDatosLista = basededatos.ListaDAO.loadListaByQuery(null, null);
			// Delete the persistent object
			basededatos.ListaDAO.delete(baseDeDatosLista);
			basededatos.EstilosMusica baseDeDatosEstilosMusica = basededatos.EstilosMusicaDAO.loadEstilosMusicaByQuery(null, null);
			// Delete the persistent object
			basededatos.EstilosMusicaDAO.delete(baseDeDatosEstilosMusica);
			basededatos.CancionesFav baseDeDatosCancionesFav = basededatos.CancionesFavDAO.loadCancionesFavByQuery(null, null);
			// Delete the persistent object
			basededatos.CancionesFavDAO.delete(baseDeDatosCancionesFav);
			basededatos.Biblioteca baseDeDatosBiblioteca = basededatos.BibliotecaDAO.loadBibliotecaByQuery(null, null);
			// Delete the persistent object
			basededatos.BibliotecaDAO.delete(baseDeDatosBiblioteca);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteMDS1GarciaRodriguezData deleteMDS1GarciaRodriguezData = new DeleteMDS1GarciaRodriguezData();
			try {
				deleteMDS1GarciaRodriguezData.deleteTestData();
			}
			finally {
				basededatos.MDS1GarciaRodriguezPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
