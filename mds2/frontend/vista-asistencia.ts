import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-asistencia')
export class VistaAsistencia extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; height: 100%;">
  <h1 style="align-self: center;">Asistencia</h1>
  <vaadin-vertical-layout theme="spacing" style="align-self: center;">
   <h3>Texto ejemplo</h3>
   <h3>Texto ejemplo</h3>
  </vaadin-vertical-layout>
  <vaadin-button style="align-self: center;">
   Cerrar
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
