/**
 * Licensee: jaime(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMDS1GarciaRodriguezData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Usuario baseDeDatosUsuario = basededatos.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.UsuarioDAO.save(baseDeDatosUsuario);
			basededatos.Usuario_Reg baseDeDatosUsuario_Reg = basededatos.Usuario_RegDAO.loadUsuario_RegByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Usuario_RegDAO.save(baseDeDatosUsuario_Reg);
			basededatos.Artista baseDeDatosArtista = basededatos.ArtistaDAO.loadArtistaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ArtistaDAO.save(baseDeDatosArtista);
			basededatos.Compositor baseDeDatosCompositor = basededatos.CompositorDAO.loadCompositorByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.CompositorDAO.save(baseDeDatosCompositor);
			basededatos.Productor baseDeDatosProductor = basededatos.ProductorDAO.loadProductorByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ProductorDAO.save(baseDeDatosProductor);
			basededatos.Administrador baseDeDatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AdministradorDAO.save(baseDeDatosAdministrador);
			basededatos.Album baseDeDatosAlbum = basededatos.AlbumDAO.loadAlbumByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AlbumDAO.save(baseDeDatosAlbum);
			basededatos.Notificacion baseDeDatosNotificacion = basededatos.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.NotificacionDAO.save(baseDeDatosNotificacion);
			basededatos.Cancion baseDeDatosCancion = basededatos.CancionDAO.loadCancionByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.CancionDAO.save(baseDeDatosCancion);
			basededatos.Evento baseDeDatosEvento = basededatos.EventoDAO.loadEventoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.EventoDAO.save(baseDeDatosEvento);
			basededatos.Interprete baseDeDatosInterprete = basededatos.InterpreteDAO.loadInterpreteByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.InterpreteDAO.save(baseDeDatosInterprete);
			basededatos.Mensaje baseDeDatosMensaje = basededatos.MensajeDAO.loadMensajeByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.MensajeDAO.save(baseDeDatosMensaje);
			basededatos.Lista baseDeDatosLista = basededatos.ListaDAO.loadListaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ListaDAO.save(baseDeDatosLista);
			basededatos.EstilosMusica baseDeDatosEstilosMusica = basededatos.EstilosMusicaDAO.loadEstilosMusicaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.EstilosMusicaDAO.save(baseDeDatosEstilosMusica);
			basededatos.CancionesFav baseDeDatosCancionesFav = basededatos.CancionesFavDAO.loadCancionesFavByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.CancionesFavDAO.save(baseDeDatosCancionesFav);
			basededatos.Biblioteca baseDeDatosBiblioteca = basededatos.BibliotecaDAO.loadBibliotecaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.BibliotecaDAO.save(baseDeDatosBiblioteca);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		basededatos.UsuarioCriteria baseDeDatosUsuarioCriteria = new basededatos.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosUsuarioCriteria.idUsuario.eq();
		System.out.println(baseDeDatosUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Usuario_Reg by Usuario_RegCriteria");
		basededatos.Usuario_RegCriteria baseDeDatosUsuario_RegCriteria = new basededatos.Usuario_RegCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosUsuario_RegCriteria.idUsuario.eq();
		System.out.println(baseDeDatosUsuario_RegCriteria.uniqueUsuario_Reg());
		
		System.out.println("Retrieving Artista by ArtistaCriteria");
		basededatos.ArtistaCriteria baseDeDatosArtistaCriteria = new basededatos.ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosArtistaCriteria.idUsuario.eq();
		System.out.println(baseDeDatosArtistaCriteria.uniqueArtista());
		
		System.out.println("Retrieving Compositor by CompositorCriteria");
		basededatos.CompositorCriteria baseDeDatosCompositorCriteria = new basededatos.CompositorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosCompositorCriteria.idCompositor.eq();
		System.out.println(baseDeDatosCompositorCriteria.uniqueCompositor());
		
		System.out.println("Retrieving Productor by ProductorCriteria");
		basededatos.ProductorCriteria baseDeDatosProductorCriteria = new basededatos.ProductorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosProductorCriteria.idProductor.eq();
		System.out.println(baseDeDatosProductorCriteria.uniqueProductor());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		basededatos.AdministradorCriteria baseDeDatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosAdministradorCriteria.ID.eq();
		System.out.println(baseDeDatosAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Album by AlbumCriteria");
		basededatos.AlbumCriteria baseDeDatosAlbumCriteria = new basededatos.AlbumCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosAlbumCriteria.idAlbum.eq();
		System.out.println(baseDeDatosAlbumCriteria.uniqueAlbum());
		
		System.out.println("Retrieving Notificacion by NotificacionCriteria");
		basededatos.NotificacionCriteria baseDeDatosNotificacionCriteria = new basededatos.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosNotificacionCriteria.idNotificacion.eq();
		System.out.println(baseDeDatosNotificacionCriteria.uniqueNotificacion());
		
		System.out.println("Retrieving Cancion by CancionCriteria");
		basededatos.CancionCriteria baseDeDatosCancionCriteria = new basededatos.CancionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosCancionCriteria.idCancion.eq();
		System.out.println(baseDeDatosCancionCriteria.uniqueCancion());
		
		System.out.println("Retrieving Evento by EventoCriteria");
		basededatos.EventoCriteria baseDeDatosEventoCriteria = new basededatos.EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosEventoCriteria.ID.eq();
		System.out.println(baseDeDatosEventoCriteria.uniqueEvento());
		
		System.out.println("Retrieving Interprete by InterpreteCriteria");
		basededatos.InterpreteCriteria baseDeDatosInterpreteCriteria = new basededatos.InterpreteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosInterpreteCriteria.idInterprete.eq();
		System.out.println(baseDeDatosInterpreteCriteria.uniqueInterprete());
		
		System.out.println("Retrieving Mensaje by MensajeCriteria");
		basededatos.MensajeCriteria baseDeDatosMensajeCriteria = new basededatos.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosMensajeCriteria.ID.eq();
		System.out.println(baseDeDatosMensajeCriteria.uniqueMensaje());
		
		System.out.println("Retrieving Lista by ListaCriteria");
		basededatos.ListaCriteria baseDeDatosListaCriteria = new basededatos.ListaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosListaCriteria.idLista.eq();
		System.out.println(baseDeDatosListaCriteria.uniqueLista());
		
		System.out.println("Retrieving EstilosMusica by EstilosMusicaCriteria");
		basededatos.EstilosMusicaCriteria baseDeDatosEstilosMusicaCriteria = new basededatos.EstilosMusicaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosEstilosMusicaCriteria.idEstilo.eq();
		System.out.println(baseDeDatosEstilosMusicaCriteria.uniqueEstilosMusica());
		
		System.out.println("Retrieving CancionesFav by CancionesFavCriteria");
		basededatos.CancionesFavCriteria baseDeDatosCancionesFavCriteria = new basededatos.CancionesFavCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosCancionesFavCriteria.ID.eq();
		System.out.println(baseDeDatosCancionesFavCriteria.uniqueCancionesFav());
		
		System.out.println("Retrieving Biblioteca by BibliotecaCriteria");
		basededatos.BibliotecaCriteria baseDeDatosBibliotecaCriteria = new basededatos.BibliotecaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//baseDeDatosBibliotecaCriteria.ID.eq();
		System.out.println(baseDeDatosBibliotecaCriteria.uniqueBiblioteca());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMDS1GarciaRodriguezData retrieveAndUpdateMDS1GarciaRodriguezData = new RetrieveAndUpdateMDS1GarciaRodriguezData();
			try {
				retrieveAndUpdateMDS1GarciaRodriguezData.retrieveAndUpdateTestData();
				//retrieveAndUpdateMDS1GarciaRodriguezData.retrieveByCriteria();
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
