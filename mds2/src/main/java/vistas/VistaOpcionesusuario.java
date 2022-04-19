package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.combobox.ComboBox;

/**
 * A Designer generated component for the vista-opcionesusuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-opcionesusuario")
@JsModule("./vista-opcionesusuario.ts")
public class VistaOpcionesusuario extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_imagen")
	private Element container_imagen;
	@Id("img")
	private Image img;
	@Id("container_opciones")
	private Element container_opciones;
	@Id("combo_box_opciones")
	private ComboBox<String> combo_box_opciones;

	
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


	public Element getContainer_opciones() {
		return container_opciones;
	}


	public void setContainer_opciones(Element container_opciones) {
		this.container_opciones = container_opciones;
	}


	public ComboBox<String> getCombo_box_opciones() {
		return combo_box_opciones;
	}


	public void setCombo_box_opciones(ComboBox<String> combo_box_opciones) {
		this.combo_box_opciones = combo_box_opciones;
	}


	/**
     * Creates a new VistaOpcionesusuario.
     */
    public VistaOpcionesusuario() {
        // You can initialise any data required for the connected UI components here.
    }

}
