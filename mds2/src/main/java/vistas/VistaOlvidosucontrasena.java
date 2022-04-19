package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-olvidosucontrasena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-olvidosucontrasena")
@JsModule("./vista-olvidosucontrasena.ts")
public class VistaOlvidosucontrasena extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_titulo")
	private Element container_titulo;
	@Id("titulo")
	private Label titulo;
	@Id("container_text_field")
	private Element container_text_field;
	@Id("tf_introduzca_su_correo")
	private TextField tf_introduzca_su_correo;
	@Id("container_botones")
	private Element container_botones;
	@Id("boton_enviar")
	private Button boton_enviar;
	@Id("boton_cancelar")
	private Button boton_cancelar;

	
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


	public Element getContainer_text_field() {
		return container_text_field;
	}


	public void setContainer_text_field(Element container_text_field) {
		this.container_text_field = container_text_field;
	}


	public TextField getTf_introduzca_su_correo() {
		return tf_introduzca_su_correo;
	}


	public void setTf_introduzca_su_correo(TextField tf_introduzca_su_correo) {
		this.tf_introduzca_su_correo = tf_introduzca_su_correo;
	}


	public Element getContainer_botones() {
		return container_botones;
	}


	public void setContainer_botones(Element container_botones) {
		this.container_botones = container_botones;
	}


	public Button getBoton_enviar() {
		return boton_enviar;
	}


	public void setBoton_enviar(Button boton_enviar) {
		this.boton_enviar = boton_enviar;
	}


	public Button getBoton_cancelar() {
		return boton_cancelar;
	}


	public void setBoton_cancelar(Button boton_cancelar) {
		this.boton_cancelar = boton_cancelar;
	}


	/**
     * Creates a new VistaOlvidosucontrasena.
     */
    public VistaOlvidosucontrasena() {
        // You can initialise any data required for the connected UI components here.
    }

}
