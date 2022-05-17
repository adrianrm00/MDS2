package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Dar_de_baja_un_perfil_de_artista extends vistas.VistaDardebajaunperfildeartista {
	
	public Dar_de_baja_un_perfil_de_artista() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		
		Buscador_de_artista ba = new Buscador_de_artista();
		getContainer_buscador().as(VerticalLayout.class).add(ba);
		
		this.getBoton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Administrador admin = new Administrador();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(admin);
			}
		});
		
		//FALTA QUITAR DE LA BASE DE DATOS
		this.getBoton_dar_de_baja().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Administrador admin = new Administrador();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(admin);
			}
		});
		
	}


	public void Validar_email() {
		throw new UnsupportedOperationException();
	}

	public void Verificar_fecha() {
		throw new UnsupportedOperationException();
	}
}