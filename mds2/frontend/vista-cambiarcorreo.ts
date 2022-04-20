import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cambiarcorreo')
export class VistaCambiarcorreo extends LitElement {
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
  <label id="titulo_cambio_correo" style="font-size:32px; font-weight:bold; align-self: center;">Cambio de Correo</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_tf" style="width: 100%; height: 200%; align-items: center;">
  <vaadin-text-field label="Nuevo Correo:" placeholder="Placeholder" id="tf_nuevo_correo" style="width: 50%;"></vaadin-text-field>
  <vaadin-text-field label="Repita el correo:" placeholder="Placeholder" id="tf_repita_correo" style="width: 50%;"></vaadin-text-field>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_botones" style="width: 100%; height: 100%; flex-direction: row; align-items: center; justify-content: center;">
  <vaadin-button id="boton_guardar" style="margin: var(--lumo-space-l); width: 20%;">
   Guardar
  </vaadin-button>
  <vaadin-button id="boton_cancelar" style="margin: var(--lumo-space-l); width: 20%;">
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
