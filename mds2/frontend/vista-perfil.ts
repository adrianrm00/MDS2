import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-perfil')
export class VistaPerfil extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;" id="container_cabecera">
  <vaadin-vertical-layout style="width: 200%; height: 100%; flex-direction: row;" id="container_informacion_usuario">
   <vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_imagen">
    <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png" id="img">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 150%; height: 100%; margin-left: var(--lumo-space-m);" id="container_informacion">
    <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; font-size: 32px; font-weight: bold;" id="container_nombre_usuario">
     <label style="width: 100%;" id="titulo_nombre_usuario">Nombre de Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; align-items: center;" id="container_estilos">
     <label style="flex-grow: 0; font-weight: bold" id="titulo_estilos">Estilos: </label>
     <label id="testo_estilos">Estilos de musica</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; align-items: center;" id="container_seguidores">
     <label style="flex-grow: 0; font-weight: bold" id="titulo_seguidores">Seguidores:</label>
     <label id="texto_num_seguidores">Numero de seguidores</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; flex-direction: row;" id="container_seguidos">
     <label style="flex-grow: 0; font-weight: bold" id="titulo_seguidos">Seguidos:</label>
     <label id="texto_num_seguidos">Numero de seguidos</label>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;" id="container_botones_vistas">
   <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; align-items: center;" id="container_vista_artista">
    <vaadin-button style="width: 50%;" id="boton_vista_artista">
      Vista Artista 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;" id="container_vista_usuario">
    <vaadin-button style="width: 50%;" id="boton_vista_usuario">
      Vista Usuario 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_estadisticas"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="container_otra_informacion"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
