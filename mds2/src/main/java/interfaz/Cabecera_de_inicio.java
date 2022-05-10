package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabeceradeinicio;
import vistas.VistaIniciarsesion;
import vistas.VistaRegistrarse;

public class Cabecera_de_inicio extends vistas.VistaCabeceradeinicio {

	
	public Cabecera_de_inicio() {
		inicializar();
	}
	
	public void inicializar() {
		this.getBoton_asistencia().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
			}
		});
		
		this.getBoton_registrarse_cabecera().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				VistaRegistrarse i = new VistaRegistrarse();
				getContainer_principal().as(VerticalLayout.class).add(i);
				
			}		
		});
		
		this.getBoton_iniciar_sesion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				VistaIniciarsesion i = new VistaIniciarsesion();
				getContainer_principal().as(VerticalLayout.class).add(i);
				
			}
			
		});
		
		this.getBoton_registrarse().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				VistaRegistrarse i = new VistaRegistrarse();
				getContainer_principal().as(VerticalLayout.class).add(i);
				
			}
			
		});
		
		
	}
	
}