import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-notificaciones')
export class VistaNotificaciones extends LitElement {
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
<vaadin-vertical-layout theme="" id="container_principal" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout id="container_titulo" style="width: 100%; height: 100%; justify-content: center;">
  <label id="titulo_notificaciones" style="font-size:32px; font-weight:bold; align-self: center;">Notificaciones</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_mensajes" style="width: 100%; height: 400%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
