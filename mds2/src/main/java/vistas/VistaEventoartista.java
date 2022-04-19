package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-eventoartista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-eventoartista")
@JsModule("./vista-eventoartista.ts")
public class VistaEventoartista extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("comtainer_nombre_concierto")
	private Element comtainer_nombre_concierto;
	@Id("texto_nombre_concierto")
	private Label texto_nombre_concierto;
	@Id("comtainer_ciudad")
	private Element comtainer_ciudad;
	@Id("texto_ciudad")
	private Label texto_ciudad;
	@Id("comtainer_fecha_evento")
	private Element comtainer_fecha_evento;
	@Id("texto_fecha_evento")
	private Label texto_fecha_evento;
	@Id("comtainer_botones")
	private Element comtainer_botones;
	@Id("comtainer_boton_editar")
	private Element comtainer_boton_editar;
	@Id("boton_editar")
	private Button boton_editar;
	@Id("comtainer_boton_borrar")
	private Element comtainer_boton_borrar;
	@Id("boton_borrar")
	private Button boton_borrar;

	
	public Element getContainer_principal() {
		return container_principal;
	}


	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}


	public Element getComtainer_nombre_concierto() {
		return comtainer_nombre_concierto;
	}


	public void setComtainer_nombre_concierto(Element comtainer_nombre_concierto) {
		this.comtainer_nombre_concierto = comtainer_nombre_concierto;
	}


	public Label getTexto_nombre_concierto() {
		return texto_nombre_concierto;
	}


	public void setTexto_nombre_concierto(Label texto_nombre_concierto) {
		this.texto_nombre_concierto = texto_nombre_concierto;
	}


	public Element getComtainer_ciudad() {
		return comtainer_ciudad;
	}


	public void setComtainer_ciudad(Element comtainer_ciudad) {
		this.comtainer_ciudad = comtainer_ciudad;
	}


	public Label getTexto_ciudad() {
		return texto_ciudad;
	}


	public void setTexto_ciudad(Label texto_ciudad) {
		this.texto_ciudad = texto_ciudad;
	}


	public Element getComtainer_fecha_evento() {
		return comtainer_fecha_evento;
	}


	public void setComtainer_fecha_evento(Element comtainer_fecha_evento) {
		this.comtainer_fecha_evento = comtainer_fecha_evento;
	}


	public Label getTexto_fecha_evento() {
		return texto_fecha_evento;
	}


	public void setTexto_fecha_evento(Label texto_fecha_evento) {
		this.texto_fecha_evento = texto_fecha_evento;
	}


	public Element getComtainer_botones() {
		return comtainer_botones;
	}


	public void setComtainer_botones(Element comtainer_botones) {
		this.comtainer_botones = comtainer_botones;
	}


	public Element getComtainer_boton_editar() {
		return comtainer_boton_editar;
	}


	public void setComtainer_boton_editar(Element comtainer_boton_editar) {
		this.comtainer_boton_editar = comtainer_boton_editar;
	}


	public Button getBoton_editar() {
		return boton_editar;
	}


	public void setBoton_editar(Button boton_editar) {
		this.boton_editar = boton_editar;
	}


	public Element getComtainer_boton_borrar() {
		return comtainer_boton_borrar;
	}


	public void setComtainer_boton_borrar(Element comtainer_boton_borrar) {
		this.comtainer_boton_borrar = comtainer_boton_borrar;
	}


	public Button getBoton_borrar() {
		return boton_borrar;
	}


	public void setBoton_borrar(Button boton_borrar) {
		this.boton_borrar = boton_borrar;
	}


	/**
     * Creates a new VistaEventoartista.
     */
    public VistaEventoartista() {
        // You can initialise any data required for the connected UI components here.
    }

}
