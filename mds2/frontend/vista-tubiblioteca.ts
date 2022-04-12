import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-tubiblioteca')
export class VistaTubiblioteca extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;">
 <vaadin-vertical-layout style="width: 100%; height: 100%; align-self: center; align-items: center; justify-content: center; padding: var(--lumo-space-m);">
  <vaadin-button style="align-self: center; width: 100%;">
   Listas
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; align-self: center; align-items: center; justify-content: center; padding: var(--lumo-space-m);">
  <vaadin-button style="align-self: center; width: 100%;">
   Artistas
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; align-self: center; align-items: center; justify-content: center; padding: var(--lumo-space-m);">
  <vaadin-button style="align-self: center; width: 100%;">
   Albumes
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