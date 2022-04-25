package interfaz;

import basededatos.iAdministrador;

public class Administrador extends vistas.VistaPantalladeinicioadministrador {
	private Button _anadirArtistaB;
	private Button _modificarArtistaB;
	private Button _anadirAlbumB;
	private Button _modificarAlbumB;
	private Button _anadirCancionB;
	private Button _modificarCancionB;
	private Button _modificarEstilosMusicaB;
	private Button _modificarCancionesInicialesB;
	private Button _darBajaPerfilB;
	private Button _darBajaPerfilArtistaB;
	private Button _cerrarSesionB;
	public iAdministrador _iAdministrador;
	public Anadir_artista _anadir_artista;
	public Modificar_artista _modificar_artista;
	public Anadir_album _anadir_album;
	public Modificar_album _modificar_album;
	public Anadir_cancion _anadir_cancion;
	public Modificar_cancion _modificar_cancion;
	public Modificar_estilos_de_musica _modificar_estilos_de_musica;
	public Dar_de_baja_un_perfil _dar_de_baja_un_perfil;
	public Dar_de_baja_un_perfil_de_artista _dar_de_baja_un_perfil_de_artista;
	public Modificar_canciones_iniciales _modificar_canciones_iniciales;
	public Cerrar_Sesion _cerrar_Sesion;
}