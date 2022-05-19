package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;

/**
 * A Designer generated component for the vista-iniciarsesion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-iniciarsesion")
@JsModule("./vista-iniciarsesion.ts")
public class VistaIniciarsesion extends LitTemplate {

	
	


	@Id("container_centrado")
	private Element container_centrado;
	@Id("container_principal")
	private Element container_principal;
	@Id("boton_volver_inicio")
	private Button boton_volver_inicio;
	@Id("container_imagen")
	private Element container_imagen;
	@Id("texto_iniciar_sesion")
	private Label texto_iniciar_sesion;
	@Id("container_de_terceros")
	private Element container_de_terceros;
	@Id("texto_separador1")
	private Label texto_separador1;
	@Id("container_iniciar_sesion")
	private Element container_iniciar_sesion;
	@Id("tf_correo_o_usuario")
	private TextField tf_correo_o_usuario;
	@Id("tf_contrasena")
	private PasswordField tf_contrasena;
	@Id("container_botones")
	private Element container_botones;
	@Id("boton_recordar_contrasena")
	private Button boton_recordar_contrasena;
	@Id("boton_iniciar_sesion")
	private Button boton_iniciar_sesion;
	@Id("texto_separador2")
	private Label texto_separador2;
	@Id("texto_no_tienes_cuenta")
	private Label texto_no_tienes_cuenta;
	@Id("boton_registrarse")
	private Button boton_registrarse;

	
	
	public Element getContainer_centrado() {
		return container_centrado;
	}



	public void setContainer_centrado(Element container_centrado) {
		this.container_centrado = container_centrado;
	}



	public Element getContainer_principal() {
		return container_principal;
	}



	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}



	public Button getBoton_volver_inicio() {
		return boton_volver_inicio;
	}



	public void setBoton_volver_inicio(Button boton_volver_inicio) {
		this.boton_volver_inicio = boton_volver_inicio;
	}



	public Element getContainer_imagen() {
		return container_imagen;
	}



	public void setContainer_imagen(Element container_imagen) {
		this.container_imagen = container_imagen;
	}



	public Label getTexto_iniciar_sesion() {
		return texto_iniciar_sesion;
	}



	public void setTexto_iniciar_sesion(Label texto_iniciar_sesion) {
		this.texto_iniciar_sesion = texto_iniciar_sesion;
	}



	public Element getContainer_de_terceros() {
		return container_de_terceros;
	}



	public void setContainer_de_terceros(Element container_de_terceros) {
		this.container_de_terceros = container_de_terceros;
	}



	public Label getTexto_separador1() {
		return texto_separador1;
	}



	public void setTexto_separador1(Label texto_separador1) {
		this.texto_separador1 = texto_separador1;
	}



	public Element getContainer_iniciar_sesion() {
		return container_iniciar_sesion;
	}



	public void setContainer_iniciar_sesion(Element container_iniciar_sesion) {
		this.container_iniciar_sesion = container_iniciar_sesion;
	}



	public TextField getTf_correo_o_usuario() {
		return tf_correo_o_usuario;
	}



	public void setTf_correo_o_usuario(TextField tf_correo_o_usuario) {
		this.tf_correo_o_usuario = tf_correo_o_usuario;
	}



	public PasswordField getTf_contrasena() {
		return tf_contrasena;
	}



	public void setTf_contrasena(PasswordField tf_contrasena) {
		this.tf_contrasena = tf_contrasena;
	}



	public Element getContainer_botones() {
		return container_botones;
	}



	public void setContainer_botones(Element container_botones) {
		this.container_botones = container_botones;
	}



	public Button getBoton_recordar_contrasena() {
		return boton_recordar_contrasena;
	}



	public void setBoton_recordar_contrasena(Button boton_recordar_contrasena) {
		this.boton_recordar_contrasena = boton_recordar_contrasena;
	}



	public Button getBoton_iniciar_sesion() {
		return boton_iniciar_sesion;
	}



	public void setBoton_iniciar_sesion(Button boton_iniciar_sesion) {
		this.boton_iniciar_sesion = boton_iniciar_sesion;
	}



	public Label getTexto_separador2() {
		return texto_separador2;
	}



	public void setTexto_separador2(Label texto_separador2) {
		this.texto_separador2 = texto_separador2;
	}



	public Label getTexto_no_tienes_cuenta() {
		return texto_no_tienes_cuenta;
	}



	public void setTexto_no_tienes_cuenta(Label texto_no_tienes_cuenta) {
		this.texto_no_tienes_cuenta = texto_no_tienes_cuenta;
	}



	public Button getBoton_registrarse() {
		return boton_registrarse;
	}



	public void setBoton_registrarse(Button boton_registrarse) {
		this.boton_registrarse = boton_registrarse;
	}



	/**
     * Creates a new VistaIniciarsesion.
     */
    public VistaIniciarsesion() {
        // You can initialise any data required for the connected UI components here.
    }

}
