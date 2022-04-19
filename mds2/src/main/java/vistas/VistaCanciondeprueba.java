package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H3;

/**
 * A Designer generated component for the vista-canciondeprueba template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciondeprueba")
@JsModule("./vista-canciondeprueba.ts")
public class VistaCanciondeprueba extends LitTemplate {

    @Id("container_img_botones")
	private Element container_img_botones;
	@Id("container_img_botones_ajustado")
	private Element container_img_botones_ajustado;
	@Id("img")
	private Image img;
	@Id("container_botones")
	private Element container_botones;
	@Id("boton_creditos")
	private Button boton_creditos;
	@Id("boton_play")
	private Button boton_play;
	@Id("container_informacion_cancion")
	private Element container_informacion_cancion;
	@Id("container_nombre_cancion")
	private Element container_nombre_cancion;
	@Id("h3_nombre_cancion")
	private H3 h3_nombre_cancion;
	@Id("container_h3")
	private Element container_h3;
	@Id("h3")
	private H3 h3;

	public Element getContainer_img_botones() {
		return container_img_botones;
	}

	public void setContainer_img_botones(Element container_img_botones) {
		this.container_img_botones = container_img_botones;
	}

	public Element getContainer_img_botones_ajustado() {
		return container_img_botones_ajustado;
	}

	public void setContainer_img_botones_ajustado(Element container_img_botones_ajustado) {
		this.container_img_botones_ajustado = container_img_botones_ajustado;
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

	public Button getBoton_creditos() {
		return boton_creditos;
	}

	public void setBoton_creditos(Button boton_creditos) {
		this.boton_creditos = boton_creditos;
	}

	public Button getBoton_play() {
		return boton_play;
	}

	public void setBoton_play(Button boton_play) {
		this.boton_play = boton_play;
	}

	public Element getContainer_informacion_cancion() {
		return container_informacion_cancion;
	}

	public void setContainer_informacion_cancion(Element container_informacion_cancion) {
		this.container_informacion_cancion = container_informacion_cancion;
	}

	public Element getContainer_nombre_cancion() {
		return container_nombre_cancion;
	}

	public void setContainer_nombre_cancion(Element container_nombre_cancion) {
		this.container_nombre_cancion = container_nombre_cancion;
	}

	public H3 getH3_nombre_cancion() {
		return h3_nombre_cancion;
	}

	public void setH3_nombre_cancion(H3 h3_nombre_cancion) {
		this.h3_nombre_cancion = h3_nombre_cancion;
	}

	public Element getContainer_h3() {
		return container_h3;
	}

	public void setContainer_h3(Element container_h3) {
		this.container_h3 = container_h3;
	}

	public H3 getH3() {
		return h3;
	}

	public void setH3(H3 h3) {
		this.h3 = h3;
	}

	/**
     * Creates a new VistaCanciondeprueba.
     */
    public VistaCanciondeprueba() {
        // You can initialise any data required for the connected UI components here.
    }

}
