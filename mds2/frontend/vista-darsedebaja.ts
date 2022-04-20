import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-darsedebaja')
export class VistaDarsedebaja extends LitElement {
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
<vaadin-vertical-layout theme="spacing" id="container_principal" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;" id="container_titulo">
  <label style="font-size:32px; font-weight:bold; align-self: center;" id="titulo">Darse de baja</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;" id="container_informacion">
  <label id="texto_info">Texto de ejemplo</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; align-items: center; justify-content: center;" id="container_botones">
  <vaadin-button style="margin: var(--lumo-space-l); width: 20%;" id="boton_darse_de_baja">
   Darse de baja
  </vaadin-button>
  <vaadin-button style="margin: var(--lumo-space-l); width: 20%;" id="boton_cancelar">
    Cancelar 
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
