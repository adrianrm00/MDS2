import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-cabeceraadministrador';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 10%;">
  <vista-cabeceraadministrador style="width: 100%; height: 100%;"></vista-cabeceraadministrador>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%; align-self: center; height: 10%; margin: var(--lumo-space-xl);">
  <vaadin-vertical-layout style="align-self: center; width: 12%; flex-grow: 0; justify-content: center; height: 100%; background-color: #EAEDED;">
   <label style="align-self: center;">Modificar canciones iniciales</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="height: 100%; align-self: center; width: 100%;">
  <vaadin-vertical-layout style="width: 40%; height: 100%; align-self: center; background-color: #EAEDED;">
   <vaadin-vertical-layout style="width: 80%; height: 100%; flex-shrink: 0; flex-grow: 0; align-self: center;" theme="spacing">
    <vaadin-vertical-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 0; margin-top: var(--lumo-space-xl); margin-bottom: var(--lumo-space-xl); background-color: #B6BBBE;">
     <vaadin-vertical-layout style="height: 100%; width: 100%;"></vaadin-vertical-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
      <label style="flex-grow: 1; flex-shrink: 0;">Seleccionar slot:</label>
      <vaadin-combo-box style="flex-grow: 1; flex-shrink: 0; width: 50%;" placeholder="Canción 1"></vaadin-combo-box>
      <vaadin-button style="flex-grow: 0;">
        Establecer 
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xl" style="width: 100%; flex-grow: 0;">
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
      <label>Canción 1:</label>
      <vaadin-text-field placeholder="xxxxxxxxxxxxxxxxxx" style="flex-grow: 1;"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
      <label>Canción 2:</label>
      <vaadin-text-field placeholder="xxxxxxxxx" style="flex-grow: 1;"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
      <label>Canción 3:</label>
      <vaadin-text-field placeholder="xxxxxxx" style="flex-grow: 1;"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
      <label>Canción 4:</label>
      <vaadin-text-field placeholder="xxxxxxxxxxxxxxxxxxxxxxxxxx" style="flex-grow: 1;"></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
      <label>Canción 5:</label>
      <vaadin-text-field placeholder="xxxxxx xxxxxx xxxxx" style="flex-grow: 1;"></vaadin-text-field>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%; margin-top: var(--lumo-space-xl);">
     <vaadin-button style="flex-grow: 0; width: 100%;">
       Cancelar 
     </vaadin-button>
     <vaadin-button style="flex-grow: 0; width: 100%;">
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
