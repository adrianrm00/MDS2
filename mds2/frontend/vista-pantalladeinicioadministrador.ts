import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="container_principal">
 <vaadin-horizontal-layout style="width: 100%; height: 10%; background-color: #EAEDED;" id="container_cabecera"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; align-self: center; justify-content: center;" id="container_principal_opciones">
  <vaadin-horizontal-layout theme="spacing" style="height: 60%; width: 50%; align-self: center; justify-content: center; flex-direction: row; align-items: center; background-color: #EAEDED; margin-bottom: 10%;" id="container_opciones">
   <vaadin-vertical-layout theme="spacing" style="height: 100%; align-items: center; justify-content: center;" id="container_opciones_izq">
    <vaadin-button style="align-self: stretch;" id="boton_anadir_artista">
      Añadir artista 
    </vaadin-button>
    <vaadin-button style="align-self: stretch;" id="boton_anadir_album">
      Añadir álbum 
    </vaadin-button>
    <vaadin-button style="align-self: stretch;" id="boton_anadir_cacnion">
      Añadir canción 
    </vaadin-button>
    <vaadin-button style="align-self: stretch;" id="boton_modificar_estilos">
      Modificar estilos de musica 
    </vaadin-button>
    <vaadin-button style="align-self: stretch;" id="boton_dar_de_baja_perfil">
      Dar de baja un perfil 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="height: 100%; justify-content: center; align-items: center;" id="container_opciones_der">
    <vaadin-button style="align-self: stretch;" id="boton_modificar_artista">
      Modificar artista 
    </vaadin-button>
    <vaadin-button style="align-self: stretch;" id="boton_modificar_album">
      Modificar álbum 
    </vaadin-button>
    <vaadin-button style="align-self: stretch;" id="boton_modificar_cancion">
      Modificar canción 
    </vaadin-button>
    <vaadin-button style="align-self: stretch;" id="boton_modificar_canciones_iniciales">
      Modificar canciones iniciales 
    </vaadin-button>
    <vaadin-button style="align-self: stretch;" id="boton_dar_de_baja_perfil_artista">
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
