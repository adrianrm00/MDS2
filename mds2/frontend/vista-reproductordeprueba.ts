import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-progress-bar/src/vaadin-progress-bar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-reproductordeprueba')
export class VistaReproductordeprueba extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;">
 <vaadin-horizontal-layout style="width: 40%; height: 100%;">
  <vaadin-horizontal-layout style="width: 100%; height: 100%; padding: var(--lumo-space-s);">
   <img style="width: 100%; height: 100%;" src="https://cdn.smehost.net/ww2melendioficialcom-prosolutionsprod/wp-content/uploads/2018/02/curiosa-la-cara.jpg">
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 100%; flex-direction: column;">
   <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: flex-start; justify-content: flex-end;">
    <h3 style="align-self: flex-start; flex-shrink: 0; flex-grow: 0;">Nombre canción</h3>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: flex-start;">
    <h5 style="flex-shrink: 0; align-self: flex-start; flex-grow: 0;">Nombre artista</h5>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: flex-start; justify-content: center;">
    <vaadin-button>
     Añadir a favoritos
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 60%; height: 100%; flex-direction: column;">
  <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: flex-end;">
   <vaadin-progress-bar style="flex-grow: 0; flex-shrink: 0;"></vaadin-progress-bar>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; flex-direction: row; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button>
      Button 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button>
      Button 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button>
      Button 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button>
      Button 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button>
      Button 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button>
      Button 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 20%; height: 100%; align-items: center; justify-content: center;">
  <vaadin-button>
   Sonido
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
