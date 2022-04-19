package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cancionesfav template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancionesfav")
@JsModule("./vista-cancionesfav.ts")
public class VistaCancionesfav extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_cabecera_canciones_fav")
	private Element container_cabecera_canciones_fav;
	@Id("container_label_canciones_fav")
	private Element container_label_canciones_fav;
	@Id("label_canciones_fav")
	private Label label_canciones_fav;
	@Id("container_boton_reproducir")
	private Element container_boton_reproducir;
	@Id("boton_reproducir")
	private Button boton_reproducir;
	@Id("container_contenido")
	private Element container_contenido;

	public Element getContainer_principal() {
		return container_principal;
	}

	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}

	public Element getContainer_cabecera_canciones_fav() {
		return container_cabecera_canciones_fav;
	}

	public void setContainer_cabecera_canciones_fav(Element container_cabecera_canciones_fav) {
		this.container_cabecera_canciones_fav = container_cabecera_canciones_fav;
	}

	public Element getContainer_label_canciones_fav() {
		return container_label_canciones_fav;
	}

	public void setContainer_label_canciones_fav(Element container_label_canciones_fav) {
		this.container_label_canciones_fav = container_label_canciones_fav;
	}

	public Label getLabel_canciones_fav() {
		return label_canciones_fav;
	}

	public void setLabel_canciones_fav(Label label_canciones_fav) {
		this.label_canciones_fav = label_canciones_fav;
	}

	public Element getContainer_boton_reproducir() {
		return container_boton_reproducir;
	}

	public void setContainer_boton_reproducir(Element container_boton_reproducir) {
		this.container_boton_reproducir = container_boton_reproducir;
	}

	public Button getBoton_reproducir() {
		return boton_reproducir;
	}

	public void setBoton_reproducir(Button boton_reproducir) {
		this.boton_reproducir = boton_reproducir;
	}

	public Element getContainer_contenido() {
		return container_contenido;
	}

	public void setContainer_contenido(Element container_contenido) {
		this.container_contenido = container_contenido;
	}

	/**
     * Creates a new VistaCancionesfav.
     */
    public VistaCancionesfav() {
        // You can initialise any data required for the connected UI components here.
    }

}
