package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;

/**
 * A Designer generated component for the vista-cancionbusqueda template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancionbusqueda")
@JsModule("./vista-cancionbusqueda.ts")
public class VistaCancionbusqueda extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_cancion")
	private Element container_cancion;
	@Id("img")
	private Image img;
	@Id("container_nombres")
	private Element container_nombres;
	@Id("label_nom_cancion")
	private Label label_nom_cancion;
	@Id("label_nom_artista")
	private Label label_nom_artista;
	@Id("container tiempo")
	private Element containerTiempo;
	@Id("label_tiempo")
	private Label label_tiempo;
	@Id("container_botones")
	private Element container_botones;
	@Id("boton_reproducir")
	private Button boton_reproducir;
	@Id("boton_anadir_fav")
	private Button boton_anadir_fav;
	@Id("combobox_opc")
	private ComboBox<String> combobox_opc;
	public Element getContainer_principal() {
		return container_principal;
	}


	public Element getContainer_cancion() {
		return container_cancion;
	}





	public void setContainer_cancion(Element container_cancion) {
		this.container_cancion = container_cancion;
	}





	public Image getImg() {
		return img;
	}





	public void setImg(Image img) {
		this.img = img;
	}





	public Element getContainer_nombres() {
		return container_nombres;
	}





	public void setContainer_nombres(Element container_nombres) {
		this.container_nombres = container_nombres;
	}





	public Label getLabel_nom_cancion() {
		return label_nom_cancion;
	}





	public void setLabel_nom_cancion(Label label_nom_cancion) {
		this.label_nom_cancion = label_nom_cancion;
	}





	public Label getLabel_nom_artista() {
		return label_nom_artista;
	}





	public void setLabel_nom_artista(Label label_nom_artista) {
		this.label_nom_artista = label_nom_artista;
	}





	public Element getContainerTiempo() {
		return containerTiempo;
	}





	public void setContainerTiempo(Element containerTiempo) {
		this.containerTiempo = containerTiempo;
	}





	public Label getLabel_tiempo() {
		return label_tiempo;
	}





	public void setLabel_tiempo(Label label_tiempo) {
		this.label_tiempo = label_tiempo;
	}





	public Element getContainer_botones() {
		return container_botones;
	}





	public void setContainer_botones(Element container_botones) {
		this.container_botones = container_botones;
	}





	public Button getBoton_reproducir() {
		return boton_reproducir;
	}





	public void setBoton_reproducir(Button boton_reproducir) {
		this.boton_reproducir = boton_reproducir;
	}





	public Button getBoton_anadir_fav() {
		return boton_anadir_fav;
	}





	public void setBoton_anadir_fav(Button boton_anadir_fav) {
		this.boton_anadir_fav = boton_anadir_fav;
	}





	public ComboBox<String> getCombobox_opc() {
		return combobox_opc;
	}





	public void setCombobox_opc(ComboBox<String> combobox_opc) {
		this.combobox_opc = combobox_opc;
	}





	public void setContainer_principal(Element container_principal) {
		this.container_principal = container_principal;
	}





	/**
     * Creates a new VistaCancionbusqueda.
     */
    public VistaCancionbusqueda() {
        // You can initialise any data required for the connected UI components here.
    }

}
