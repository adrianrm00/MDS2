import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-iniciousuaruioregistrado')
export class VistaIniciousuaruioregistrado extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; height: 20%;">
  <vaadin-vertical-layout style="width: 100%; height: 20%;">
   <label style="font-size: 32px; font-weight: bold">Canciones mas escuchadas</label>
  </vaadin-vertical-layout>
  <vaadin-scroller></vaadin-scroller>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 20%;">
  <vaadin-vertical-layout style="width: 100%; height: 20%;">
   <label style="font-size: 32px; font-weight: bold">Artistas que sigues</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 20%;">
  <vaadin-vertical-layout style="width: 100%; height: 20%;">
   <label style="font-size: 32px; font-weight: bold">Ultimos lanzamientos</label>
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
