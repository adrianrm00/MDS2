import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-veralbumes')
export class VistaVeralbumes extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; align-items: center;" id="container_principal">
 <vaadin-vertical-layout style="margin-left: var(--lumo-space-xl); width: 200%;" id="container_titulo">
  <label style="width: 100%; font-size: 32px; font-weight:bold;" id="titulo">Albumes</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%;" id="container_buscador"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
