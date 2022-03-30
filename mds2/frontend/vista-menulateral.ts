import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-menulateral')
export class VistaMenulateral extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; flex-direction: row;">
  <vaadin-button style="flex-shrink: 1; flex-grow: 0;">
   <vaadin-vertical-layout style="flex-direction: row; width: 100%; height: 100%; align-items: center;">
    <img style="width: 15%; flex-shrink: 0;" src="https://w7.pngwing.com/pngs/127/82/png-transparent-computer-icons-house-home-cabin-angle-photography-logo.png">Inicio 
   </vaadin-vertical-layout>
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; flex-direction: row;">
  <vaadin-button style="flex-shrink: 1; flex-grow: 0;">
   <vaadin-vertical-layout style="flex-direction: row; width: 100%; height: 100%; align-items: center;">
    <img style="width: 15%; flex-shrink: 0;" src="https://w7.pngwing.com/pngs/608/913/png-transparent-computer-icons-google-search-symbol-mobile-search-search-for-miscellaneous-logo-mobile-phones.png">Buscar
   </vaadin-vertical-layout>
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; flex-direction: row;">
  <vaadin-button style="flex-shrink: 1; flex-grow: 0;">
   <vaadin-vertical-layout style="flex-direction: row; width: 100%; height: 100%; align-items: center;">
    <img style="width: 15%; flex-shrink: 0;" src="https://www.logocrea.com/wp-content/uploads/2016/07/libros1.png">Tu biblioteca
   </vaadin-vertical-layout>
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; flex-direction: row;">
  <vaadin-button style="flex-shrink: 1; flex-grow: 0;">
   <vaadin-vertical-layout style="flex-direction: row; width: 100%; height: 100%; align-items: center;">
    <img style="width: 15%; flex-shrink: 0;" src="https://w7.pngwing.com/pngs/807/736/png-transparent-computer-icons-plus-sign-logo-cross-plusminus-sign.png">Crear lista
   </vaadin-vertical-layout>
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; flex-direction: row;">
  <vaadin-button style="flex-shrink: 1; flex-grow: 0;">
   <vaadin-vertical-layout style="flex-direction: row; width: 100%; height: 100%; align-items: center;">
    <img style="width: 15%; flex-shrink: 0;" src="https://images.emojiterra.com/google/android-nougat/512px/1f5a4.png">Canciones fav
   </vaadin-vertical-layout>
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%;">
  <label style="width: 100%;">-----------------------------------</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
