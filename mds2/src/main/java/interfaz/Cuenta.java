package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cuenta extends vistas.VistaCuenta {

	public Cuenta() {
		this.getStyle().set("width", "100%");
		inicializar();
	}

	public void inicializar() {
		
		this.getBoton_cambiar_imagen().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				// Falta meter el cambio de imagen
			}
		});

		this.getBoton_cambiar_correo().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Dialog w = new Dialog();
				w.setWidth("50%");
				Cambiar_correo ccorr = new Cambiar_correo();
				w.add(ccorr);
				w.open();
				ccorr.getBoton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						w.close();
					}
				});

				ccorr.getBoton_guardar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						// Falta metodo para meterlo en la base de datos
						Notification noti = new Notification();
						noti.show("Correo cambiado correctamente");
						noti.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
						w.close();
					}
				});
			}
		});

		this.getBoton_cambiar_contrasena().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Dialog w = new Dialog();
				w.setWidth("50%");
				Cambiar_contrasena ccont = new Cambiar_contrasena();
				w.add(ccont);
				w.open();
				ccont.getBoton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						w.close();
					}
				});

				ccont.getBoton_guardar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						// Falta metodo para meterlo en la base de datos
						Notification noti = new Notification();
						noti.show("Contraseña cambiada correctamente");
						//noti.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
						w.close();
					}
				});
			}
		});

		this.getBoton_darse_de_baja().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Dialog w = new Dialog();
				w.setWidth("50%");
				Darse_de_baja darbaja = new Darse_de_baja();
				w.add(darbaja);
				w.open();
				darbaja.getBoton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						w.close();
					}
				});

				darbaja.getBoton_darse_de_baja().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						// TODO Auto-generated method stub
						// Falta metodo para meterlo en la base de datos
						Notification noti = new Notification();
						//noti.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
						noti.show("Se ha avisado al administrador para darle de baja");
						w.close();
					}
				});
			}
		});

	}

	public void Cambiar_foto() {
		throw new UnsupportedOperationException();
	}
}