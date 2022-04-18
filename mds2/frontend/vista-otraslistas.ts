import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-otraslistas')
export class VistaOtraslistas extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; padding: var(--lumo-space-l); position: sticky;">
  <vaadin-vertical-layout style="height: 100%; width: 100%;">
   <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="height: 100%; width: 300%;">
   <vaadin-vertical-layout style="width: 40%; flex-grow: 0; flex-shrink: 1;">
    <vaadin-text-field label="Nobre de la Lista:" placeholder="Placeholder" style="width: 100%; height: 100%;"></vaadin-text-field>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 20%; justify-content: center;">
    <label style="width: 100%; font-weight: bold;">Creada por : Nombre del usuario</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 20%; justify-content: center;">
    <label style="width: 100%;">Lista: XXX/100</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
