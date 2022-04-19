package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-dardebajaunperfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dardebajaunperfil")
@JsModule("./vista-dardebajaunperfil.ts")
public class VistaDardebajaunperfil extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_titulo")
	private Element container_titulo;
	@Id("container_titulo_ajustado")
	private Element container_titulo_ajustado;
	@Id("label_titulo")
	private Label label_titulo;
	@Id("container_contenido")
	private Element container_contenido;
	@Id("container_fondo_contenido")
	private Element container_fondo_contenido;
	@Id("container_contenido_ajustado")
	private Element container_contenido_ajustado;
	@Id("container_buscador_perfil")
	private Element container_buscador_perfil;
	@Id("tf_nombre_usuario")
	private TextField tf_nombre_usuario;
	@Id("tf_email")
	private TextField tf_email;
	@Id("dp_fecha_creacion")
	private DatePicker dp_fecha_creacion;
	@Id("container_foto_perfil")
	private HorizontalLayout container_foto_perfil;
	@Id("label_foto_de_perfil")
	private Label label_foto_de_perfil;
	@Id("img")
	private Image img;
	@Id("container_botones_finales")
	private HorizontalLayout container_botones_finales;
	@Id("boton_cancelar")
	private Button boton_cancelar;
	@Id("boton_dar_de_baja")
	private Button boton_dar_de_baja;

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

	public Element getContainer_titulo_ajustado() {
		return container_titulo_ajustado;
	}

	public void setContainer_titulo_ajustado(Element container_titulo_ajustado) {
		this.container_titulo_ajustado = container_titulo_ajustado;
	}

	public Label getLabel_titulo() {
		return label_titulo;
	}

	public void setLabel_titulo(Label label_titulo) {
		this.label_titulo = label_titulo;
	}

	public Element getContainer_contenido() {
		return container_contenido;
	}

	public void setContainer_contenido(Element container_contenido) {
		this.container_contenido = container_contenido;
	}

	public Element getContainer_fondo_contenido() {
		return container_fondo_contenido;
	}

	public void setContainer_fondo_contenido(Element container_fondo_contenido) {
		this.container_fondo_contenido = container_fondo_contenido;
	}

	public Element getContainer_contenido_ajustado() {
		return container_contenido_ajustado;
	}

	public void setContainer_contenido_ajustado(Element container_contenido_ajustado) {
		this.container_contenido_ajustado = container_contenido_ajustado;
	}

	public Element getContainer_buscador_perfil() {
		return container_buscador_perfil;
	}

	public void setContainer_buscador_perfil(Element container_buscador_perfil) {
		this.container_buscador_perfil = container_buscador_perfil;
	}

	public TextField getTf_nombre_usuario() {
		return tf_nombre_usuario;
	}

	public void setTf_nombre_usuario(TextField tf_nombre_usuario) {
		this.tf_nombre_usuario = tf_nombre_usuario;
	}

	public TextField getTf_email() {
		return tf_email;
	}

	public void setTf_email(TextField tf_email) {
		this.tf_email = tf_email;
	}

	public DatePicker getDp_fecha_creacion() {
		return dp_fecha_creacion;
	}

	public void setDp_fecha_creacion(DatePicker dp_fecha_creacion) {
		this.dp_fecha_creacion = dp_fecha_creacion;
	}

	public HorizontalLayout getContainer_foto_perfil() {
		return container_foto_perfil;
	}

	public void setContainer_foto_perfil(HorizontalLayout container_foto_perfil) {
		this.container_foto_perfil = container_foto_perfil;
	}

	public Label getLabel_foto_de_perfil() {
		return label_foto_de_perfil;
	}

	public void setLabel_foto_de_perfil(Label label_foto_de_perfil) {
		this.label_foto_de_perfil = label_foto_de_perfil;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public HorizontalLayout getContainer_botones_finales() {
		return container_botones_finales;
	}

	public void setContainer_botones_finales(HorizontalLayout container_botones_finales) {
		this.container_botones_finales = container_botones_finales;
	}

	public Button getBoton_cancelar() {
		return boton_cancelar;
	}

	public void setBoton_cancelar(Button boton_cancelar) {
		this.boton_cancelar = boton_cancelar;
	}

	public Button getBoton_dar_de_baja() {
		return boton_dar_de_baja;
	}

	public void setBoton_dar_de_baja(Button boton_dar_de_baja) {
		this.boton_dar_de_baja = boton_dar_de_baja;
	}

	/**
     * Creates a new VistaDardebajaunperfil.
     */
    public VistaDardebajaunperfil() {
        // You can initialise any data required for the connected UI components here.
    }

}
