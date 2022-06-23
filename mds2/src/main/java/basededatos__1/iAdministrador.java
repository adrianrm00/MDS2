package basededatos__1;

import basededatos.Album;
import basededatos.Artista;
// import interfaz.Cancion;
import interfaz.Estilo_de_musica;
// import BaseDeDatos__2.Cancion;
import basededatos.Interprete;
import basededatos.Compositor;
import basededatos.Productor;
import basededatos.EstilosMusica;
import interfaz.Perfil;
import interfaz.Perfil_artista;
import interfaz.Cancion_de_prueba;

import java.util.Date;

import BaseDeDatos__2.BD_Productor;
import basededatos.Usuario_Reg;

public interface iAdministrador {

	public Album anadir_album(String aNomAlbum, Date aFechaLanz, Artista[] aArtistaAsociado, interfaz.Cancion[] aCanciones, String aFoto);

	public Artista anadir_artista(String aNomArtista, String aNomCompleto, String aEmail, String aContrasena, Date aFechaNacimiento, Estilo_de_musica[] aEstilosMusica, String aFoto);

	public basededatos.Cancion anadir_cancion(String aTitulo, Interprete[] aInterpretes, Compositor[] aCompositores, Productor[] aProductores, Estilo_de_musica[] aEstilosMusica, String aFicheroMultimedia);

	public EstilosMusica anadir_estilo_musica(String aEstilo);

	public void dar_baja_perfil(Perfil aPerfil);

	public void dar_baja_perfil_artista(Perfil_artista aPerfilArtista);

	public void eliminar_estilo_musica(Estilo_de_musica aEstilo);

	public basededatos.Cancion modificar_cancion_inicial(int aSlot, Cancion_de_prueba aCancion);

	public EstilosMusica anadir_estilo_musica_artista(EstilosMusica aEstilo);

	public void eliminar_estilo_musica_artista(EstilosMusica aEstilo, int aIdArtista);

	public Artista anadir_artista_asociado_album(int aIdArtista, int aIdAlbum);

	public void eliminar_artista_asociado_album(int aIdArtista, int aIdAlbum);

	public basededatos.Cancion anadir_cancion_album(int aIdAlbum, String aTitulo, Interprete[] aInterprete, Compositor[] aCompositor, BD_Productor[] aProductor, EstilosMusica[] aEstiloMusica, String aFichero);

	public void eliminar_cancion_album(int aIdCancion, int aIdAlbum);

	public Interprete anadir_interprete(String aInterprete);

	public void eliminar_interprete(Interprete aInterprete, int aIdCancion);

	public void eliminar_compositor(Compositor aCompositor, int aIdCancion);

	public void eliminar_productor(Productor aProductor, int aIdCancion);

	public Compositor anadir_compositor(Compositor aCompositor);

	public Productor anadir_productor(Productor aProductor);

	public EstilosMusica anadir_estilo_musica_cancion(EstilosMusica aEstiloMusica);

	public void eliminar_estilo_musica_cancion(EstilosMusica aEstiloMusica, int aIdCancion);

	public Artista modificar_artista(int aIdArtista, String aNomArtista, String aNomCompleto, String aEmail, String aContrasena, Date aFechaNacimiento, EstilosMusica[] aEstilosMusica, String aFoto);

	public Artista buscador_artista_administrador(String aNomArtista);

	public Album modificar_album(int aIdAlbum, String aNombre, Date aFechaLanz, Artista[] aArtistasAsociados, basededatos.Cancion[] aCanciones, String aFoto);

	public Album buscador_album_administrador(String aNomAlbum);

	public basededatos.Cancion modificar_cancion(int aIdCancion, String aTitulo, Interprete[] aInterpretes, Compositor[] aCompositores, Productor[] aProductores, EstilosMusica[] aEstiloDeMusica, String aFichero);

	public basededatos.Cancion buscador_canciones_administrador(String aNombreCancion);

	public Usuario_Reg buscador_perfiles_administrador(String aNombrePerfil);
}