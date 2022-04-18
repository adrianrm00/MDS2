package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-album")
@JsModule("./vista-album.ts")
public class VistaAlbum extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_delimitador")
	private Element container_delimitador;
	public Element getContainer_principal() {
		return container_principal;
	}

	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}

	public Element getContainer_delimitador() {
		return container_delimitador;
	}

	public void setContainer_delimitador(Element container_delimitador) {
		this.container_delimitador = container_delimitador;
	}

	public Element getContaniner_img() {
		return contaniner_img;
	}

	public void setContaniner_img(Element contaniner_img) {
		this.contaniner_img = contaniner_img;
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

	public Element getContainer_informacion_ajustada() {
		return container_informacion_ajustada;
	}

	public void setContainer_informacion_ajustada(Element container_informacion_ajustada) {
		this.container_informacion_ajustada = container_informacion_ajustada;
	}

	public TextField getTf_nombre_album() {
		return tf_nombre_album;
	}

	public void setTf_nombre_album(TextField tf_nombre_album) {
		this.tf_nombre_album = tf_nombre_album;
	}

	public TextField getTf_fecha_edicion() {
		return tf_fecha_edicion;
	}

	public void setTf_fecha_edicion(TextField tf_fecha_edicion) {
		this.tf_fecha_edicion = tf_fecha_edicion;
	}

	public Element getContainer_boton() {
		return container_boton;
	}

	public void setContainer_boton(Element container_boton) {
		this.container_boton = container_boton;
	}

	public Button getBoton() {
		return boton;
	}

	public void setBoton(Button boton) {
		this.boton = boton;
	}

	public Element getContainer_canciones() {
		return container_canciones;
	}

	public void setContainer_canciones(Element container_canciones) {
		this.container_canciones = container_canciones;
	}

	@Id("contaniner_img")
	private Element contaniner_img;
	@Id("img")
	private Image img;
	@Id("container_informacion")
	private Element container_informacion;
	@Id("container_informacion_ajustada")
	private Element container_informacion_ajustada;
	@Id("tf_nombre_album")
	private TextField tf_nombre_album;
	@Id("tf_fecha_edicion")
	private TextField tf_fecha_edicion;
	@Id("container_boton")
	private Element container_boton;
	@Id("boton")
	private Button boton;
	@Id("container_canciones")
	private Element container_canciones;

	/**
     * Creates a new VistaAlbum.
     */
    public VistaAlbum() {
        // You can initialise any data required for the connected UI components here.
    }

}
