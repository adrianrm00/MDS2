package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-perfilartista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-perfilartista")
@JsModule("./vista-perfilartista.ts")
public class VistaPerfilartista extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_cabecera")
	private Element container_cabecera;
	@Id("container informacion_artista")
	private Element containerInformacion_artista;
	@Id("container_imagen")
	private Element container_imagen;
	@Id("img")
	private Image img;
	@Id("container_informacion")
	private Element container_informacion;
	@Id("container_nombre_seguir")
	private Element container_nombre_seguir;
	@Id("container_nombre")
	private Element container_nombre;
	@Id("titulo_nombre")
	private Label titulo_nombre;
	@Id("container_boton")
	private Element container_boton;
	@Id("boton_seguir")
	private Button boton_seguir;
	@Id("container_estilos")
	private Element container_estilos;
	@Id("titulo_estilos")
	private Label titulo_estilos;
	@Id("testo_estilos")
	private Label testo_estilos;
	@Id("container_seguidores")
	private Element container_seguidores;
	@Id("titulo_seguidores")
	private Label titulo_seguidores;
	@Id("container_eventos")
	private Element container_eventos;
	@Id("testo_num_seguidores")
	private Label testo_num_seguidores;
	@Id("container_canciones")
	private Element container_canciones;

	
	public Element getContainer_principal() {
		return container_principal;
	}


	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}


	public Element getContainer_cabecera() {
		return container_cabecera;
	}


	public void setContainer_cabecera(Element container_cabecera) {
		this.container_cabecera = container_cabecera;
	}


	public Element getContainerInformacion_artista() {
		return containerInformacion_artista;
	}


	public void setContainerInformacion_artista(Element containerInformacion_artista) {
		this.containerInformacion_artista = containerInformacion_artista;
	}


	public Element getContainer_imagen() {
		return container_imagen;
	}


	public void setContainer_imagen(Element container_imagen) {
		this.container_imagen = container_imagen;
	}


	public Image getImg() {
		return img;
	}


	public void setImg(Image img) {
		this.img = img;
	}


	public Element getContainer_informacion() {
		return container_informacion;
	}


	public void setContainer_informacion(Element container_informacion) {
		this.container_informacion = container_informacion;
	}


	public Element getContainer_nombre_seguir() {
		return container_nombre_seguir;
	}


	public void setContainer_nombre_seguir(Element container_nombre_seguir) {
		this.container_nombre_seguir = container_nombre_seguir;
	}


	public Element getContainer_nombre() {
		return container_nombre;
	}


	public void setContainer_nombre(Element container_nombre) {
		this.container_nombre = container_nombre;
	}


	public Label getTitulo_nombre() {
		return titulo_nombre;
	}


	public void setTitulo_nombre(Label titulo_nombre) {
		this.titulo_nombre = titulo_nombre;
	}


	public Element getContainer_boton() {
		return container_boton;
	}


	public void setContainer_boton(Element container_boton) {
		this.container_boton = container_boton;
	}


	public Button getBoton_seguir() {
		return boton_seguir;
	}


	public void setBoton_seguir(Button boton_seguir) {
		this.boton_seguir = boton_seguir;
	}


	public Element getContainer_estilos() {
		return container_estilos;
	}


	public void setContainer_estilos(Element container_estilos) {
		this.container_estilos = container_estilos;
	}


	public Label getTitulo_estilos() {
		return titulo_estilos;
	}


	public void setTitulo_estilos(Label titulo_estilos) {
		this.titulo_estilos = titulo_estilos;
	}


	public Label getTesto_estilos() {
		return testo_estilos;
	}


	public void setTesto_estilos(Label testo_estilos) {
		this.testo_estilos = testo_estilos;
	}


	public Element getContainer_seguidores() {
		return container_seguidores;
	}


	public void setContainer_seguidores(Element container_seguidores) {
		this.container_seguidores = container_seguidores;
	}


	public Label getTitulo_seguidores() {
		return titulo_seguidores;
	}


	public void setTitulo_seguidores(Label titulo_seguidores) {
		this.titulo_seguidores = titulo_seguidores;
	}


	public Element getContainer_eventos() {
		return container_eventos;
	}


	public void setContainer_eventos(Element container_eventos) {
		this.container_eventos = container_eventos;
	}


	public Label getTesto_num_seguidores() {
		return testo_num_seguidores;
	}


	public void setTesto_num_seguidores(Label testo_num_seguidores) {
		this.testo_num_seguidores = testo_num_seguidores;
	}


	public Element getContainer_canciones() {
		return container_canciones;
	}


	public void setContainer_canciones(Element container_canciones) {
		this.container_canciones = container_canciones;
	}


	/**
     * Creates a new VistaPerfilartista.
     */
    public VistaPerfilartista() {
        // You can initialise any data required for the connected UI components here.
    }

}
