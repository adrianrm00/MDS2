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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 10%;"></vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%; align-self: center; height: 10%; margin: var(--lumo-space-xl);">
  <vaadin-vertical-layout style="align-self: center; width: 12%; flex-grow: 0; justify-content: center; height: 100%; background-color: #EAEDED;">
   <label style="align-self: center;">Modificar estilos de música</label>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="height: 100%; align-self: center; width: 100%;">
  <vaadin-vertical-layout style="width: 40%; height: 100%; align-self: center; background-color: #EAEDED;">
   <vaadin-vertical-layout style="align-self: center; width: 80%; height: 100%;" theme="spacing">
    <label style="align-self: center; margin-top: var(--lumo-space-xl);">Estilos de música disponibles acutalmente</label>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; flex-direction: row;">
     <vaadin-text-field placeholder="Estilo1" style="flex-grow: 1;"></vaadin-text-field>
     <vaadin-button>
       X 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
     <vaadin-text-field placeholder="Estilo2" style="flex-grow: 1;"></vaadin-text-field>
     <vaadin-button>
       X 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
     <vaadin-text-field placeholder="Estilo3" style="flex-grow: 1;"></vaadin-text-field>
     <vaadin-button>
       X 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
     <vaadin-text-field placeholder="Estilo4" style="flex-grow: 1;"></vaadin-text-field>
     <vaadin-button>
       X 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
     <vaadin-text-field placeholder="Estilo5" style="flex-grow: 1;"></vaadin-text-field>
     <vaadin-button>
       X 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
     <vaadin-text-field placeholder="Estilo6" style="flex-grow: 1;"></vaadin-text-field>
     <vaadin-button>
       X 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
     <vaadin-text-field placeholder="Estilo7" style="flex-grow: 1;"></vaadin-text-field>
     <vaadin-button>
       X 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
     <vaadin-text-field placeholder="Estilo8" style="flex-grow: 1;"></vaadin-text-field>
     <vaadin-button>
       X 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
     <vaadin-text-field placeholder="Estilo9" style="flex-grow: 1;"></vaadin-text-field>
     <vaadin-button>
       X 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
     <vaadin-text-field placeholder="Estilo10" style="flex-grow: 1;"></vaadin-text-field>
     <vaadin-button>
       X 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-button style="align-self: center;">
      + 
    </vaadin-button>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%;">
     <vaadin-button style="flex-grow: 0; width: 100%;">
       Cancelar 
     </vaadin-button>
     <vaadin-button style="flex-grow: 0; width: 100%;">
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
