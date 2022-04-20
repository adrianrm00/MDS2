import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-mensaje')
export class VistaMensaje extends LitElement {
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
<vaadin-vertical-layout id="container_principal" style="width: 100%; height: 100%; flex-direction: row;">
 <vaadin-vertical-layout id="container_imagen" style="width: 100%; height: 100%;">
  <img id="img" style="width: 70%; height: 100%; align-self: center;" src="https://static.vecteezy.com/system/resources/previews/004/897/815/non_2x/message-icon-you-can-use-for-commercial-free-vector.jpg">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_asusto" style="width: 180%; height: 100%; justify-content: center;">
  <label id="texto_asusnto" style="font-size:20px; font-weight:bold">Asunto mensaje</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_botones" style="width: 100%; height: 100%; justify-content: center; align-items: center;">
  <vaadin-button id="boton_leer">
   Leer
  </vaadin-button>
  <vaadin-button id="boton_borrar">
   Borrar
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
