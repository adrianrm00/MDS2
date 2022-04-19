package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-evento template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-evento")
@JsModule("./vista-evento.ts")
public class VistaEvento extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_cabecera")
	private Element container_cabecera;
	@Id("conainer_titulo")
	private Element conainer_titulo;
	@Id("titulo_proximos eventos")
	private Label titulo_proximosEventos;
	@Id("container_boton")
	private Element container_boton;
	@Id("boton_editar_eventos")
	private Button boton_editar_eventos;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("container_datos")
	private Element container_datos;
	@Id("container_nombre_evento")
	private Element container_nombre_evento;
	@Id("texto_nombre_evento")
	private Label texto_nombre_evento;
	@Id("container_ciudad")
	private Element container_ciudad;
	@Id("texto_ciudad")
	private Label texto_ciudad;
	@Id("container_fecha")
	private Element container_fecha;
	@Id("texto_fecha")
	private Label texto_fecha;
	@Id("container_eventos")
	private Element container_eventos;
	
	
	public Element getContainer_principal() {
		return container_principal;
	}


	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}


	public Element getContainer_cabecera() {
		return container_cabecera;
	}


	public void setContainer_cabecera(Element container_cabecera) {
		this.container_cabecera = container_cabecera;
	}


	public Element getConainer_titulo() {
		return conainer_titulo;
	}


	public void setConainer_titulo(Element conainer_titulo) {
		this.conainer_titulo = conainer_titulo;
	}


	public Label getTitulo_proximosEventos() {
		return titulo_proximosEventos;
	}


	public void setTitulo_proximosEventos(Label titulo_proximosEventos) {
		this.titulo_proximosEventos = titulo_proximosEventos;
	}


	public Element getContainer_boton() {
		return container_boton;
	}


	public void setContainer_boton(Element container_boton) {
		this.container_boton = container_boton;
	}


	public Button getBoton_editar_eventos() {
		return boton_editar_eventos;
	}


	public void setBoton_editar_eventos(Button boton_editar_eventos) {
		this.boton_editar_eventos = boton_editar_eventos;
	}


	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}


	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}


	public Element getContainer_datos() {
		return container_datos;
	}


	public void setContainer_datos(Element container_datos) {
		this.container_datos = container_datos;
	}


	public Element getContainer_nombre_evento() {
		return container_nombre_evento;
	}


	public void setContainer_nombre_evento(Element container_nombre_evento) {
		this.container_nombre_evento = container_nombre_evento;
	}


	public Label getTexto_nombre_evento() {
		return texto_nombre_evento;
	}


	public void setTexto_nombre_evento(Label texto_nombre_evento) {
		this.texto_nombre_evento = texto_nombre_evento;
	}


	public Element getContainer_ciudad() {
		return container_ciudad;
	}


	public void setContainer_ciudad(Element container_ciudad) {
		this.container_ciudad = container_ciudad;
	}


	public Label getTexto_ciudad() {
		return texto_ciudad;
	}


	public void setTexto_ciudad(Label texto_ciudad) {
		this.texto_ciudad = texto_ciudad;
	}


	public Element getContainer_fecha() {
		return container_fecha;
	}


	public void setContainer_fecha(Element container_fecha) {
		this.container_fecha = container_fecha;
	}


	public Label getTexto_fecha() {
		return texto_fecha;
	}


	public void setTexto_fecha(Label texto_fecha) {
		this.texto_fecha = texto_fecha;
	}


	public Element getContainer_eventos() {
		return container_eventos;
	}


	public void setContainer_eventos(Element container_eventos) {
		this.container_eventos = container_eventos;
	}


	/**
     * Creates a new VistaEvento.
     */
    public VistaEvento() {
        // You can initialise any data required for the connected UI components here.
    }

}
