import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-evento')
export class VistaEvento extends LitElement {
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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; align-items: flex-start; flex-direction: row;">
  <vaadin-vertical-layout style="width: 300%; justify-content: center;">
   <label style="font-size:32px; font-weight:bold;">Proximos eventos</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; justify-content: center; align-items: center; align-self: center;">
   <vaadin-button>
    Editar Eventos
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 400%;">
  <vaadin-vertical-layout style="width: 100%; flex-direction: row;">
   <vaadin-vertical-layout style="width: 100%;">
    <label>Nombre evento</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%;">
    <label>Ciudad</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%;">
    <label>Fecha</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
