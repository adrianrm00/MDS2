package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-buscadordecanciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscadordecanciones")
@JsModule("./vista-buscadordecanciones.ts")
public class VistaBuscadordecanciones extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("tf_buscador")
	private TextField tf_buscador;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("img_lupa")
	private Image img_lupa;

	public Element getContainer_principal() {
		return container_principal;
	}

	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}

	public TextField getTf_buscador() {
		return tf_buscador;
	}

	public void setTf_buscador(TextField tf_buscador) {
		this.tf_buscador = tf_buscador;
	}

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Image getImg_lupa() {
		return img_lupa;
	}

	public void setImg_lupa(Image img_lupa) {
		this.img_lupa = img_lupa;
	}

	/**
     * Creates a new VistaBuscadordecanciones.
     */
    public VistaBuscadordecanciones() {
        // You can initialise any data required for the connected UI components here.
    }

}
