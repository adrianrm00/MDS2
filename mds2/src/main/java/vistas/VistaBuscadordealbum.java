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
 * A Designer generated component for the vista-buscadordealbum template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscadordealbum")
@JsModule("./vista-buscadordealbum.ts")
public class VistaBuscadordealbum extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("tf_buscador")
	private TextField tf_buscador;
	@Id("boton_buscar")
	private Button boton_buscar;
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

	public Button getBoton_buscar() {
		return boton_buscar;
	}

	public void setBoton_buscar(Button boton_buscar) {
		this.boton_buscar = boton_buscar;
	}

	public Image getImg_lupa() {
		return img_lupa;
	}

	public void setImg_lupa(Image img_lupa) {
		this.img_lupa = img_lupa;
	}

	/**
     * Creates a new VistaBuscadordealbum.
     */
    public VistaBuscadordealbum() {
        // You can initialise any data required for the connected UI components here.
    }

}
