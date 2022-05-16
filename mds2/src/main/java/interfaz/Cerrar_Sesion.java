package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cerrar_Sesion extends vistas.VistaCerrarsesion {

	public Cerrar_Sesion() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		
		this.getBoton_no().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				//Falta hacer para saber si es admin o no
				
			}
		});
		
		this.getBoton_si().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				//Falta hacer para saber si es admin o no
				Cabecera_de_inicio cerrarSi = new Cabecera_de_inicio();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(cerrarSi);
			}
		});
		
		
	}
	
}