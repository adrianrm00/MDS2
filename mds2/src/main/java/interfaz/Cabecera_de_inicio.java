package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabeceradeinicio;
import vistas.VistaIniciarsesion;
import vistas.VistaRegistrarse;

public class Cabecera_de_inicio extends vistas.VistaCabeceradeinicio {

	
	public Cabecera_de_inicio() {
		
		this.getStyle().set("width", "100%");
		
		inicializar();
	}
	
	public void inicializar() {
		
		this.getBoton_asistencia().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
				Dialog w = new Dialog();
				Asistencia asist = new Asistencia();
				w.add(asist);
				w.open();
				
				asist.getBoton_cerrar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						Cabecera_de_inicio cabIn = new Cabecera_de_inicio();
						getContainer_principal().as(VerticalLayout.class).removeAll();
						getContainer_principal().as(VerticalLayout.class).add(cabIn);
						w.close();
					}
				});
				

			}
		});
		
		this.getBoton_registrarse_cabecera().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Registrarse reg = new Registrarse();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(reg);
				
			}		
		});
		
		this.getBoton_iniciar_sesion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Iniciar_Sesion inSes = new Iniciar_Sesion();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(inSes);
				
			}
			
		});
		
		this.getBoton_registrarse().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
		
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				VistaRegistrarse reg = new VistaRegistrarse();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(reg);
				
			}
			
		});
		
		
	}
	
}