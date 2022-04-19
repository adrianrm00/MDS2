import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-cancion')
export class VistaCancion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; align-items: center;" id="container_principal">
 <vaadin-vertical-layout style="height: 100%; width: 100%;" id="container_foto_botones_nombre">
  <vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_foto_botones">
   <vaadin-vertical-layout theme="spacing" id="container_img">
    <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png" id="img">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;" id="container_botones">
    <vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_boton_anadir_a_fav">
     <vaadin-button id="boton_anadir_a_fav">
       Añadir a fav 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_boton_reproducir">
     <vaadin-button id="boton_reproducir">
       Reproducir 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_cb">
     <vaadin-combo-box id="cb"></vaadin-combo-box>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_nombre_cancion_y_artista">
   <vaadin-vertical-layout style="width: 100%;" id="container_nombre_cancion">
    <label style="font-weight: bold; width: 100%;" id="label_nombre_cancion">Nombre Cancion</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%;" id="container_nombre_artista">
    <label style="width: 100%;" id="label_nombre_artista">Nombre artista</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;" id="container_nombre_cancion_y_artista_2">
  <vaadin-vertical-layout style="width: 100%;" id="container_nombre_cancion_2">
   <label style="font-weight: bold;" id="label_nombre_cancion_2">Nombre Cancion</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="container_nombre_artista_2">
   <label id="label_nombre_artista_2">Nombre artista</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; align-items: center;" id="container_boton_anadir_a_fav_2">
  <vaadin-button style="width: 100%;" id="boton_anadir_a_fav_2">
    Añadir a fav 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;" id="container_boton_reproducir_2">
  <vaadin-button style="width: 100%;" id="boton_reproducir_2">
    Reproducir 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;" id="container_cb_2">
  <vaadin-combo-box id="cb_2"></vaadin-combo-box>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
