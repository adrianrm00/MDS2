import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-modificarcancionesiniciales')
export class VistaModificarcancionesiniciales extends LitElement {
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
  <vaadin-vertical-layout style="align-self: center; width: 12%; flex-grow: 0; justify-content: center; height: 100%; background-color: #EAEDED;" id="container_modificar_canciones_iniciales">
   <label style="align-self: center;" id="titulo_modificar_canciones_iniciales">Modificar canciones iniciales</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="height: 100%; align-self: center; width: 100%;" id="container_opciones1">
  <vaadin-vertical-layout style="width: 40%; height: 100%; align-self: center; background-color: #EAEDED;" id="container_opciones2">
   <vaadin-vertical-layout style="width: 80%; height: 100%; flex-shrink: 0; flex-grow: 0; align-self: center;" theme="spacing" id="container_opciones3">
    <vaadin-vertical-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 0; margin-top: var(--lumo-space-xl); margin-bottom: var(--lumo-space-xl); background-color: #B6BBBE;" id="container_seleccionar_cancion">
     <vaadin-vertical-layout id="container_buscador1" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
     <vaadin-vertical-layout style="height: 100%; width: 100%; flex-direction: row; align-items: center;" id="container_slot">
      <label style="flex-grow: 1; flex-shrink: 0;" id="titulo_slot">Seleccionar slot:</label>
      <vaadin-combo-box style="flex-grow: 1; flex-shrink: 0; width: 50%;" placeholder="Canción 1" id="cb_slot"></vaadin-combo-box>
      <vaadin-button style="flex-grow: 0;" id="boton_establecer">
        Establecer 
      </vaadin-button>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xl" style="width: 100%; flex-grow: 0;" id="container_canciones">
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;" id="container_cancion1">
      <label id="titulo_cancion1">Canción 1:</label>
      <vaadin-text-field placeholder="xxxxxxxxxxxxxxxxxx" style="flex-grow: 1;" id="nombre_cancion1"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;" id="container_cancion2">
      <label id="titulo_cancion2">Canción 2:</label>
      <vaadin-text-field placeholder="xxxxxxxxx" style="flex-grow: 1;" id="nombre_cancion2"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;" id="container_cancion3">
      <label id="titulo_cancion3">Canción 3:</label>
      <vaadin-text-field placeholder="xxxxxxx" style="flex-grow: 1;" id="nombre_cancion3"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;" id="container_cancion4">
      <label id="titulo_cancion4">Canción 4:</label>
      <vaadin-text-field placeholder="xxxxxxxxxxxxxxxxxxxxxxxxxx" style="flex-grow: 1;" id="nombre_cancion4"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;" id="container_cancion5">
      <label id="titulo_cancion5">Canción 5:</label>
      <vaadin-text-field placeholder="xxxxxx xxxxxx xxxxx" style="flex-grow: 1;" id="nombre_cancion5"></vaadin-text-field>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%; margin-top: var(--lumo-space-xl);" id="container_botones">
     <vaadin-button style="flex-grow: 0; width: 100%;" id="boton_cancelar">
       Cancelar 
     </vaadin-button>
     <vaadin-button style="flex-grow: 0; width: 100%;" id="boton_guardar">
       Guardar cambios 
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
