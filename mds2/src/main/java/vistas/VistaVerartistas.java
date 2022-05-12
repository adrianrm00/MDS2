package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-verartistas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verartistas")
@JsModule("./vista-verartistas.ts")
public class VistaVerartistas extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_titulo")
	private Element container_titulo;
	@Id("titulo")
	private Label titulo;
	@Id("container_buscador")
	private Element container_buscador;
	@Id("container-buscador")
	private Element containerBuscador;

	
	
	public Element getContainerBuscador() {
		return containerBuscador;
	}


	public void setContainerBuscador(Element containerBuscador) {
		this.containerBuscador = containerBuscador;
	}


	public Element getContainer_principal() {
		return container_principal;
	}


	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}


	public Element getContainer_titulo() {
		return container_titulo;
	}


	public void setContainer_titulo(Element container_titulo) {
		this.container_titulo = container_titulo;
	}


	public Label getTitulo() {
		return titulo;
	}


	public void setTitulo(Label titulo) {
		this.titulo = titulo;
	}


	public Element getContainer_buscador() {
		return container_buscador;
	}


	public void setContainer_buscador(Element container_buscador) {
		this.container_buscador = container_buscador;
	}


	/**
     * Creates a new VistaVerartistas.
     */
    public VistaVerartistas() {
        // You can initialise any data required for the connected UI components here.
    }

}
