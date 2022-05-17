package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Anadir_cancion_a_album extends Anadir_cancion {

	public Anadir_cancion_a_album() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		
		getContainer_label_anadir_cancion().setText("Añadir canción al álbum");
		getContainer_label_anadir_cancion().getStyle().set("text-align", "center");
		
		//FALTA
				this.getBoton_anadir_interprete().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						
					}
				});
				
				//FALTA
				this.getBoton_eliminar_interprete().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						
					}
				});
				
				//FALTA
				this.getBoton_anadir_compositor().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						
					}
				});
				
				//FALTA
				this.getBoton_eliminar_compositor().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						
					}
				});
				
				//FALTA
				this.getBoton_anadir_productor().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						
					}
				});
				
				//FALTA
				this.getBoton_eliminar_productor().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						
					}
				});
				
				//FALTA
				this.getBoton_anadir_estilo_de_musica().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						
					}
				});
				
				//FALTA
				this.getBoton_eliminar_estilo_de_musica().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						
					}
				});
				
				//FALTA
				this.getBoton_buscar_archivos().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						
					}
				});
				
				
				this.getBoton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						
						getContainer_principal().as(VerticalLayout.class).removeAll();

					}
				});
				
				//FALTA AÑADIR A LA BASE DE DATOS
				this.getBoton_anadir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						
						getContainer_principal().as(VerticalLayout.class).removeAll();
			
					}
				});
		
	}
	
}