package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Modificar_artista extends Anadir_artista {
	
	public Modificar_artista() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		Buscador_de_artista buscArt = new Buscador_de_artista();
		getContainer_buscador_artista().as(VerticalLayout.class).removeAll();
		getContainer_buscador_artista().as(VerticalLayout.class).add(buscArt);
		
		
		getContainer_label_anadir_artista().setText("Modificar artista");
		//getContainer_titulo().as(VerticalLayout.class).setAlignItems(Alignment.CENTER);

		
		this.getBoton_eliminar_estilos_de_musica().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		this.getBoton_anadir_estilos_de_musica().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		this.getBoton_buscar_en_archivos().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
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
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(admin);
				
			}
			
		});
		
		//FALTA MODIFICAR LA BASE DE DATOS
		this.getBoton_dar_de_alta().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Administrador admin = new Administrador();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(admin);
				
			}
			
		});
		
	}

}