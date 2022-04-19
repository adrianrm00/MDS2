package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-anadiramislistas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-anadiramislistas")
@JsModule("./vista-anadiramislistas.ts")
public class VistaAnadiramislistas extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("boton_anadir_a_mis_listas")
	private Button boton_anadir_a_mis_listas;
	
	public Element getContainer_principal() {
		return container_principal;
	}



	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}



	public Button getBoton_anadir_a_mis_listas() {
		return boton_anadir_a_mis_listas;
	}



	public void setBoton_anadir_a_mis_listas(Button boton_anadir_a_mis_listas) {
		this.boton_anadir_a_mis_listas = boton_anadir_a_mis_listas;
	}



	/**
     * Creates a new VistaAnadiramislistas.
     */
    public VistaAnadiramislistas() {
        // You can initialise any data required for the connected UI components here.
    }

}
