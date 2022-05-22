package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.Scroller;

/**
 * A Designer generated component for the vista-anadirartista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-anadirartista")
@JsModule("./vista-anadirartista.ts")
public class VistaAnadirartista extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_principal_2")
	private Element container_principal_2;
	@Id("container_titulo")
	private Element container_titulo;
	@Id("container_label_anadir_artista")
	private Element container_label_anadir_artista;
	@Id("label_anadir_artista")
	private Label label_anadir_artista;
	@Id("container_contenido")
	private Element container_contenido;
	@Id("container_contenido_con_fondo")
	private Element container_contenido_con_fondo;
	@Id("container_contenido_ajustado")
	private Element container_contenido_ajustado;
	@Id("container_buscador_artista")
	private Element container_buscador_artista;
	@Id("tf_nombre_artista")
	private TextField tf_nombre_artista;
	@Id("tf_nombre_completo")
	private TextField tf_nombre_completo;
	@Id("tf_email")
	private TextField tf_email;
	@Id("pf_contrasena")
	private PasswordField pf_contrasena;
	@Id("pf_repetir_contrasena")
	private PasswordField pf_repetir_contrasena;
	@Id("container_estilos_de_musica")
	private Element container_estilos_de_musica;
	@Id("label_estilos_de_musica")
	private Label label_estilos_de_musica;
	@Id("container_estilos_de_musica1")
	private Element container_estilos_de_musica1;
	@Id("container_linea_estilos_de_musica")
	private HorizontalLayout container_linea_estilos_de_musica;
	@Id("cb_estilos_de_musica")
	private ComboBox<String> cb_estilos_de_musica;
	@Id("boton_eliminar_estilos_de_musica")
	private Button boton_eliminar_estilos_de_musica;
	@Id("boton_anadir_estilos_de_musica")
	private Button boton_anadir_estilos_de_musica;
	@Id("container_foto_de_perfil")
	private HorizontalLayout container_foto_de_perfil;
	@Id("label_foto_de_perfil")
	private Label label_foto_de_perfil;
	@Id("container_img")
	private Element container_img;
	@Id("boton_buscar_en_archivos")
	private Button boton_buscar_en_archivos;
	@Id("img")
	private Image img;
	@Id("container_botones_finales")
	private HorizontalLayout container_botones_finales;
	@Id("boton_cancelar")
	private Button boton_cancelar;
	@Id("boton_dar_de_alta")
	private Button boton_dar_de_alta;
	@Id("scroller")
	private Scroller scroller;

	
	public Scroller getScroller() {
		return scroller;
	}

	public void setScroller(Scroller scroller) {
		this.scroller = scroller;
	}

	public Element getContainer_principal() {
		return container_principal;
	}

	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}

	public Element getContainer_principal_2() {
		return container_principal_2;
	}

	public void setContainer_principal_2(Element container_principal_2) {
		this.container_principal_2 = container_principal_2;
	}

	public Element getContainer_titulo() {
		return container_titulo;
	}

	public void setContainer_titulo(Element container_titulo) {
		this.container_titulo = container_titulo;
	}

	public Element getContainer_label_anadir_artista() {
		return container_label_anadir_artista;
	}

	public void setContainer_label_anadir_artista(Element container_label_anadir_artista) {
		this.container_label_anadir_artista = container_label_anadir_artista;
	}

	public Label getLabel_anadir_artista() {
		return label_anadir_artista;
	}

	public void setLabel_anadir_artista(Label label_anadir_artista) {
		this.label_anadir_artista = label_anadir_artista;
	}

	public Element getContainer_contenido() {
		return container_contenido;
	}

	public void setContainer_contenido(Element container_contenido) {
		this.container_contenido = container_contenido;
	}

	public Element getContainer_contenido_con_fondo() {
		return container_contenido_con_fondo;
	}

	public void setContainer_contenido_con_fondo(Element container_contenido_con_fondo) {
		this.container_contenido_con_fondo = container_contenido_con_fondo;
	}

	public Element getContainer_contenido_ajustado() {
		return container_contenido_ajustado;
	}

	public void setContainer_contenido_ajustado(Element container_contenido_ajustado) {
		this.container_contenido_ajustado = container_contenido_ajustado;
	}

	public Element getContainer_buscador_artista() {
		return container_buscador_artista;
	}

	public void setContainer_buscador_artista(Element container_buscador_artista) {
		this.container_buscador_artista = container_buscador_artista;
	}

	public TextField getTf_nombre_artista() {
		return tf_nombre_artista;
	}

	public void setTf_nombre_artista(TextField tf_nombre_artista) {
		this.tf_nombre_artista = tf_nombre_artista;
	}

	public TextField getTf_nombre_completo() {
		return tf_nombre_completo;
	}

	public void setTf_nombre_completo(TextField tf_nombre_completo) {
		this.tf_nombre_completo = tf_nombre_completo;
	}

	public TextField getTf_email() {
		return tf_email;
	}

	public void setTf_email(TextField tf_email) {
		this.tf_email = tf_email;
	}

	public PasswordField getPf_contrasena() {
		return pf_contrasena;
	}

	public void setPf_contrasena(PasswordField pf_contrasena) {
		this.pf_contrasena = pf_contrasena;
	}

	public PasswordField getPf_repetir_contrasena() {
		return pf_repetir_contrasena;
	}

	public void setPf_repetir_contrasena(PasswordField pf_repetir_contrasena) {
		this.pf_repetir_contrasena = pf_repetir_contrasena;
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

	public Element getContainer_estilos_de_musica1() {
		return container_estilos_de_musica1;
	}

	public void setContainer_estilos_de_musica1(Element container_estilos_de_musica1) {
		this.container_estilos_de_musica1 = container_estilos_de_musica1;
	}

	public HorizontalLayout getContainer_linea_estilos_de_musica() {
		return container_linea_estilos_de_musica;
	}

	public void setContainer_linea_estilos_de_musica(HorizontalLayout container_linea_estilos_de_musica) {
		this.container_linea_estilos_de_musica = container_linea_estilos_de_musica;
	}

	public ComboBox<String> getCb_estilos_de_musica() {
		return cb_estilos_de_musica;
	}

	public void setCb_estilos_de_musica(ComboBox<String> cb_estilos_de_musica) {
		this.cb_estilos_de_musica = cb_estilos_de_musica;
	}

	public Button getBoton_eliminar_estilos_de_musica() {
		return boton_eliminar_estilos_de_musica;
	}

	public void setBoton_eliminar_estilos_de_musica(Button boton_eliminar_estilos_de_musica) {
		this.boton_eliminar_estilos_de_musica = boton_eliminar_estilos_de_musica;
	}

	public Button getBoton_anadir_estilos_de_musica() {
		return boton_anadir_estilos_de_musica;
	}

	public void setBoton_anadir_estilos_de_musica(Button boton_anadir_estilos_de_musica) {
		this.boton_anadir_estilos_de_musica = boton_anadir_estilos_de_musica;
	}

	public HorizontalLayout getContainer_foto_de_perfil() {
		return container_foto_de_perfil;
	}

	public void setContainer_foto_de_perfil(HorizontalLayout container_foto_de_perfil) {
		this.container_foto_de_perfil = container_foto_de_perfil;
	}

	public Label getLabel_foto_de_perfil() {
		return label_foto_de_perfil;
	}

	public void setLabel_foto_de_perfil(Label label_foto_de_perfil) {
		this.label_foto_de_perfil = label_foto_de_perfil;
	}

	public Element getContainer_img() {
		return container_img;
	}

	public void setContainer_img(Element container_img) {
		this.container_img = container_img;
	}

	public Button getBoton_buscar_en_archivos() {
		return boton_buscar_en_archivos;
	}

	public void setBoton_buscar_en_archivos(Button boton_buscar_en_archivos) {
		this.boton_buscar_en_archivos = boton_buscar_en_archivos;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
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

	public Button getBoton_dar_de_alta() {
		return boton_dar_de_alta;
	}

	public void setBoton_dar_de_alta(Button boton_dar_de_alta) {
		this.boton_dar_de_alta = boton_dar_de_alta;
	}

	/**
     * Creates a new VistaAnadirartista.
     */
    public VistaAnadirartista() {
        // You can initialise any data required for the connected UI components here.
    }

}
