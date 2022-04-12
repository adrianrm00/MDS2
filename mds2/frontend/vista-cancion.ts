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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; align-items: center;">
  <vaadin-vertical-layout style="height: 100%; width: 100%;">
   <vaadin-vertical-layout style="width: 100%; height: 100%;">
    <vaadin-vertical-layout theme="spacing">
     <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png">
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;">
     <vaadin-vertical-layout style="width: 100%; height: 100%;">
      <vaadin-button>
       Añadir a fav
      </vaadin-button>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout style="width: 100%; height: 100%;">
      <vaadin-button>
       Reproducir
      </vaadin-button>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout style="width: 100%; height: 100%;">
      <vaadin-combo-box></vaadin-combo-box>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%;">
    <vaadin-vertical-layout style="width: 100%;">
     <label style="font-weight: bold; width: 100%;">Nombre Cancion</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%;">
     <label style="width: 100%;">Nombre artista</label>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;">
   <vaadin-vertical-layout style="width: 100%;">
    <label style="font-weight: bold;">Nombre Cancion</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout>
    <label>Nombre artista</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; align-items: center;">
   <vaadin-button style="width: 100%;">
    Añadir a fav
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;">
   <vaadin-button style="width: 100%;">
    Reproducir
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;">
   <vaadin-combo-box></vaadin-combo-box>
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
