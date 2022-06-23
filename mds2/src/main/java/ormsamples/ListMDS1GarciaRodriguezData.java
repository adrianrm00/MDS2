/**
 * Licensee: jaime(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListMDS1GarciaRodriguezData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuario...");
		basededatos.Usuario[] baseDeDatosUsuarios = basededatos.UsuarioDAO.listUsuarioByQuery(null, null);
		int length = Math.min(baseDeDatosUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_Reg...");
		basededatos.Usuario_Reg[] baseDeDatosUsuario_Regs = basededatos.Usuario_RegDAO.listUsuario_RegByQuery(null, null);
		length = Math.min(baseDeDatosUsuario_Regs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosUsuario_Regs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Artista...");
		basededatos.Artista[] baseDeDatosArtistas = basededatos.ArtistaDAO.listArtistaByQuery(null, null);
		length = Math.min(baseDeDatosArtistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosArtistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Compositor...");
		basededatos.Compositor[] baseDeDatosCompositors = basededatos.CompositorDAO.listCompositorByQuery(null, null);
		length = Math.min(baseDeDatosCompositors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosCompositors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Productor...");
		basededatos.Productor[] baseDeDatosProductors = basededatos.ProductorDAO.listProductorByQuery(null, null);
		length = Math.min(baseDeDatosProductors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosProductors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		basededatos.Administrador[] baseDeDatosAdministradors = basededatos.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(baseDeDatosAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Album...");
		basededatos.Album[] baseDeDatosAlbums = basededatos.AlbumDAO.listAlbumByQuery(null, null);
		length = Math.min(baseDeDatosAlbums.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosAlbums[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Notificacion...");
		basededatos.Notificacion[] baseDeDatosNotificacions = basededatos.NotificacionDAO.listNotificacionByQuery(null, null);
		length = Math.min(baseDeDatosNotificacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosNotificacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cancion...");
		basededatos.Cancion[] baseDeDatosCancions = basededatos.CancionDAO.listCancionByQuery(null, null);
		length = Math.min(baseDeDatosCancions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosCancions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Evento...");
		basededatos.Evento[] baseDeDatosEventos = basededatos.EventoDAO.listEventoByQuery(null, null);
		length = Math.min(baseDeDatosEventos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosEventos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Interprete...");
		basededatos.Interprete[] baseDeDatosInterpretes = basededatos.InterpreteDAO.listInterpreteByQuery(null, null);
		length = Math.min(baseDeDatosInterpretes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosInterpretes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mensaje...");
		basededatos.Mensaje[] baseDeDatosMensajes = basededatos.MensajeDAO.listMensajeByQuery(null, null);
		length = Math.min(baseDeDatosMensajes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosMensajes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Lista...");
		basededatos.Lista[] baseDeDatosListas = basededatos.ListaDAO.listListaByQuery(null, null);
		length = Math.min(baseDeDatosListas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosListas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EstilosMusica...");
		basededatos.EstilosMusica[] baseDeDatosEstilosMusicas = basededatos.EstilosMusicaDAO.listEstilosMusicaByQuery(null, null);
		length = Math.min(baseDeDatosEstilosMusicas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosEstilosMusicas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing CancionesFav...");
		basededatos.CancionesFav[] baseDeDatosCancionesFavs = basededatos.CancionesFavDAO.listCancionesFavByQuery(null, null);
		length = Math.min(baseDeDatosCancionesFavs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosCancionesFavs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Biblioteca...");
		basededatos.Biblioteca[] baseDeDatosBibliotecas = basededatos.BibliotecaDAO.listBibliotecaByQuery(null, null);
		length = Math.min(baseDeDatosBibliotecas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(baseDeDatosBibliotecas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Usuario by Criteria...");
		basededatos.UsuarioCriteria baseDeDatosUsuarioCriteria = new basededatos.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosUsuarioCriteria.idUsuario.eq();
		baseDeDatosUsuarioCriteria.setMaxResults(ROW_COUNT);
		basededatos.Usuario[] baseDeDatosUsuarios = baseDeDatosUsuarioCriteria.listUsuario();
		int length =baseDeDatosUsuarios== null ? 0 : Math.min(baseDeDatosUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Usuario_Reg by Criteria...");
		basededatos.Usuario_RegCriteria baseDeDatosUsuario_RegCriteria = new basededatos.Usuario_RegCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosUsuario_RegCriteria.idUsuario.eq();
		baseDeDatosUsuario_RegCriteria.setMaxResults(ROW_COUNT);
		basededatos.Usuario_Reg[] baseDeDatosUsuario_Regs = baseDeDatosUsuario_RegCriteria.listUsuario_Reg();
		length =baseDeDatosUsuario_Regs== null ? 0 : Math.min(baseDeDatosUsuario_Regs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosUsuario_Regs[i]);
		}
		System.out.println(length + " Usuario_Reg record(s) retrieved."); 
		
		System.out.println("Listing Artista by Criteria...");
		basededatos.ArtistaCriteria baseDeDatosArtistaCriteria = new basededatos.ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosArtistaCriteria.idUsuario.eq();
		baseDeDatosArtistaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Artista[] baseDeDatosArtistas = baseDeDatosArtistaCriteria.listArtista();
		length =baseDeDatosArtistas== null ? 0 : Math.min(baseDeDatosArtistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosArtistas[i]);
		}
		System.out.println(length + " Artista record(s) retrieved."); 
		
		System.out.println("Listing Compositor by Criteria...");
		basededatos.CompositorCriteria baseDeDatosCompositorCriteria = new basededatos.CompositorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosCompositorCriteria.idCompositor.eq();
		baseDeDatosCompositorCriteria.setMaxResults(ROW_COUNT);
		basededatos.Compositor[] baseDeDatosCompositors = baseDeDatosCompositorCriteria.listCompositor();
		length =baseDeDatosCompositors== null ? 0 : Math.min(baseDeDatosCompositors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosCompositors[i]);
		}
		System.out.println(length + " Compositor record(s) retrieved."); 
		
		System.out.println("Listing Productor by Criteria...");
		basededatos.ProductorCriteria baseDeDatosProductorCriteria = new basededatos.ProductorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosProductorCriteria.idProductor.eq();
		baseDeDatosProductorCriteria.setMaxResults(ROW_COUNT);
		basededatos.Productor[] baseDeDatosProductors = baseDeDatosProductorCriteria.listProductor();
		length =baseDeDatosProductors== null ? 0 : Math.min(baseDeDatosProductors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosProductors[i]);
		}
		System.out.println(length + " Productor record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		basededatos.AdministradorCriteria baseDeDatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosAdministradorCriteria.ID.eq();
		baseDeDatosAdministradorCriteria.setMaxResults(ROW_COUNT);
		basededatos.Administrador[] baseDeDatosAdministradors = baseDeDatosAdministradorCriteria.listAdministrador();
		length =baseDeDatosAdministradors== null ? 0 : Math.min(baseDeDatosAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Album by Criteria...");
		basededatos.AlbumCriteria baseDeDatosAlbumCriteria = new basededatos.AlbumCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosAlbumCriteria.idAlbum.eq();
		baseDeDatosAlbumCriteria.setMaxResults(ROW_COUNT);
		basededatos.Album[] baseDeDatosAlbums = baseDeDatosAlbumCriteria.listAlbum();
		length =baseDeDatosAlbums== null ? 0 : Math.min(baseDeDatosAlbums.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosAlbums[i]);
		}
		System.out.println(length + " Album record(s) retrieved."); 
		
		System.out.println("Listing Notificacion by Criteria...");
		basededatos.NotificacionCriteria baseDeDatosNotificacionCriteria = new basededatos.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosNotificacionCriteria.idNotificacion.eq();
		baseDeDatosNotificacionCriteria.setMaxResults(ROW_COUNT);
		basededatos.Notificacion[] baseDeDatosNotificacions = baseDeDatosNotificacionCriteria.listNotificacion();
		length =baseDeDatosNotificacions== null ? 0 : Math.min(baseDeDatosNotificacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosNotificacions[i]);
		}
		System.out.println(length + " Notificacion record(s) retrieved."); 
		
		System.out.println("Listing Cancion by Criteria...");
		basededatos.CancionCriteria baseDeDatosCancionCriteria = new basededatos.CancionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosCancionCriteria.idCancion.eq();
		baseDeDatosCancionCriteria.setMaxResults(ROW_COUNT);
		basededatos.Cancion[] baseDeDatosCancions = baseDeDatosCancionCriteria.listCancion();
		length =baseDeDatosCancions== null ? 0 : Math.min(baseDeDatosCancions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosCancions[i]);
		}
		System.out.println(length + " Cancion record(s) retrieved."); 
		
		System.out.println("Listing Evento by Criteria...");
		basededatos.EventoCriteria baseDeDatosEventoCriteria = new basededatos.EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosEventoCriteria.ID.eq();
		baseDeDatosEventoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Evento[] baseDeDatosEventos = baseDeDatosEventoCriteria.listEvento();
		length =baseDeDatosEventos== null ? 0 : Math.min(baseDeDatosEventos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosEventos[i]);
		}
		System.out.println(length + " Evento record(s) retrieved."); 
		
		System.out.println("Listing Interprete by Criteria...");
		basededatos.InterpreteCriteria baseDeDatosInterpreteCriteria = new basededatos.InterpreteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosInterpreteCriteria.idInterprete.eq();
		baseDeDatosInterpreteCriteria.setMaxResults(ROW_COUNT);
		basededatos.Interprete[] baseDeDatosInterpretes = baseDeDatosInterpreteCriteria.listInterprete();
		length =baseDeDatosInterpretes== null ? 0 : Math.min(baseDeDatosInterpretes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosInterpretes[i]);
		}
		System.out.println(length + " Interprete record(s) retrieved."); 
		
		System.out.println("Listing Mensaje by Criteria...");
		basededatos.MensajeCriteria baseDeDatosMensajeCriteria = new basededatos.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosMensajeCriteria.ID.eq();
		baseDeDatosMensajeCriteria.setMaxResults(ROW_COUNT);
		basededatos.Mensaje[] baseDeDatosMensajes = baseDeDatosMensajeCriteria.listMensaje();
		length =baseDeDatosMensajes== null ? 0 : Math.min(baseDeDatosMensajes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosMensajes[i]);
		}
		System.out.println(length + " Mensaje record(s) retrieved."); 
		
		System.out.println("Listing Lista by Criteria...");
		basededatos.ListaCriteria baseDeDatosListaCriteria = new basededatos.ListaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosListaCriteria.idLista.eq();
		baseDeDatosListaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Lista[] baseDeDatosListas = baseDeDatosListaCriteria.listLista();
		length =baseDeDatosListas== null ? 0 : Math.min(baseDeDatosListas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosListas[i]);
		}
		System.out.println(length + " Lista record(s) retrieved."); 
		
		System.out.println("Listing EstilosMusica by Criteria...");
		basededatos.EstilosMusicaCriteria baseDeDatosEstilosMusicaCriteria = new basededatos.EstilosMusicaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosEstilosMusicaCriteria.idEstilo.eq();
		baseDeDatosEstilosMusicaCriteria.setMaxResults(ROW_COUNT);
		basededatos.EstilosMusica[] baseDeDatosEstilosMusicas = baseDeDatosEstilosMusicaCriteria.listEstilosMusica();
		length =baseDeDatosEstilosMusicas== null ? 0 : Math.min(baseDeDatosEstilosMusicas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosEstilosMusicas[i]);
		}
		System.out.println(length + " EstilosMusica record(s) retrieved."); 
		
		System.out.println("Listing CancionesFav by Criteria...");
		basededatos.CancionesFavCriteria baseDeDatosCancionesFavCriteria = new basededatos.CancionesFavCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosCancionesFavCriteria.ID.eq();
		baseDeDatosCancionesFavCriteria.setMaxResults(ROW_COUNT);
		basededatos.CancionesFav[] baseDeDatosCancionesFavs = baseDeDatosCancionesFavCriteria.listCancionesFav();
		length =baseDeDatosCancionesFavs== null ? 0 : Math.min(baseDeDatosCancionesFavs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosCancionesFavs[i]);
		}
		System.out.println(length + " CancionesFav record(s) retrieved."); 
		
		System.out.println("Listing Biblioteca by Criteria...");
		basededatos.BibliotecaCriteria baseDeDatosBibliotecaCriteria = new basededatos.BibliotecaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//baseDeDatosBibliotecaCriteria.ID.eq();
		baseDeDatosBibliotecaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Biblioteca[] baseDeDatosBibliotecas = baseDeDatosBibliotecaCriteria.listBiblioteca();
		length =baseDeDatosBibliotecas== null ? 0 : Math.min(baseDeDatosBibliotecas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(baseDeDatosBibliotecas[i]);
		}
		System.out.println(length + " Biblioteca record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListMDS1GarciaRodriguezData listMDS1GarciaRodriguezData = new ListMDS1GarciaRodriguezData();
			try {
				listMDS1GarciaRodriguezData.listTestData();
				//listMDS1GarciaRodriguezData.listByCriteria();
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
