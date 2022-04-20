package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-notificaciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-notificaciones")
@JsModule("./vista-notificaciones.ts")
public class VistaNotificaciones extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_titulo")
	private Element container_titulo;
	@Id("titulo_notificaciones")
	private Label titulo_notificaciones;
	@Id("container_mensajes")
	private Element container_mensajes;

	
	public Element getContainer_principal() {
		return container_principal;
	}


	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}


	public Element getContainer_titulo() {
		return container_titulo;
	}


	public void setContainer_titulo(Element container_titulo) {
		this.container_titulo = container_titulo;
	}


	public Label getTitulo_notificaciones() {
		return titulo_notificaciones;
	}


	public void setTitulo_notificaciones(Label titulo_notificaciones) {
		this.titulo_notificaciones = titulo_notificaciones;
	}


	public Element getContainer_mensajes() {
		return container_mensajes;
	}


	public void setContainer_mensajes(Element container_mensajes) {
		this.container_mensajes = container_mensajes;
	}


	/**
     * Creates a new VistaNotificaciones.
     */
    public VistaNotificaciones() {
        // You can initialise any data required for the connected UI components here.
    }

}
