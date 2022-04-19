package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-tubiblioteca template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-tubiblioteca")
@JsModule("./vista-tubiblioteca.ts")
public class VistaTubiblioteca extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_listas")
	private Element container_listas;
	@Id("boton listas")
	private Button botonListas;
	@Id("container_artistas")
	private Element container_artistas;
	@Id("boton_artistas")
	private Button boton_artistas;
	@Id("container_albumes")
	private Element container_albumes;
	@Id("boton_albumes")
	private Button boton_albumes;

	public Element getContainer_principal() {
		return container_principal;
	}


	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}


	public Element getContainer_listas() {
		return container_listas;
	}


	public void setContainer_listas(Element container_listas) {
		this.container_listas = container_listas;
	}


	public Button getBotonListas() {
		return botonListas;
	}


	public void setBotonListas(Button botonListas) {
		this.botonListas = botonListas;
	}


	public Element getContainer_artistas() {
		return container_artistas;
	}


	public void setContainer_artistas(Element container_artistas) {
		this.container_artistas = container_artistas;
	}


	public Button getBoton_artistas() {
		return boton_artistas;
	}


	public void setBoton_artistas(Button boton_artistas) {
		this.boton_artistas = boton_artistas;
	}


	public Element getContainer_albumes() {
		return container_albumes;
	}


	public void setContainer_albumes(Element container_albumes) {
		this.container_albumes = container_albumes;
	}


	public Button getBoton_albumes() {
		return boton_albumes;
	}


	public void setBoton_albumes(Button boton_albumes) {
		this.boton_albumes = boton_albumes;
	}


	/**
     * Creates a new VistaTubiblioteca.
     */
    public VistaTubiblioteca() {
        // You can initialise any data required for the connected UI components here.
    }

}
