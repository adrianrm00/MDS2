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
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.PasswordField;
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

	@Id("container_principal_1")
	private Element container_principal_1;
	@Id("container_principal_2")
	private Element container_principal_2;
	@Id("container_titulo")
	private Element container_titulo;
	@Id("container_anadir_album")
	private Element container_anadir_album;
	@Id("label_anadir_album")
	private Label label_anadir_album;
	@Id("container_contenido")
	private Element container_contenido;
	@Id("container_contenido_fondo")
	private Element container_contenido_fondo;
	@Id("container_contenido_fondo_ajustado")
	private Element container_contenido_fondo_ajustado;
	@Id("buscador_album")
	private Element buscador_album;
	@Id("tf_nombre_album")
	private TextField tf_nombre_album;
	@Id("dp_fecha_lanzamiento")
	private DatePicker dp_fecha_lanzamiento;
	@Id("container_artista_asociado")
	private Element container_artista_asociado;
	@Id("label_artista_asociado")
	private Label label_artista_asociado;
	@Id("container_tf_artista_asociado")
	private HorizontalLayout container_tf_artista_asociado;
	@Id("tf_artista_asociado")
	private TextField tf_artista_asociado;
	@Id("boton_eliminar_artista_asociado")
	private Button boton_eliminar_artista_asociado;
	@Id("container_anadir_artista_asociado")
	private Element container_anadir_artista_asociado;
	@Id("pf_escribir_contrasena")
	private PasswordField pf_escribir_contrasena;
	@Id("pf_repetir_contrasena")
	private PasswordField pf_repetir_contrasena;
	@Id("container_anadir_cancion")
	private Element container_anadir_cancion;
	@Id("label_anadir_cancion")
	private Label label_anadir_cancion;
	@Id("container_tf_anadir_canciones")
	private Element container_tf_anadir_canciones;
	@Id("container_tf_anadir_cancion")
	private HorizontalLayout container_tf_anadir_cancion;
	@Id("tf_anadir_cancion")
	private TextField tf_anadir_cancion;
	@Id("boton_eliminar_cancion")
	private Button boton_eliminar_cancion;
	@Id("container_boton_anadir_cancion")
	private Element container_boton_anadir_cancion;
	@Id("container_anadir_cancion_a_album")
	private Element container_anadir_cancion_a_album;
	@Id("container_foto_album")
	private HorizontalLayout container_foto_album;
	@Id("label_foto_album")
	private Label label_foto_album;
	@Id("container_img_album")
	private Element container_img_album;
	@Id("img_album")
	private Image img_album;
	@Id("boton_buscar_en_archivos")
	private Button boton_buscar_en_archivos;
	@Id("container_botones_finales")
	private HorizontalLayout container_botones_finales;
	@Id("boton_cancelar")
	private Button boton_cancelar;
	@Id("boton_confirmar")
	private Button boton_confirmar;
	
	public Element getContainer_principal_1() {
		return container_principal_1;
	}

	public void setContainer_principal_1(Element container_principal_1) {
		this.container_principal_1 = container_principal_1;
	}

	public Element getContainer_principal_2() {
		return container_principal_2;
	}

	public void setContainer_principal_2(Element container_principal_2) {
		this.container_principal_2 = container_principal_2;
	}

	public Element getContainer_titulo() {
		return container_titulo;
	}

	public void setContainer_titulo(Element container_titulo) {
		this.container_titulo = container_titulo;
	}

	public Element getContainer_anadir_album() {
		return container_anadir_album;
	}

	public void setContainer_anadir_album(Element container_anadir_album) {
		this.container_anadir_album = container_anadir_album;
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

	public Element getContainer_contenido_fondo() {
		return container_contenido_fondo;
	}

	public void setContainer_contenido_fondo(Element container_contenido_fondo) {
		this.container_contenido_fondo = container_contenido_fondo;
	}

	public Element getContainer_contenido_fondo_ajustado() {
		return container_contenido_fondo_ajustado;
	}

	public void setContainer_contenido_fondo_ajustado(Element container_contenido_fondo_ajustado) {
		this.container_contenido_fondo_ajustado = container_contenido_fondo_ajustado;
	}

	public Element getBuscador_album() {
		return buscador_album;
	}

	public void setBuscador_album(Element buscador_album) {
		this.buscador_album = buscador_album;
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

	public Label getLabel_artista_asociado() {
		return label_artista_asociado;
	}

	public void setLabel_artista_asociado(Label label_artista_asociado) {
		this.label_artista_asociado = label_artista_asociado;
	}

	public HorizontalLayout getContainer_tf_artista_asociado() {
		return container_tf_artista_asociado;
	}

	public void setContainer_tf_artista_asociado(HorizontalLayout container_tf_artista_asociado) {
		this.container_tf_artista_asociado = container_tf_artista_asociado;
	}

	public TextField getTf_artista_asociado() {
		return tf_artista_asociado;
	}

	public void setTf_artista_asociado(TextField tf_artista_asociado) {
		this.tf_artista_asociado = tf_artista_asociado;
	}

	public Button getBoton_eliminar_artista_asociado() {
		return boton_eliminar_artista_asociado;
	}

	public void setBoton_eliminar_artista_asociado(Button boton_eliminar_artista_asociado) {
		this.boton_eliminar_artista_asociado = boton_eliminar_artista_asociado;
	}

	public Element getContainer_anadir_artista_asociado() {
		return container_anadir_artista_asociado;
	}

	public void setContainer_anadir_artista_asociado(Element container_anadir_artista_asociado) {
		this.container_anadir_artista_asociado = container_anadir_artista_asociado;
	}

	public PasswordField getPf_escribir_contrasena() {
		return pf_escribir_contrasena;
	}

	public void setPf_escribir_contrasena(PasswordField pf_escribir_contrasena) {
		this.pf_escribir_contrasena = pf_escribir_contrasena;
	}

	public PasswordField getPf_repetir_contrasena() {
		return pf_repetir_contrasena;
	}

	public void setPf_repetir_contrasena(PasswordField pf_repetir_contrasena) {
		this.pf_repetir_contrasena = pf_repetir_contrasena;
	}

	public Element getContainer_anadir_cancion() {
		return container_anadir_cancion;
	}

	public void setContainer_anadir_cancion(Element container_anadir_cancion) {
		this.container_anadir_cancion = container_anadir_cancion;
	}

	public Label getLabel_anadir_cancion() {
		return label_anadir_cancion;
	}

	public void setLabel_anadir_cancion(Label label_anadir_cancion) {
		this.label_anadir_cancion = label_anadir_cancion;
	}

	public Element getContainer_tf_anadir_canciones() {
		return container_tf_anadir_canciones;
	}

	public void setContainer_tf_anadir_canciones(Element container_tf_anadir_canciones) {
		this.container_tf_anadir_canciones = container_tf_anadir_canciones;
	}

	public HorizontalLayout getContainer_tf_anadir_cancion() {
		return container_tf_anadir_cancion;
	}

	public void setContainer_tf_anadir_cancion(HorizontalLayout container_tf_anadir_cancion) {
		this.container_tf_anadir_cancion = container_tf_anadir_cancion;
	}

	public TextField getTf_anadir_cancion() {
		return tf_anadir_cancion;
	}

	public void setTf_anadir_cancion(TextField tf_anadir_cancion) {
		this.tf_anadir_cancion = tf_anadir_cancion;
	}

	public Button getBoton_eliminar_cancion() {
		return boton_eliminar_cancion;
	}

	public void setBoton_eliminar_cancion(Button boton_eliminar_cancion) {
		this.boton_eliminar_cancion = boton_eliminar_cancion;
	}

	public Element getContainer_boton_anadir_cancion() {
		return container_boton_anadir_cancion;
	}

	public void setContainer_boton_anadir_cancion(Element container_boton_anadir_cancion) {
		this.container_boton_anadir_cancion = container_boton_anadir_cancion;
	}

	public Element getContainer_anadir_cancion_a_album() {
		return container_anadir_cancion_a_album;
	}

	public void setContainer_anadir_cancion_a_album(Element container_anadir_cancion_a_album) {
		this.container_anadir_cancion_a_album = container_anadir_cancion_a_album;
	}

	public HorizontalLayout getContainer_foto_album() {
		return container_foto_album;
	}

	public void setContainer_foto_album(HorizontalLayout container_foto_album) {
		this.container_foto_album = container_foto_album;
	}

	public Label getLabel_foto_album() {
		return label_foto_album;
	}

	public void setLabel_foto_album(Label label_foto_album) {
		this.label_foto_album = label_foto_album;
	}

	public Element getContainer_img_album() {
		return container_img_album;
	}

	public void setContainer_img_album(Element container_img_album) {
		this.container_img_album = container_img_album;
	}

	public Image getImg_album() {
		return img_album;
	}

	public void setImg_album(Image img_album) {
		this.img_album = img_album;
	}

	public Button getBoton_buscar_en_archivos() {
		return boton_buscar_en_archivos;
	}

	public void setBoton_buscar_en_archivos(Button boton_buscar_en_archivos) {
		this.boton_buscar_en_archivos = boton_buscar_en_archivos;
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

	public Button getBoton_confirmar() {
		return boton_confirmar;
	}

	public void setBoton_confirmar(Button boton_confirmar) {
		this.boton_confirmar = boton_confirmar;
	}

	/**
     * Creates a new VistaAnadiralbum.
     */
    public VistaAnadiralbum() {
        // You can initialise any data required for the connected UI components here.
    }

}
