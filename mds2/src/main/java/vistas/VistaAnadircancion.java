package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;

/**
 * A Designer generated component for the vista-anadircancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-anadircancion")
@JsModule("./vista-anadircancion.ts")
public class VistaAnadircancion extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_titulo")
	private Element container_titulo;
	@Id("container_label_anadir_cancion")
	private Element container_label_anadir_cancion;
	@Id("label_anadir_cancion")
	private Label label_anadir_cancion;
	@Id("container_contenido")
	private Element container_contenido;
	@Id("container_contenido_ajustado")
	private Element container_contenido_ajustado;
	@Id("container_buscador_cancion")
	private Element container_buscador_cancion;
	@Id("tf_titulo")
	private TextField tf_titulo;
	@Id("container_interprete")
	private Element container_interprete;
	@Id("label_interprete")
	private Label label_interprete;
	@Id("container_linea_interpretes")
	private Element container_linea_interpretes;
	@Id("container_linea_interprete")
	private HorizontalLayout container_linea_interprete;
	@Id("boton_eliminar_interprete")
	private Button boton_eliminar_interprete;
	@Id("tf_interprete")
	private TextField tf_interprete;
	@Id("boton_anadir_interprete")
	private Button boton_anadir_interprete;
	@Id("container_compositor")
	private Element container_compositor;
	@Id("label_compositor")
	private Label label_compositor;
	@Id("container_linea_compositores")
	private Element container_linea_compositores;
	@Id("container_linea_compositor")
	private HorizontalLayout container_linea_compositor;
	@Id("tf_compositor")
	private TextField tf_compositor;
	@Id("boton_eliminar_compositor")
	private Button boton_eliminar_compositor;
	@Id("boton_anadir_compositor")
	private Button boton_anadir_compositor;
	@Id("container_productor")
	private Element container_productor;
	@Id("label_productor")
	private Label label_productor;
	@Id("container_linea_productores")
	private Element container_linea_productores;
	@Id("container_linea_productor")
	private HorizontalLayout container_linea_productor;
	@Id("tf_productor")
	private TextField tf_productor;
	@Id("boton_eliminar_productor")
	private Button boton_eliminar_productor;
	@Id("boton_anadir_productor")
	private Button boton_anadir_productor;
	@Id("container_estilos_de_musica")
	private Element container_estilos_de_musica;
	@Id("label_estilos_de_musica")
	private Label label_estilos_de_musica;
	@Id("container_linea_estilos_de_musica")
	private Element container_linea_estilos_de_musica;
	@Id("container_linea_estilo_de_musica")
	private HorizontalLayout container_linea_estilo_de_musica;
	@Id("cb_estilos_de_musica")
	private ComboBox<String> cb_estilos_de_musica;
	@Id("boton_eliminar_estilo_de_musica")
	private Button boton_eliminar_estilo_de_musica;
	@Id("boton_anadir_estilo_de_musica")
	private Button boton_anadir_estilo_de_musica;
	@Id("container_fichero_multimedia")
	private HorizontalLayout container_fichero_multimedia;
	@Id("label_fichero_multimedia")
	private Label label_fichero_multimedia;
	@Id("tf_fichero_multimedia")
	private TextField tf_fichero_multimedia;
	@Id("boton_buscar_archivos")
	private Button boton_buscar_archivos;
	@Id("container_botones_finales")
	private HorizontalLayout container_botones_finales;
	@Id("boton_cancelar")
	private Button boton_cancelar;
	@Id("boton_anadir")
	private Button boton_anadir;
	
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

	public Element getContainer_label_anadir_cancion() {
		return container_label_anadir_cancion;
	}

	public void setContainer_label_anadir_cancion(Element container_label_anadir_cancion) {
		this.container_label_anadir_cancion = container_label_anadir_cancion;
	}

	public Label getLabel_anadir_cancion() {
		return label_anadir_cancion;
	}

	public void setLabel_anadir_cancion(Label label_anadir_cancion) {
		this.label_anadir_cancion = label_anadir_cancion;
	}

	public Element getContainer_contenido() {
		return container_contenido;
	}

	public void setContainer_contenido(Element container_contenido) {
		this.container_contenido = container_contenido;
	}

	public Element getContainer_contenido_ajustado() {
		return container_contenido_ajustado;
	}

	public void setContainer_contenido_ajustado(Element container_contenido_ajustado) {
		this.container_contenido_ajustado = container_contenido_ajustado;
	}

	public Element getContainer_buscador_cancion() {
		return container_buscador_cancion;
	}

	public void setContainer_buscador_cancion(Element container_buscador_cancion) {
		this.container_buscador_cancion = container_buscador_cancion;
	}

	public TextField getTf_titulo() {
		return tf_titulo;
	}

	public void setTf_titulo(TextField tf_titulo) {
		this.tf_titulo = tf_titulo;
	}

	public Element getContainer_interprete() {
		return container_interprete;
	}

	public void setContainer_interprete(Element container_interprete) {
		this.container_interprete = container_interprete;
	}

	public Label getLabel_interprete() {
		return label_interprete;
	}

	public void setLabel_interprete(Label label_interprete) {
		this.label_interprete = label_interprete;
	}

	public Element getContainer_linea_interpretes() {
		return container_linea_interpretes;
	}

	public void setContainer_linea_interpretes(Element container_linea_interpretes) {
		this.container_linea_interpretes = container_linea_interpretes;
	}

	public HorizontalLayout getContainer_linea_interprete() {
		return container_linea_interprete;
	}

	public void setContainer_linea_interprete(HorizontalLayout container_linea_interprete) {
		this.container_linea_interprete = container_linea_interprete;
	}

	public Button getBoton_eliminar_interprete() {
		return boton_eliminar_interprete;
	}

	public void setBoton_eliminar_interprete(Button boton_eliminar_interprete) {
		this.boton_eliminar_interprete = boton_eliminar_interprete;
	}

	public TextField getTf_interprete() {
		return tf_interprete;
	}

	public void setTf_interprete(TextField tf_interprete) {
		this.tf_interprete = tf_interprete;
	}

	public Button getBoton_anadir_interprete() {
		return boton_anadir_interprete;
	}

	public void setBoton_anadir_interprete(Button boton_anadir_interprete) {
		this.boton_anadir_interprete = boton_anadir_interprete;
	}

	public Element getContainer_compositor() {
		return container_compositor;
	}

	public void setContainer_compositor(Element container_compositor) {
		this.container_compositor = container_compositor;
	}

	public Label getLabel_compositor() {
		return label_compositor;
	}

	public void setLabel_compositor(Label label_compositor) {
		this.label_compositor = label_compositor;
	}

	public Element getContainer_linea_compositores() {
		return container_linea_compositores;
	}

	public void setContainer_linea_compositores(Element container_linea_compositores) {
		this.container_linea_compositores = container_linea_compositores;
	}

	public HorizontalLayout getContainer_linea_compositor() {
		return container_linea_compositor;
	}

	public void setContainer_linea_compositor(HorizontalLayout container_linea_compositor) {
		this.container_linea_compositor = container_linea_compositor;
	}

	public TextField getTf_compositor() {
		return tf_compositor;
	}

	public void setTf_compositor(TextField tf_compositor) {
		this.tf_compositor = tf_compositor;
	}

	public Button getBoton_eliminar_compositor() {
		return boton_eliminar_compositor;
	}

	public void setBoton_eliminar_compositor(Button boton_eliminar_compositor) {
		this.boton_eliminar_compositor = boton_eliminar_compositor;
	}

	public Button getBoton_anadir_compositor() {
		return boton_anadir_compositor;
	}

	public void setBoton_anadir_compositor(Button boton_anadir_compositor) {
		this.boton_anadir_compositor = boton_anadir_compositor;
	}

	public Element getContainer_productor() {
		return container_productor;
	}

	public void setContainer_productor(Element container_productor) {
		this.container_productor = container_productor;
	}

	public Label getLabel_productor() {
		return label_productor;
	}

	public void setLabel_productor(Label label_productor) {
		this.label_productor = label_productor;
	}

	public Element getContainer_linea_productores() {
		return container_linea_productores;
	}

	public void setContainer_linea_productores(Element container_linea_productores) {
		this.container_linea_productores = container_linea_productores;
	}

	public HorizontalLayout getContainer_linea_productor() {
		return container_linea_productor;
	}

	public void setContainer_linea_productor(HorizontalLayout container_linea_productor) {
		this.container_linea_productor = container_linea_productor;
	}

	public TextField getTf_productor() {
		return tf_productor;
	}

	public void setTf_productor(TextField tf_productor) {
		this.tf_productor = tf_productor;
	}

	public Button getBoton_eliminar_productor() {
		return boton_eliminar_productor;
	}

	public void setBoton_eliminar_productor(Button boton_eliminar_productor) {
		this.boton_eliminar_productor = boton_eliminar_productor;
	}

	public Button getBoton_anadir_productor() {
		return boton_anadir_productor;
	}

	public void setBoton_anadir_productor(Button boton_anadir_productor) {
		this.boton_anadir_productor = boton_anadir_productor;
	}

	public Element getContainer_estilos_de_musica() {
		return container_estilos_de_musica;
	}

	public void setContainer_estilos_de_musica(Element container_estilos_de_musica) {
		this.container_estilos_de_musica = container_estilos_de_musica;
	}

	public Label getLabel_estilos_de_musica() {
		return label_estilos_de_musica;
	}

	public void setLabel_estilos_de_musica(Label label_estilos_de_musica) {
		this.label_estilos_de_musica = label_estilos_de_musica;
	}

	public Element getContainer_linea_estilos_de_musica() {
		return container_linea_estilos_de_musica;
	}

	public void setContainer_linea_estilos_de_musica(Element container_linea_estilos_de_musica) {
		this.container_linea_estilos_de_musica = container_linea_estilos_de_musica;
	}

	public HorizontalLayout getContainer_linea_estilo_de_musica() {
		return container_linea_estilo_de_musica;
	}

	public void setContainer_linea_estilo_de_musica(HorizontalLayout container_linea_estilo_de_musica) {
		this.container_linea_estilo_de_musica = container_linea_estilo_de_musica;
	}

	public ComboBox<String> getCb_estilos_de_musica() {
		return cb_estilos_de_musica;
	}

	public void setCb_estilos_de_musica(ComboBox<String> cb_estilos_de_musica) {
		this.cb_estilos_de_musica = cb_estilos_de_musica;
	}

	public Button getBoton_eliminar_estilo_de_musica() {
		return boton_eliminar_estilo_de_musica;
	}

	public void setBoton_eliminar_estilo_de_musica(Button boton_eliminar_estilo_de_musica) {
		this.boton_eliminar_estilo_de_musica = boton_eliminar_estilo_de_musica;
	}

	public Button getBoton_anadir_estilo_de_musica() {
		return boton_anadir_estilo_de_musica;
	}

	public void setBoton_anadir_estilo_de_musica(Button boton_anadir_estilo_de_musica) {
		this.boton_anadir_estilo_de_musica = boton_anadir_estilo_de_musica;
	}

	public HorizontalLayout getContainer_fichero_multimedia() {
		return container_fichero_multimedia;
	}

	public void setContainer_fichero_multimedia(HorizontalLayout container_fichero_multimedia) {
		this.container_fichero_multimedia = container_fichero_multimedia;
	}

	public Label getLabel_fichero_multimedia() {
		return label_fichero_multimedia;
	}

	public void setLabel_fichero_multimedia(Label label_fichero_multimedia) {
		this.label_fichero_multimedia = label_fichero_multimedia;
	}

	public TextField getTf_fichero_multimedia() {
		return tf_fichero_multimedia;
	}

	public void setTf_fichero_multimedia(TextField tf_fichero_multimedia) {
		this.tf_fichero_multimedia = tf_fichero_multimedia;
	}

	public Button getBoton_buscar_archivos() {
		return boton_buscar_archivos;
	}

	public void setBoton_buscar_archivos(Button boton_buscar_archivos) {
		this.boton_buscar_archivos = boton_buscar_archivos;
	}

	public HorizontalLayout getContainer_botones_finales() {
		return container_botones_finales;
	}

	public void setContainer_botones_finales(HorizontalLayout container_botones_finales) {
		this.container_botones_finales = container_botones_finales;
	}

	public Button getBoton_cancelar() {
		return boton_cancelar;
	}

	public void setBoton_cancelar(Button boton_cancelar) {
		this.boton_cancelar = boton_cancelar;
	}

	public Button getBoton_anadir() {
		return boton_anadir;
	}

	public void setBoton_anadir(Button boton_anadir) {
		this.boton_anadir = boton_anadir;
	}

	/**
     * Creates a new VistaAnadircancion.
     */
    public VistaAnadircancion() {
        // You can initialise any data required for the connected UI components here.
    }

}
