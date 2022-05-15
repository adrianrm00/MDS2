package interfaz;

import Diagrama_de_clases.Google;
import Diagrama_de_clases.Facebook;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import Diagrama_de_clases.Apple;

public class Registrarse extends vistas.VistaRegistrarse {
	
	public Registrarse() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		this.getBoton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Cabecera_de_inicio init = new Cabecera_de_inicio();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(init);
			}
		});
		
		//Falta
		this.getBoton_subir_foto().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
				
			}
		});

		this.getBoton_registrarse().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
	
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				//Antes de irse al inicio tiene que saltar la confirmacion de la cuenta
				Cabecera_de_inicio init = new Cabecera_de_inicio();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(init);
			}
		});
		
		//Falta
		this.getBoton_google().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//Falta
		this.getBoton_facebook().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//Falta
		this.getBoton_apple().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	

	public void Subir_foto() {
		throw new UnsupportedOperationException();
	}

	public void Confirmar_cuenta() {
		throw new UnsupportedOperationException();
	}

	public void Registro_de_terceros() {
		throw new UnsupportedOperationException();
	}
}