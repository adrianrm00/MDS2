package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cuenta extends vistas.VistaCuenta{

	public Cuenta() {
		this.getStyle().set("width", "80%");
		inicializar();
	}
	
	public void inicializar() {
		
		this.getBoton_cambiar_imagen().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				
			}
		});
		
		this.getBoton_cambiar_correo().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Cambiar_correo ccorr = new Cambiar_correo();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(ccorr);
			}
		});
		
		this.getBoton_cambiar_contraseña().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Cambiar_contrasena ccont = new Cambiar_contrasena();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(ccont);
				
			}
		});
		
		this.getBoton_darse_de_baja().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Darse_de_baja dbaja = new Darse_de_baja();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(dbaja);
				
			}
		});
		
	}
	

	public void Cambiar_foto() {
		throw new UnsupportedOperationException();
	}
}