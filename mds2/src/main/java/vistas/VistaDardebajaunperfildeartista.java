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
 * A Designer generated component for the vista-dardebajaunperfildeartista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dardebajaunperfildeartista")
@JsModule("./vista-dardebajaunperfildeartista.ts")
public class VistaDardebajaunperfildeartista extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_titulo")
	private Element container_titulo;
	@Id("container_dar_de_baja_artista")
	private Element container_dar_de_baja_artista;
	@Id("texto_dar_de_baja-artista")
	private Label texto_dar_de_bajaArtista;
	@Id("container_opciones1")
	private Element container_opciones1;
	@Id("container_opciones2")
	private Element container_opciones2;
	@Id("container_opciones3")
	private Element container_opciones3;
	@Id("container_buscador")
	private Element container_buscador;
	@Id("tf_nombre_artista")
	private TextField tf_nombre_artista;
	@Id("tf_nombre")
	private TextField tf_nombre;
	@Id("tf_correo")
	private TextField tf_correo;
	@Id("tf_fecha_nacimiento")
	private DatePicker tf_fecha_nacimiento;
	@Id("tf_fecha_creacion")
	private DatePicker tf_fecha_creacion;
	@Id("container_foto_perfil")
	private HorizontalLayout container_foto_perfil;
	@Id("texto_foto_de_perfil")
	private Label texto_foto_de_perfil;
	@Id("img")
	private Image img;
	@Id("container_botones")
	private HorizontalLayout container_botones;
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


	public Element getContainer_dar_de_baja_artista() {
		return container_dar_de_baja_artista;
	}


	public void setContainer_dar_de_baja_artista(Element container_dar_de_baja_artista) {
		this.container_dar_de_baja_artista = container_dar_de_baja_artista;
	}


	public Label getTexto_dar_de_bajaArtista() {
		return texto_dar_de_bajaArtista;
	}


	public void setTexto_dar_de_bajaArtista(Label texto_dar_de_bajaArtista) {
		this.texto_dar_de_bajaArtista = texto_dar_de_bajaArtista;
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


	public Element getContainer_buscador() {
		return container_buscador;
	}


	public void setContainer_buscador(Element container_buscador) {
		this.container_buscador = container_buscador;
	}


	public TextField getTf_nombre_artista() {
		return tf_nombre_artista;
	}


	public void setTf_nombre_artista(TextField tf_nombre_artista) {
		this.tf_nombre_artista = tf_nombre_artista;
	}


	public TextField getTf_nombre() {
		return tf_nombre;
	}


	public void setTf_nombre(TextField tf_nombre) {
		this.tf_nombre = tf_nombre;
	}


	public TextField getTf_correo() {
		return tf_correo;
	}


	public void setTf_correo(TextField tf_correo) {
		this.tf_correo = tf_correo;
	}


	public DatePicker getTf_fecha_nacimiento() {
		return tf_fecha_nacimiento;
	}


	public void setTf_fecha_nacimiento(DatePicker tf_fecha_nacimiento) {
		this.tf_fecha_nacimiento = tf_fecha_nacimiento;
	}


	public DatePicker getTf_fecha_creacion() {
		return tf_fecha_creacion;
	}


	public void setTf_fecha_creacion(DatePicker tf_fecha_creacion) {
		this.tf_fecha_creacion = tf_fecha_creacion;
	}


	public HorizontalLayout getContainer_foto_perfil() {
		return container_foto_perfil;
	}


	public void setContainer_foto_perfil(HorizontalLayout container_foto_perfil) {
		this.container_foto_perfil = container_foto_perfil;
	}


	public Label getTexto_foto_de_perfil() {
		return texto_foto_de_perfil;
	}


	public void setTexto_foto_de_perfil(Label texto_foto_de_perfil) {
		this.texto_foto_de_perfil = texto_foto_de_perfil;
	}


	public Image getImg() {
		return img;
	}


	public void setImg(Image img) {
		this.img = img;
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


	public Button getBoton_dar_de_baja() {
		return boton_dar_de_baja;
	}


	public void setBoton_dar_de_baja(Button boton_dar_de_baja) {
		this.boton_dar_de_baja = boton_dar_de_baja;
	}


	/**
     * Creates a new VistaDardebajaunperfildeartista.
     */
    public VistaDardebajaunperfildeartista() {
        // You can initialise any data required for the connected UI components here.
    }

}
