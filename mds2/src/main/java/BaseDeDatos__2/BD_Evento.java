package BaseDeDatos__2;

import basededatos__1.BDPrincipal;

import java.util.Date;
import java.util.Vector;
import basededatos.Evento;

public class BD_Evento {
	public BDPrincipal _bd_prin_event;
	public Vector<Evento> _contiene_evento = new Vector<Evento>();

	public Evento[] cargar_eventos_artista(int aIdArtista) {
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