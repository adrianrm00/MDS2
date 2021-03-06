import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-estadisticas')
export class VistaEstadisticas extends LitElement {
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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%;" id="container_principal">
 <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;" id="container_cabecera">
  <label style="font-size: 32px; font-weight: bold;" id="texto_estadisticas">Estadisticas</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 400%; align-items: center; justify-content: center;" id="container_informacion">
  <label id="texto_ejemplo1">Texto ejemplo</label>
  <label id="texto_ejemplo2">Texto ejemplo</label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
