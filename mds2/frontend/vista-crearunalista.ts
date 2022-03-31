import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-anadircancionalista';

@customElement('vista-crearunalista')
export class VistaCrearunalista extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; height: 40%; flex-direction: row; padding: var(--lumo-space-l); position: sticky;">
  <vaadin-vertical-layout style="height: 100%; width: 20%;">
   <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="height: 100%; width: 100%;">
   <vaadin-vertical-layout style="width: 40%; flex-grow: 0; flex-shrink: 1;">
    <vaadin-text-field label="Nobre de la Lista:" placeholder="Placeholder" style="width: 100%; height: 100%;"></vaadin-text-field>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 20%; justify-content: center;">
    <label style="width: 100%; font-weight: bold;">Creada por : Nombre del usuario</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 20%; justify-content: center;">
    <label style="width: 100%;">Lista: XXX/100</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-l);">
  <vaadin-vertical-layout style="width: 100%; height: 30%;">
   <vaadin-vertical-layout theme="spacing" style="width: 100%;">
    <label style="font-weight: bold; width: 100%;">Busca algo para tu lista:</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 40%; height: 100%; flex-direction: row;">
    <vaadin-text-field placeholder="Placeholder" style="width: 60%;"></vaadin-text-field>
    <vaadin-button style="width: 10%;">
     <img style="width: 100%;" src="https://w7.pngwing.com/pngs/608/913/png-transparent-computer-icons-google-search-symbol-mobile-search-search-for-miscellaneous-logo-mobile-phones.png">
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%; height: 100%; padding-right: var(--lumo-space-xl);">
   <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; padding-bottom: var(--lumo-space-xl);">
    <vaadin-vertical-layout style="width: 100%; height: 100%; padding-right: var(--lumo-space-m);">
     <vista-anadircancionalista style="width: 100%; height: 100%;"></vista-anadircancionalista>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m);">
     <vista-anadircancionalista style="width: 100%; height: 100%;"></vista-anadircancionalista>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; padding-bottom: var(--lumo-space-xl);">
    <vaadin-vertical-layout style="width: 100%; height: 100%; padding-right: var(--lumo-space-m);">
     <vista-anadircancionalista style="width: 100%; height: 100%;"></vista-anadircancionalista>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m);">
     <vista-anadircancionalista style="width: 100%; height: 100%;"></vista-anadircancionalista>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; padding-bottom: var(--lumo-space-xl);">
    <vaadin-vertical-layout style="width: 100%; height: 100%; padding-right: var(--lumo-space-m);">
     <vista-anadircancionalista style="width: 100%; height: 100%;"></vista-anadircancionalista>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m);">
     <vista-anadircancionalista style="width: 100%; height: 100%;"></vista-anadircancionalista>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; padding-bottom: var(--lumo-space-xl);">
    <vaadin-vertical-layout style="width: 100%; height: 100%; padding-right: var(--lumo-space-m);">
     <vista-anadircancionalista style="width: 100%; height: 100%;"></vista-anadircancionalista>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m);">
     <vista-anadircancionalista style="width: 100%; height: 100%;"></vista-anadircancionalista>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; padding-bottom: var(--lumo-space-xl);">
    <vaadin-vertical-layout style="width: 100%; height: 100%; padding-right: var(--lumo-space-m);">
     <vista-anadircancionalista style="width: 100%; height: 100%;"></vista-anadircancionalista>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m);">
     <vista-anadircancionalista style="width: 100%; height: 100%;"></vista-anadircancionalista>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; padding-bottom: var(--lumo-space-xl);">
    <vaadin-vertical-layout style="width: 100%; height: 100%; padding-right: var(--lumo-space-m);">
     <vista-anadircancionalista style="width: 100%; height: 100%;"></vista-anadircancionalista>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m);">
     <vista-anadircancionalista style="width: 100%; height: 100%;"></vista-anadircancionalista>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; padding-bottom: var(--lumo-space-xl);">
    <vaadin-vertical-layout style="width: 100%; height: 100%; padding-right: var(--lumo-space-m);">
     <vista-anadircancionalista style="width: 100%; height: 100%;"></vista-anadircancionalista>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="width: 100%; height: 100%; padding-left: var(--lumo-space-m);">
     <vista-anadircancionalista style="width: 100%; height: 100%;"></vista-anadircancionalista>
    </vaadin-vertical-layout>
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
