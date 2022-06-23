package BaseDeDatos__2;

import basededatos__1.BDPrincipal;

import java.util.Date;
import java.util.Vector;
import basededatos.Album;
import basededatos.Artista;
import interfaz.Cancion;

public class BD_Album {
	public BDPrincipal _bd_prin_album;
	public Vector<Album> _contiene_album = new Vector<Album>();

	public Album anadir_album(String aNomAlbum, Date aFechaLanz, Artista[] aArtistaAsociado, Cancion[] aCanciones, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public Cancion anadir_cancion_album(int aIdAlbum, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void elimar_cancion_album(int aIdCancion, int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public Album[] cargar_albumes_recomendados(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Album[] cargar_albumes_artista(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Album cargar_datos_album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_artista_asociado(int aIdArtista, int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public Album modificar_album(int aIdAlbum, String aNombre, Date aFechaLanz, Artista[] aArtistasAsociados, Cancion[] aCanciones, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public Album buscador_album_administrador(String aNomAlbum) {
		throw new UnsupportedOperationException();
	}

	public Cancion buscador_canciones_administrador(String aNombreCancion) {
		throw new UnsupportedOperationException();
	}

	public Album[] BuscadorGeneralAlbum(String aNombreAlbum) {
		throw new UnsupportedOperationException();
	}

	public Album[] BuscadorBibliotecaAlbum(int aIdUsuario, String aNombreAlbum) {
		throw new UnsupportedOperationException();
	}
}