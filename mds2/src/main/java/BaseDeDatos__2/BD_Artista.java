package BaseDeDatos__2;

import basededatos__1.BDPrincipal;

import java.util.Date;
import java.util.Vector;

import basededatos.Album;
import basededatos.Artista;
import basededatos.EstilosMusica;
import basededatos.Usuario_Reg;
import interfaz.Estilo_de_musica;
import interfaz.Perfil_artista;

public class BD_Artista {
	public BDPrincipal _bd_prin_artista;
	public Vector<Artista> _contiene_artista = new Vector<Artista>();

	public Artista anadir_artista(String aNomArtista, String aNomCompleto, String aEmail, String aContrasena, Date aFechaNacimiento, Estilo_de_musica[] aEstilosMusica, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public void dar_baja_perfil_artista(Perfil_artista aPerfilArtista) {
		throw new UnsupportedOperationException();
	}

	public Artista comprobar_inicio(String aEmail, String aNombreUsuario, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public Artista anadir_artista_asociado_album(int aIdArtista, int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public Artista[] cargar_artistas_recomendados(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Artista[] cargar_artistas_seguidos(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Artista[] cargar_artistas() {
		throw new UnsupportedOperationException();
	}

	public Artista ir_a_artista(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public Artista cargar_artistas(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Album[] cargar_albumes(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Artista cargar_datos_artista(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_estilo_musica_artista(EstilosMusica aEstilo, int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Artista modificar_artista(int aIdArtista, String aNomArtista, String aNomCompleto, String aEmail, String aContrasena, Date aFechaNacimiento, EstilosMusica[] aEstilosMusica, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public Artista buscador_artista_administrador(String aNomArtista) {
		throw new UnsupportedOperationException();
	}

	public Artista[] BuscadorGeneralArtista(String aNombreArtista) {
		throw new UnsupportedOperationException();
	}

	public Artista[] BuscadorBibliotecaArtistas(int aIdUsuario, String aNombreArtista) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Reg seguir_artista(int aIdUsuario, int aIdArtista) {
		throw new UnsupportedOperationException();
	}
}