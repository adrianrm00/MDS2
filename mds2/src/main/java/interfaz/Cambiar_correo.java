package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cambiar_correo extends vistas.VistaCambiarcorreo{

	public Cambiar_correo() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		//Tiene que avisar al administrador que va a darse de baja
		this.getBoton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Cuenta cuent = new Cuenta();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(cuent);
			}
		});
		
		this.getBoton_guardar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(new Cuenta());
			}
		});
		
	}
	

	public void Validar_email() {
		throw new UnsupportedOperationException();
	}
}