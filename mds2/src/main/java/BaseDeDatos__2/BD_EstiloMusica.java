package BaseDeDatos__2;

import basededatos__1.BDPrincipal;
import java.util.Vector;
import basededatos.EstilosMusica;
import interfaz.Estilo_de_musica;

public class BD_EstiloMusica {
	public BDPrincipal _bd_prin_estilo_musica;
	public Vector<EstilosMusica> _contiene_estilo_musica = new Vector<EstilosMusica>();

	public EstilosMusica anadir_estilo_musica(String aEstilo) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_estilo_musica(Estilo_de_musica aEstilo) {
		throw new UnsupportedOperationException();
	}

	public EstilosMusica anadir_estilo_musica_artista(EstilosMusica aEstilo) {
		throw new UnsupportedOperationException();
	}

	public EstilosMusica anadir_estilo_musica_cancion(EstilosMusica aEstiloMusica) {
		throw new UnsupportedOperationException();
	}
}