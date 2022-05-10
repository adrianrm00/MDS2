package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Dar_de_baja_un_perfil extends vistas.VistaDardebajaunperfil {
	
	public Dar_de_baja_un_perfil() {
		inicializar();
	}
	
	public void inicializar() {
		
		this.getBoton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Administrador admin = new Administrador();
				getContainer_principal().as(VerticalLayout.class).add(admin);
			}
		});
		
		//FALTA QUITAR DE LA BASE DE DATOS
		this.getBoton_dar_de_baja().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Administrador admin = new Administrador();
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