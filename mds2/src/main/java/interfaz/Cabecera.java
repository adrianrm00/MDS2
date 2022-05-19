package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cabecera extends vistas.VistaCabecera {

	public Cabecera() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		
		Menu_lateral menu = new Menu_lateral();
		this.getContainer_menu_lateral().as(VerticalLayout.class).add(menu);
		
		Opciones_Usuario opc = new Opciones_Usuario();
		this.getContainer_opciones_usuario().as(VerticalLayout.class).add(opc);
		opc.getCombo_box_opciones().setItems("Cuenta", "Perfil", "Notificaciones", "Contactanos", "Cerrar Sesion");
		opc.getCombo_box_opciones().addValueChangeListener(event -> {
			if(event.getValue() == "Cuenta") {
				//Notification.show("ASDFGHJKSDFGHJK");
				Cuenta cuent = new Cuenta();
				getContainer_contenido().as(VerticalLayout.class).removeAll();
				getContainer_contenido().as(VerticalLayout.class).add(cuent);
			}
			else if(event.getValue() == "Perfil") {
				Perfil perfil = new Perfil();
				getContainer_contenido().as(VerticalLayout.class).removeAll();
				getContainer_contenido().as(VerticalLayout.class).add(perfil);
			}
			else if(event.getValue() == "Notificaciones") {
				Notificaciones noti= new Notificaciones();
				getContainer_contenido().as(VerticalLayout.class).removeAll();
				getContainer_contenido().as(VerticalLayout.class).add(noti);
			}
			else if(event.getValue() == "Contactanos") {
				Contactanos cont = new Contactanos();
				getContainer_contenido().as(VerticalLayout.class).removeAll();
				getContainer_contenido().as(VerticalLayout.class).add(cont);
			}else if(event.getValue() == "Cerrar Sesion") {
				Dialog w = new Dialog();
				Cerrar_Sesion cerrar = new Cerrar_Sesion();
				w.add(cerrar);
				w.open();
				cerrar.getBoton_si().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						//Falta hacer para saber si es admin o no
						Cabecera_de_inicio cerrarSi = new Cabecera_de_inicio();
						getContainer_principal().as(VerticalLayout.class).removeAll();
						getContainer_principal().as(VerticalLayout.class).add(cerrarSi);
						w.close();
					}
				});
				
				cerrar.getBoton_no().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						//Falta hacer para saber si es admin o no
						Cabecera cerrarNo = new Cabecera();
						getContainer_principal().as(VerticalLayout.class).removeAll();
						getContainer_principal().as(VerticalLayout.class).add(cerrarNo);
						w.close();
					}
				});
			}
		});
		
		
		menu.getBoton_buscar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Buscar buscador = new Buscar();
				getContainer_buscador_biblioteca().as(VerticalLayout.class).removeAll();
				getContainer_buscador_biblioteca().as(VerticalLayout.class).add(buscador);
				
				//hacer que aparezca en contenido la ventana buscador
				//getContainer_contenido().as(VerticalLayout.class).add(null);
			}
		});
		
		menu.getBoton_tu_biblioteca().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Tu_biblioteca biblio = new Tu_biblioteca();
				getContainer_buscador_biblioteca().as(VerticalLayout.class).removeAll();
				getContainer_buscador_biblioteca().as(VerticalLayout.class).add(biblio);
				
				
				biblio.getBoton_albumes().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					// TODO Auto-generated method stub
					Ver_albumes album = new Ver_albumes();
					getContainer_contenido().as(VerticalLayout.class).removeAll();
					getContainer_contenido().as(VerticalLayout.class).add(album);
				}
			});
			
			biblio.getBoton_artistas().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					// TODO Auto-generated method stub
					Ver_Artistas artista = new Ver_Artistas();
					getContainer_contenido().as(VerticalLayout.class).removeAll();
					getContainer_contenido().as(VerticalLayout.class).add(artista);
				}
			});
			
			biblio.getBotonListas().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					// TODO Auto-generated method stub
					Ver_Listas init = new Ver_Listas();
					getContainer_contenido().as(VerticalLayout.class).removeAll();
					getContainer_contenido().as(VerticalLayout.class).add(init);
				}
			});

			}
		});
		
		menu.getBoton_crear_lista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Crear_lista clista = new Crear_lista();
				getContainer_contenido().as(VerticalLayout.class).removeAll();
				getContainer_contenido().as(VerticalLayout.class).add(clista);
			}
		});
		
		
		
	

		
		//Falta poner el reproductor y la vista que vamos a poner de inicio
		

		
		
		
		
	}
	
}