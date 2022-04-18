import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-pantalladeinicioadministrador')
export class VistaPantalladeinicioadministrador extends LitElement {
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
 <vaadin-horizontal-layout style="width: 100%; height: 10%; background-color: #EAEDED;">
  <vaadin-horizontal-layout style="width: 20%; height: 100%;">
   <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 100%;">
    <img style="width: 100%; height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
    <p style="font-size: 30px; font-weight: bold; width: 100%; height: 50%; flex-grow: 0; flex-shrink: 0; margin-top: 20%;">SpotyUAL</p>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-s" style="width: 80%; height: 100%; justify-content: flex-end;">
   <img style="height: 50%; width: 5%; align-self: center;" src="https://e7.pngegg.com/pngimages/858/581/png-clipart-profile-icon-user-computer-icons-system-chinese-wind-title-column-miscellaneous-service.png">
   <label style="font-size: 20px; font-weight: bold; align-self: center;">Administrador</label>
   <vaadin-button style="align-self: center; margin-right: var(--lumo-space-m);">
    Salir
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; align-self: center; justify-content: center;">
  <vaadin-horizontal-layout theme="spacing" style="height: 60%; width: 50%; align-self: center; justify-content: center; flex-direction: row; align-items: center; background-color: #EAEDED; margin-bottom: 10%;">
   <vaadin-vertical-layout theme="spacing" style="height: 100%; align-items: center; justify-content: center;">
    <vaadin-button style="align-self: stretch;">
     Añadir artista
    </vaadin-button>
    <vaadin-button style="align-self: stretch;">
     Añadir álbum
    </vaadin-button>
    <vaadin-button style="align-self: stretch;">
     Añadir canción
    </vaadin-button>
    <vaadin-button style="align-self: stretch;">
     Modificar estilos de musica
    </vaadin-button>
    <vaadin-button style="align-self: stretch;">
     Dar de baja un perfil
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="height: 100%; justify-content: center; align-items: center;">
    <vaadin-button style="align-self: stretch;">
     Modificar artista
    </vaadin-button>
    <vaadin-button style="align-self: stretch;">
     Modificar álbum
    </vaadin-button>
    <vaadin-button style="align-self: stretch;">
     Modificar canción
    </vaadin-button>
    <vaadin-button style="align-self: stretch;">
     Modificar canciones iniciales
    </vaadin-button>
    <vaadin-button style="align-self: stretch;">
     Dar de baja un perfil de artista
    </vaadin-button>
   </vaadin-vertical-layout>
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
