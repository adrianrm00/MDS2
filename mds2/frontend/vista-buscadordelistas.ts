import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-buscadordelistas')
export class VistaBuscadordelistas extends LitElement {
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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%; flex-direction: row; align-items: center;" id="container_principal">
 <vaadin-vertical-layout style="width: 100%;" id="container_buscador">
  <vaadin-text-field placeholder="Buscador de listas" style="width: 100%;" id="tf_buscador"></vaadin-text-field>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; align-self: center; justify-content: center;" id="container_boton">
  <vaadin-button id="boton_buscar">
    Buscar 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
