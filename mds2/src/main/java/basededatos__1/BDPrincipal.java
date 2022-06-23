package basededatos__1;

import BaseDeDatos__2.BD_Usuario_Registrado;

import java.util.Date;

import BaseDeDatos__2.BD_Administrador;
import BaseDeDatos__2.BD_Artista;
import BaseDeDatos__2.BD_Album;
import BaseDeDatos__2.BD_Cancion;
import BaseDeDatos__2.BD_Lista;
import BaseDeDatos__2.BD_Notificacion;
import BaseDeDatos__2.BD_Evento;
import BaseDeDatos__2.BD_Biblioteca;
import BaseDeDatos__2.BD_EstiloMusica;
import BaseDeDatos__2.BD_Productor;
import BaseDeDatos__2.BD_Compositor;
import BaseDeDatos__2.BD_interprete;
import BaseDeDatos__2.BD_CancionesFav;
import BaseDeDatos__2.BD_Mensaje_Contacto;
import basededatos.Lista;
import basededatos.Usuario_Reg;
import basededatos.Notificacion;
import basededatos.Mensaje;
import basededatos.Artista;
import basededatos.Cancion;
// import BaseDeDatos__2.Cancion;
import basededatos.Album;
import basededatos.CancionesFav;
import basededatos.Evento;
import basededatos.Usuario;
// import interfaz.Cancion;
import interfaz.Estilo_de_musica;
import basededatos.Interprete;
import basededatos.Compositor;
import basededatos.Productor;
import basededatos.EstilosMusica;
import interfaz.Perfil;
import interfaz.Perfil_artista;
import interfaz.Cancion_de_prueba;

public class BDPrincipal implements iUsuarioRegistrado, iUsuarioNoRegistrado, iAdministrador, iArtista {
	public BD_Usuario_Registrado _bd_usuario_registrado;
	public BD_Administrador _bd_administrador;
	public BD_Artista _bd_artista;
	public BD_Album _bd_album;
	public BD_Cancion _bd_cancion;
	public BD_Lista _bd_lista;
	public BD_Notificacion _bd_notificaciones;
	public BD_Evento _bd_evento;
	public BD_Biblioteca _bd_biblioteca;
	public BD_EstiloMusica _bd_estilo_musica;
	public BD_Productor _bd_productor;
	public BD_Compositor _bd_compositor;
	public BD_interprete _bd_interprete;
	public BD_CancionesFav _bd_canciones_fav;
	public BD_Mensaje_Contacto _bd_mensaje_contacto;

	public Lista[] cargar_listas_menu_lateral(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Reg cambiar_correo(String aCorreo, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Reg cambiar_contrasena(String aContrasena, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void confirmar_darse_baja() {
		throw new UnsupportedOperationException();
	}

	public void eliminar_notificacion(int aIdUsuario, int aIdNotificacion) {
		throw new UnsupportedOperationException();
	}

	public Notificacion abrir_notificacion(int aIdUsuario, int aIdNotificacion) {
		throw new UnsupportedOperationException();
	}

	public Mensaje enviar_mensaje(String aMensaje, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Lista[] cargar_listas() {
		throw new UnsupportedOperationException();
	}

	public Artista[] cargar_artistas() {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_canciones() {
		throw new UnsupportedOperationException();
	}

	public Cancion anadir_favoritos(int aIdUsuario, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_favoritos(int aIdUsuario, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public Cancion cargar_creditos(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public Lista[] anadir_cancion_a_lista_creada(int aIdCancion, int aIdLista, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Lista[] cargar_listas(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Artista ir_a_artista(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public Artista[] cargar_artistas(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Album[] cargar_albumes(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Lista crear_lista(int aIdUsuario, String aNombreLista, Cancion[] aCanciones) {
		throw new UnsupportedOperationException();
	}

	public CancionesFav[] cargar_canciones(int aIdUduario) {
		throw new UnsupportedOperationException();
	}

	public Lista cargar_lista(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public Lista editar_lista(int aIdLista, String aNombreLista, Cancion[] aCanciones) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_lista(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public Artista[] cargar_artistas_seguidos(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_canciones_mas_escuchadas(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_canciones_artista(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Album[] cargar_albumes_artista(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Evento[] cargar_eventos_artista(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Artista cargar_datos_artista(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Album cargar_datos_album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_canciones_album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Reg cargar_estadisticas(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Album[] BuscadorGeneralAlbum(String aNombreAlbum) {
		throw new UnsupportedOperationException();
	}

	public Artista[] BuscadorGeneralArtista(String aNombreArtista) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] BuscadorGeneralCancion(String aNombreCancion) {
		throw new UnsupportedOperationException();
	}

	public Lista[] BuscadorGeneralListas(String aNombreLista) {
		throw new UnsupportedOperationException();
	}

	public Lista[] BuscadorBibliotecaListas(int aIdUsuario, String aNombreLista) {
		throw new UnsupportedOperationException();
	}

	public Artista[] BuscadorBibliotecaArtistas(int aIdUsuario, String aNombreArtista) {
		throw new UnsupportedOperationException();
	}

	public Album[] BuscadorBibliotecaAlbum(int aIdUsuario, String aNombreAlbum) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] BuscadorCancionesLista(String aNombreCancion) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Reg anadir_a_mis_listas(int aIdLista, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Reg seguir_artista(int aIdUsuario, int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Reg comprobar_inicio(String aEmail, String aNombreUsuario, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public Usuario registrarse(String aNombreCompleto, String aNombreUsuario, String aEmail, String aContrasena, String aImagen) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Reg olvido_su_contrasena(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public Album anadir_album(String aNomAlbum, Date aFechaLanz, Artista[] aArtistaAsociado, interfaz.Cancion[] aCanciones, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public Artista anadir_artista(String aNomArtista, String aNomCompleto, String aEmail, String aContrasena, Date aFechaNacimiento, Estilo_de_musica[] aEstilosMusica, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public Cancion anadir_cancion(String aTitulo, Interprete[] aInterpretes, Compositor[] aCompositores, Productor[] aProductores, Estilo_de_musica[] aEstilosMusica, String aFicheroMultimedia) {
		throw new UnsupportedOperationException();
	}

	public EstilosMusica anadir_estilo_musica(String aEstilo) {
		throw new UnsupportedOperationException();
	}

	public void dar_baja_perfil(Perfil aPerfil) {
		throw new UnsupportedOperationException();
	}

	public void dar_baja_perfil_artista(Perfil_artista aPerfilArtista) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_estilo_musica(Estilo_de_musica aEstilo) {
		throw new UnsupportedOperationException();
	}

	public Cancion modificar_cancion_inicial(int aSlot, Cancion_de_prueba aCancion) {
		throw new UnsupportedOperationException();
	}

	public EstilosMusica anadir_estilo_musica_artista(EstilosMusica aEstilo) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_estilo_musica_artista(EstilosMusica aEstilo, int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Artista anadir_artista_asociado_album(int aIdArtista, int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_artista_asociado_album(int aIdArtista, int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public Cancion anadir_cancion_album(int aIdAlbum, String aTitulo, Interprete[] aInterprete, Compositor[] aCompositor, BD_Productor[] aProductor, EstilosMusica[] aEstiloMusica, String aFichero) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_cancion_album(int aIdCancion, int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public Interprete anadir_interprete(String aInterprete) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_interprete(Interprete aInterprete, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_compositor(Compositor aCompositor, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_productor(Productor aProductor, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public Compositor anadir_compositor(Compositor aCompositor) {
		throw new UnsupportedOperationException();
	}

	public Productor anadir_productor(Productor aProductor) {
		throw new UnsupportedOperationException();
	}

	public EstilosMusica anadir_estilo_musica_cancion(EstilosMusica aEstiloMusica) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_estilo_musica_cancion(EstilosMusica aEstiloMusica, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public Artista modificar_artista(int aIdArtista, String aNomArtista, String aNomCompleto, String aEmail, String aContrasena, Date aFechaNacimiento, EstilosMusica[] aEstilosMusica, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public Artista buscador_artista_administrador(String aNomArtista) {
		throw new UnsupportedOperationException();
	}

	public Album modificar_album(int aIdAlbum, String aNombre, Date aFechaLanz, Artista[] aArtistasAsociados, Cancion[] aCanciones, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public Album buscador_album_administrador(String aNomAlbum) {
		throw new UnsupportedOperationException();
	}

	public Cancion modificar_cancion(int aIdCancion, String aTitulo, Interprete[] aInterpretes, Compositor[] aCompositores, Productor[] aProductores, EstilosMusica[] aEstiloDeMusica, String aFichero) {
		throw new UnsupportedOperationException();
	}

	public Cancion buscador_canciones_administrador(String aNombreCancion) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Reg buscador_perfiles_administrador(String aNombrePerfil) {
		throw new UnsupportedOperationException();
	}

	public Evento anadir_evento(String aNombreEvento, String aLugar, Date aFecha) {
		throw new UnsupportedOperationException();
	}

	public Evento editar_evento(String aNombreEvento, String aLugar, Date aFecha) {
		throw new UnsupportedOperationException();
	}

	public void borrar_evento(int aIdEvento) {
		throw new UnsupportedOperationException();
	}
}