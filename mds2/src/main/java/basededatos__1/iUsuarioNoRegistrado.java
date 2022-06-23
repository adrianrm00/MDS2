package basededatos__1;

import basededatos.Cancion;
import basededatos.Usuario_Reg;
import basededatos.Usuario;

public interface iUsuarioNoRegistrado {

	public Cancion[] cargar_canciones();

	public Usuario_Reg comprobar_inicio(String aEmail, String aNombreUsuario, String aContrasena);

	public Usuario registrarse(String aNombreCompleto, String aNombreUsuario, String aEmail, String aContrasena, String aImagen);

	public Usuario_Reg olvido_su_contrasena(String aEmail);
}