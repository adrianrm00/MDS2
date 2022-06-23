package BaseDeDatos__2;

import basededatos__1.BDPrincipal;
import java.util.Vector;

import basededatos.Cancion;
import basededatos.Lista;

public class BD_Lista {
	public BDPrincipal _bd_prin_lista;
	public Vector<Lista> _contiene_lista = new Vector<Lista>();

	public Lista[] cargar_listas_menu_lateral(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Lista[] cargar_listas(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Lista[] cargar_listas() {
		throw new UnsupportedOperationException();
	}

	public Lista[] anadir_cancion_a_lista_creada(int aIdCancion, int aIdLista, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Lista crear_lista(int aIdUusuario, String aNombreLista, Cancion[] aCanciones) {
		throw new UnsupportedOperationException();
	}

	public Lista cargar_lista(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public Lista editar_lista(int aIdLista, int aNombreLista, Cancion[] aCanciones) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_lista(int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public Lista[] BuscadorGeneralListas(String aNombreLista) {
		throw new UnsupportedOperationException();
	}

	public Lista[] BuscadorBibliotecaListas(int aIdUsuario, String aNombreLista) {
		throw new UnsupportedOperationException();
	}
}