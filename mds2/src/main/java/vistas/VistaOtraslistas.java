package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-otraslistas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-otraslistas")
@JsModule("./vista-otraslistas.ts")
public class VistaOtraslistas extends LitTemplate {

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
	@Id("titulo_creada_por")
	private Label titulo_creada_por;
	@Id("container_num_lista")
	private Element container_num_lista;
	@Id("titulo_num_lista")
	private Label titulo_num_lista;
	@Id("container_canciones_listas")
	private Element container_canciones_listas;
	@Id("boton_creador_lista")
	private Button boton_creador_lista;
	@Id("container_botones_lista")
	private Element container_botones_lista;
	@Id("container_boton_añadir_a_mislistas")
	private Element container_boton_añadir_a_mislistas;
	@Id("container_boton_compartir")
	private Element container_boton_compartir;
	@Id("boton_compartir")
	private Button boton_compartir;
	@Id("Container_Boton_Reproducir")
	private Element container_Boton_Reproducir;
	@Id("Boton_Reproducri")
	private Button boton_Reproducri;
	
	
	
	public Element getContainer_Boton_Reproducir() {
		return container_Boton_Reproducir;
	}



	public void setContainer_Boton_Reproducir(Element container_Boton_Reproducir) {
		this.container_Boton_Reproducir = container_Boton_Reproducir;
	}



	public Button getBoton_Reproducri() {
		return boton_Reproducri;
	}



	public void setBoton_Reproducri(Button boton_Reproducri) {
		this.boton_Reproducri = boton_Reproducri;
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



	public Label getTitulo_creada_por() {
		return titulo_creada_por;
	}



	public void setTitulo_creada_por(Label titulo_creada_por) {
		this.titulo_creada_por = titulo_creada_por;
	}



	public Element getContainer_num_lista() {
		return container_num_lista;
	}



	public void setContainer_num_lista(Element container_num_lista) {
		this.container_num_lista = container_num_lista;
	}



	public Label getTitulo_num_lista() {
		return titulo_num_lista;
	}



	public void setTitulo_num_lista(Label titulo_num_lista) {
		this.titulo_num_lista = titulo_num_lista;
	}



	public Element getContainer_canciones_listas() {
		return container_canciones_listas;
	}



	public void setContainer_canciones_listas(Element container_canciones_listas) {
		this.container_canciones_listas = container_canciones_listas;
	}



	public Button getBoton_creador_lista() {
		return boton_creador_lista;
	}



	public void setBoton_creador_lista(Button boton_creador_lista) {
		this.boton_creador_lista = boton_creador_lista;
	}



	public Element getContainer_botones_lista() {
		return container_botones_lista;
	}



	public void setContainer_botones_lista(Element container_botones_lista) {
		this.container_botones_lista = container_botones_lista;
	}



	public Element getContainer_boton_añadir_a_mislistas() {
		return container_boton_añadir_a_mislistas;
	}



	public void setContainer_boton_añadir_a_mislistas(Element container_boton_añadir_a_mislistas) {
		this.container_boton_añadir_a_mislistas = container_boton_añadir_a_mislistas;
	}



	public Element getContainer_boton_compartir() {
		return container_boton_compartir;
	}



	public void setContainer_boton_compartir(Element container_boton_compartir) {
		this.container_boton_compartir = container_boton_compartir;
	}

	

	public Button getBoton_compartir() {
		return boton_compartir;
	}



	public void setBoton_compartir(Button boton_compartir) {
		this.boton_compartir = boton_compartir;
	}



	/**
     * Creates a new VistaOtraslistas.
     */
    public VistaOtraslistas() {
        // You can initialise any data required for the connected UI components here.
    }

}
