import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-anadiralbum')
export class VistaAnadiralbum extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_principal">
 <vaadin-vertical-layout style="width: 100%; align-self: center; height: 10%; margin: var(--lumo-space-xl);" id="container_titulo">
  <vaadin-vertical-layout style="align-self: center; width: 10%; flex-grow: 0; justify-content: center; height: 100%; background-color: #EAEDED;" id="container_label_anadir_album">
   <label style="align-self: center;" id="label_anadir_album">Añadir álbum </label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_contenido">
  <vaadin-vertical-layout style="width: 43%; height: 100%; align-self: center; background-color: #EAEDED;" id="container_contenido_con_fondo">
   <vaadin-vertical-layout style="width: 80%; height: 100%; align-self: center;" id="container_contenido_ajustado">
    <vaadin-vertical-layout id="Container_Buscador_Album" style="align-self: center; width: 100%; height: 100%;"></vaadin-vertical-layout>
    <vaadin-text-field label="Nombre álbum:" placeholder="Placeholder" style="width: 100%;" id="tf_nombre_album"></vaadin-text-field>
    <vaadin-date-picker id="dp_fecha_lanzamiento" style="width: 100%;" label="Fecha lanzamiento:"></vaadin-date-picker>
    <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center; flex-direction: row;" id="container_artista_asociado">
     <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0; width: 27%;" id="label_artista">Artista asociado:</label>
     <vaadin-vertical-layout style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: center; flex-direction: row;" id="container_linea_artistas">
      <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;" id="tf_artista"></vaadin-text-field>
      <vaadin-button id="boton_eliminar_artista">
        X 
      </vaadin-button>
     </vaadin-vertical-layout>
     <vaadin-button id="boton_anadir_artista" style="flex-shrink: 1;">
       + 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center; flex-direction: row;" id="container_cancion">
     <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0; width: 27%;" id="label_cancion">Añadir canción: </label>
     <vaadin-vertical-layout style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: center; flex-direction: row;" id="container_linea_canciones">
      <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;" id="tf_cancion"></vaadin-text-field>
      <vaadin-button id="boton_eliminar_cancion">
        X 
      </vaadin-button>
     </vaadin-vertical-layout>
     <vaadin-button id="boton_anadir_cancion" style="flex-shrink: 1;">
       + 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout id="container_anadir_cancion" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 30%; flex-direction: row; align-items: center;" id="container_foto_album">
     <label id="label_foto_album">Foto del álbum:</label>
     <vaadin-vertical-layout style="width: 50%; height: 80%;" id="container_foto">
      <img style="width: 100%; height: 100%;" src="https://extension.ual.es/assets/logo-ual.png" id="foto">
     </vaadin-vertical-layout>
     <vaadin-button style="flex-shrink: 1; flex-grow: 0;" id="boton_buscar_foto">
       Buscar 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%;" id="container_botones_finales">
     <vaadin-button style="flex-grow: 0; width: 100%;" id="boton_cancelar">
       Cancelar 
     </vaadin-button>
     <vaadin-button style="flex-grow: 0; width: 100%;" id="boton_dar_de_alta">
       Dar de alta 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
