package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Contactanos extends vistas.VistaContactanos{

	public Contactanos() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		//Tiene que avisar al administrador que va a darse de baja
		this.getBoton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Cabecera contact = new Cabecera();
				getContainer_principal().as(VerticalLayout.class).add(contact);
			}
		});
		
		this.getBoton_enviar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Cabecera contact = new Cabecera();
				getContainer_principal().as(VerticalLayout.class).add(contact);
			}
		});
		
	}

	public void Enviar() {
		throw new UnsupportedOperationException();
	}
}