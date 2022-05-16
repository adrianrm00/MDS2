package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Otras_listas extends vistas.VistaOtraslistas {

	public Otras_listas() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		
		Anadir_a_mis_listas addlistas = new Anadir_a_mis_listas();
		this.getContainer_boton_añadir_a_mislistas().as(VerticalLayout.class).add(addlistas);
		
		this.getBoton_creador_lista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Perfil perUser = new Perfil();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(perUser);
			}
		});
		
		this.getBoton_compartir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				//Funcionamiento del boton compartir
			}
		});
		
		this.getBoton_Reproducri().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				//Metodo que reproduzca la lista
			}
		});
		
	}
	
}