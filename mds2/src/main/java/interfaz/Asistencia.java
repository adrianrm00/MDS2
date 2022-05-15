package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Asistencia extends vistas.VistaAsistencia {
	
	public Asistencia() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		
		this.getBoton_cerrar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Cabecera_de_inicio cabIn = new Cabecera_de_inicio();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				
				getContainer_principal().as(VerticalLayout.class).add(cabIn);
			}
		});
		
	}

}