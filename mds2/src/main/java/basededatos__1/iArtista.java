package basededatos__1;

import java.util.Date;

import basededatos.Evento;

public interface iArtista extends iUsuarioRegistrado {

	public Evento anadir_evento(String aNombreEvento, String aLugar, Date aFecha);

	public Evento editar_evento(String aNombreEvento, String aLugar, Date aFecha);

	public void borrar_evento(int aIdEvento);
}