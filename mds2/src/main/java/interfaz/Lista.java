package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Lista extends vistas.VistaLista {

	public Lista() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
//		this.getBoton_editar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
//			
//			@Override
//			public void onComponentEvent(ClickEvent<Button> event) {
//				// TODO Auto-generated method stub
//				Anadir_artista anArt = new Anadir_artista();
//				getContainer_principal().as(VerticalLayout.class).removeAll();
//				getContainer_principal().as(VerticalLayout.class).add(anArt);
//			}
//		});
		
		this.getBoton_eliminar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				//Metodo que elimine la lista de la base de datos
			}
		});
		
		this.getBoton_compartir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				//Metodo para compartir la lista
			}
		});

	this.getBoton_reproducir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
	
		@Override
		public void onComponentEvent(ClickEvent<Button> event) {
			// TODO Auto-generated method stub
			Anadir_artista anArt = new Anadir_artista();
			//Metodo para reproducir la primera cancion de la lista
			}
		});
	}
	
	

	public void Compartir_lista() {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_lista() {
		throw new UnsupportedOperationException();
	}

	public void Reproducir_lista() {
		throw new UnsupportedOperationException();
	}
}