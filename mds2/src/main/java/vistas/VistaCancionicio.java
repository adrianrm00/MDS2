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
 * A Designer generated component for the vista-cancionicio template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancionicio")
@JsModule("./vista-cancionicio.ts")
public class VistaCancionicio extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("conainer_img")
	private Element conainer_img;
	@Id("img")
	private Image img;
	@Id("container_contenido")
	private Element container_contenido;
	@Id("container_texto")
	private Element container_texto;
	@Id("label_nom_cancion")
	private Label label_nom_cancion;
	@Id("label_nombre_artista")
	private Label label_nombre_artista;
	@Id("container_boton")
	private Element container_boton;
	@Id("boton_reproducir")
	private Button boton_reproducir;

	
	
	public Element getContainer_principal() {
		return container_principal;
	}



	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}



	public Element getConainer_img() {
		return conainer_img;
	}



	public void setConainer_img(Element conainer_img) {
		this.conainer_img = conainer_img;
	}



	public Image getImg() {
		return img;
	}



	public void setImg(Image img) {
		this.img = img;
	}



	public Element getContainer_contenido() {
		return container_contenido;
	}



	public void setContainer_contenido(Element container_contenido) {
		this.container_contenido = container_contenido;
	}



	public Element getContainer_texto() {
		return container_texto;
	}



	public void setContainer_texto(Element container_texto) {
		this.container_texto = container_texto;
	}



	public Label getLabel_nom_cancion() {
		return label_nom_cancion;
	}



	public void setLabel_nom_cancion(Label label_nom_cancion) {
		this.label_nom_cancion = label_nom_cancion;
	}



	public Label getLabel_nombre_artista() {
		return label_nombre_artista;
	}



	public void setLabel_nombre_artista(Label label_nombre_artista) {
		this.label_nombre_artista = label_nombre_artista;
	}



	public Element getContainer_boton() {
		return container_boton;
	}



	public void setContainer_boton(Element container_boton) {
		this.container_boton = container_boton;
	}



	public Button getBoton_reproducir() {
		return boton_reproducir;
	}



	public void setBoton_reproducir(Button boton_reproducir) {
		this.boton_reproducir = boton_reproducir;
	}



	/**
     * Creates a new VistaCancionicio.
     */
    public VistaCancionicio() {
        // You can initialise any data required for the connected UI components here.
    }

}
