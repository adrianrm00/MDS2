package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import Diagrama_de_clases.Apple;
import Diagrama_de_clases.Facebook;
import Diagrama_de_clases.Google;

public class Iniciar_Sesion extends vistas.VistaIniciarsesion {

	public Iniciar_Sesion() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		
		this.getBoton_volver_inicio().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Cabecera_de_inicio init = new Cabecera_de_inicio();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(init);
			}
		});
		
		//Falta
		this.getBoton_recordar_contrasena().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
				Dialog w = new Dialog();
				Olvido_su_contrasena olvCon = new Olvido_su_contrasena();
				w.add(olvCon);
				w.open();
				
				olvCon.getBoton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						Iniciar_Sesion inSes = new Iniciar_Sesion();
						getContainer_principal().as(VerticalLayout.class).removeAll();
						getContainer_principal().as(VerticalLayout.class).add(inSes);
						w.close();
					}
				});
				
				olvCon.getBoton_enviar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						Iniciar_Sesion inSes = new Iniciar_Sesion();
						getContainer_principal().as(VerticalLayout.class).removeAll();
						getContainer_principal().as(VerticalLayout.class).add(inSes);
						w.close();
					}
				});
				
			}
		});
		
		//Falta si se equivoca al introducir la contraseña que sera con un if
		this.getBoton_iniciar_sesion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
				if(getTf_correo_o_usuario().getValue().equals("user")) {
					Cabecera reg = new Cabecera();
					getContainer_principal().as(VerticalLayout.class).removeAll();
					getContainer_principal().as(VerticalLayout.class).add(reg);
				}
				else if (getTf_correo_o_usuario().getValue().equals("admin")) {
					Cabecera_administrador admin = new Cabecera_administrador();
					getContainer_principal().as(VerticalLayout.class).removeAll();
					getContainer_principal().as(VerticalLayout.class).add(admin);
				}
				else {
					Notification.show("Usuario incorrecto");
				}
			}
		});
		
		this.getBoton_registrarse().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Registrarse reg = new Registrarse();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(reg);
			}
		});
		
	}
	
	
	
	public void Iniciar_Sesion_de_terceros() {
		throw new UnsupportedOperationException();
	}
}