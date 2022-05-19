package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.checkbox.Checkbox;

/**
 * A Designer generated component for the vista-registrarse template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-registrarse")
@JsModule("./vista-registrarse.ts")
public class VistaRegistrarse extends LitTemplate {

    @Id("boton_cancelar")
	private Button boton_cancelar;
	@Id("container_imagen")
	private Element container_imagen;
	@Id("img")
	private Image img;
	@Id("container_informacion")
	private Element container_informacion;
	@Id("container_nombre")
	private Element container_nombre;
	@Id("tf_nombre")
	private TextField tf_nombre;
	@Id("container_apellidos")
	private Element container_apellidos;
	@Id("tf_apellidos")
	private TextField tf_apellidos;
	@Id("container_nombre_usuario")
	private Element container_nombre_usuario;
	@Id("tf_nombre-usuario")
	private TextField tf_nombreUsuario;
	@Id("container_correo")
	private Element container_correo;
	@Id("tf_correo")
	private TextField tf_correo;
	@Id("container_contrasena")
	private Element container_contrasena;
	@Id("tf_contrasena")
	private PasswordField tf_contrasena;
	@Id("container_repetir_contrasena")
	private Element container_repetir_contrasena;
	@Id("tf_repetir_contrasena")
	private PasswordField tf_repetir_contrasena;
	@Id("container_foto_perfil")
	private Element container_foto_perfil;
	@Id("texto_foto_perfil")
	private Label texto_foto_perfil;
	@Id("boton_subir_foto")
	private Button boton_subir_foto;
	@Id("container_terminos")
	private Element container_terminos;
	@Id("texto_condiciones")
	private Label texto_condiciones;
	@Id("checkbox_condicion1")
	private Checkbox checkbox_condicion1;
	@Id("checkbox_condicion2")
	private Checkbox checkbox_condicion2;
	@Id("boton_registrarse")
	private Button boton_registrarse;
	@Id("texto_otros_registros")
	private Label texto_otros_registros;
	@Id("container_registro_de_terceros")
	private Element container_registro_de_terceros;
	@Id("boton_google")
	private Button boton_google;
	@Id("boton_facebook")
	private Button boton_facebook;
	@Id("boton_apple")
	private Button boton_apple;
	@Id("container_principal")
	private Element container_principal;
	@Id("container_centrado")
	private Element container_centrado;
	
	
	
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


	public Button getBoton_cancelar() {
		return boton_cancelar;
	}


	public void setBoton_cancelar(Button boton_cancelar) {
		this.boton_cancelar = boton_cancelar;
	}


	public Element getContainer_imagen() {
		return container_imagen;
	}


	public void setContainer_imagen(Element container_imagen) {
		this.container_imagen = container_imagen;
	}


	public Image getImg() {
		return img;
	}


	public void setImg(Image img) {
		this.img = img;
	}


	public Element getContainer_informacion() {
		return container_informacion;
	}


	public void setContainer_informacion(Element container_informacion) {
		this.container_informacion = container_informacion;
	}


	public Element getContainer_nombre() {
		return container_nombre;
	}


	public void setContainer_nombre(Element container_nombre) {
		this.container_nombre = container_nombre;
	}


	public TextField getTf_nombre() {
		return tf_nombre;
	}


	public void setTf_nombre(TextField tf_nombre) {
		this.tf_nombre = tf_nombre;
	}


	public Element getContainer_apellidos() {
		return container_apellidos;
	}


	public void setContainer_apellidos(Element container_apellidos) {
		this.container_apellidos = container_apellidos;
	}


	public TextField getTf_apellidos() {
		return tf_apellidos;
	}


	public void setTf_apellidos(TextField tf_apellidos) {
		this.tf_apellidos = tf_apellidos;
	}


	public Element getContainer_nombre_usuario() {
		return container_nombre_usuario;
	}


	public void setContainer_nombre_usuario(Element container_nombre_usuario) {
		this.container_nombre_usuario = container_nombre_usuario;
	}


	public TextField getTf_nombreUsuario() {
		return tf_nombreUsuario;
	}


	public void setTf_nombreUsuario(TextField tf_nombreUsuario) {
		this.tf_nombreUsuario = tf_nombreUsuario;
	}


	public Element getContainer_correo() {
		return container_correo;
	}


	public void setContainer_correo(Element container_correo) {
		this.container_correo = container_correo;
	}


	public TextField getTf_correo() {
		return tf_correo;
	}


	public void setTf_correo(TextField tf_correo) {
		this.tf_correo = tf_correo;
	}


	public Element getContainer_contrasena() {
		return container_contrasena;
	}


	public void setContainer_contrasena(Element container_contrasena) {
		this.container_contrasena = container_contrasena;
	}


	public PasswordField getTf_contrasena() {
		return tf_contrasena;
	}


	public void setTf_contrasena(PasswordField tf_contrasena) {
		this.tf_contrasena = tf_contrasena;
	}


	public Element getContainer_repetir_contrasena() {
		return container_repetir_contrasena;
	}


	public void setContainer_repetir_contrasena(Element container_repetir_contrasena) {
		this.container_repetir_contrasena = container_repetir_contrasena;
	}


	public PasswordField getTf_repetir_contrasena() {
		return tf_repetir_contrasena;
	}


	public void setTf_repetir_contrasena(PasswordField tf_repetir_contrasena) {
		this.tf_repetir_contrasena = tf_repetir_contrasena;
	}


	public Element getContainer_foto_perfil() {
		return container_foto_perfil;
	}


	public void setContainer_foto_perfil(Element container_foto_perfil) {
		this.container_foto_perfil = container_foto_perfil;
	}


	public Label getTexto_foto_perfil() {
		return texto_foto_perfil;
	}


	public void setTexto_foto_perfil(Label texto_foto_perfil) {
		this.texto_foto_perfil = texto_foto_perfil;
	}


	public Button getBoton_subir_foto() {
		return boton_subir_foto;
	}


	public void setBoton_subir_foto(Button boton_subir_foto) {
		this.boton_subir_foto = boton_subir_foto;
	}


	public Element getContainer_terminos() {
		return container_terminos;
	}


	public void setContainer_terminos(Element container_terminos) {
		this.container_terminos = container_terminos;
	}


	public Label getTexto_condiciones() {
		return texto_condiciones;
	}


	public void setTexto_condiciones(Label texto_condiciones) {
		this.texto_condiciones = texto_condiciones;
	}


	public Checkbox getCheckbox_condicion1() {
		return checkbox_condicion1;
	}


	public void setCheckbox_condicion1(Checkbox checkbox_condicion1) {
		this.checkbox_condicion1 = checkbox_condicion1;
	}


	public Checkbox getCheckbox_condicion2() {
		return checkbox_condicion2;
	}


	public void setCheckbox_condicion2(Checkbox checkbox_condicion2) {
		this.checkbox_condicion2 = checkbox_condicion2;
	}


	public Button getBoton_registrarse() {
		return boton_registrarse;
	}


	public void setBoton_registrarse(Button boton_registrarse) {
		this.boton_registrarse = boton_registrarse;
	}


	public Label getTexto_otros_registros() {
		return texto_otros_registros;
	}


	public void setTexto_otros_registros(Label texto_otros_registros) {
		this.texto_otros_registros = texto_otros_registros;
	}


	public Element getContainer_registro_de_terceros() {
		return container_registro_de_terceros;
	}


	public void setContainer_registro_de_terceros(Element container_registro_de_terceros) {
		this.container_registro_de_terceros = container_registro_de_terceros;
	}


	public Button getBoton_google() {
		return boton_google;
	}


	public void setBoton_google(Button boton_google) {
		this.boton_google = boton_google;
	}


	public Button getBoton_facebook() {
		return boton_facebook;
	}


	public void setBoton_facebook(Button boton_facebook) {
		this.boton_facebook = boton_facebook;
	}


	public Button getBoton_apple() {
		return boton_apple;
	}


	public void setBoton_apple(Button boton_apple) {
		this.boton_apple = boton_apple;
	}


	/**
     * Creates a new VistaRegistrarse.
     */
    public VistaRegistrarse() {
        // You can initialise any data required for the connected UI components here.
    }

}
