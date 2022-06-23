/**
 * Licensee: jaime(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS1GarciaRodriguezData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS1GarciaRodriguezPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Usuario baseDeDatosUsuario = basededatos.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : seguido, biblioteca, cancionesFav, lista, notificacion
			basededatos.UsuarioDAO.save(baseDeDatosUsuario);
			basededatos.Usuario_Reg baseDeDatosUsuario_Reg = basededatos.Usuario_RegDAO.createUsuario_Reg();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mensaje
			basededatos.Usuario_RegDAO.save(baseDeDatosUsuario_Reg);
			basededatos.Artista baseDeDatosArtista = basededatos.ArtistaDAO.createArtista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : evento, estilo, album, seguidor, idArtista
			basededatos.ArtistaDAO.save(baseDeDatosArtista);
			basededatos.Compositor baseDeDatosCompositor = basededatos.CompositorDAO.createCompositor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cancion
			basededatos.CompositorDAO.save(baseDeDatosCompositor);
			basededatos.Productor baseDeDatosProductor = basededatos.ProductorDAO.createProductor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cancion
			basededatos.ProductorDAO.save(baseDeDatosProductor);
			basededatos.Administrador baseDeDatosAdministrador = basededatos.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mensaje
			basededatos.AdministradorDAO.save(baseDeDatosAdministrador);
			basededatos.Album baseDeDatosAlbum = basededatos.AlbumDAO.createAlbum();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cancion, artista, biblioteca
			basededatos.AlbumDAO.save(baseDeDatosAlbum);
			basededatos.Notificacion baseDeDatosNotificacion = basededatos.NotificacionDAO.createNotificacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario
			basededatos.NotificacionDAO.save(baseDeDatosNotificacion);
			basededatos.Cancion baseDeDatosCancion = basededatos.CancionDAO.createCancion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cancionesfav, lista, estilo, productor, compositor, interprete, numReproducciones, duracion, album
			basededatos.CancionDAO.save(baseDeDatosCancion);
			basededatos.Evento baseDeDatosEvento = basededatos.EventoDAO.createEvento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : artista
			basededatos.EventoDAO.save(baseDeDatosEvento);
			basededatos.Interprete baseDeDatosInterprete = basededatos.InterpreteDAO.createInterprete();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cancion
			basededatos.InterpreteDAO.save(baseDeDatosInterprete);
			basededatos.Mensaje baseDeDatosMensaje = basededatos.MensajeDAO.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : administrador, usuario_Reg
			basededatos.MensajeDAO.save(baseDeDatosMensaje);
			basededatos.Lista baseDeDatosLista = basededatos.ListaDAO.createLista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cancion, usuario, biblioteca
			basededatos.ListaDAO.save(baseDeDatosLista);
			basededatos.EstilosMusica baseDeDatosEstilosMusica = basededatos.EstilosMusicaDAO.createEstilosMusica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cancion, artista
			basededatos.EstilosMusicaDAO.save(baseDeDatosEstilosMusica);
			basededatos.CancionesFav baseDeDatosCancionesFav = basededatos.CancionesFavDAO.createCancionesFav();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario, cancion
			basededatos.CancionesFavDAO.save(baseDeDatosCancionesFav);
			basededatos.Biblioteca baseDeDatosBiblioteca = basededatos.BibliotecaDAO.createBiblioteca();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : album, lista, usuario
			basededatos.BibliotecaDAO.save(baseDeDatosBiblioteca);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateMDS1GarciaRodriguezData createMDS1GarciaRodriguezData = new CreateMDS1GarciaRodriguezData();
			try {
				createMDS1GarciaRodriguezData.createTestData();
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
