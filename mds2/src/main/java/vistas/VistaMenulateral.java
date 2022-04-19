package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-menulateral template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-menulateral")
@JsModule("./vista-menulateral.ts")
public class VistaMenulateral extends LitTemplate {

    @Id("container_pricipal")
	private Element container_pricipal;
	@Id("container_inicio")
	private Element container_inicio;
	@Id("boton_inicio")
	private Button boton_inicio;
	@Id("container_buscar")
	private Element container_buscar;
	@Id("boton_buscar")
	private Button boton_buscar;
	@Id("container_tu_biblioteca")
	private Element container_tu_biblioteca;
	@Id("boton_tu_biblioteca")
	private Button boton_tu_biblioteca;
	@Id("container_crear_lista")
	private Element container_crear_lista;
	@Id("boton_crear_lista")
	private Button boton_crear_lista;
	@Id("container_canciones_fav")
	private Element container_canciones_fav;
	@Id("boton_canciones_fav")
	private Button boton_canciones_fav;
	@Id("container_separador")
	private Element container_separador;
	@Id("texto_separador")
	private Label texto_separador;
	
	
	public Element getContainer_pricipal() {
		return container_pricipal;
	}


	public void setContainer_pricipal(Element container_pricipal) {
		this.container_pricipal = container_pricipal;
	}


	public Element getContainer_inicio() {
		return container_inicio;
	}


	public void setContainer_inicio(Element container_inicio) {
		this.container_inicio = container_inicio;
	}


	public Button getBoton_inicio() {
		return boton_inicio;
	}


	public void setBoton_inicio(Button boton_inicio) {
		this.boton_inicio = boton_inicio;
	}


	public Element getContainer_buscar() {
		return container_buscar;
	}


	public void setContainer_buscar(Element container_buscar) {
		this.container_buscar = container_buscar;
	}


	public Button getBoton_buscar() {
		return boton_buscar;
	}


	public void setBoton_buscar(Button boton_buscar) {
		this.boton_buscar = boton_buscar;
	}


	public Element getContainer_tu_biblioteca() {
		return container_tu_biblioteca;
	}


	public void setContainer_tu_biblioteca(Element container_tu_biblioteca) {
		this.container_tu_biblioteca = container_tu_biblioteca;
	}


	public Button getBoton_tu_biblioteca() {
		return boton_tu_biblioteca;
	}


	public void setBoton_tu_biblioteca(Button boton_tu_biblioteca) {
		this.boton_tu_biblioteca = boton_tu_biblioteca;
	}


	public Element getContainer_crear_lista() {
		return container_crear_lista;
	}


	public void setContainer_crear_lista(Element container_crear_lista) {
		this.container_crear_lista = container_crear_lista;
	}


	public Button getBoton_crear_lista() {
		return boton_crear_lista;
	}


	public void setBoton_crear_lista(Button boton_crear_lista) {
		this.boton_crear_lista = boton_crear_lista;
	}


	public Element getContainer_canciones_fav() {
		return container_canciones_fav;
	}


	public void setContainer_canciones_fav(Element container_canciones_fav) {
		this.container_canciones_fav = container_canciones_fav;
	}


	public Button getBoton_canciones_fav() {
		return boton_canciones_fav;
	}


	public void setBoton_canciones_fav(Button boton_canciones_fav) {
		this.boton_canciones_fav = boton_canciones_fav;
	}


	public Element getContainer_separador() {
		return container_separador;
	}


	public void setContainer_separador(Element container_separador) {
		this.container_separador = container_separador;
	}


	public Label getTexto_separador() {
		return texto_separador;
	}


	public void setTexto_separador(Label texto_separador) {
		this.texto_separador = texto_separador;
	}


	/**
     * Creates a new VistaMenulateral.
     */
    public VistaMenulateral() {
        // You can initialise any data required for the connected UI components here.
    }

}
