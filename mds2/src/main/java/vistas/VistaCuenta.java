package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.Scroller;

/**
 * A Designer generated component for the vista-cuenta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cuenta")
@JsModule("./vista-cuenta.ts")
public class VistaCuenta extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_cabecera")
	private Element container_cabecera;
	@Id("container_titulo")
	private Element container_titulo;
	@Id("titulo_cuenta")
	private Label titulo_cuenta;
	@Id("container_cambiar_imagen")
	private Element container_cambiar_imagen;
	@Id("container_img")
	private Element container_img;
	@Id("boton_cambiar_imagen")
	private Button boton_cambiar_imagen;
	@Id("container_informacion")
	private Element container_informacion;
	@Id("tf_nombre")
	private TextField tf_nombre;
	@Id("tf_apellidos")
	private TextField tf_apellidos;
	@Id("tf_nombre_ususrio")
	private TextField tf_nombre_ususrio;
	@Id("container_botones")
	private Element container_botones;
	@Id("container_botones_cambiar_datos")
	private Element container_botones_cambiar_datos;
	@Id("boton_cambiar_correo")
	private Button boton_cambiar_correo;
	@Id("boton_cambiar_contrasena")
	private Button boton_cambiar_contrasena;
	@Id("container_boton_baja")
	private Element container_boton_baja;
	@Id("boton_darse_de_baja")
	private Button boton_darse_de_baja;
	@Id("container_scroll")
	private Scroller container_scroll;

	
	
	
	
	public Scroller getContainer_scroll() {
		return container_scroll;
	}


	public void setContainer_scroll(Scroller container_scroll) {
		this.container_scroll = container_scroll;
	}


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


	public Element getContainer_titulo() {
		return container_titulo;
	}


	public void setContainer_titulo(Element container_titulo) {
		this.container_titulo = container_titulo;
	}


	public Label getTitulo_cuenta() {
		return titulo_cuenta;
	}


	public void setTitulo_cuenta(Label titulo_cuenta) {
		this.titulo_cuenta = titulo_cuenta;
	}


	public Element getContainer_cambiar_imagen() {
		return container_cambiar_imagen;
	}


	public void setContainer_cambiar_imagen(Element container_cambiar_imagen) {
		this.container_cambiar_imagen = container_cambiar_imagen;
	}


	public Element getContainer_img() {
		return container_img;
	}


	public void setContainer_img(Element container_img) {
		this.container_img = container_img;
	}


	public Button getBoton_cambiar_imagen() {
		return boton_cambiar_imagen;
	}


	public void setBoton_cambiar_imagen(Button boton_cambiar_imagen) {
		this.boton_cambiar_imagen = boton_cambiar_imagen;
	}


	public Element getContainer_informacion() {
		return container_informacion;
	}


	public void setContainer_informacion(Element container_informacion) {
		this.container_informacion = container_informacion;
	}


	public TextField getTf_nombre() {
		return tf_nombre;
	}


	public void setTf_nombre(TextField tf_nombre) {
		this.tf_nombre = tf_nombre;
	}


	public TextField getTf_apellidos() {
		return tf_apellidos;
	}


	public void setTf_apellidos(TextField tf_apellidos) {
		this.tf_apellidos = tf_apellidos;
	}


	public TextField getTf_nombre_ususrio() {
		return tf_nombre_ususrio;
	}


	public void setTf_nombre_ususrio(TextField tf_nombre_ususrio) {
		this.tf_nombre_ususrio = tf_nombre_ususrio;
	}


	public Element getContainer_botones() {
		return container_botones;
	}


	public void setContainer_botones(Element container_botones) {
		this.container_botones = container_botones;
	}


	public Element getContainer_botones_cambiar_datos() {
		return container_botones_cambiar_datos;
	}


	public void setContainer_botones_cambiar_datos(Element container_botones_cambiar_datos) {
		this.container_botones_cambiar_datos = container_botones_cambiar_datos;
	}


	public Button getBoton_cambiar_correo() {
		return boton_cambiar_correo;
	}


	public void setBoton_cambiar_correo(Button boton_cambiar_correo) {
		this.boton_cambiar_correo = boton_cambiar_correo;
	}


	public Button getBoton_cambiar_contrasena() {
		return boton_cambiar_contrasena;
	}


	public void setBoton_cambiar_contraseña(Button boton_cambiar_contrasena) {
		this.boton_cambiar_contrasena = boton_cambiar_contrasena;
	}


	public Element getContainer_boton_baja() {
		return container_boton_baja;
	}


	public void setContainer_boton_baja(Element container_boton_baja) {
		this.container_boton_baja = container_boton_baja;
	}


	public Button getBoton_darse_de_baja() {
		return boton_darse_de_baja;
	}


	public void setBoton_darse_de_baja(Button boton_darse_de_baja) {
		this.boton_darse_de_baja = boton_darse_de_baja;
	}


	/**
     * Creates a new VistaCuenta.
     */
    public VistaCuenta() {
        // You can initialise any data required for the connected UI components here.
    }

}
