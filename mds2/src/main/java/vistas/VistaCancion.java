package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion")
@JsModule("./vista-cancion.ts")
public class VistaCancion extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_foto_botones_nombre")
	private Element container_foto_botones_nombre;
	@Id("container_foto_botones")
	private Element container_foto_botones;
	@Id("container_img")
	private Element container_img;
	@Id("img")
	private Image img;
	@Id("container_botones")
	private Element container_botones;
	@Id("container_boton_anadir_a_fav")
	private Element container_boton_anadir_a_fav;
	@Id("boton_anadir_a_fav")
	private Button boton_anadir_a_fav;
	@Id("container_boton_reproducir")
	private Element container_boton_reproducir;
	@Id("boton_reproducir")
	private Button boton_reproducir;
	@Id("container_cb")
	private Element container_cb;
	@Id("cb")
	private ComboBox<String> cb;
	@Id("container_nombre_cancion_y_artista")
	private Element container_nombre_cancion_y_artista;
	@Id("container_nombre_cancion")
	private Element container_nombre_cancion;
	@Id("label_nombre_cancion")
	private Label label_nombre_cancion;
	@Id("container_nombre_artista")
	private Element container_nombre_artista;
	@Id("label_nombre_artista")
	private Label label_nombre_artista;
	@Id("container_nombre_cancion_y_artista_2")
	private Element container_nombre_cancion_y_artista_2;
	@Id("container_nombre_cancion_2")
	private Element container_nombre_cancion_2;
	@Id("label_nombre_cancion_2")
	private Label label_nombre_cancion_2;
	@Id("container_nombre_artista_2")
	private Element container_nombre_artista_2;
	@Id("label_nombre_artista_2")
	private Label label_nombre_artista_2;
	@Id("container_boton_anadir_a_fav_2")
	private Element container_boton_anadir_a_fav_2;
	@Id("boton_anadir_a_fav_2")
	private Button boton_anadir_a_fav_2;
	@Id("container_boton_reproducir_2")
	private Element container_boton_reproducir_2;
	@Id("boton_reproducir_2")
	private Button boton_reproducir_2;
	@Id("container_cb_2")
	private Element container_cb_2;
	@Id("cb_2")
	private ComboBox<String> cb_2;

	public Element getContainer_principal() {
		return container_principal;
	}

	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}

	public Element getContainer_foto_botones_nombre() {
		return container_foto_botones_nombre;
	}

	public void setContainer_foto_botones_nombre(Element container_foto_botones_nombre) {
		this.container_foto_botones_nombre = container_foto_botones_nombre;
	}

	public Element getContainer_foto_botones() {
		return container_foto_botones;
	}

	public void setContainer_foto_botones(Element container_foto_botones) {
		this.container_foto_botones = container_foto_botones;
	}

	public Element getContainer_img() {
		return container_img;
	}

	public void setContainer_img(Element container_img) {
		this.container_img = container_img;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public Element getContainer_botones() {
		return container_botones;
	}

	public void setContainer_botones(Element container_botones) {
		this.container_botones = container_botones;
	}

	public Element getContainer_boton_anadir_a_fav() {
		return container_boton_anadir_a_fav;
	}

	public void setContainer_boton_anadir_a_fav(Element container_boton_anadir_a_fav) {
		this.container_boton_anadir_a_fav = container_boton_anadir_a_fav;
	}

	public Button getBoton_anadir_a_fav() {
		return boton_anadir_a_fav;
	}

	public void setBoton_anadir_a_fav(Button boton_anadir_a_fav) {
		this.boton_anadir_a_fav = boton_anadir_a_fav;
	}

	public Element getContainer_boton_reproducir() {
		return container_boton_reproducir;
	}

	public void setContainer_boton_reproducir(Element container_boton_reproducir) {
		this.container_boton_reproducir = container_boton_reproducir;
	}

	public Button getBoton_reproducir() {
		return boton_reproducir;
	}

	public void setBoton_reproducir(Button boton_reproducir) {
		this.boton_reproducir = boton_reproducir;
	}

	public Element getContainer_cb() {
		return container_cb;
	}

	public void setContainer_cb(Element container_cb) {
		this.container_cb = container_cb;
	}

	public ComboBox<String> getCb() {
		return cb;
	}

	public void setCb(ComboBox<String> cb) {
		this.cb = cb;
	}

	public Element getContainer_nombre_cancion_y_artista() {
		return container_nombre_cancion_y_artista;
	}

	public void setContainer_nombre_cancion_y_artista(Element container_nombre_cancion_y_artista) {
		this.container_nombre_cancion_y_artista = container_nombre_cancion_y_artista;
	}

	public Element getContainer_nombre_cancion() {
		return container_nombre_cancion;
	}

	public void setContainer_nombre_cancion(Element container_nombre_cancion) {
		this.container_nombre_cancion = container_nombre_cancion;
	}

	public Label getLabel_nombre_cancion() {
		return label_nombre_cancion;
	}

	public void setLabel_nombre_cancion(Label label_nombre_cancion) {
		this.label_nombre_cancion = label_nombre_cancion;
	}

	public Element getContainer_nombre_artista() {
		return container_nombre_artista;
	}

	public void setContainer_nombre_artista(Element container_nombre_artista) {
		this.container_nombre_artista = container_nombre_artista;
	}

	public Label getLabel_nombre_artista() {
		return label_nombre_artista;
	}

	public void setLabel_nombre_artista(Label label_nombre_artista) {
		this.label_nombre_artista = label_nombre_artista;
	}

	public Element getContainer_nombre_cancion_y_artista_2() {
		return container_nombre_cancion_y_artista_2;
	}

	public void setContainer_nombre_cancion_y_artista_2(Element container_nombre_cancion_y_artista_2) {
		this.container_nombre_cancion_y_artista_2 = container_nombre_cancion_y_artista_2;
	}

	public Element getContainer_nombre_cancion_2() {
		return container_nombre_cancion_2;
	}

	public void setContainer_nombre_cancion_2(Element container_nombre_cancion_2) {
		this.container_nombre_cancion_2 = container_nombre_cancion_2;
	}

	public Label getLabel_nombre_cancion_2() {
		return label_nombre_cancion_2;
	}

	public void setLabel_nombre_cancion_2(Label label_nombre_cancion_2) {
		this.label_nombre_cancion_2 = label_nombre_cancion_2;
	}

	public Element getContainer_nombre_artista_2() {
		return container_nombre_artista_2;
	}

	public void setContainer_nombre_artista_2(Element container_nombre_artista_2) {
		this.container_nombre_artista_2 = container_nombre_artista_2;
	}

	public Label getLabel_nombre_artista_2() {
		return label_nombre_artista_2;
	}

	public void setLabel_nombre_artista_2(Label label_nombre_artista_2) {
		this.label_nombre_artista_2 = label_nombre_artista_2;
	}

	public Element getContainer_boton_anadir_a_fav_2() {
		return container_boton_anadir_a_fav_2;
	}

	public void setContainer_boton_anadir_a_fav_2(Element container_boton_anadir_a_fav_2) {
		this.container_boton_anadir_a_fav_2 = container_boton_anadir_a_fav_2;
	}

	public Button getBoton_anadir_a_fav_2() {
		return boton_anadir_a_fav_2;
	}

	public void setBoton_anadir_a_fav_2(Button boton_anadir_a_fav_2) {
		this.boton_anadir_a_fav_2 = boton_anadir_a_fav_2;
	}

	public Element getContainer_boton_reproducir_2() {
		return container_boton_reproducir_2;
	}

	public void setContainer_boton_reproducir_2(Element container_boton_reproducir_2) {
		this.container_boton_reproducir_2 = container_boton_reproducir_2;
	}

	public Button getBoton_reproducir_2() {
		return boton_reproducir_2;
	}

	public void setBoton_reproducir_2(Button boton_reproducir_2) {
		this.boton_reproducir_2 = boton_reproducir_2;
	}

	public Element getContainer_cb_2() {
		return container_cb_2;
	}

	public void setContainer_cb_2(Element container_cb_2) {
		this.container_cb_2 = container_cb_2;
	}

	public ComboBox<String> getCb_2() {
		return cb_2;
	}

	public void setCb_2(ComboBox<String> cb_2) {
		this.cb_2 = cb_2;
	}

	/**
     * Creates a new VistaCancion.
     */
    public VistaCancion() {
        // You can initialise any data required for the connected UI components here.
    }

}
