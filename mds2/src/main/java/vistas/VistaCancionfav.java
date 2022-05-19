package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cancionfav template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancionfav")
@JsModule("./vista-cancionfav.ts")
public class VistaCancionfav extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("conainer_num_cancion")
	private Element conainer_num_cancion;
	@Id("label_num_cancion")
	private Label label_num_cancion;
	@Id("container_cancion")
	private Element container_cancion;
	@Id("container_img")
	private Element container_img;
	@Id("img")
	private Image img;
	@Id("label_nombre_nom_cancion")
	private Label label_nombre_nom_cancion;
	@Id("label nom_artistas")
	private Label labelNom_artistas;
	@Id("container_nombres")
	private Element container_nombres;
	@Id("container_informacion")
	private Element container_informacion;
	@Id("container_nom_album")
	private Element container_nom_album;
	@Id("label_nom_album")
	private Label label_nom_album;
	@Id("container_fecha")
	private Element container_fecha;
	@Id("laber_fecha")
	private Label laber_fecha;
	@Id("container_tiempo")
	private Element container_tiempo;
	@Id("container_botones")
	private Element container_botones;
	@Id("container_anadir_fav")
	private Element container_anadir_fav;
	@Id("label_tiempo")
	private Label label_tiempo;
	@Id("boton anadir_fav")
	private Button botonAnadir_fav;
	@Id("container_reproducir")
	private Element container_reproducir;
	@Id("boton_reproducir")
	private Button boton_reproducir;

	
	
	public Element getContainer_principal() {
		return container_principal;
	}



	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}



	public Element getConainer_num_cancion() {
		return conainer_num_cancion;
	}



	public void setConainer_num_cancion(Element conainer_num_cancion) {
		this.conainer_num_cancion = conainer_num_cancion;
	}



	public Label getLabel_num_cancion() {
		return label_num_cancion;
	}



	public void setLabel_num_cancion(Label label_num_cancion) {
		this.label_num_cancion = label_num_cancion;
	}



	public Element getContainer_cancion() {
		return container_cancion;
	}



	public void setContainer_cancion(Element container_cancion) {
		this.container_cancion = container_cancion;
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



	public Label getLabel_nombre_nom_cancion() {
		return label_nombre_nom_cancion;
	}



	public void setLabel_nombre_nom_cancion(Label label_nombre_nom_cancion) {
		this.label_nombre_nom_cancion = label_nombre_nom_cancion;
	}



	public Label getLabelNom_artistas() {
		return labelNom_artistas;
	}



	public void setLabelNom_artistas(Label labelNom_artistas) {
		this.labelNom_artistas = labelNom_artistas;
	}



	public Element getContainer_nombres() {
		return container_nombres;
	}



	public void setContainer_nombres(Element container_nombres) {
		this.container_nombres = container_nombres;
	}



	public Element getContainer_informacion() {
		return container_informacion;
	}



	public void setContainer_informacion(Element container_informacion) {
		this.container_informacion = container_informacion;
	}



	public Element getContainer_nom_album() {
		return container_nom_album;
	}



	public void setContainer_nom_album(Element container_nom_album) {
		this.container_nom_album = container_nom_album;
	}



	public Label getLabel_nom_album() {
		return label_nom_album;
	}



	public void setLabel_nom_album(Label label_nom_album) {
		this.label_nom_album = label_nom_album;
	}



	public Element getContainer_fecha() {
		return container_fecha;
	}



	public void setContainer_fecha(Element container_fecha) {
		this.container_fecha = container_fecha;
	}



	public Label getLaber_fecha() {
		return laber_fecha;
	}



	public void setLaber_fecha(Label laber_fecha) {
		this.laber_fecha = laber_fecha;
	}



	public Element getContainer_tiempo() {
		return container_tiempo;
	}



	public void setContainer_tiempo(Element container_tiempo) {
		this.container_tiempo = container_tiempo;
	}



	public Element getContainer_botones() {
		return container_botones;
	}



	public void setContainer_botones(Element container_botones) {
		this.container_botones = container_botones;
	}



	public Element getContainer_anadir_fav() {
		return container_anadir_fav;
	}



	public void setContainer_anadir_fav(Element container_anadir_fav) {
		this.container_anadir_fav = container_anadir_fav;
	}



	public Label getLabel_tiempo() {
		return label_tiempo;
	}



	public void setLabel_tiempo(Label label_tiempo) {
		this.label_tiempo = label_tiempo;
	}



	public Button getBotonAnadir_fav() {
		return botonAnadir_fav;
	}



	public void setBotonAnadir_fav(Button botonAnadir_fav) {
		this.botonAnadir_fav = botonAnadir_fav;
	}



	public Element getContainer_reproducir() {
		return container_reproducir;
	}



	public void setContainer_reproducir(Element container_reproducir) {
		this.container_reproducir = container_reproducir;
	}



	public Button getBoton_reproducir() {
		return boton_reproducir;
	}



	public void setBoton_reproducir(Button boton_reproducir) {
		this.boton_reproducir = boton_reproducir;
	}



	/**
     * Creates a new VistaCancionfav.
     */
    public VistaCancionfav() {
        // You can initialise any data required for the connected UI components here.
    }

}
