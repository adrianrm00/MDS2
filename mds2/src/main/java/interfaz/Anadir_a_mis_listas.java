package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

public class Anadir_a_mis_listas extends vistas.VistaAnadiramislistas {

	public Anadir_a_mis_listas() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		
		this.getBoton_anadir_a_mis_listas().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				//Hacer metodo para que guarde la lista en la del usuario
			}
		});
		
	}
	
}