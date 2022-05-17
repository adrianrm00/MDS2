package interfaz;

import java.awt.Window;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabeceradeinicio;

public class Cabecera_administrador extends vistas.VistaCabeceraadministrador {
	
	public Cabecera_administrador() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		
		Administrador admin = new Administrador();
		this.getContainer_contenido().as(VerticalLayout.class).add(admin);
		
		this.getBoton_salir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Dialog w = new Dialog();
				Cerrar_Sesion cerrar = new Cerrar_Sesion();
				w.add(cerrar);
				w.open();
				cerrar.getBoton_si().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						//Falta hacer para saber si es admin o no
						Cabecera_de_inicio cerrarSi = new Cabecera_de_inicio();
						getContainer_principal().as(VerticalLayout.class).removeAll();
						getContainer_principal().as(VerticalLayout.class).add(cerrarSi);
						w.close();
					}
				});
				
				cerrar.getBoton_no().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						//Falta hacer para saber si es admin o no
						Cabecera_administrador cerrarNo = new Cabecera_administrador();
						getContainer_principal().as(VerticalLayout.class).removeAll();
						getContainer_principal().as(VerticalLayout.class).add(cerrarNo);
						w.close();
					}
				});
				
				
				
				
//				Cerrar_Sesion cabIn = new Cerrar_Sesion();
//				getContainer_principal().as(VerticalLayout.class).removeAll();
//				getContainer_principal().as(VerticalLayout.class).add(cabIn);
			}
		});
		
	}

}
