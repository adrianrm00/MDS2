package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;

public class Anadir_artista extends vistas.VistaAnadirartista {
	
	public Anadir_artista() {
		this.getStyle().set("width", "100%");
		inicializar();
	}
	
	public void inicializar() {
		
		//FALTA
		this.getBoton_eliminar_estilos_de_musica().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub

			}
		});
		
		//FALTA
		this.getBoton_anadir_estilos_de_musica().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				VerticalLayout vl = new VerticalLayout();
				ComboBox<String> cb = new ComboBox<String>();
				Button b = getBoton_eliminar_estilos_de_musica();
				
				vl.add(cb);
				vl.add(b);
				
				vl.getStyle().set("margin-right", "var(--lumo-space-m)");
				vl.getStyle().set("width", "100%");
				vl.getStyle().set("flex-grow", "0");
				vl.getStyle().set("flex-shrink", "1");
				vl.getStyle().set("align-items", "stretch");
							
				getContainer_estilos_de_musica1().as(VerticalLayout.class).add(vl);
			}
		});
		
		//Falta buscar en el pc
		this.getBoton_buscar_en_archivos().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub

			}
		});
		
		this.getBoton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Administrador admin = new Administrador();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(admin);
			}
		});
		
		//Falta añadir a la base de datos
		this.getBoton_dar_de_alta().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub
				Administrador admin = new Administrador();
				getContainer_principal().as(VerticalLayout.class).removeAll();
				getContainer_principal().as(VerticalLayout.class).add(admin);
			}
		});
				
	}


	public void Anadir_estilo_de_musica() {
		throw new UnsupportedOperationException();
	}

	public void Subir_foto() {
		throw new UnsupportedOperationException();
	}

	public void Validar_email() {
		throw new UnsupportedOperationException();
	}

	public void Validar_contrasena() {
		throw new UnsupportedOperationException();
	}

	public void Verificar_fecha() {
		throw new UnsupportedOperationException();
	}
}