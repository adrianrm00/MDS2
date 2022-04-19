package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-resultadoprincipal template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-resultadoprincipal")
@JsModule("./vista-resultadoprincipal.ts")
public class VistaResultadoprincipal extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_principal_ajustado")
	private Element container_principal_ajustado;
	@Id("container_imagen_y_nombre")
	private Element container_imagen_y_nombre;
	@Id("container_imagen")
	private Element container_imagen;
	@Id("img")
	private Image img;
	@Id("container_nombre")
	private Element container_nombre;
	@Id("nombre_cancion")
	private Label nombre_cancion;
	@Id("container_informacion")
	private Element container_informacion;
	@Id("informacion")
	private Label informacion;


	public Element getContainer_principal() {
		return container_principal;
	}


	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}


	public Element getContainer_principal_ajustado() {
		return container_principal_ajustado;
	}


	public void setContainer_principal_ajustado(Element container_principal_ajustado) {
		this.container_principal_ajustado = container_principal_ajustado;
	}


	public Element getContainer_imagen_y_nombre() {
		return container_imagen_y_nombre;
	}


	public void setContainer_imagen_y_nombre(Element container_imagen_y_nombre) {
		this.container_imagen_y_nombre = container_imagen_y_nombre;
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


	public Element getContainer_nombre() {
		return container_nombre;
	}


	public void setContainer_nombre(Element container_nombre) {
		this.container_nombre = container_nombre;
	}


	public Label getNombre_cancion() {
		return nombre_cancion;
	}


	public void setNombre_cancion(Label nombre_cancion) {
		this.nombre_cancion = nombre_cancion;
	}


	public Element getContainer_informacion() {
		return container_informacion;
	}


	public void setContainer_informacion(Element container_informacion) {
		this.container_informacion = container_informacion;
	}


	public Label getInformacion() {
		return informacion;
	}


	public void setInformacion(Label informacion) {
		this.informacion = informacion;
	}


	/**
     * Creates a new VistaResultadoprincipal.
     */
    public VistaResultadoprincipal() {
        // You can initialise any data required for the connected UI components here.
    }

}
