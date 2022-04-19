import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-perfilartista')
export class VistaPerfilartista extends LitElement {
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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%;" id="container_principal">
 <vaadin-vertical-layout style="height: 100%; width: 100%; flex-direction: row;" id="container_cabecera">
  <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;" id="container informacion_artista">
   <vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_imagen">
    <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png" id="img">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 200%; height: 100%;" id="container_informacion">
    <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;" id="container_nombre_seguir">
     <vaadin-vertical-layout style="width: 300%; height: 100%; justify-content: center;" id="container_nombre">
      <label style="font-size: 32px; font-weight:bold;" id="titulo_nombre">Nombre Artista</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;" id="container_boton">
      <vaadin-button id="boton_seguir">
        Seguir 
      </vaadin-button>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; align-items: center;" id="container_estilos">
     <label style="font-weight: bold;" id="titulo_estilos">Estilos:</label>
     <label id="testo_estilos">Estilos del artista</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; align-items: center;" id="container_seguidores">
     <label style="font-weight: bold;" id="titulo_seguidores">Seguidores:</label>
     <label id="testo_num_seguidores"> Numero de seguidores</label>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_eventos"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 500%;" id="container_canciones"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
