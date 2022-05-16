package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-lista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista")
@JsModule("./vista-lista.ts")
public class VistaLista extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_eliminar")
	private Element container_eliminar;
	@Id("boton_eliminar")
	private Button boton_eliminar;
	@Id("container_compartir")
	private Element container_compartir;
	@Id("boton_compartir")
	private Button boton_compartir;
	@Id("container_reproducir")
	private Element container_reproducir;
	@Id("boton_reproducir")
	private Button boton_reproducir;

	
	public Element getContainer_principal() {
		return container_principal;
	}


	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}


	public Element getContainer_eliminar() {
		return container_eliminar;
	}


	public void setContainer_eliminar(Element container_eliminar) {
		this.container_eliminar = container_eliminar;
	}


	public Button getBoton_eliminar() {
		return boton_eliminar;
	}


	public void setBoton_eliminar(Button boton_eliminar) {
		this.boton_eliminar = boton_eliminar;
	}


	public Element getContainer_compartir() {
		return container_compartir;
	}


	public void setContainer_compartir(Element container_compartir) {
		this.container_compartir = container_compartir;
	}


	public Button getBoton_compartir() {
		return boton_compartir;
	}


	public void setBoton_compartir(Button boton_compartir) {
		this.boton_compartir = boton_compartir;
	}


	public Element getContainer_reproducir() {
		return container_reproducir;
	}


	public void setContainer_reproducir(Element container_reproducir) {
		this.container_reproducir = container_reproducir;
	}


	public Button getBoton_reproducir() {
		return boton_reproducir;
	}


	public void setBoton_reproducir(Button boton_reproducir) {
		this.boton_reproducir = boton_reproducir;
	}


	/**
     * Creates a new VistaLista.
     */
    public VistaLista() {
        // You can initialise any data required for the connected UI components here.
    }

}
