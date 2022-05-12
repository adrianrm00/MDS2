package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Mensaje extends vistas.VistaMensaje {

	public Mensaje() {
		inicializar();
	}
	
	public void inicializar() {
		
		this.getBoton_leer().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				//Falta hacer la vista del contenido del mensaje
			}
		});
		
		this.getBoton_borrar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Mensaje men = new Mensaje();
				getContainer_principal().as(VerticalLayout.class).add(men);
			}
		});
		
	}

	public void Borrar() {
		throw new UnsupportedOperationException();
	}
}