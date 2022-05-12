package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-cabecera template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera")
@JsModule("./vista-cabecera.ts")
public class VistaCabecera extends LitTemplate {

	@Id("container_principal")
	private Element container_principal;
	@Id("container_cabecera")
	private Element container_cabecera;
	@Id("container_spotyual")
	private Element container_spotyual;
	@Id("container_img")
	private Element container_img;
	@Id("img")
	private Image img;
	@Id("container_label")
	private Element container_label;
	@Id("label_spotyual")
	private Label label_spotyual;
	@Id("container_buscador_biblioteca")
	private Element container_buscador_biblioteca;
	@Id("container_buscador")
	private Element container_buscador;
	@Id("container_opciones_usuario")
	private Element container_opciones_usuario;
	@Id("container_contenido_total")
	private Element container_contenido_total;
	@Id("container_menu_lateral")
	private Element container_menu_lateral;
	@Id("container_contenido")
	private Element container_contenido;
	@Id("container_reproductor")
	private Element container_reproductor;
	@Id("container_biblioteca")
	private Element container_biblioteca;
	
	

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



	public Element getContainer_spotyual() {
		return container_spotyual;
	}



	public void setContainer_spotyual(Element container_spotyual) {
		this.container_spotyual = container_spotyual;
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



	public Element getContainer_label() {
		return container_label;
	}



	public void setContainer_label(Element container_label) {
		this.container_label = container_label;
	}



	public Label getLabel_spotyual() {
		return label_spotyual;
	}



	public void setLabel_spotyual(Label label_spotyual) {
		this.label_spotyual = label_spotyual;
	}



	public Element getContainer_buscador_biblioteca() {
		return container_buscador_biblioteca;
	}



	public void setContainer_buscador_biblioteca(Element container_buscador_biblioteca) {
		this.container_buscador_biblioteca = container_buscador_biblioteca;
	}



	public Element getContainer_buscador() {
		return container_buscador;
	}



	public void setContainer_buscador(Element container_buscador) {
		this.container_buscador = container_buscador;
	}



	public Element getContainer_biblioteca() {
		return container_biblioteca;
	}



	public void setContainer_biblioteca(Element container_biblioteca) {
		this.container_biblioteca = container_biblioteca;
	}



	public Element getContainer_opciones_usuario() {
		return container_opciones_usuario;
	}



	public void setContainer_opciones_usuario(Element container_opciones_usuario) {
		this.container_opciones_usuario = container_opciones_usuario;
	}



	public Element getContainer_contenido_total() {
		return container_contenido_total;
	}



	public void setContainer_contenido_total(Element container_contenido_total) {
		this.container_contenido_total = container_contenido_total;
	}



	public Element getContainer_menu_lateral() {
		return container_menu_lateral;
	}



	public void setContainer_menu_lateral(Element container_menu_lateral) {
		this.container_menu_lateral = container_menu_lateral;
	}



	public Element getContainer_contenido() {
		return container_contenido;
	}



	public void setContainer_contenido(Element container_contenido) {
		this.container_contenido = container_contenido;
	}



	public Element getContainer_reproductor() {
		return container_reproductor;
	}



	public void setContainer_reproductor(Element container_reproductor) {
		this.container_reproductor = container_reproductor;
	}



	/**
     * Creates a new VistaCabecera.
     */
    public VistaCabecera() {
        // You can initialise any data required for the connected UI components here.
    }

}
