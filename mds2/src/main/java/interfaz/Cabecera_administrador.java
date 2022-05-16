package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
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
				Cerrar_Sesion cabIn = new Cerrar_Sesion();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(cabIn);
			}
		});
		
	}

}
