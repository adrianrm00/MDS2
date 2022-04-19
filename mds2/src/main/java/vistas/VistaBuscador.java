package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-buscador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscador")
@JsModule("./vista-buscador.ts")
public class VistaBuscador extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_tf")
	private Element container_tf;
	@Id("tf_buscador")
	private TextField tf_buscador;
	@Id("container_boton")
	private Element container_boton;
	@Id("boton_buscar")
	private Button boton_buscar;

	public Element getContainer_principal() {
		return container_principal;
	}

	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}

	public Element getContainer_tf() {
		return container_tf;
	}

	public void setContainer_tf(Element container_tf) {
		this.container_tf = container_tf;
	}

	public TextField getTf_buscador() {
		return tf_buscador;
	}

	public void setTf_buscador(TextField tf_buscador) {
		this.tf_buscador = tf_buscador;
	}

	public Element getContainer_boton() {
		return container_boton;
	}

	public void setContainer_boton(Element container_boton) {
		this.container_boton = container_boton;
	}

	public Button getBoton_buscar() {
		return boton_buscar;
	}

	public void setBoton_buscar(Button boton_buscar) {
		this.boton_buscar = boton_buscar;
	}

	/**
     * Creates a new VistaBuscador.
     */
    public VistaBuscador() {
        // You can initialise any data required for the connected UI components here.
    }

}
