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
 * A Designer generated component for the vista-crearunalista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-crearunalista")
@JsModule("./vista-crearunalista.ts")
public class VistaCrearunalista extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_cabecera")
	private Element container_cabecera;
	@Id("container_img")
	private Element container_img;
	@Id("img")
	private Image img;
	@Id("container_informacion_lista")
	private Element container_informacion_lista;
	@Id("container_nombre_lista")
	private Element container_nombre_lista;
	@Id("tf_lista")
	private TextField tf_lista;
	@Id("container_creada_por")
	private Element container_creada_por;
	@Id("label_creada_por")
	private Label label_creada_por;
	@Id("container_lista_numero")
	private Element container_lista_numero;
	@Id("label_lista_numero")
	private Label label_lista_numero;
	@Id("container_boton_editar_lista")
	private Element container_boton_editar_lista;
	@Id("boton_editar_lista")
	private Button boton_editar_lista;
	@Id("container_contenido")
	private Element container_contenido;
	@Id("container_buscador")
	private Element container_buscador;
	@Id("container_label_busca_algo_para_tu_lista")
	private Element container_label_busca_algo_para_tu_lista;
	@Id("label_busca_algo_para_tu_lista")
	private Label label_busca_algo_para_tu_lista;
	@Id("container_buscador_y_boton")
	private Element container_buscador_y_boton;
	@Id("tf_buscador")
	private TextField tf_buscador;
	@Id("boton_buscador")
	private Button boton_buscador;
	@Id("img_lupa")
	private Image img_lupa;
	@Id("container_canciones")
	private Element container_canciones;

	
	
	public Element getContainer_canciones() {
		return container_canciones;
	}

	public void setContainer_canciones(Element container_canciones) {
		this.container_canciones = container_canciones;
	}

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

	public Element getContainer_informacion_lista() {
		return container_informacion_lista;
	}

	public void setContainer_informacion_lista(Element container_informacion_lista) {
		this.container_informacion_lista = container_informacion_lista;
	}

	public Element getContainer_nombre_lista() {
		return container_nombre_lista;
	}

	public void setContainer_nombre_lista(Element container_nombre_lista) {
		this.container_nombre_lista = container_nombre_lista;
	}

	public TextField getTf_lista() {
		return tf_lista;
	}

	public void setTf_lista(TextField tf_lista) {
		this.tf_lista = tf_lista;
	}

	public Element getContainer_creada_por() {
		return container_creada_por;
	}

	public void setContainer_creada_por(Element container_creada_por) {
		this.container_creada_por = container_creada_por;
	}

	public Label getLabel_creada_por() {
		return label_creada_por;
	}

	public void setLabel_creada_por(Label label_creada_por) {
		this.label_creada_por = label_creada_por;
	}

	public Element getContainer_lista_numero() {
		return container_lista_numero;
	}

	public void setContainer_lista_numero(Element container_lista_numero) {
		this.container_lista_numero = container_lista_numero;
	}

	public Label getLabel_lista_numero() {
		return label_lista_numero;
	}

	public void setLabel_lista_numero(Label label_lista_numero) {
		this.label_lista_numero = label_lista_numero;
	}

	public Element getContainer_boton_editar_lista() {
		return container_boton_editar_lista;
	}

	public void setContainer_boton_editar_lista(Element container_boton_editar_lista) {
		this.container_boton_editar_lista = container_boton_editar_lista;
	}

	public Button getBoton_editar_lista() {
		return boton_editar_lista;
	}

	public void setBoton_editar_lista(Button boton_editar_lista) {
		this.boton_editar_lista = boton_editar_lista;
	}

	public Element getContainer_contenido() {
		return container_contenido;
	}

	public void setContainer_contenido(Element container_contenido) {
		this.container_contenido = container_contenido;
	}

	public Element getContainer_buscador() {
		return container_buscador;
	}

	public void setContainer_buscador(Element container_buscador) {
		this.container_buscador = container_buscador;
	}

	public Element getContainer_label_busca_algo_para_tu_lista() {
		return container_label_busca_algo_para_tu_lista;
	}

	public void setContainer_label_busca_algo_para_tu_lista(Element container_label_busca_algo_para_tu_lista) {
		this.container_label_busca_algo_para_tu_lista = container_label_busca_algo_para_tu_lista;
	}

	public Label getLabel_busca_algo_para_tu_lista() {
		return label_busca_algo_para_tu_lista;
	}

	public void setLabel_busca_algo_para_tu_lista(Label label_busca_algo_para_tu_lista) {
		this.label_busca_algo_para_tu_lista = label_busca_algo_para_tu_lista;
	}

	public Element getContainer_buscador_y_boton() {
		return container_buscador_y_boton;
	}

	public void setContainer_buscador_y_boton(Element container_buscador_y_boton) {
		this.container_buscador_y_boton = container_buscador_y_boton;
	}

	public TextField getTf_buscador() {
		return tf_buscador;
	}

	public void setTf_buscador(TextField tf_buscador) {
		this.tf_buscador = tf_buscador;
	}

	public Button getBoton_buscador() {
		return boton_buscador;
	}

	public void setBoton_buscador(Button boton_buscador) {
		this.boton_buscador = boton_buscador;
	}

	public Image getImg_lupa() {
		return img_lupa;
	}

	public void setImg_lupa(Image img_lupa) {
		this.img_lupa = img_lupa;
	}

	/**
     * Creates a new VistaCrearunalista.
     */
    public VistaCrearunalista() {
        // You can initialise any data required for the connected UI components here.
    }

}
