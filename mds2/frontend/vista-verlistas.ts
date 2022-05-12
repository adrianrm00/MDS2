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
<vaadin-vertical-layout id="container_principal" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout id="container_cabecera" style="width: 100%; height: 100%; flex-direction: row; align-items: center; margin-left: var(--lumo-space-xl);">
  <label id="container_texto" style="width: 100%; font-size: 32px; font-weight:bold;">Listas</label>
  <vaadin-vertical-layout id="container_buscador" style="width: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_listas" style="width: 100%; height: 300%; margin-left: var(--lumo-space-xl);"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
