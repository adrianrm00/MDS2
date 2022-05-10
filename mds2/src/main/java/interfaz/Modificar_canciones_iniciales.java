package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Modificar_canciones_iniciales extends vistas.VistaModificarcancionesiniciales {
	
	public Modificar_canciones_iniciales() {
		inicializar();
	}
	
	public void inicializar() {
		
		//FALTA MODIFICAR LOS SLOTS
		this.getBoton_establecer().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
			}
		});
		
		this.getBoton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Administrador admin = new Administrador();
				getContainer_principal().as(VerticalLayout.class).add(admin);
			}
		});
		
		//FALTA AÑADIR A LA BASE DE DATOS
		this.getBoton_guardar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Administrador admin = new Administrador();
				getContainer_principal().as(VerticalLayout.class).add(admin);
			}
		});
		
	}

}