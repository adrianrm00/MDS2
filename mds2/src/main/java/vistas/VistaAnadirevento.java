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
 * A Designer generated component for the vista-anadirevento template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-anadirevento")
@JsModule("./vista-anadirevento.ts")
public class VistaAnadirevento extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_titulo")
	private Element container_titulo;
	@Id("label_anadir_evento")
	private Label label_anadir_evento;
	@Id("container_contenido")
	private Element container_contenido;
	@Id("container_contenido_ajustado")
	private Element container_contenido_ajustado;
	@Id("tf_nombre_concierto")
	private TextField tf_nombre_concierto;
	@Id("tf_ciudad")
	private TextField tf_ciudad;
	@Id("tf_fecha")
	private TextField tf_fecha;
	@Id("container_botones_finales")
	private Element container_botones_finales;
	@Id("container_cancelar")
	private Element container_cancelar;
	@Id("boton_cancelar")
	private Button boton_cancelar;
	@Id("container_anadir")
	private Element container_anadir;
	@Id("boton_anadir")
	private Button boton_anadir;

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

	public Label getLabel_anadir_evento() {
		return label_anadir_evento;
	}

	public void setLabel_anadir_evento(Label label_anadir_evento) {
		this.label_anadir_evento = label_anadir_evento;
	}

	public Element getContainer_contenido() {
		return container_contenido;
	}

	public void setContainer_contenido(Element container_contenido) {
		this.container_contenido = container_contenido;
	}

	public Element getContainer_contenido_ajustado() {
		return container_contenido_ajustado;
	}

	public void setContainer_contenido_ajustado(Element container_contenido_ajustado) {
		this.container_contenido_ajustado = container_contenido_ajustado;
	}

	public TextField getTf_nombre_concierto() {
		return tf_nombre_concierto;
	}

	public void setTf_nombre_concierto(TextField tf_nombre_concierto) {
		this.tf_nombre_concierto = tf_nombre_concierto;
	}

	public TextField getTf_ciudad() {
		return tf_ciudad;
	}

	public void setTf_ciudad(TextField tf_ciudad) {
		this.tf_ciudad = tf_ciudad;
	}

	public TextField getTf_fecha() {
		return tf_fecha;
	}

	public void setTf_fecha(TextField tf_fecha) {
		this.tf_fecha = tf_fecha;
	}

	public Element getContainer_botones_finales() {
		return container_botones_finales;
	}

	public void setContainer_botones_finales(Element container_botones_finales) {
		this.container_botones_finales = container_botones_finales;
	}

	public Element getContainer_cancelar() {
		return container_cancelar;
	}

	public void setContainer_cancelar(Element container_cancelar) {
		this.container_cancelar = container_cancelar;
	}

	public Button getBoton_cancelar() {
		return boton_cancelar;
	}

	public void setBoton_cancelar(Button boton_cancelar) {
		this.boton_cancelar = boton_cancelar;
	}

	public Element getContainer_anadir() {
		return container_anadir;
	}

	public void setContainer_anadir(Element container_anadir) {
		this.container_anadir = container_anadir;
	}

	public Button getBoton_anadir() {
		return boton_anadir;
	}

	public void setBoton_anadir(Button boton_anadir) {
		this.boton_anadir = boton_anadir;
	}

	/**
     * Creates a new VistaAnadirevento.
     */
    public VistaAnadirevento() {
        // You can initialise any data required for the connected UI components here.
    }

}
