import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-anadircancion')
export class VistaAnadircancion extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
  <vaadin-vertical-layout style="width: 100%; align-self: center; height: 10%; margin: var(--lumo-space-xl);">
   <vaadin-vertical-layout style="align-self: center; width: 40%; flex-grow: 0; justify-content: center; height: 100%; background-color: #EAEDED;">
    <label style="align-self: center;">Añadir canción</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 40%; height: 100%; align-self: center; background-color: #EAEDED;">
   <vaadin-vertical-layout style="align-self: center; width: 80%; height: 100%;" theme="spacing-l">
    <vaadin-text-field label="T�tulo:" placeholder="Placeholder" style="width: 100%;"></vaadin-text-field>
    <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;">
     <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0; width: 16%;">Intérprete:</label>
     <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;">
      <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
       <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;"></vaadin-text-field>
       <vaadin-button>
         X 
       </vaadin-button>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
       <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;"></vaadin-text-field>
       <vaadin-button>
         X 
       </vaadin-button>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
     <vaadin-button>
       + 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;">
     <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0; width: 16%;">Compositor:</label>
     <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;">
      <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
       <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;"></vaadin-text-field>
       <vaadin-button>
         X 
       </vaadin-button>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
       <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;"></vaadin-text-field>
       <vaadin-button>
         X 
       </vaadin-button>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
     <vaadin-button>
       + 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;">
     <label style="margin-right: var(--lumo-space-xl); flex-grow: 1; flex-shrink: 0; width: 16%;">Productor:</label>
     <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;">
      <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
       <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;"></vaadin-text-field>
       <vaadin-button>
         X 
       </vaadin-button>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
       <vaadin-text-field style="flex-grow: 1; flex-shrink: 0;"></vaadin-text-field>
       <vaadin-button>
         X 
       </vaadin-button>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
     <vaadin-button>
       + 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 100%;">
     <label style="flex-grow: 1; flex-shrink: 0; margin-right: var(--lumo-space-xs);">Estilos de música:</label>
     <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-m); width: 100%; flex-grow: 0; flex-shrink: 1; align-items: stretch;">
      <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
       <vaadin-combo-box style="flex-grow: 1; flex-shrink: 0;"></vaadin-combo-box>
       <vaadin-button>
         X 
       </vaadin-button>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
       <vaadin-combo-box style="flex-grow: 1; flex-shrink: 0;"></vaadin-combo-box>
       <vaadin-button>
         X 
       </vaadin-button>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
     <vaadin-button>
       + 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
     <label style="flex-grow: 1; flex-shrink: 0;">Fichero multimedia:</label>
     <vaadin-text-field placeholder="mpa, ogg, mp3..." style="width: 100%; flex-grow: 0; flex-shrink: 1;"></vaadin-text-field>
     <vaadin-button style="flex-shrink: 0; flex-grow: 0;">
       Buscar archivos 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; width: 100%; margin-bottom: var(--lumo-space-l);">
     <vaadin-button style="flex-grow: 0; width: 100%;">
       Cancelar 
     </vaadin-button>
     <vaadin-button style="flex-grow: 0; width: 100%;">
      Añádir
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
