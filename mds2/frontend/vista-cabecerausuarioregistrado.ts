import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-cabecerausuarioregistrado')
export class VistaCabecerausuarioregistrado extends LitElement {
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
 <vaadin-horizontal-layout style="width: 20%; height: 100%;">
  <vaadin-horizontal-layout style="width: 50%; height: 100%;">
   <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png">
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: center; align-self: center;">
   <label style="width: 100%; height: 100%; align-self: center;font-size: 30px; font-weight: bold; ">SpotyUAL</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 50%;">
  <img>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 30%; height: 100%; flex-grow: 0; flex-shrink: 1; flex-wrap: wrap;">
  <vaadin-horizontal-layout style="height: 100%; width: 100%;">
   <vaadin-horizontal-layout style="width: 30%;">
    <img style="width: 100%; height: 50%; align-self: center;" src="https://thumbs.dreamstime.com/b/vector-de-icono-perfil-usuario-s%C3%ADmbolo-retrato-avatar-logo-la-persona-forma-plana-silueta-negra-aislada-sobre-fondo-blanco-196482136.jpg">
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 80%;">
    <label style="width: 100%; align-self: center;">Nombre de Usuario</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; height: 100%;">
    <vaadin-combo-box style="width: 100%; align-self: center;"></vaadin-combo-box>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
