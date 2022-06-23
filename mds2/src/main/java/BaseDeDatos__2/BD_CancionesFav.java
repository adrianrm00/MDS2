package BaseDeDatos__2;

import basededatos__1.BDPrincipal;
import java.util.Vector;

import basededatos.Cancion;
import basededatos.CancionesFav;

public class BD_CancionesFav {
	public BDPrincipal _bd_prin_canciones_fav;
	public Vector<CancionesFav> _contiene_canciones_fav = new Vector<CancionesFav>();

	public Cancion anadir_favoritos(int aIdUsuario, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_favoritos(int aIdUsuario, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public CancionesFav[] cargar_canciones_fav(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}
}