package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Anadir_album extends vistas.VistaAnadiralbum {
	
	public Anadir_album() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		//FALTA
		this.getBoton_anadir_artista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub

			}
		});
		//FALTA
		this.getBoton_eliminar_artista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub

			}
		});
		//FALTA
		this.getBoton_anadir_cancion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
				getBoton_cancelar().setVisible(false);
				getBoton_dar_de_alta().setVisible(false);
				getBoton_anadir_cancion().setVisible(false);
				
				Anadir_cancion_a_album anaCanAbl = new Anadir_cancion_a_album();
				getContainer_anadir_cancion().as(VerticalLayout.class).add(anaCanAbl);
				
				anaCanAbl.getBoton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						getBoton_cancelar().setVisible(true);
						getBoton_dar_de_alta().setVisible(true);
						getBoton_anadir_cancion().setVisible(true);
					}
				});
				
				anaCanAbl.getBoton_anadir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						getBoton_cancelar().setVisible(true);
						getBoton_dar_de_alta().setVisible(true);
						getBoton_anadir_cancion().setVisible(true);
					}
				});
				
			}
		});
		//FALTA
		this.getBoton_eliminar_cancion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub

			}
		});
		//FALTA
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
		//FALTA AÑADIR A LA BASE DE DATOS
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


	public void Subir_foto() {
		throw new UnsupportedOperationException();
	}

	public void Verificar_fecha() {
		throw new UnsupportedOperationException();
	}
}