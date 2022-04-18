import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-album')
export class VistaAlbum extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_principal">
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;" id="container_delimitador">
  <vaadin-vertical-layout style="width: 100%; height: 100%;" id="contaniner_img">
   <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png" id="img">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 200%; height: 100%; justify-content: center;" id="container_informacion">
   <vaadin-vertical-layout style="width: 100%; justify-content: center;" id="container_informacion_ajustada">
    <vaadin-text-field label="Nombre album:" placeholder="Nombre del album" style="width: 100%;" id="tf_nombre_album"></vaadin-text-field>
    <vaadin-text-field label="Creado por:" placeholder="Nombre del artista" style="width: 100%;" id="tf_creado_por"></vaadin-text-field>
    <vaadin-text-field label="Fecha de edicion:" placeholder="Fecha de subida o algo asi" style="width: 100%;" id="tf_fecha_edicion"></vaadin-text-field>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;" id="container_boton">
   <vaadin-button id="boton">
     Reproducir 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_canciones"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
