import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-modificarestilosdemusica')
export class VistaModificarestilosdemusica extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_principal">
 <vaadin-vertical-layout style="width: 100%; align-self: center; height: 10%; margin: var(--lumo-space-xl);" id="container_titulo">
  <vaadin-vertical-layout style="align-self: center; width: 12%; flex-grow: 0; justify-content: center; height: 100%; background-color: #EAEDED;" id="container_modificar_estilos">
   <label style="align-self: center;" id="titulo">Modificar estilos de música</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="height: 100%; align-self: center; width: 100%;" id="container_opciones1">
  <vaadin-vertical-layout style="width: 40%; height: 100%; align-self: center; background-color: #EAEDED;" id="container_opciones2">
   <vaadin-vertical-layout style="align-self: center; width: 80%; height: 100%;" theme="spacing" id="container_opciones3">
    <label style="align-self: center; margin-top: var(--lumo-space-xl);" id="texto_estilos_actuales">Estilos de música disponibles acutalmente</label>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; flex-direction: row;" id="container_estilo1">
     <vaadin-text-field placeholder="Estilo1" style="flex-grow: 1;" id="tf_estilo"></vaadin-text-field>
     <vaadin-button id="boton_eliminar">
       X 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-button style="align-self: center;" id="boton_añadir_estilo">
      + 
    </vaadin-button>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%;" id="container_botones">
     <vaadin-button style="flex-grow: 0; width: 100%;" id="boton_cancelar">
       Cancelar 
     </vaadin-button>
     <vaadin-button style="flex-grow: 0; width: 100%;" id="boton_guardar">
       Guardar cambios 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
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
