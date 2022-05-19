import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';

@customElement('vista-cancionperfilusuario')
export class VistaCancionperfilusuario extends LitElement {
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
 <vaadin-vertical-layout id="container_img" style="width: 100%; height: 50%; align-items: center;">
  <img id="img" style="width: 60%; height: 100%;" src="https://extension.ual.es/assets/logo-ual.png">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_contenido" style="width: 100%; height: 50%;">
  <vaadin-vertical-layout id="container-texto" style="width: 100%; height: 60%;">
   <label id="label_nom_cancion" style="font-size: 32px; font-weight: bold; align-self: center;">Nombre Cancion</label>
   <label id="label_nom_artista" style="font-size: 20px; align-self: center;">Nombre artistas</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="container_botones" style="height: 40%; width: 100%; flex-direction: row;">
   <vaadin-vertical-layout id="container_boton_reproducir" style="height: 100%; width: 50%; align-items: center; justify-content: center;">
    <vaadin-button id="container_reproducir" style="width: 70%;">
     Reproducir
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="container_combo_box" style="width: 50%; height: 100%; align-items: center; justify-content: center;">
    <vaadin-combo-box id="combo_opc" style="width: 70%;"></vaadin-combo-box>
   </vaadin-vertical-layout>
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
