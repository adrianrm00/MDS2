package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-modificarestilosdemusica template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificarestilosdemusica")
@JsModule("./vista-modificarestilosdemusica.ts")
public class VistaModificarestilosdemusica extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_titulo")
	private Element container_titulo;
	@Id("container_modificar_estilos")
	private Element container_modificar_estilos;
	@Id("titulo")
	private Label titulo;
	@Id("container_opciones1")
	private Element container_opciones1;
	@Id("container_opciones2")
	private Element container_opciones2;
	@Id("container_opciones3")
	private Element container_opciones3;
	@Id("texto_estilos_actuales")
	private Label texto_estilos_actuales;
	@Id("container_estilo1")
	private HorizontalLayout container_estilo1;
	@Id("tf_estilo")
	private TextField tf_estilo;
	@Id("boton_eliminar")
	private Button boton_eliminar;
	@Id("boton_añadir_estilo")
	private Button boton_añadir_estilo;
	@Id("container_botones")
	private HorizontalLayout container_botones;
	@Id("boton_cancelar")
	private Button boton_cancelar;
	@Id("boton_guardar")
	private Button boton_guardar;

	
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


	public Element getContainer_modificar_estilos() {
		return container_modificar_estilos;
	}


	public void setContainer_modificar_estilos(Element container_modificar_estilos) {
		this.container_modificar_estilos = container_modificar_estilos;
	}


	public Label getTitulo() {
		return titulo;
	}


	public void setTitulo(Label titulo) {
		this.titulo = titulo;
	}


	public Element getContainer_opciones1() {
		return container_opciones1;
	}


	public void setContainer_opciones1(Element container_opciones1) {
		this.container_opciones1 = container_opciones1;
	}


	public Element getContainer_opciones2() {
		return container_opciones2;
	}


	public void setContainer_opciones2(Element container_opciones2) {
		this.container_opciones2 = container_opciones2;
	}


	public Element getContainer_opciones3() {
		return container_opciones3;
	}


	public void setContainer_opciones3(Element container_opciones3) {
		this.container_opciones3 = container_opciones3;
	}


	public Label getTexto_estilos_actuales() {
		return texto_estilos_actuales;
	}


	public void setTexto_estilos_actuales(Label texto_estilos_actuales) {
		this.texto_estilos_actuales = texto_estilos_actuales;
	}


	public HorizontalLayout getContainer_estilo1() {
		return container_estilo1;
	}


	public void setContainer_estilo1(HorizontalLayout container_estilo1) {
		this.container_estilo1 = container_estilo1;
	}


	public TextField getTf_estilo() {
		return tf_estilo;
	}


	public void setTf_estilo(TextField tf_estilo) {
		this.tf_estilo = tf_estilo;
	}


	public Button getBoton_eliminar() {
		return boton_eliminar;
	}


	public void setBoton_eliminar(Button boton_eliminar) {
		this.boton_eliminar = boton_eliminar;
	}


	public Button getBoton_añadir_estilo() {
		return boton_añadir_estilo;
	}


	public void setBoton_añadir_estilo(Button boton_añadir_estilo) {
		this.boton_añadir_estilo = boton_añadir_estilo;
	}


	public HorizontalLayout getContainer_botones() {
		return container_botones;
	}


	public void setContainer_botones(HorizontalLayout container_botones) {
		this.container_botones = container_botones;
	}


	public Button getBoton_cancelar() {
		return boton_cancelar;
	}


	public void setBoton_cancelar(Button boton_cancelar) {
		this.boton_cancelar = boton_cancelar;
	}


	public Button getBoton_guardar() {
		return boton_guardar;
	}


	public void setBoton_guardar(Button boton_guardar) {
		this.boton_guardar = boton_guardar;
	}


	/**
     * Creates a new VistaModificarestilosdemusica.
     */
    public VistaModificarestilosdemusica() {
        // You can initialise any data required for the connected UI components here.
    }

}
