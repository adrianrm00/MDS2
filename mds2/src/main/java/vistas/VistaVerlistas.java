package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-verlistas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-verlistas")
@JsModule("./vista-verlistas.ts")
public class VistaVerlistas extends LitTemplate {

	@Id("container_principal")
	private Element container_principal;
	@Id("container_cabecera")
	private Element container_cabecera;
	@Id("container_texto")
	private Label container_texto;
	@Id("container_buscador")
	private Element container_buscador;
	@Id("container_buscador_centrado")
	private Element container_buscador_centrado;
	@Id("container_listas")
	private Element container_listas;
	@Id("container_listas_centrado")
	private Element container_listas_centrado;

	
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

	public Label getContainer_texto() {
		return container_texto;
	}

	public void setContainer_texto(Label container_texto) {
		this.container_texto = container_texto;
	}

	public Element getContainer_buscador() {
		return container_buscador;
	}

	public void setContainer_buscador(Element container_buscador) {
		this.container_buscador = container_buscador;
	}

	public Element getContainer_buscador_centrado() {
		return container_buscador_centrado;
	}

	public void setContainer_buscador_centrado(Element container_buscador_centrado) {
		this.container_buscador_centrado = container_buscador_centrado;
	}

	public Element getContainer_listas() {
		return container_listas;
	}

	public void setContainer_listas(Element container_listas) {
		this.container_listas = container_listas;
	}

	public Element getContainer_listas_centrado() {
		return container_listas_centrado;
	}

	public void setContainer_listas_centrado(Element container_listas_centrado) {
		this.container_listas_centrado = container_listas_centrado;
	}


	/**
     * Creates a new VistaVerlistas.
     */
    public VistaVerlistas() {
        // You can initialise any data required for the connected UI components here.
    }

}
