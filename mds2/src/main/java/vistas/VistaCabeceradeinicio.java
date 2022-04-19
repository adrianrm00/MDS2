package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;

/**
 * A Designer generated component for the vista-cabeceradeinicio template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabeceradeinicio")
@JsModule("./vista-cabeceradeinicio.ts")
public class VistaCabeceradeinicio extends LitTemplate {

    @Id("container_cabecera")
	private Element container_cabecera;
	@Id("container_spotyual")
	private HorizontalLayout container_spotyual;
	@Id("container_img")
	private Element container_img;
	@Id("img")
	private Image img;
	@Id("container_p")
	private Element container_p;
	@Id("p_spotyual")
	private Paragraph p_spotyual;
	@Id("container_botones")
	private HorizontalLayout container_botones;
	@Id("boton_asistencia")
	private Button boton_asistencia;
	@Id("boton_registrarse_cabecera")
	private Button boton_registrarse_cabecera;
	@Id("boton_iniciar_sesion")
	private Button boton_iniciar_sesion;
	@Id("container_mensaje_principal")
	private Element container_mensaje_principal;
	@Id("container_mensaje_principal_ajustado")
	private Element container_mensaje_principal_ajustado;
	@Id("h1")
	private H1 h1;
	@Id("h3")
	private H3 h3;
	@Id("container_boton_registrarse")
	private Element container_boton_registrarse;
	@Id("boton_registrarse")
	private Button boton_registrarse;
	@Id("container_canciones_prueba")
	private Element container_canciones_prueba;
	@Id("container_titulo_canciones_prueba")
	private Element container_titulo_canciones_prueba;
	@Id("h3_canciones_prueba")
	private H3 h3_canciones_prueba;
	@Id("container_canciones")
	private Element container_canciones;
	@Id("cancion_prueba_1")
	private HorizontalLayout cancion_prueba_1;
	@Id("cancion_prueba_2")
	private HorizontalLayout cancion_prueba_2;
	@Id("cancion_prueba_3")
	private HorizontalLayout cancion_prueba_3;
	@Id("cancion_prueba_4")
	private HorizontalLayout cancion_prueba_4;
	@Id("cancion_prueba_5")
	private HorizontalLayout cancion_prueba_5;
	@Id("container_footer")
	private Element container_footer;

	public Element getContainer_cabecera() {
		return container_cabecera;
	}

	public void setContainer_cabecera(Element container_cabecera) {
		this.container_cabecera = container_cabecera;
	}

	public HorizontalLayout getContainer_spotyual() {
		return container_spotyual;
	}

	public void setContainer_spotyual(HorizontalLayout container_spotyual) {
		this.container_spotyual = container_spotyual;
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

	public Element getContainer_p() {
		return container_p;
	}

	public void setContainer_p(Element container_p) {
		this.container_p = container_p;
	}

	public Paragraph getP_spotyual() {
		return p_spotyual;
	}

	public void setP_spotyual(Paragraph p_spotyual) {
		this.p_spotyual = p_spotyual;
	}

	public HorizontalLayout getContainer_botones() {
		return container_botones;
	}

	public void setContainer_botones(HorizontalLayout container_botones) {
		this.container_botones = container_botones;
	}

	public Button getBoton_asistencia() {
		return boton_asistencia;
	}

	public void setBoton_asistencia(Button boton_asistencia) {
		this.boton_asistencia = boton_asistencia;
	}

	public Button getBoton_registrarse_cabecera() {
		return boton_registrarse_cabecera;
	}

	public void setBoton_registrarse_cabecera(Button boton_registrarse_cabecera) {
		this.boton_registrarse_cabecera = boton_registrarse_cabecera;
	}

	public Button getBoton_iniciar_sesion() {
		return boton_iniciar_sesion;
	}

	public void setBoton_iniciar_sesion(Button boton_iniciar_sesion) {
		this.boton_iniciar_sesion = boton_iniciar_sesion;
	}

	public Element getContainer_mensaje_principal() {
		return container_mensaje_principal;
	}

	public void setContainer_mensaje_principal(Element container_mensaje_principal) {
		this.container_mensaje_principal = container_mensaje_principal;
	}

	public Element getContainer_mensaje_principal_ajustado() {
		return container_mensaje_principal_ajustado;
	}

	public void setContainer_mensaje_principal_ajustado(Element container_mensaje_principal_ajustado) {
		this.container_mensaje_principal_ajustado = container_mensaje_principal_ajustado;
	}

	public H1 getH1() {
		return h1;
	}

	public void setH1(H1 h1) {
		this.h1 = h1;
	}

	public H3 getH3() {
		return h3;
	}

	public void setH3(H3 h3) {
		this.h3 = h3;
	}

	public Element getContainer_boton_registrarse() {
		return container_boton_registrarse;
	}

	public void setContainer_boton_registrarse(Element container_boton_registrarse) {
		this.container_boton_registrarse = container_boton_registrarse;
	}

	public Button getBoton_registrarse() {
		return boton_registrarse;
	}

	public void setBoton_registrarse(Button boton_registrarse) {
		this.boton_registrarse = boton_registrarse;
	}

	public Element getContainer_canciones_prueba() {
		return container_canciones_prueba;
	}

	public void setContainer_canciones_prueba(Element container_canciones_prueba) {
		this.container_canciones_prueba = container_canciones_prueba;
	}

	public Element getContainer_titulo_canciones_prueba() {
		return container_titulo_canciones_prueba;
	}

	public void setContainer_titulo_canciones_prueba(Element container_titulo_canciones_prueba) {
		this.container_titulo_canciones_prueba = container_titulo_canciones_prueba;
	}

	public H3 getH3_canciones_prueba() {
		return h3_canciones_prueba;
	}

	public void setH3_canciones_prueba(H3 h3_canciones_prueba) {
		this.h3_canciones_prueba = h3_canciones_prueba;
	}

	public Element getContainer_canciones() {
		return container_canciones;
	}

	public void setContainer_canciones(Element container_canciones) {
		this.container_canciones = container_canciones;
	}

	public HorizontalLayout getCancion_prueba_1() {
		return cancion_prueba_1;
	}

	public void setCancion_prueba_1(HorizontalLayout cancion_prueba_1) {
		this.cancion_prueba_1 = cancion_prueba_1;
	}

	public HorizontalLayout getCancion_prueba_2() {
		return cancion_prueba_2;
	}

	public void setCancion_prueba_2(HorizontalLayout cancion_prueba_2) {
		this.cancion_prueba_2 = cancion_prueba_2;
	}

	public HorizontalLayout getCancion_prueba_3() {
		return cancion_prueba_3;
	}

	public void setCancion_prueba_3(HorizontalLayout cancion_prueba_3) {
		this.cancion_prueba_3 = cancion_prueba_3;
	}

	public HorizontalLayout getCancion_prueba_4() {
		return cancion_prueba_4;
	}

	public void setCancion_prueba_4(HorizontalLayout cancion_prueba_4) {
		this.cancion_prueba_4 = cancion_prueba_4;
	}

	public HorizontalLayout getCancion_prueba_5() {
		return cancion_prueba_5;
	}

	public void setCancion_prueba_5(HorizontalLayout cancion_prueba_5) {
		this.cancion_prueba_5 = cancion_prueba_5;
	}

	public Element getContainer_footer() {
		return container_footer;
	}

	public void setContainer_footer(Element container_footer) {
		this.container_footer = container_footer;
	}

	/**
     * Creates a new VistaCabeceradeinicio.
     */
    public VistaCabeceradeinicio() {
        // You can initialise any data required for the connected UI components here.
    }

}
