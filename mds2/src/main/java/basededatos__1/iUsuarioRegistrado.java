package basededatos__1;

import basededatos.Lista;
import basededatos.Usuario_Reg;
import basededatos.Notificacion;
import basededatos.Mensaje;
import basededatos.Artista;
import basededatos.Cancion;
import basededatos.Album;
import basededatos.CancionesFav;
import basededatos.Evento;

public interface iUsuarioRegistrado {

	public Lista[] cargar_listas_menu_lateral(int aIdUsuario);

	public Usuario_Reg cambiar_correo(String aCorreo, int aIdUsuario);

	public Usuario_Reg cambiar_contrasena(String aContrasena, int aIdUsuario);

	public void confirmar_darse_baja();

	public void eliminar_notificacion(int aIdUsuario, int aIdNotificacion);

	public Notificacion abrir_notificacion(int aIdUsuario, int aIdNotificacion);

	public Mensaje enviar_mensaje(String aMensaje, int aIdUsuario);

	public Lista[] cargar_listas();

	public Artista[] cargar_artistas();

	public Cancion[] cargar_canciones();

	public Cancion anadir_favoritos(int aIdUsuario, int aIdCancion);

	public void eliminar_favoritos(int aIdUsuario, int aIdCancion);

	public Cancion cargar_creditos(int aIdCancion);

	public Lista[] anadir_cancion_a_lista_creada(int aIdCancion, int aIdLista, int aIdUsuario);

	public Lista[] cargar_listas(int aIdUsuario);

	public Artista ir_a_artista(int aIdCancion);

	public Artista[] cargar_artistas(int aIdUsuario);

	public Album[] cargar_albumes(int aIdUsuario);

	public Lista crear_lista(int aIdUsuario, String aNombreLista, Cancion[] aCanciones);

	public CancionesFav[] cargar_canciones(int aIdUduario);

	public Lista cargar_lista(int aIdLista);

	public Lista editar_lista(int aIdLista, String aNombreLista, Cancion[] aCanciones);

	public void eliminar_lista(int aIdLista);

	public Artista[] cargar_artistas_seguidos(int aIdUsuario);

	public Cancion[] cargar_canciones_mas_escuchadas(int aIdUsuario);

	public Cancion[] cargar_canciones_artista(int aIdArtista);

	public Album[] cargar_albumes_artista(int aIdArtista);

	public Evento[] cargar_eventos_artista(int aIdArtista);

	public Artista cargar_datos_artista(int aIdArtista);

	public Album cargar_datos_album(int aIdAlbum);

	public Cancion[] cargar_canciones_album(int aIdAlbum);

	public Usuario_Reg cargar_estadisticas(int aIdUsuario);

	public Album[] BuscadorGeneralAlbum(String aNombreAlbum);

	public Artista[] BuscadorGeneralArtista(String aNombreArtista);

	public Cancion[] BuscadorGeneralCancion(String aNombreCancion);

	public Lista[] BuscadorGeneralListas(String aNombreLista);

	public Lista[] BuscadorBibliotecaListas(int aIdUsuario, String aNombreLista);

	public Artista[] BuscadorBibliotecaArtistas(int aIdUsuario, String aNombreArtista);

	public Album[] BuscadorBibliotecaAlbum(int aIdUsuario, String aNombreAlbum);

	public Cancion[] BuscadorCancionesLista(String aNombreCancion);

	public Usuario_Reg anadir_a_mis_listas(int aIdLista, int aIdUsuario);

	public Usuario_Reg seguir_artista(int aIdUsuario, int aIdArtista);
}