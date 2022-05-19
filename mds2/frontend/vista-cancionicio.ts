import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cancionicio')
export class VistaCancionicio extends LitElement {
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
<vaadin-vertical-layout theme="" id="container_principal" style="width: 100%; height: 100%; flex-direction: row;">
 <vaadin-vertical-layout id="conainer_img" style="width: 30%; height: 100%; justify-content: center;">
  <img id="img" style="width: 90%; height: 90%; align-self: center;" src="https://extension.ual.es/assets/logo-ual.png">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_contenido" style="height: 100%; width: 70%; flex-direction: row;">
  <vaadin-vertical-layout id="container_texto" style="height: 100%; justify-content: center; width: 70%;">
   <label id="label_nom_cancion" style="font-size:32px; font-weight: bold;">Nombre Cancion</label>
   <label id="label_nombre_artista" style="font-size: 18px">Nombre artistas</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="container_boton" style="width: 30%; height: 100%; justify-content: center;">
   <vaadin-button id="boton_reproducir" style="align-self: center;">
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
