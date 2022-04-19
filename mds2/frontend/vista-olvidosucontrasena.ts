import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
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
<vaadin-vertical-layout theme="" id="container_principal" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout id="container_titulo" style="width: 100%; height: 100%; justify-content: center;">
  <label id="titulo" style="align-self: center; font-size: 32px; font-weight:bold;">¿Olvidó su contraseña?</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_text_field" style="height: 150%; width: 100%; justify-content: center; align-items: center;">
  <vaadin-text-field label="Introduzca su correo electronico:" placeholder="Placeholder" id="tf_introduzca_su_correo" style="width: 50%;"></vaadin-text-field>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_botones" style="width: 100%; height: 100%; flex-direction: row; align-items: center; justify-content: center;">
  <vaadin-button id="boton_enviar" style="margin-right: var(--lumo-space-xl); width: 30%;">
   Enviar
  </vaadin-button>
  <vaadin-button id="boton_cancelar" style="margin-left: var(--lumo-space-xl); width: 30%;">
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
