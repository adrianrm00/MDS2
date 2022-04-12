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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="height: 100%; width: 100%; flex-direction: row;">
  <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;">
   <vaadin-vertical-layout style="width: 100%; height: 100%;">
    <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 200%; height: 100%;">
    <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;">
     <vaadin-vertical-layout style="width: 300%; height: 100%; justify-content: center;">
      <label style="font-size: 32px; font-weight:bold;">Nombre Artista</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;">
      <vaadin-button>
        Seguir 
      </vaadin-button>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; align-items: center;">
     <label style="font-weight: bold;">Estilos:</label>
     <label>Estilos del artista</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; align-items: center;">
     <label style="font-weight: bold;">Seguidores:</label>
     <label> Numero de seguidores</label>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 500%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
