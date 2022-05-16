package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Notificaciones extends vistas.VistaNotificaciones {

	public Notificaciones() {
		this.getStyle().set("width", "100%");
		inicializar();
		
	}
	
	public void inicializar() {
		
		Mensaje mens = new Mensaje();
		this.getContainer_mensajes().as(VerticalLayout.class).add(mens);
		
	}
	
	
}