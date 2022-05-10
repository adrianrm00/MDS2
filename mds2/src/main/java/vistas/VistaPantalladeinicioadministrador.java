package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-pantalladeinicioadministrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pantalladeinicioadministrador")
@JsModule("./vista-pantalladeinicioadministrador.ts")
public class VistaPantalladeinicioadministrador extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_principal_opciones")
	private HorizontalLayout container_principal_opciones;
	@Id("container_opciones")
	private HorizontalLayout container_opciones;
	@Id("container_opciones_izq")
	private Element container_opciones_izq;
	@Id("boton_anadir_artista")
	private Button boton_anadir_artista;
	@Id("boton_anadir_album")
	private Button boton_anadir_album;
	@Id("boton_anadir_cacnion")
	private Button boton_anadir_cacnion;
	@Id("boton_modificar_estilos")
	private Button boton_modificar_estilos;
	@Id("boton_dar_de_baja_perfil")
	private Button boton_dar_de_baja_perfil;
	@Id("container_opciones_der")
	private Element container_opciones_der;
	@Id("boton_modificar_artista")
	private Button boton_modificar_artista;
	@Id("boton_modificar_album")
	private Button boton_modificar_album;
	@Id("boton_modificar_cancion")
	private Button boton_modificar_cancion;
	@Id("boton_modificar_canciones_iniciales")
	private Button boton_modificar_canciones_iniciales;
	@Id("boton_dar_de_baja_perfil_artista")
	private Button boton_dar_de_baja_perfil_artista;

	
	public Element getContainer_principal() {
		return container_principal;
	}


	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}


	public HorizontalLayout getContainer_principal_opciones() {
		return container_principal_opciones;
	}


	public void setContainer_principal_opciones(HorizontalLayout container_principal_opciones) {
		this.container_principal_opciones = container_principal_opciones;
	}


	public HorizontalLayout getContainer_opciones() {
		return container_opciones;
	}


	public void setContainer_opciones(HorizontalLayout container_opciones) {
		this.container_opciones = container_opciones;
	}


	public Element getContainer_opciones_izq() {
		return container_opciones_izq;
	}


	public void setContainer_opciones_izq(Element container_opciones_izq) {
		this.container_opciones_izq = container_opciones_izq;
	}


	public Button getBoton_anadir_artista() {
		return boton_anadir_artista;
	}


	public void setBoton_anadir_artista(Button boton_anadir_artista) {
		this.boton_anadir_artista = boton_anadir_artista;
	}


	public Button getBoton_anadir_album() {
		return boton_anadir_album;
	}


	public void setBoton_anadir_album(Button boton_anadir_album) {
		this.boton_anadir_album = boton_anadir_album;
	}


	public Button getBoton_anadir_cacnion() {
		return boton_anadir_cacnion;
	}


	public void setBoton_anadir_cacnion(Button boton_anadir_cacnion) {
		this.boton_anadir_cacnion = boton_anadir_cacnion;
	}


	public Button getBoton_modificar_estilos() {
		return boton_modificar_estilos;
	}


	public void setBoton_modificar_estilos(Button boton_modificar_estilos) {
		this.boton_modificar_estilos = boton_modificar_estilos;
	}


	public Button getBoton_dar_de_baja_perfil() {
		return boton_dar_de_baja_perfil;
	}


	public void setBoton_dar_de_baja_perfil(Button boton_dar_de_baja_perfil) {
		this.boton_dar_de_baja_perfil = boton_dar_de_baja_perfil;
	}


	public Element getContainer_opciones_der() {
		return container_opciones_der;
	}


	public void setContainer_opciones_der(Element container_opciones_der) {
		this.container_opciones_der = container_opciones_der;
	}


	public Button getBoton_modificar_artista() {
		return boton_modificar_artista;
	}


	public void setBoton_modificar_artista(Button boton_modificar_artista) {
		this.boton_modificar_artista = boton_modificar_artista;
	}


	public Button getBoton_modificar_album() {
		return boton_modificar_album;
	}


	public void setBoton_modificar_album(Button boton_modificar_album) {
		this.boton_modificar_album = boton_modificar_album;
	}


	public Button getBoton_modificar_cancion() {
		return boton_modificar_cancion;
	}


	public void setBoton_modificar_cancion(Button boton_modificar_cancion) {
		this.boton_modificar_cancion = boton_modificar_cancion;
	}


	public Button getBoton_modificar_canciones_iniciales() {
		return boton_modificar_canciones_iniciales;
	}


	public void setBoton_modificar_canciones_iniciales(Button boton_modificar_canciones_iniciales) {
		this.boton_modificar_canciones_iniciales = boton_modificar_canciones_iniciales;
	}


	public Button getBoton_dar_de_baja_perfil_artista() {
		return boton_dar_de_baja_perfil_artista;
	}


	public void setBoton_dar_de_baja_perfil_artista(Button boton_dar_de_baja_perfil_artista) {
		this.boton_dar_de_baja_perfil_artista = boton_dar_de_baja_perfil_artista;
	}


	/**
     * Creates a new VistaPantalladeinicioadministrador.
     */
    public VistaPantalladeinicioadministrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
