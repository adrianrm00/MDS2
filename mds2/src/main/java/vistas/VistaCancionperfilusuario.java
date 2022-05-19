package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cancionperfilusuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancionperfilusuario")
@JsModule("./vista-cancionperfilusuario.ts")
public class VistaCancionperfilusuario extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_img")
	private Element container_img;
	@Id("img")
	private Image img;
	@Id("container_contenido")
	private Element container_contenido;
	@Id("container-texto")
	private Element containerTexto;
	@Id("label_nom_cancion")
	private Label label_nom_cancion;
	@Id("label_nom_artista")
	private Label label_nom_artista;
	@Id("container_botones")
	private Element container_botones;
	@Id("container_boton_reproducir")
	private Element container_boton_reproducir;
	@Id("container_reproducir")
	private Button container_reproducir;
	@Id("container_combo_box")
	private Element container_combo_box;
	
	

	public Element getContainer_principal() {
		return container_principal;
	}



	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
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



	public Element getContainer_contenido() {
		return container_contenido;
	}



	public void setContainer_contenido(Element container_contenido) {
		this.container_contenido = container_contenido;
	}



	public Element getContainerTexto() {
		return containerTexto;
	}



	public void setContainerTexto(Element containerTexto) {
		this.containerTexto = containerTexto;
	}



	public Label getLabel_nom_cancion() {
		return label_nom_cancion;
	}



	public void setLabel_nom_cancion(Label label_nom_cancion) {
		this.label_nom_cancion = label_nom_cancion;
	}



	public Label getLabel_nom_artista() {
		return label_nom_artista;
	}



	public void setLabel_nom_artista(Label label_nom_artista) {
		this.label_nom_artista = label_nom_artista;
	}



	public Element getContainer_botones() {
		return container_botones;
	}



	public void setContainer_botones(Element container_botones) {
		this.container_botones = container_botones;
	}



	public Element getContainer_boton_reproducir() {
		return container_boton_reproducir;
	}



	public void setContainer_boton_reproducir(Element container_boton_reproducir) {
		this.container_boton_reproducir = container_boton_reproducir;
	}



	public Button getContainer_reproducir() {
		return container_reproducir;
	}



	public void setContainer_reproducir(Button container_reproducir) {
		this.container_reproducir = container_reproducir;
	}



	public Element getContainer_combo_box() {
		return container_combo_box;
	}



	public void setContainer_combo_box(Element container_combo_box) {
		this.container_combo_box = container_combo_box;
	}



	/**
     * Creates a new VistaCancionperfilusuario.
     */
    public VistaCancionperfilusuario() {
        // You can initialise any data required for the connected UI components here.
    }

}
