package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.iAdministrador;

public class Administrador extends vistas.VistaPantalladeinicioadministrador {
	
	public Administrador() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		this.getBoton_anadir_artista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Anadir_artista anArt = new Anadir_artista();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(anArt);
			}
		});
		
		this.getBoton_modificar_artista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
				
				Modificar_artista modArt = new Modificar_artista();
				Scroller a = new Scroller(modArt);
				
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(a);
			}
		});
		
		this.getBoton_anadir_album().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Anadir_album anAlb = new Anadir_album();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(anAlb);
			}
		});
		
		this.getBoton_modificar_album().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Modificar_album modAlb = new Modificar_album();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(modAlb);
			}
		});
		
		this.getBoton_anadir_cacnion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Anadir_cancion anCan = new Anadir_cancion();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(anCan);
			}
		});
		
		this.getBoton_modificar_cancion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Modificar_cancion modCan = new Modificar_cancion();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(modCan);
			}
		});
		
		this.getBoton_modificar_estilos().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Modificar_estilos_de_musica modEst = new Modificar_estilos_de_musica();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(modEst);
			}
		});
		
		this.getBoton_modificar_canciones_iniciales().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Modificar_canciones_iniciales modCanInic = new Modificar_canciones_iniciales();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(modCanInic);
			}
		});
		
		this.getBoton_dar_de_baja_perfil().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Dar_de_baja_un_perfil bajPerf = new Dar_de_baja_un_perfil();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(bajPerf);
			}
		});
		
		this.getBoton_dar_de_baja_perfil_artista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Dar_de_baja_un_perfil_de_artista bajPerfArt = new Dar_de_baja_un_perfil_de_artista();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(bajPerfArt);
			}
		});
	}
	
}