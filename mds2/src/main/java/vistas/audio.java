package vistas;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;

@Tag("audio")
public class audio  extends Component {

    public audio(){
        getElement().setAttribute("controls",true);
    }

    public  void setSource(String path){
        getElement().setProperty("src",path);
    }
}

//public class audio {
//
//}
