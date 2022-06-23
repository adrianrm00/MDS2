package BaseDeDatos__2;

import basededatos__1.BDPrincipal;
import java.util.Vector;

import basededatos.Album;
import basededatos.Artista;
import basededatos.Cancion;
import basededatos.Usuario;
import basededatos.Usuario_Reg;
import interfaz.Perfil;

public class BD_Usuario_Registrado {
	public BDPrincipal _bd_prin_us_reg;
	public Vector<Usuario_Reg> _contiene_usuario_reg = new Vector<Usuario_Reg>();

	public void dar_baja_perfil(Perfil aPerfil) {
		throw new UnsupportedOperationException();
	}

	public Usuario comprobar_inicio(String aEmail, String aNombreUsuario, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public Usuario registrarse(String aNombreCompleto, String aNombreUsuario, String aEmail, String aContrasena, String aImagen) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Reg olvido_su_contrasena(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_canciones_escuchadas_recientemente(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Artista[] cargar_artistas_recomendados(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Album[] cargar_albumes_recomendados(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Reg cambiar_contrasena(String aContrasena, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Reg cambiar_correo(String aCorreo, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Reg cargar_estadisticas(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void confirmar_darse_baja() {
		throw new UnsupportedOperationException();
	}

	public Usuario_Reg cambiar_contrasena(String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Reg buscador_perfiles_administrador(String aNombrePerfil) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Reg anadir_a_mis_listas(int aIdLista, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}
}