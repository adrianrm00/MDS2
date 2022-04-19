package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-asistencia template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-asistencia")
@JsModule("./vista-asistencia.ts")
public class VistaAsistencia extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("h1_asistencia")
	private H1 h1_asistencia;
	@Id("container_contenido")
	private Element container_contenido;
	@Id("h3_1")
	private H3 h3_1;
	@Id("h3_2")
	private H3 h3_2;
	@Id("boton_cerrar")
	private Button boton_cerrar;

	public Element getContainer_principal() {
		return container_principal;
	}

	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}

	public H1 getH1_asistencia() {
		return h1_asistencia;
	}

	public void setH1_asistencia(H1 h1_asistencia) {
		this.h1_asistencia = h1_asistencia;
	}

	public Element getContainer_contenido() {
		return container_contenido;
	}

	public void setContainer_contenido(Element container_contenido) {
		this.container_contenido = container_contenido;
	}

	public H3 getH3_1() {
		return h3_1;
	}

	public void setH3_1(H3 h3_1) {
		this.h3_1 = h3_1;
	}

	public H3 getH3_2() {
		return h3_2;
	}

	public void setH3_2(H3 h3_2) {
		this.h3_2 = h3_2;
	}

	public Button getBoton_cerrar() {
		return boton_cerrar;
	}

	public void setBoton_cerrar(Button boton_cerrar) {
		this.boton_cerrar = boton_cerrar;
	}

	/**
     * Creates a new VistaAsistencia.
     */
    public VistaAsistencia() {
        // You can initialise any data required for the connected UI components here.
    }

}
