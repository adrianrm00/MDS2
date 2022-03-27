import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-canciondeprueba')
export class VistaCanciondeprueba extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 80%; padding: var(--lumo-space-xl); background-color: #5DADE2; flex-direction: column;">
 <vaadin-vertical-layout style="width: 100%; height: 100%;">
  <img style="width: 100%; height: 100%;" src="https://cdn.smehost.net/ww2melendioficialcom-prosolutionsprod/wp-content/uploads/2018/02/holanda.jpg">
  <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;">
   <vaadin-button style="width: 100%; height: 100%; position: relative; bottom: 68px;">
    Créditos
   </vaadin-button>
   <vaadin-button style="width: 100%; height: 100%; position: relative; bottom: 68px;">
    Play
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
<vaadin-vertical-layout style="width: 100%; height: 20%; background-color: #7FB3D5 ;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 50%;">
  <h3 style="flex-grow: 0; flex-shrink: 1; align-self: center;">Nombre canción</h3>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 50%;">
  <h3 style="align-self: center;">Heading 3</h3>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
