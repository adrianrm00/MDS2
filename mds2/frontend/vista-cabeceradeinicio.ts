import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cabeceradeinicio')
export class VistaCabeceradeinicio extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 10%; flex-direction: row; background-color: #EAEDED;">
 <vaadin-horizontal-layout theme="spacing" style="width: 20%; height: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
   <vaadin-vertical-layout theme="spacing">
    <img style="flex-grow: 0; flex-shrink: 1; height: 100%;" src="https://i1.wp.com/almeria.fape.es/wp-content/uploads/2018/03/logo_Ual_.jpg?resize=351%2C339">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="flex-shrink: 0; justify-content: center; align-self: center;">
    <p style="font-size: 30px; font-weight: bold; height: 100%; flex-grow: 0; flex-shrink: 0; align-self: center; width: 100%;">SpotyUAL</p>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing-s" style="height: 100%; width: 50%; padding-left: var(--lumo-space-m); padding-right: var(--lumo-space-m); flex-grow: 0; flex-shrink: 0; flex-direction: row; margin-left: 30%;">
  <vaadin-button style="align-self: center; width: 100%; height: 50%; margin-left: var(--lumo-space-s);">
    Asistencia 
  </vaadin-button>
  <vaadin-button style="align-self: center; width: 100%; height: 50%;">
    Registrarse 
  </vaadin-button>
  <vaadin-button style="align-self: center; width: 100%; height: 50%;">
    Iniciar Sesión 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 30%; align-items: center; justify-content: center; background-color: #99A3A4;">
 <vaadin-vertical-layout>
  <h1 style="align-self: center;">Escuchar lo es todo</h1>
  <h3 style="align-self: center;">Millones de canciones y pódcasts. No hace falta tarjeta de crédito.</h3>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout>
  <vaadin-button style="width: 100%; height: 100%; flex-shrink: 1; flex-grow: 0;">
    Registrarse 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
<vaadin-vertical-layout style="width: 100%; height: 50%;">
 <vaadin-vertical-layout style="height: 30%; width: 100%;">
  <h3 style="flex-grow: 0; flex-shrink: 0; align-self: center; margin-top: 6%;">Aquí tienes unas canciones de prueba</h3>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 70%; flex-direction: row;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-xl);"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-xl);"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-xl);"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-xl);"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-xl);"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 10%;"></vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
