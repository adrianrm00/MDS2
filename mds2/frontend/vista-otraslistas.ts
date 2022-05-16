import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-otraslistas')
export class VistaOtraslistas extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; padding: var(--lumo-space-l); position: sticky;" id="container_informacion_lista">
  <vaadin-vertical-layout style="height: 100%; width: 100%;" id="container_imagen">
   <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png" id="img">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="height: 100%; width: 300%;" id="container_informacion">
   <vaadin-vertical-layout style="width: 40%; flex-grow: 0; flex-shrink: 1;" id="container_nombre_lista">
    <vaadin-text-field label="Nobre de la Lista:" placeholder="Placeholder" style="width: 100%; height: 100%;" id="tf_nombre_lista"></vaadin-text-field>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 20%; justify-content: center;" id="container_creada_por">
    <label style="font-weight: bold;" id="titulo_creada_por">Creada por : Nombre del usuario</label>
    <vaadin-button id="boton_creador_lista">
      Perfil Usuario 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 20%; justify-content: center;" id="container_num_lista">
    <label style="width: 100%;" id="titulo_num_lista">Lista: XXX/100</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center; flex-direction: row;" id="container_botones_lista">
   <vaadin-vertical-layout id="container_boton_añadir_a_mislistas" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
   <vaadin-vertical-layout id="container_boton_compartir" style="width: 100%; height: 100%; justify-content: center; align-items: center;">
    <vaadin-button id="boton_compartir">
      Compartir 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="Container_Boton_Reproducir" style="width: 100%; height: 100%; align-items: center; justify-content: center;">
    <vaadin-button id="Boton_Reproducri">
     Reproducir
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="container_canciones_listas" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
