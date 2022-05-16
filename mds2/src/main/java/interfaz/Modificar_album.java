package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Modificar_album extends Anadir_album {
	
	public Modificar_album() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		Buscador_de_album buscAlb = new Buscador_de_album();
		getContainer_Buscador_Album().as(VerticalLayout.class).removeAll();
		getContainer_Buscador_Album().as(VerticalLayout.class).add(buscAlb);
		
		
		getContainer_label_anadir_album().setText("Modificar álbum");
		getContainer_label_anadir_album().getStyle().set("text-align", "center");
		
		this.getBoton_eliminar_artista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		this.getBoton_anadir_artista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		this.getBoton_eliminar_cancion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		this.getBoton_anadir_cancion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		this.getBoton_buscar_foto().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
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
		
		//FALTA QUE MODIFIQUE LA BASE DE DATOS
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