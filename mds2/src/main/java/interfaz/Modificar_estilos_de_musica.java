package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Modificar_estilos_de_musica extends vistas.VistaModificarestilosdemusica {
	
	public Modificar_estilos_de_musica() {
		inicializar();
	}
	
	public void inicializar() {
		
		//FALTA
		this.getBoton_eliminar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//FALTA
		this.getBoton_añadir_estilo().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
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


	public void Anadir_estilo_de_musica() {
		throw new UnsupportedOperationException();
	}
}