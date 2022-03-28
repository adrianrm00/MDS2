import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-olvidosucontrasena')
export class VistaOlvidosucontrasena extends LitElement {
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
  <h1 style="align-self: center;">¿Olvidó su contraseña?</h1>
  <vaadin-vertical-layout style="align-self: center; width: 60%;">
   <vaadin-text-field label="Introduzca su correo electrónico:" placeholder="Placeholder" style="width: 100%; height: 100%;"></vaadin-text-field>
   <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center; width: 100%; height: 100%;">
    <vaadin-button style="margin: 5%; flex-grow: 1; flex-shrink: 0;">
     Cancelar
    </vaadin-button>
    <vaadin-button style="margin: 5%; flex-grow: 1; flex-shrink: 0;">
     Enviar
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
