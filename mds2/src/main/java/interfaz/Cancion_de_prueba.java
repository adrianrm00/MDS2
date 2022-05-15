package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cancion_de_prueba extends vistas.VistaCanciondeprueba{

	public Cancion_de_prueba() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		//Falta
		this.getBoton_play().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
			}
		});
		//Falta
		this.getBoton_creditos().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	
	public void Reproducir() {
		throw new UnsupportedOperationException();
	}

	public void Creditos() {
		throw new UnsupportedOperationException();
	}
}