package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Anadir_album extends vistas.VistaAnadiralbum {
	
	public Anadir_album() {
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
				getContainer_principal().as(VerticalLayout.class).add(admin);
			}
		});
		//FALTA AÑADIR A LA BASE DE DATOS
		this.getBoton_dar_de_alta().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Administrador admin = new Administrador();
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