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
 * A Designer generated component for the vista-mensaje template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mensaje")
@JsModule("./vista-mensaje.ts")
public class VistaMensaje extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_imagen")
	private Element container_imagen;
	@Id("img")
	private Image img;
	@Id("container_asusto")
	private Element container_asusto;
	@Id("texto_asusnto")
	private Label texto_asusnto;
	@Id("container_botones")
	private Element container_botones;
	@Id("boton_leer")
	private Button boton_leer;
	@Id("boton_borrar")
	private Button boton_borrar;

	
	public Button getBoton_borrar() {
		return boton_borrar;
	}


	public void setBoton_borrar(Button boton_borrar) {
		this.boton_borrar = boton_borrar;
	}


	public Element getContainer_principal() {
		return container_principal;
	}


	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}


	public Element getContainer_imagen() {
		return container_imagen;
	}


	public void setContainer_imagen(Element container_imagen) {
		this.container_imagen = container_imagen;
	}


	public Image getImg() {
		return img;
	}


	public void setImg(Image img) {
		this.img = img;
	}


	public Element getContainer_asusto() {
		return container_asusto;
	}


	public void setContainer_asusto(Element container_asusto) {
		this.container_asusto = container_asusto;
	}


	public Label getTexto_asusnto() {
		return texto_asusnto;
	}


	public void setTexto_asusnto(Label texto_asusnto) {
		this.texto_asusnto = texto_asusnto;
	}


	public Element getContainer_botones() {
		return container_botones;
	}


	public void setContainer_botones(Element container_botones) {
		this.container_botones = container_botones;
	}


	public Button getBoton_leer() {
		return boton_leer;
	}


	public void setBoton_leer(Button boton_leer) {
		this.boton_leer = boton_leer;
	}


	/**
     * Creates a new VistaMensaje.
     */
    public VistaMensaje() {
        // You can initialise any data required for the connected UI components here.
    }

}
