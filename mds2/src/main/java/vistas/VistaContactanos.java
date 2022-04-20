package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-contactanos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-contactanos")
@JsModule("./vista-contactanos.ts")
public class VistaContactanos extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_informacion")
	private Element container_informacion;
	@Id("container_titulo")
	private Element container_titulo;
	@Id("titulo")
	private Label titulo;
	@Id("container_datos_contacto")
	private Element container_datos_contacto;
	@Id("texto_correo")
	private Label texto_correo;
	@Id("texto_telefono")
	private Label texto_telefono;
	@Id("Container_motivos")
	private Element container_motivos;
	@Id("titulo_motivos")
	private Label titulo_motivos;
	@Id("tfa_motivos")
	private TextArea tfa_motivos;
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


	public Element getContainer_informacion() {
		return container_informacion;
	}


	public void setContainer_informacion(Element container_informacion) {
		this.container_informacion = container_informacion;
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


	public Element getContainer_datos_contacto() {
		return container_datos_contacto;
	}


	public void setContainer_datos_contacto(Element container_datos_contacto) {
		this.container_datos_contacto = container_datos_contacto;
	}


	public Label getTexto_correo() {
		return texto_correo;
	}


	public void setTexto_correo(Label texto_correo) {
		this.texto_correo = texto_correo;
	}


	public Label getTexto_telefono() {
		return texto_telefono;
	}


	public void setTexto_telefono(Label texto_telefono) {
		this.texto_telefono = texto_telefono;
	}


	public Element getContainer_motivos() {
		return container_motivos;
	}


	public void setContainer_motivos(Element container_motivos) {
		this.container_motivos = container_motivos;
	}


	public Label getTitulo_motivos() {
		return titulo_motivos;
	}


	public void setTitulo_motivos(Label titulo_motivos) {
		this.titulo_motivos = titulo_motivos;
	}


	public TextArea getTfa_motivos() {
		return tfa_motivos;
	}


	public void setTfa_motivos(TextArea tfa_motivos) {
		this.tfa_motivos = tfa_motivos;
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
     * Creates a new VistaContactanos.
     */
    public VistaContactanos() {
        // You can initialise any data required for the connected UI components here.
    }

}
