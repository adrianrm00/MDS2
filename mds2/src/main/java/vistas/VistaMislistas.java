package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-mislistas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mislistas")
@JsModule("./vista-mislistas.ts")
public class VistaMislistas extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_informacion_lista")
	private Element container_informacion_lista;
	@Id("container_imagen")
	private Element container_imagen;
	@Id("img")
	private Image img;
	@Id("container_informacion")
	private Element container_informacion;
	@Id("container_nombre_lista")
	private Element container_nombre_lista;
	@Id("tf_nombre_lista")
	private TextField tf_nombre_lista;
	@Id("container_creada_por")
	private Element container_creada_por;
	@Id("texto_creada_por")
	private Label texto_creada_por;
	@Id("container_num_listas")
	private Element container_num_listas;
	@Id("texto_num_listas")
	private Label texto_num_listas;
	@Id("container_canciones")
	private Element container_canciones;
	@Id("Container_botones_lista")
	private Element container_botones_lista;

	
	
	public Element getContainer_botones_lista() {
		return container_botones_lista;
	}


	public void setContainer_botones_lista(Element container_botones_lista) {
		this.container_botones_lista = container_botones_lista;
	}


	public Element getContainer_principal() {
		return container_principal;
	}


	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}


	public Element getContainer_informacion_lista() {
		return container_informacion_lista;
	}


	public void setContainer_informacion_lista(Element container_informacion_lista) {
		this.container_informacion_lista = container_informacion_lista;
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


	public Element getContainer_informacion() {
		return container_informacion;
	}


	public void setContainer_informacion(Element container_informacion) {
		this.container_informacion = container_informacion;
	}


	public Element getContainer_nombre_lista() {
		return container_nombre_lista;
	}


	public void setContainer_nombre_lista(Element container_nombre_lista) {
		this.container_nombre_lista = container_nombre_lista;
	}


	public TextField getTf_nombre_lista() {
		return tf_nombre_lista;
	}


	public void setTf_nombre_lista(TextField tf_nombre_lista) {
		this.tf_nombre_lista = tf_nombre_lista;
	}


	public Element getContainer_creada_por() {
		return container_creada_por;
	}


	public void setContainer_creada_por(Element container_creada_por) {
		this.container_creada_por = container_creada_por;
	}


	public Label getTexto_creada_por() {
		return texto_creada_por;
	}


	public void setTexto_creada_por(Label texto_creada_por) {
		this.texto_creada_por = texto_creada_por;
	}


	public Element getContainer_num_listas() {
		return container_num_listas;
	}


	public void setContainer_num_listas(Element container_num_listas) {
		this.container_num_listas = container_num_listas;
	}


	public Label getTexto_num_listas() {
		return texto_num_listas;
	}


	public void setTexto_num_listas(Label texto_num_listas) {
		this.texto_num_listas = texto_num_listas;
	}


	public Element getContainer_canciones() {
		return container_canciones;
	}


	public void setContainer_canciones(Element container_canciones) {
		this.container_canciones = container_canciones;
	}


	/**
     * Creates a new VistaMislistas.
     */
    public VistaMislistas() {
        // You can initialise any data required for the connected UI components here.
    }

}
