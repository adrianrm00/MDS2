package interfaz;

import java.util.ArrayList;
import java.util.Collection;

import com.vaadin.flow.component.notification.Notification;

public class Opciones_Usuario extends vistas.VistaOpcionesusuario {

	public Opciones_Usuario() {
		getStyle().set("width", "100%");
//		getStyle().set("height", "20%");
		getCombo_box_opciones().setItems("Cuenta", "Perfil", "Notificaciones", "Contactanos", "Cerrar Sesion");
		getCombo_box_opciones().addValueChangeListener(event -> {
			if(event.getValue() == "Cuenta") {
				//Notification.show("ASDFGHJKSDFGHJK");
				
			}
		});
	
	}
	
	
}