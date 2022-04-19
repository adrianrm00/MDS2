import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-evento')
export class VistaEvento extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; align-items: flex-start; flex-direction: row;" id="container_cabecera">
  <vaadin-vertical-layout style="width: 300%; height: 100%; justify-content: center;" id="conainer_titulo">
   <label style="font-size:32px; font-weight:bold;" id="titulo_proximos eventos">Proximos eventos</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; justify-content: center; align-items: center; align-self: center;" id="container_boton">
   <vaadin-button id="boton_editar_eventos">
     Editar Eventos 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 400%;" id="vaadinVerticalLayout">
  <vaadin-vertical-layout style="width: 100%; flex-direction: row;" id="container_datos">
   <vaadin-vertical-layout style="width: 100%;" id="container_nombre_evento">
    <label id="texto_nombre_evento">Nombre evento</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%;" id="container_ciudad">
    <label id="texto_ciudad">Ciudad</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%;" id="container_fecha">
    <label id="texto_fecha">Fecha</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_eventos"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
