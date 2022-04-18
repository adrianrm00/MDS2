import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-verlistas')
export class VistaVerlistas extends LitElement {
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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%; align-items: center; flex-direction: row;">
 <vaadin-vertical-layout style="width: 200%; margin-left: var(--lumo-space-xl);">
  <label style="width: 100%; font-size: 32px; font-weight:bold;">Listas</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
