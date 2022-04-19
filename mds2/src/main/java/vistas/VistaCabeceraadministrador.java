package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cabeceraadministrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabeceraadministrador")
@JsModule("./vista-cabeceraadministrador.ts")
public class VistaCabeceraadministrador extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_cabecera")
	private HorizontalLayout container_cabecera;
	@Id("container_spotyual")
	private HorizontalLayout container_spotyual;
	@Id("container_img")
	private Element container_img;
	@Id("img")
	private Image img;
	@Id("container_p")
	private Element container_p;
	@Id("p_spotyual")
	private Paragraph p_spotyual;
	@Id("container_administrador")
	private HorizontalLayout container_administrador;
	@Id("img_administrador")
	private Image img_administrador;
	@Id("label_administrador")
	private Label label_administrador;
	@Id("boton_salir")
	private Button boton_salir;
	@Id("container_contenido")
	private Element container_contenido;

	public Element getContainer_principal() {
		return container_principal;
	}

	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}

	public HorizontalLayout getContainer_cabecera() {
		return container_cabecera;
	}

	public void setContainer_cabecera(HorizontalLayout container_cabecera) {
		this.container_cabecera = container_cabecera;
	}

	public HorizontalLayout getContainer_spotyual() {
		return container_spotyual;
	}

	public void setContainer_spotyual(HorizontalLayout container_spotyual) {
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

	public Element getContainer_p() {
		return container_p;
	}

	public void setContainer_p(Element container_p) {
		this.container_p = container_p;
	}

	public Paragraph getP_spotyual() {
		return p_spotyual;
	}

	public void setP_spotyual(Paragraph p_spotyual) {
		this.p_spotyual = p_spotyual;
	}

	public HorizontalLayout getContainer_administrador() {
		return container_administrador;
	}

	public void setContainer_administrador(HorizontalLayout container_administrador) {
		this.container_administrador = container_administrador;
	}

	public Image getImg_administrador() {
		return img_administrador;
	}

	public void setImg_administrador(Image img_administrador) {
		this.img_administrador = img_administrador;
	}

	public Label getLabel_administrador() {
		return label_administrador;
	}

	public void setLabel_administrador(Label label_administrador) {
		this.label_administrador = label_administrador;
	}

	public Button getBoton_salir() {
		return boton_salir;
	}

	public void setBoton_salir(Button boton_salir) {
		this.boton_salir = boton_salir;
	}

	public Element getContainer_contenido() {
		return container_contenido;
	}

	public void setContainer_contenido(Element container_contenido) {
		this.container_contenido = container_contenido;
	}

	/**
     * Creates a new VistaCabeceraadministrador.
     */
    public VistaCabeceraadministrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
