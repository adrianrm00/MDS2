import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-anadircancion')
export class VistaAnadircancion extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="container_principal">
 <vaadin-vertical-layout style="width: 100%; align-self: center; height: 10%; margin: var(--lumo-space-xl);" id="container_titulo">
  <vaadin-vertical-layout style="align-self: center; width: 40%; flex-grow: 0; justify-content: center; height: 100%; background-color: #EAEDED;" id="container_label_anadir_cancion">
   <label style="align-self: center;" id="label_anadir_cancion">Añadir canción</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 40%; height: 100%; align-self: center; background-color: #EAEDED;" id="container_contenido">
  <vaadin-vertical-layout style="align-self: center; width: 80%; height: 100%;" theme="spacing-l" id="container_contenido_ajustado">
   <vaadin-vertical-layout style="width: 100%;" id="container_buscador_cancion"></vaadin-vertical-layout>
   <vaadin-text-field label="T�tulo:" placeholder="Placeholder" style="width: 100%;" id="tf_titulo"></vaadin-text-field>
   <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;" id="container_interprete">
    <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0; width: 16%;" id="label_interprete">Intérprete:</label>
    <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;" id="container_linea_interpretes">
     <vaadin-horizontal-layout theme="spacing" style="flex-direction: row;" id="container_linea_interprete">
      <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;" id="tf_interprete"></vaadin-text-field>
      <vaadin-button id="boton_eliminar_interprete">
        X 
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-button id="boton_anadir_interprete">
     +
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;" id="container_compositor">
    <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0; width: 16%;" id="label_compositor">Compositor:</label>
    <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;" id="container_linea_compositores">
     <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="container_linea_compositor">
      <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;" id="tf_compositor"></vaadin-text-field>
      <vaadin-button id="boton_eliminar_compositor">
        X 
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-button id="boton_anadir_compositor">
      + 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;" id="container_productor">
    <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0;" id="label_productor">Productor:</label>
    <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;" id="container_linea_productores">
     <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="container_linea_productor">
      <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;" id="tf_productor"></vaadin-text-field>
      <vaadin-button id="boton_eliminar_productor">
        X 
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-button id="boton_anadir_productor">
      + 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;" id="container_estilos_de_musica">
    <label style="flex-grow: 1; flex-shrink: 0; margin-right: var(--lumo-space-xs);" id="label_estilos_de_musica">Estilos de música:</label>
    <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;" id="container_linea_estilos_de_musica">
     <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="container_linea_estilo_de_musica">
      <vaadin-combo-box style="flex-grow: 1; flex-shrink: 0;" id="cb_estilos_de_musica"></vaadin-combo-box>
      <vaadin-button id="boton_eliminar_estilo_de_musica">
        X 
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-button id="boton_anadir_estilo_de_musica">
      + 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;" id="container_fichero_multimedia">
    <label style="flex-grow: 1; flex-shrink: 0;" id="label_fichero_multimedia">Fichero multimedia:</label>
    <vaadin-text-field placeholder="mpa, ogg, mp3..." style="width: 100%; flex-grow: 0; flex-shrink: 1;" id="tf_fichero_multimedia"></vaadin-text-field>
    <vaadin-button style="flex-shrink: 0; flex-grow: 0;" id="boton_buscar_archivos">
      Buscar archivos 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%; margin-bottom: var(--lumo-space-l);" id="container_botones_finales">
    <vaadin-button style="flex-grow: 0; width: 100%;" id="boton_cancelar">
      Cancelar 
    </vaadin-button>
    <vaadin-button style="flex-grow: 0; width: 100%;" id="boton_anadir">
      Añádir 
    </vaadin-button>
   </vaadin-horizontal-layout>
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
