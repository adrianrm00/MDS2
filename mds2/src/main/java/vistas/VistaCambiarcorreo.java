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
 * A Designer generated component for the vista-cambiarcorreo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cambiarcorreo")
@JsModule("./vista-cambiarcorreo.ts")
public class VistaCambiarcorreo extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_titulo")
	private Element container_titulo;
	@Id("titulo_cambio_correo")
	private Label titulo_cambio_correo;
	@Id("container_tf")
	private Element container_tf;
	@Id("tf_nuevo_correo")
	private TextField tf_nuevo_correo;
	@Id("tf_repita_correo")
	private TextField tf_repita_correo;
	@Id("container_botones")
	private Element container_botones;
	@Id("boton_guardar")
	private Button boton_guardar;
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


	public Label getTitulo_cambio_correo() {
		return titulo_cambio_correo;
	}


	public void setTitulo_cambio_correo(Label titulo_cambio_correo) {
		this.titulo_cambio_correo = titulo_cambio_correo;
	}


	public Element getContainer_tf() {
		return container_tf;
	}


	public void setContainer_tf(Element container_tf) {
		this.container_tf = container_tf;
	}


	public TextField getTf_nuevo_correo() {
		return tf_nuevo_correo;
	}


	public void setTf_nuevo_correo(TextField tf_nuevo_correo) {
		this.tf_nuevo_correo = tf_nuevo_correo;
	}


	public TextField getTf_repita_correo() {
		return tf_repita_correo;
	}


	public void setTf_repita_correo(TextField tf_repita_correo) {
		this.tf_repita_correo = tf_repita_correo;
	}


	public Element getContainer_botones() {
		return container_botones;
	}


	public void setContainer_botones(Element container_botones) {
		this.container_botones = container_botones;
	}


	public Button getBoton_guardar() {
		return boton_guardar;
	}


	public void setBoton_guardar(Button boton_guardar) {
		this.boton_guardar = boton_guardar;
	}


	public Button getBoton_cancelar() {
		return boton_cancelar;
	}


	public void setBoton_cancelar(Button boton_cancelar) {
		this.boton_cancelar = boton_cancelar;
	}


	/**
     * Creates a new VistaCambiarcorreo.
     */
    public VistaCambiarcorreo() {
        // You can initialise any data required for the connected UI components here.
    }

}
