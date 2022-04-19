package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cerrarsesion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cerrarsesion")
@JsModule("./vista-cerrarsesion.ts")
public class VistaCerrarsesion extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("h1")
	private H1 h1;
	@Id("container_botones_finales")
	private HorizontalLayout container_botones_finales;
	@Id("container_boton_no")
	private HorizontalLayout container_boton_no;
	@Id("boton_no")
	private Button boton_no;
	@Id("container_boton_si")
	private HorizontalLayout container_boton_si;
	@Id("boton_si")
	private Button boton_si;

	public Element getContainer_principal() {
		return container_principal;
	}

	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}

	public H1 getH1() {
		return h1;
	}

	public void setH1(H1 h1) {
		this.h1 = h1;
	}

	public HorizontalLayout getContainer_botones_finales() {
		return container_botones_finales;
	}

	public void setContainer_botones_finales(HorizontalLayout container_botones_finales) {
		this.container_botones_finales = container_botones_finales;
	}

	public HorizontalLayout getContainer_boton_no() {
		return container_boton_no;
	}

	public void setContainer_boton_no(HorizontalLayout container_boton_no) {
		this.container_boton_no = container_boton_no;
	}

	public Button getBoton_no() {
		return boton_no;
	}

	public void setBoton_no(Button boton_no) {
		this.boton_no = boton_no;
	}

	public HorizontalLayout getContainer_boton_si() {
		return container_boton_si;
	}

	public void setContainer_boton_si(HorizontalLayout container_boton_si) {
		this.container_boton_si = container_boton_si;
	}

	public Button getBoton_si() {
		return boton_si;
	}

	public void setBoton_si(Button boton_si) {
		this.boton_si = boton_si;
	}

	/**
     * Creates a new VistaCerrarsesion.
     */
    public VistaCerrarsesion() {
        // You can initialise any data required for the connected UI components here.
    }

}
