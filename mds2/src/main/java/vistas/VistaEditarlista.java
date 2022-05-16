package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-editarlista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-editarlista")
@JsModule("./vista-editarlista.ts")
public class VistaEditarlista extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("boton_editar")
	private Button boton_editar;

	
	
	public Element getContainer_principal() {
		return container_principal;
	}



	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}



	public Button getBoton_editar() {
		return boton_editar;
	}



	public void setBoton_editar(Button boton_editar) {
		this.boton_editar = boton_editar;
	}



	/**
     * Creates a new VistaEditarlista.
     */
    public VistaEditarlista() {
        // You can initialise any data required for the connected UI components here.
    }

}
