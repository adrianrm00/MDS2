import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cancionesfavoritas')
export class VistaCancionesfavoritas extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; height: 20%; flex-direction: row; padding: var(--lumo-space-m);">
  <vaadin-vertical-layout style="align-items: center; justify-content: center; align-self: center;">
   <label style="align-self: center; font-size: 20px ; font-weight: bold;">Canciones favoritas</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="align-items: center; justify-content: center; align-self: center; padding: var(--lumo-space-m);">
   <vaadin-button>
    Reproducir
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-m);">
  <vaadin-vertical-layout style="width: 100%; flex-direction: row;">
   <vaadin-vertical-layout style="width: 100%; align-self: center;">
    <label>Nª Cancion</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; align-self: center;">
    <label>Titulo</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; align-self: center;">
    <label>Album</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; align-self: center;">
    <label>Fecha Incorporación</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; align-self: center;">
    <label>Duración</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
