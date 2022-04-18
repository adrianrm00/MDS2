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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;">
  <vaadin-vertical-layout style="width: 200%; height: 100%; flex-direction: row;">
   <vaadin-vertical-layout style="width: 100%; height: 100%;">
    <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 150%; height: 100%; margin-left: var(--lumo-space-m);">
    <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; font-size: 32px; font-weight: bold;">
     <label style="width: 100%;">Nombre de Usuario</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; align-items: center;">
     <label style="flex-grow: 0; font-weight: bold">Estilos: </label>
     <label>Estilos de musica</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; align-items: center;">
     <label style="flex-grow: 0; font-weight: bold">Seguidores:</label>
     <label>Numero de seguidores</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; flex-direction: row;">
     <label style="flex-grow: 0; font-weight: bold">Seguidos:</label>
     <label>Numero de seguidos</label>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;">
   <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; align-items: center;">
    <vaadin-button style="width: 50%;">
     Vista Artista
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;">
    <vaadin-button style="width: 50%;">
     Vista Usuario
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
