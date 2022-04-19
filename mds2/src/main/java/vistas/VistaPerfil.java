package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-perfil")
@JsModule("./vista-perfil.ts")
public class VistaPerfil extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_cabecera")
	private Element container_cabecera;
	@Id("container_informacion_usuario")
	private Element container_informacion_usuario;
	@Id("container_imagen")
	private Element container_imagen;
	@Id("img")
	private Image img;
	@Id("container_informacion")
	private Element container_informacion;
	@Id("container_nombre_usuario")
	private Element container_nombre_usuario;
	@Id("titulo_nombre_usuario")
	private Label titulo_nombre_usuario;
	@Id("container_estilos")
	private Element container_estilos;
	@Id("titulo_estilos")
	private Label titulo_estilos;
	@Id("testo_estilos")
	private Label testo_estilos;
	@Id("container_seguidores")
	private Element container_seguidores;
	@Id("titulo_seguidores")
	private Label titulo_seguidores;
	@Id("texto_num_seguidores")
	private Label texto_num_seguidores;
	@Id("container_seguidos")
	private Element container_seguidos;
	@Id("titulo_seguidos")
	private Label titulo_seguidos;
	@Id("texto_num_seguidos")
	private Label texto_num_seguidos;
	@Id("container_botones_vistas")
	private Element container_botones_vistas;
	@Id("container_vista_artista")
	private Element container_vista_artista;
	@Id("boton_vista_artista")
	private Button boton_vista_artista;
	@Id("container_vista_usuario")
	private Element container_vista_usuario;
	@Id("boton_vista_usuario")
	private Button boton_vista_usuario;
	@Id("container_estadisticas")
	private Element container_estadisticas;
	@Id("container_otra_informacion")
	private Element container_otra_informacion;

	
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


	public Element getContainer_informacion_usuario() {
		return container_informacion_usuario;
	}


	public void setContainer_informacion_usuario(Element container_informacion_usuario) {
		this.container_informacion_usuario = container_informacion_usuario;
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


	public Element getContainer_nombre_usuario() {
		return container_nombre_usuario;
	}


	public void setContainer_nombre_usuario(Element container_nombre_usuario) {
		this.container_nombre_usuario = container_nombre_usuario;
	}


	public Label getTitulo_nombre_usuario() {
		return titulo_nombre_usuario;
	}


	public void setTitulo_nombre_usuario(Label titulo_nombre_usuario) {
		this.titulo_nombre_usuario = titulo_nombre_usuario;
	}


	public Element getContainer_estilos() {
		return container_estilos;
	}


	public void setContainer_estilos(Element container_estilos) {
		this.container_estilos = container_estilos;
	}


	public Label getTitulo_estilos() {
		return titulo_estilos;
	}


	public void setTitulo_estilos(Label titulo_estilos) {
		this.titulo_estilos = titulo_estilos;
	}


	public Label getTesto_estilos() {
		return testo_estilos;
	}


	public void setTesto_estilos(Label testo_estilos) {
		this.testo_estilos = testo_estilos;
	}


	public Element getContainer_seguidores() {
		return container_seguidores;
	}


	public void setContainer_seguidores(Element container_seguidores) {
		this.container_seguidores = container_seguidores;
	}


	public Label getTitulo_seguidores() {
		return titulo_seguidores;
	}


	public void setTitulo_seguidores(Label titulo_seguidores) {
		this.titulo_seguidores = titulo_seguidores;
	}


	public Label getTexto_num_seguidores() {
		return texto_num_seguidores;
	}


	public void setTexto_num_seguidores(Label texto_num_seguidores) {
		this.texto_num_seguidores = texto_num_seguidores;
	}


	public Element getContainer_seguidos() {
		return container_seguidos;
	}


	public void setContainer_seguidos(Element container_seguidos) {
		this.container_seguidos = container_seguidos;
	}


	public Label getTitulo_seguidos() {
		return titulo_seguidos;
	}


	public void setTitulo_seguidos(Label titulo_seguidos) {
		this.titulo_seguidos = titulo_seguidos;
	}


	public Label getTexto_num_seguidos() {
		return texto_num_seguidos;
	}


	public void setTexto_num_seguidos(Label texto_num_seguidos) {
		this.texto_num_seguidos = texto_num_seguidos;
	}


	public Element getContainer_botones_vistas() {
		return container_botones_vistas;
	}


	public void setContainer_botones_vistas(Element container_botones_vistas) {
		this.container_botones_vistas = container_botones_vistas;
	}


	public Element getContainer_vista_artista() {
		return container_vista_artista;
	}


	public void setContainer_vista_artista(Element container_vista_artista) {
		this.container_vista_artista = container_vista_artista;
	}


	public Button getBoton_vista_artista() {
		return boton_vista_artista;
	}


	public void setBoton_vista_artista(Button boton_vista_artista) {
		this.boton_vista_artista = boton_vista_artista;
	}


	public Element getContainer_vista_usuario() {
		return container_vista_usuario;
	}


	public void setContainer_vista_usuario(Element container_vista_usuario) {
		this.container_vista_usuario = container_vista_usuario;
	}


	public Button getBoton_vista_usuario() {
		return boton_vista_usuario;
	}


	public void setBoton_vista_usuario(Button boton_vista_usuario) {
		this.boton_vista_usuario = boton_vista_usuario;
	}


	public Element getContainer_estadisticas() {
		return container_estadisticas;
	}


	public void setContainer_estadisticas(Element container_estadisticas) {
		this.container_estadisticas = container_estadisticas;
	}


	public Element getContainer_otra_informacion() {
		return container_otra_informacion;
	}


	public void setContainer_otra_informacion(Element container_otra_informacion) {
		this.container_otra_informacion = container_otra_informacion;
	}


	/**
     * Creates a new VistaPerfil.
     */
    public VistaPerfil() {
        // You can initialise any data required for the connected UI components here.
    }

}
