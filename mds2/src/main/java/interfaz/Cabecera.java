package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cabecera extends vistas.VistaCabecera {

	public Cabecera() {
		this.getStyle().set("width", "100%");
		inicializar();
	}

	public void inicializar() {

		Menu_lateral menu = new Menu_lateral();
		this.getContainer_menu_lateral_centrado().as(VerticalLayout.class).add(menu);

		
		Scroller scroll = this.getContainer_contenido_centrado();
		VerticalLayout lay = new VerticalLayout();

		
		//getContainer_contenido().getStyle().set("display","block");
		
		Opciones_Usuario opc = new Opciones_Usuario();
		this.getContainer_opc_usuario_centrado().as(VerticalLayout.class).add(opc);
		opc.getCombo_box_opciones().setItems("Cuenta", "Perfil", "Notificaciones", "Contactanos", "Cerrar Sesion");
		opc.getCombo_box_opciones().addValueChangeListener(event -> {
			if (event.getValue() == "Cuenta") {
				opc.getCombo_box_opciones().setValue("NOMBRE USUARIO");
				getContainer_buscador_biblioteca_centrado().as(VerticalLayout.class).removeAll();
				
				Cuenta cuent = new Cuenta();	
				//lay.getStyle().set("width", "100%");
				lay.removeAll();
				lay.add(cuent);
				scroll.setContent(lay);
				
			} else if (event.getValue() == "Perfil") {
				opc.getCombo_box_opciones().setValue("NOMBRE USUARIO");
				getContainer_buscador_biblioteca_centrado().as(VerticalLayout.class).removeAll();
				
				Perfil perfil = new Perfil();
				lay.getStyle().set("width", "100%");
				lay.removeAll();
				lay.add(perfil);
				scroll.setContent(lay);
				
			} else if (event.getValue() == "Notificaciones") {
				opc.getCombo_box_opciones().setValue("NOMBRE USUARIO");
				getContainer_buscador_biblioteca_centrado().as(VerticalLayout.class).removeAll();
				
				Notificaciones noti = new Notificaciones();
				lay.getStyle().set("width", "100%");
				lay.removeAll();
				lay.add(noti);
				scroll.setContent(lay);
			} else if (event.getValue() == "Contactanos") {
				opc.getCombo_box_opciones().setValue("NOMBRE USUARIO");
				getContainer_buscador_biblioteca_centrado().as(VerticalLayout.class).removeAll();
				Contactanos cont = new Contactanos();
				
				lay.getStyle().set("width", "100%");
				lay.removeAll();
				lay.add(cont);
				scroll.setContent(lay);
			} else if (event.getValue() == "Cerrar Sesion") {
				opc.getCombo_box_opciones().setValue("NOMBRE USUARIO");
				Dialog w = new Dialog();
				Cerrar_Sesion cerrar = new Cerrar_Sesion();
				w.add(cerrar);
				w.open();
				cerrar.getBoton_si().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						// Falta hacer para saber si es admin o no
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
						// Falta hacer para saber si es admin o no
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
				getContainer_buscador_biblioteca_centrado().as(VerticalLayout.class).removeAll();
				getContainer_buscador_biblioteca_centrado().as(VerticalLayout.class).add(buscador);

				// hacer que aparezca en contenido la ventana buscador
				// getContainer_contenido().as(VerticalLayout.class).add(null);
			}
		});

		menu.getBoton_tu_biblioteca().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Tu_biblioteca biblio = new Tu_biblioteca();
				getContainer_buscador_biblioteca_centrado().as(VerticalLayout.class).removeAll();
				getContainer_buscador_biblioteca_centrado().as(VerticalLayout.class).add(biblio);

				Ver_Listas lista = new Ver_Listas();
				lay.getStyle().set("width", "100%");
				lay.removeAll();
				lay.add(lista);
				scroll.setContent(lay);

				biblio.getBotonListas().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						Ver_Listas init = new Ver_Listas();
						lay.getStyle().set("width", "100%");
						lay.removeAll();
						lay.add(init);
						scroll.setContent(lay);
					}
				});

				biblio.getBoton_artistas().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						Ver_Artistas artista = new Ver_Artistas();
						lay.getStyle().set("width", "100%");
						lay.removeAll();
						lay.add(artista);
						scroll.setContent(lay);
					}
				});

				biblio.getBoton_albumes().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						Ver_albumes album = new Ver_albumes();
						lay.getStyle().set("width", "100%");
						lay.removeAll();
						lay.add(album);
						scroll.setContent(lay);
					}
				});
			}
		});

		menu.getBoton_crear_lista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Crear_lista clista = new Crear_lista();
				//lay.getStyle().set("width", "100%");
				lay.removeAll();
				lay.add(clista);
				scroll.setContent(lay);
			}
		});

		Reproductor repro = new Reproductor();
		this.getContainer_reproductor_centrado().as(VerticalLayout.class).add(repro);

		// Falta poner el reproductor y la vista que vamos a poner de inicio

	}

}