package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cambiarcontrasena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cambiarcontrasena")
@JsModule("./vista-cambiarcontrasena.ts")
public class VistaCambiarcontrasena extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_titulo")
	private Element container_titulo;
	@Id("titulo_cambio_correo")
	private Label titulo_cambio_correo;
	@Id("container_informacion")
	private Element container_informacion;
	@Id("tf_contrasena_actual")
	private PasswordField tf_contrasena_actual;
	@Id("tf_nueva_contrasena")
	private PasswordField tf_nueva_contrasena;
	@Id("tf_repetir_contrasena")
	private PasswordField tf_repetir_contrasena;
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


	public Element getContainer_informacion() {
		return container_informacion;
	}


	public void setContainer_informacion(Element container_informacion) {
		this.container_informacion = container_informacion;
	}


	public PasswordField getTf_contrasena_actual() {
		return tf_contrasena_actual;
	}


	public void setTf_contrasena_actual(PasswordField tf_contrasena_actual) {
		this.tf_contrasena_actual = tf_contrasena_actual;
	}


	public PasswordField getTf_nueva_contrasena() {
		return tf_nueva_contrasena;
	}


	public void setTf_nueva_contrasena(PasswordField tf_nueva_contrasena) {
		this.tf_nueva_contrasena = tf_nueva_contrasena;
	}


	public PasswordField getTf_repetir_contrasena() {
		return tf_repetir_contrasena;
	}


	public void setTf_repetir_contrasena(PasswordField tf_repetir_contrasena) {
		this.tf_repetir_contrasena = tf_repetir_contrasena;
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
     * Creates a new VistaCambiarcontrasena.
     */
    public VistaCambiarcontrasena() {
        // You can initialise any data required for the connected UI components here.
    }

}
