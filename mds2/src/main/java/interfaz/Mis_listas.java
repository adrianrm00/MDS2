package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Mis_listas extends vistas.VistaMislistas {
	
	public Mis_listas() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		
		Lista botones = new Lista();
		this.getContainer_botones_lista().as(VerticalLayout.class).add(botones);
		
		
	}

}