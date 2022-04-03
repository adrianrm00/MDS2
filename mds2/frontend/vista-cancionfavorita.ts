import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cancionfavorita')
export class VistaCancionfavorita extends LitElement {
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
 <vaadin-vertical-layout style="align-self: center; padding: var(--lumo-space-s);">
  <label style="align-self: center;">XXXX/1000</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;">
  <vaadin-vertical-layout style="width: 50%; height: 100%; padding: var(--lumo-space-s);">
   <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; align-self: center; align-items: center; justify-content: center;">
   <label>Nombre de la canción</label>
   <label>Nombre del artista</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 70%; height: 100%; align-self: center; align-items: center; justify-content: center;">
  <label>Nombre del album</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 50%; height: 100%; align-self: center; align-items: center; justify-content: center;">
  <label>22/05/2007</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 50%; height: 100%; align-self: center; justify-content: center; align-items: center;">
  <label>Duracion</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 80%; height: 100%; flex-direction: row;">
  <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;">
   <vaadin-button style="align-self: center;">
    MG
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; align-self: center;">
   <vaadin-button style="align-self: center;">
    Reproducir
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
