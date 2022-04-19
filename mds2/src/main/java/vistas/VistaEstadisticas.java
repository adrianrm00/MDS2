package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-estadisticas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-estadisticas")
@JsModule("./vista-estadisticas.ts")
public class VistaEstadisticas extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_cabecera")
	private Element container_cabecera;
	@Id("texto_estadisticas")
	private Label texto_estadisticas;
	@Id("container_informacion")
	private Element container_informacion;
	@Id("texto_ejemplo1")
	private Label texto_ejemplo1;
	@Id("texto_ejemplo2")
	private Label texto_ejemplo2;

	
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


	public Label getTexto_estadisticas() {
		return texto_estadisticas;
	}


	public void setTexto_estadisticas(Label texto_estadisticas) {
		this.texto_estadisticas = texto_estadisticas;
	}


	public Element getContainer_informacion() {
		return container_informacion;
	}


	public void setContainer_informacion(Element container_informacion) {
		this.container_informacion = container_informacion;
	}


	public Label getTexto_ejemplo1() {
		return texto_ejemplo1;
	}


	public void setTexto_ejemplo1(Label texto_ejemplo1) {
		this.texto_ejemplo1 = texto_ejemplo1;
	}


	public Label getTexto_ejemplo2() {
		return texto_ejemplo2;
	}


	public void setTexto_ejemplo2(Label texto_ejemplo2) {
		this.texto_ejemplo2 = texto_ejemplo2;
	}


	/**
     * Creates a new VistaEstadisticas.
     */
    public VistaEstadisticas() {
        // You can initialise any data required for the connected UI components here.
    }

}
