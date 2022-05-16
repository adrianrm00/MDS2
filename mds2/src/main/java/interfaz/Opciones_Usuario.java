package interfaz;

import java.util.ArrayList;
import java.util.Collection;

import com.vaadin.flow.component.notification.Notification;

public class Opciones_Usuario extends vistas.VistaOpcionesusuario {

	public Opciones_Usuario() {
		getCombo_box_opciones().setItems("OPCION A", "OPCION B");
		getCombo_box_opciones().addValueChangeListener(event -> {
			if(event.getValue() == "OPCION A") {
				Notification.show("ASDFGHJKSDFGHJK");
			}
		});
	
	}
	
	
}