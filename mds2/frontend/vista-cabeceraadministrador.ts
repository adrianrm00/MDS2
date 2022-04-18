import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cabeceraadministrador')
export class VistaCabeceraadministrador extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; height: 10%; flex-direction: row;">
  <vaadin-vertical-layout style="width: 20%; height: 100%; flex-direction: row;">
   <vaadin-vertical-layout style="width: 80%; height: 100%;">
    <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="align-self: center;">
    <label style="font-size: 32px; font-weight: bold;">SpotyUal </label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-direction: row; width: 100%; height: 100%; justify-content: flex-end;">
   <vaadin-horizontal-layout style="width: 30%; height: 100%;">
    <vaadin-vertical-layout style="width: 50%; height: 100%; align-self: center; justify-content: center; align-items: flex-end;">
     <img style="width: 50%; height: 50%;" src="http://assets.stickpng.com/images/585e4beacb11b227491c3399.png">
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="align-self: center; width: 100%;">
     <label style="align-self: center; height: 100%;">Administrador</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="align-self: center; width: 50%; margin-right: var(--lumo-space-xl);">
     <vaadin-button style="width: 1%; flex-shrink: 0; flex-grow: 0;">
      <img style="width: 60%; height: 10%;" src="https://cdn-icons-png.flaticon.com/512/25/25706.png">
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
