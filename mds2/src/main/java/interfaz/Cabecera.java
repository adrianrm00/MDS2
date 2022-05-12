package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cabecera extends vistas.VistaCabecera {

	public Cabecera() {
		inicializar();
	}
	
	public void inicializar() {
		Menu_lateral menu= new Menu_lateral();
		this.getContainer_menu_lateral().as(VerticalLayout.class).add(menu);
		
		Buscar buscador = new Buscar();
		this.getContainer_buscador().as(VerticalLayout.class).add(buscador);
		
		Tu_biblioteca biblio = new Tu_biblioteca();
		this.getContainer_biblioteca().as(VerticalLayout.class).add(biblio);
		
		Opciones_Usuario opc = new Opciones_Usuario();
		this.getContainer_opciones_usuario().as(VerticalLayout.class).add(opc);
		
		//Falta poner el reproductor y la vista que vamos a poner de inicio
		
		biblio.getBoton_albumes().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Ver_albumes album = new Ver_albumes();
				getContainer_contenido().as(VerticalLayout.class).add(album);
			}
		});
		
		biblio.getBoton_artistas().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Ver_Artistas artista = new Ver_Artistas();
				getContainer_contenido().as(VerticalLayout.class).add(artista);
			}
		});
		
		biblio.getBotonListas().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Ver_Listas init = new Ver_Listas();
				getContainer_contenido().as(VerticalLayout.class).add(init);
			}
		});
		
		
	}
	
}