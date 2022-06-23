package BaseDeDatos__2;

import basededatos__1.BDPrincipal;
import java.util.Vector;
import basededatos.Mensaje;

public class BD_Mensaje_Contacto {
	public BDPrincipal _bd_prin_mensaje_contacto;
	public Vector<Mensaje> _contiene_mensaje = new Vector<Mensaje>();

	public Mensaje enviar_mensaje(String aMensaje, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}
}