import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';

@customElement('vista-cancionbusqueda')
export class VistaCancionbusqueda extends LitElement {
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
<vaadin-vertical-layout id="container_principal" style="width: 100%; height: 100%; flex-direction: row;">
 <vaadin-vertical-layout id="container_cancion" style="width: 15%; height: 100%;">
  <img id="img" style="width: 100%; height: 100%;" src="https://extension.ual.es/assets/logo-ual.png">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_nombres" style="width: 35%; height: 100%; justify-content: center;">
  <label id="label_nom_cancion" style="font-size:20px; font-weight:bold; width: 100%;">Nombre Cancion</label>
  <label id="label_nom_artista" style="width: 100%;">Nombre artista</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container tiempo" style="height: 100%; width: 10%; justify-content: center; align-items: center;">
  <label id="label_tiempo">Tiempo</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_botones" style="height: 100%; width: 40%; flex-direction: row; align-items: center;">
  <vaadin-button id="boton_reproducir">
   Reproducir
  </vaadin-button>
  <vaadin-button id="boton_anadir_fav">
   Añadir fav
  </vaadin-button>
  <vaadin-combo-box id="combobox_opc"></vaadin-combo-box>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
