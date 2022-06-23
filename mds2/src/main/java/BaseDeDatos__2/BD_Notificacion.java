package BaseDeDatos__2;

import basededatos__1.BDPrincipal;
import java.util.Vector;
import basededatos.Notificacion;

public class BD_Notificacion {
	public BDPrincipal _bd_prin_notif;
	public Vector<Notificacion> _contiene_notificacion = new Vector<Notificacion>();

	public void eliminar_notificacion(int aIdUsuario, int aIdNotificacion) {
		throw new UnsupportedOperationException();
	}

	public Notificacion abrir_notificacion(int aIdUsuario, int aIdNotificacion) {
		throw new UnsupportedOperationException();
	}
}