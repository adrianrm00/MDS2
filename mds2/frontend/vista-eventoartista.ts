import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-eventoartista')
export class VistaEventoartista extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;" id="container_principal">
 <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;" id="comtainer_nombre_concierto">
  <label style="width: 100%;" id="texto_nombre_concierto">Nombre del concierto </label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;" id="comtainer_ciudad">
  <label style="width: 100%;" id="texto_ciudad">Ciudad</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;" id="comtainer_fecha_evento">
  <label style="width: 100%;" id="texto_fecha_evento">Fecha del evento</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;" id="comtainer_botones">
  <vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; align-items: center;" id="comtainer_boton_editar">
   <vaadin-button id="boton_editar">
     Editar 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;" id="comtainer_boton_borrar">
   <vaadin-button id="boton_borrar">
     Borrar 
   </vaadin-button>
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
