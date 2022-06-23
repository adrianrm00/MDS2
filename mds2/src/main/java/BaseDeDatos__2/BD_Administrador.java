package BaseDeDatos__2;

import basededatos__1.BDPrincipal;
import java.util.Vector;
import basededatos.Administrador;

public class BD_Administrador {
	public BDPrincipal _bd_prin_admin;
	public Vector<Administrador> _contiene_admin = new Vector<Administrador>();

	public Administrador comprobar_inicio(String aEmail, String aNombreUsuario, String aContrasena) {
		throw new UnsupportedOperationException();
	}
}