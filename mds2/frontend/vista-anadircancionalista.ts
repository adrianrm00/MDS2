import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-anadircancionalista')
export class VistaAnadircancionalista extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;" id="container_principal">
 <vaadin-vertical-layout style="height: 100%; width: 100%; flex-direction: row;" id="container_cancion">
  <vaadin-vertical-layout style="height: 100%; width: 50%;" id="container_imagen">
   <img style="width: 100%; height: 100%; align-self: center;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png" id="img">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m); align-items: center; justify-content: center;" id="container_informacion_cancion">
   <vaadin-horizontal-layout theme="" style="width: 100%; height: 100%; align-self: center; justify-content: center; align-items: center;" id="container_nombre_cancion">
    <label style="font-size: 18px; font-weight: bold; align-self: center; height: 100%; width: 100%;" id="label_nombre_cancion">Nombre de la canción</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="" style="width: 100%; height: 100%;" id="container_nombre_artista">
    <label style="width: 100%; font-size: 18px;" id="label_nombre_artista">Nombre del artista</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 30%; height: 100%; align-self: center; justify-content: center; align-items: center;" id="container_boton">
  <vaadin-button id="boton_anadir">
    Añadir 
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
