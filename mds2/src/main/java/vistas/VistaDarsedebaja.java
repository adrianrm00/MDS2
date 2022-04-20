package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-darsedebaja template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-darsedebaja")
@JsModule("./vista-darsedebaja.ts")
public class VistaDarsedebaja extends LitTemplate {

    @Id("container_principal")
	private Element container_principal;
	@Id("container_titulo")
	private Element container_titulo;
	@Id("titulo")
	private Label titulo;
	@Id("container_informacion")
	private Element container_informacion;
	@Id("texto_info")
	private Label texto_info;
	@Id("container_botones")
	private Element container_botones;
	@Id("boton_darse_de_baja")
	private Button boton_darse_de_baja;
	@Id("boton_cancelar")
	private Button boton_cancelar;
	
	
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


	public Label getTitulo() {
		return titulo;
	}


	public void setTitulo(Label titulo) {
		this.titulo = titulo;
	}


	public Element getContainer_informacion() {
		return container_informacion;
	}


	public void setContainer_informacion(Element container_informacion) {
		this.container_informacion = container_informacion;
	}


	public Label getTexto_info() {
		return texto_info;
	}


	public void setTexto_info(Label texto_info) {
		this.texto_info = texto_info;
	}


	public Element getContainer_botones() {
		return container_botones;
	}


	public void setContainer_botones(Element container_botones) {
		this.container_botones = container_botones;
	}


	public Button getBoton_darse_de_baja() {
		return boton_darse_de_baja;
	}


	public void setBoton_darse_de_baja(Button boton_darse_de_baja) {
		this.boton_darse_de_baja = boton_darse_de_baja;
	}


	public Button getBoton_cancelar() {
		return boton_cancelar;
	}


	public void setBoton_cancelar(Button boton_cancelar) {
		this.boton_cancelar = boton_cancelar;
	}


	/**
     * Creates a new VistaDarsedebaja.
     */
    public VistaDarsedebaja() {
        // You can initialise any data required for the connected UI components here.
    }

}
