import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cancionfav')
export class VistaCancionfav extends LitElement {
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
 <vaadin-vertical-layout id="conainer_num_cancion" style="width: 10%; height: 100%; align-items: center; justify-content: center;">
  <label id="label_num_cancion">Num Cancion</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_cancion" style="width: 30%; height: 100%; flex-direction: row;">
  <vaadin-vertical-layout id="container_img" style="width: 25%; height: 100%;">
   <img id="img" style="width: 100%; height: 100%;" src="https://extension.ual.es/assets/logo-ual.png">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="container_nombres" style="width: 75%; height: 100%; justify-content: center;">
   <label id="label_nombre_nom_cancion" style="font-size:20px; font-weight:bold; width: 100%;">Nombre Cancion</label>
   <label id="label nom_artistas" style="width: 100%;">Nombre Artistas</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_informacion" style="width: 30%; height: 100%; flex-direction: row;">
  <vaadin-vertical-layout id="container_nom_album" style="width: 40%; height: 100%; justify-content: center; align-items: center;">
   <label id="label_nom_album">Nombre Album</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="container_fecha" style="width: 30%; height: 100%; align-items: center; justify-content: center;">
   <label id="laber_fecha">Fecha lanzamien</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="container_tiempo" style="width: 30%; height: 100%; align-items: center; justify-content: center;">
   <label id="label_tiempo">Tiempo</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_botones" style="width: 30%; height: 100%; flex-direction: row;">
  <vaadin-vertical-layout id="container_anadir_fav" style="width: 50%; height: 100%; align-items: center; justify-content: center;">
   <vaadin-button id="boton anadir_fav">
    Anadir a fav
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="container_reproducir" style="width: 50%; height: 100%; align-items: center; justify-content: center;">
   <vaadin-button id="boton_reproducir">
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
