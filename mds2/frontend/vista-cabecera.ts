import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-cabecera')
export class VistaCabecera extends LitElement {
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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%; flex-direction: row;">
 <vaadin-vertical-layout style="width: 60%; height: 100%; flex-direction: row;">
  <vaadin-vertical-layout style="height: 100%; width: 80%;">
   <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; align-self: center;">
   <label style="width: 100%; font-size:32px; font-weight:bold;">SpotyUAL</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;">
  <vaadin-vertical-layout style="width: 100%; height: 100%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%;"></vaadin-vertical-layout>
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
