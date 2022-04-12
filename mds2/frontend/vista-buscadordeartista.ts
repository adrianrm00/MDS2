import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-buscadordeartista')
export class VistaBuscadordeartista extends LitElement {
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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%; flex-direction: row; align-items: center; justify-content: center;">
 <vaadin-vertical-layout style="width: 100%;">
  <vaadin-text-field placeholder="Buscador de artistas" style="width: 100%;"></vaadin-text-field>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; align-self: center; justify-content: center;">
  <vaadin-button>
    Buscar 
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
