package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-anadircancionalista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-anadircancionalista")
@JsModule("./vista-anadircancionalista.ts")
public class VistaAnadircancionalista extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_cancion")
	private Element container_cancion;
	@Id("container_imagen")
	private Element container_imagen;
	@Id("img")
	private Image img;
	@Id("container_informacion_cancion")
	private Element container_informacion_cancion;
	@Id("container_nombre_cancion")
	private HorizontalLayout container_nombre_cancion;
	@Id("label_nombre_cancion")
	private Label label_nombre_cancion;
	@Id("container_nombre_artista")
	private HorizontalLayout container_nombre_artista;
	@Id("label_nombre_artista")
	private Label label_nombre_artista;
	@Id("container_boton")
	private Element container_boton;
	@Id("boton_anadir")
	private Button boton_anadir;

	public Element getContainer_principal() {
		return container_principal;
	}

	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}

	public Element getContainer_cancion() {
		return container_cancion;
	}

	public void setContainer_cancion(Element container_cancion) {
		this.container_cancion = container_cancion;
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

	public Element getContainer_informacion_cancion() {
		return container_informacion_cancion;
	}

	public void setContainer_informacion_cancion(Element container_informacion_cancion) {
		this.container_informacion_cancion = container_informacion_cancion;
	}

	public HorizontalLayout getContainer_nombre_cancion() {
		return container_nombre_cancion;
	}

	public void setContainer_nombre_cancion(HorizontalLayout container_nombre_cancion) {
		this.container_nombre_cancion = container_nombre_cancion;
	}

	public Label getLabel_nombre_cancion() {
		return label_nombre_cancion;
	}

	public void setLabel_nombre_cancion(Label label_nombre_cancion) {
		this.label_nombre_cancion = label_nombre_cancion;
	}

	public HorizontalLayout getContainer_nombre_artista() {
		return container_nombre_artista;
	}

	public void setContainer_nombre_artista(HorizontalLayout container_nombre_artista) {
		this.container_nombre_artista = container_nombre_artista;
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

	public Button getBoton_anadir() {
		return boton_anadir;
	}

	public void setBoton_anadir(Button boton_anadir) {
		this.boton_anadir = boton_anadir;
	}

	/**
     * Creates a new VistaAnadircancionalista.
     */
    public VistaAnadircancionalista() {
        // You can initialise any data required for the connected UI components here.
    }

}
