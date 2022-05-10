package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-anadiralbum template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-anadiralbum")
@JsModule("./vista-anadiralbum.ts")
public class VistaAnadiralbum extends LitTemplate {



	@Id("container_principal")
	private Element container_principal;
	@Id("container_titulo")
	private Element container_titulo;
	@Id("container_label_anadir_album")
	private Element container_label_anadir_album;
	@Id("label_anadir_album")
	private Label label_anadir_album;
	@Id("container_contenido")
	private Element container_contenido;
	@Id("container_contenido_con_fondo")
	private Element container_contenido_con_fondo;
	@Id("container_contenido_ajustado")
	private Element container_contenido_ajustado;
	@Id("tf_nombre_album")
	private TextField tf_nombre_album;
	@Id("dp_fecha_lanzamiento")
	private DatePicker dp_fecha_lanzamiento;
	@Id("container_artista_asociado")
	private Element container_artista_asociado;
	@Id("label_artista")
	private Label label_artista;
	@Id("container_linea_artistas")
	private Element container_linea_artistas;
	@Id("tf_artista")
	private TextField tf_artista;
	@Id("boton_eliminar_artista")
	private Button boton_eliminar_artista;
	@Id("boton_anadir_artista")
	private Button boton_anadir_artista;
	@Id("container_cancion")
	private Element container_cancion;
	@Id("label_cancion")
	private Label label_cancion;
	@Id("container_linea_canciones")
	private Element container_linea_canciones;
	@Id("tf_cancion")
	private TextField tf_cancion;
	@Id("boton_eliminar_cancion")
	private Button boton_eliminar_cancion;
	@Id("boton_anadir_cancion")
	private Button boton_anadir_cancion;
	@Id("container_anadir_cancion")
	private Element container_anadir_cancion;
	@Id("container_foto_album")
	private Element container_foto_album;
	@Id("label_foto_album")
	private Label label_foto_album;
	@Id("container_foto")
	private Element container_foto;
	@Id("foto")
	private Image foto;
	@Id("boton_buscar_foto")
	private Button boton_buscar_foto;
	@Id("container_botones_finales")
	private HorizontalLayout container_botones_finales;
	@Id("boton_cancelar")
	private Button boton_cancelar;
	@Id("boton_dar_de_alta")
	private Button boton_dar_de_alta;
	
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



	public Element getContainer_label_anadir_album() {
		return container_label_anadir_album;
	}



	public void setContainer_label_anadir_album(Element container_label_anadir_album) {
		this.container_label_anadir_album = container_label_anadir_album;
	}



	public Label getLabel_anadir_album() {
		return label_anadir_album;
	}



	public void setLabel_anadir_album(Label label_anadir_album) {
		this.label_anadir_album = label_anadir_album;
	}



	public Element getContainer_contenido() {
		return container_contenido;
	}



	public void setContainer_contenido(Element container_contenido) {
		this.container_contenido = container_contenido;
	}



	public Element getContainer_contenido_con_fondo() {
		return container_contenido_con_fondo;
	}



	public void setContainer_contenido_con_fondo(Element container_contenido_con_fondo) {
		this.container_contenido_con_fondo = container_contenido_con_fondo;
	}



	public Element getContainer_contenido_ajustado() {
		return container_contenido_ajustado;
	}



	public void setContainer_contenido_ajustado(Element container_contenido_ajustado) {
		this.container_contenido_ajustado = container_contenido_ajustado;
	}



	public TextField getTf_nombre_album() {
		return tf_nombre_album;
	}



	public void setTf_nombre_album(TextField tf_nombre_album) {
		this.tf_nombre_album = tf_nombre_album;
	}



	public DatePicker getDp_fecha_lanzamiento() {
		return dp_fecha_lanzamiento;
	}



	public void setDp_fecha_lanzamiento(DatePicker dp_fecha_lanzamiento) {
		this.dp_fecha_lanzamiento = dp_fecha_lanzamiento;
	}



	public Element getContainer_artista_asociado() {
		return container_artista_asociado;
	}



	public void setContainer_artista_asociado(Element container_artista_asociado) {
		this.container_artista_asociado = container_artista_asociado;
	}



	public Label getLabel_artista() {
		return label_artista;
	}



	public void setLabel_artista(Label label_artista) {
		this.label_artista = label_artista;
	}



	public Element getContainer_linea_artistas() {
		return container_linea_artistas;
	}



	public void setContainer_linea_artistas(Element container_linea_artistas) {
		this.container_linea_artistas = container_linea_artistas;
	}



	public TextField getTf_artista() {
		return tf_artista;
	}



	public void setTf_artista(TextField tf_artista) {
		this.tf_artista = tf_artista;
	}



	public Button getBoton_eliminar_artista() {
		return boton_eliminar_artista;
	}



	public void setBoton_eliminar_artista(Button boton_eliminar_artista) {
		this.boton_eliminar_artista = boton_eliminar_artista;
	}



	public Button getBoton_anadir_artista() {
		return boton_anadir_artista;
	}



	public void setBoton_anadir_artista(Button boton_anadir_artista) {
		this.boton_anadir_artista = boton_anadir_artista;
	}



	public Element getContainer_cancion() {
		return container_cancion;
	}



	public void setContainer_cancion(Element container_cancion) {
		this.container_cancion = container_cancion;
	}



	public Label getLabel_cancion() {
		return label_cancion;
	}



	public void setLabel_cancion(Label label_cancion) {
		this.label_cancion = label_cancion;
	}



	public Element getContainer_linea_canciones() {
		return container_linea_canciones;
	}



	public void setContainer_linea_canciones(Element container_linea_canciones) {
		this.container_linea_canciones = container_linea_canciones;
	}



	public TextField getTf_cancion() {
		return tf_cancion;
	}



	public void setTf_cancion(TextField tf_cancion) {
		this.tf_cancion = tf_cancion;
	}



	public Button getBoton_eliminar_cancion() {
		return boton_eliminar_cancion;
	}



	public void setBoton_eliminar_cancion(Button boton_eliminar_cancion) {
		this.boton_eliminar_cancion = boton_eliminar_cancion;
	}



	public Button getBoton_anadir_cancion() {
		return boton_anadir_cancion;
	}



	public void setBoton_anadir_cancion(Button boton_anadir_cancion) {
		this.boton_anadir_cancion = boton_anadir_cancion;
	}



	public Element getContainer_anadir_cancion() {
		return container_anadir_cancion;
	}



	public void setContainer_anadir_cancion(Element container_anadir_cancion) {
		this.container_anadir_cancion = container_anadir_cancion;
	}



	public Element getContainer_foto_album() {
		return container_foto_album;
	}



	public void setContainer_foto_album(Element container_foto_album) {
		this.container_foto_album = container_foto_album;
	}



	public Label getLabel_foto_album() {
		return label_foto_album;
	}



	public void setLabel_foto_album(Label label_foto_album) {
		this.label_foto_album = label_foto_album;
	}



	public Element getContainer_foto() {
		return container_foto;
	}



	public void setContainer_foto(Element container_foto) {
		this.container_foto = container_foto;
	}



	public Image getFoto() {
		return foto;
	}



	public void setFoto(Image foto) {
		this.foto = foto;
	}



	public Button getBoton_buscar_foto() {
		return boton_buscar_foto;
	}



	public void setBoton_buscar_foto(Button boton_buscar_foto) {
		this.boton_buscar_foto = boton_buscar_foto;
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



	public Button getBoton_dar_de_alta() {
		return boton_dar_de_alta;
	}



	public void setBoton_dar_de_alta(Button boton_dar_de_alta) {
		this.boton_dar_de_alta = boton_dar_de_alta;
	}



	/**
     * Creates a new VistaAnadiralbum.
     */
    public VistaAnadiralbum() {
        // You can initialise any data required for the connected UI components here.
    }

}
