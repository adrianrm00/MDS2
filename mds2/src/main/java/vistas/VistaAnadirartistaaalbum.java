package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-anadirartistaaalbum template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-anadirartistaaalbum")
@JsModule("./vista-anadirartistaaalbum.ts")
public class VistaAnadirartistaaalbum extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("boton_anadir_artista_a_album")
	private Button boton_anadir_artista_a_album;

	public Element getContainer_principal() {
		return container_principal;
	}

	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}

	public Button getBoton_anadir_artista_a_album() {
		return boton_anadir_artista_a_album;
	}

	public void setBoton_anadir_artista_a_album(Button boton_anadir_artista_a_album) {
		this.boton_anadir_artista_a_album = boton_anadir_artista_a_album;
	}

	/**
     * Creates a new VistaAnadirartistaaalbum.
     */
    public VistaAnadirartistaaalbum() {
        // You can initialise any data required for the connected UI components here.
    }

}
