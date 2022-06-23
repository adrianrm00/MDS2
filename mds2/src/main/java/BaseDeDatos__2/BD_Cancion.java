package BaseDeDatos__2;

import basededatos__1.BDPrincipal;
import java.util.Vector;
import basededatos.Cancion;
import basededatos.Compositor;
import basededatos.EstilosMusica;
import basededatos.Interprete;
import basededatos.Productor;
import interfaz.Estilo_de_musica;
import interfaz.Cancion_de_prueba;

public class BD_Cancion {
	public BDPrincipal _bd_prin_cancion;
	public Vector<Cancion> _contiene_cancion = new Vector<Cancion>();

	public Cancion anadir_cancion(String aTitulo, Interprete[] aInterpretes, Compositor[] aCompositores, BD_Productor[] aProductores, Estilo_de_musica[] aEstilosMusica, String aFicheroMultimedia) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_canciones() {
		throw new UnsupportedOperationException();
	}

	public Cancion modificar_cancion_inicial(int aSlot, Cancion_de_prueba aCancion) {
		throw new UnsupportedOperationException();
	}

	public Cancion anadir_cancion_album(int aIdCancion, String aTitulo, Interprete[] aInterprete, Compositor[] aCompositor, Productor[] aProductor, EstilosMusica[] aEstiloMusica, String aFichero) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_canciones_escuchadas_recientemente(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_canciones_mas_escuchadas(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_cancion() {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_canciones_artista(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_canciones_album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public Compositor anadir_compositor(Compositor aCompositor, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public Interprete anadir_interprete(int aIdCancion, Interprete aInterprete) {
		throw new UnsupportedOperationException();
	}

	public Productor anadir_productor(Productor aProductor, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public Cancion cargar_creditos(int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_compositor(Compositor aCompositor, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_estilo_musica_cancion(EstilosMusica aEstiloMusica, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_interprete(Interprete aInterprete, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_productor(Productor aProductor, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public BD_Cancion modificar_cancion(int aIdCancion, String aTitulo, Interprete[] aInterpretes, Compositor[] aCompositores, Productor[] aProductores, EstilosMusica[] aEstilosDeMusica, String aFichero) {
		throw new UnsupportedOperationException();
	}

	public Cancion buscador_canciones_administrador(String aNombreCancion) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] BuscadorGeneralCancion(Cancion[] aNombreCancion) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] BuscardorCancionLista(String aNombreCancion) {
		throw new UnsupportedOperationException();
	}
}