package Beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by pcthomas on 31/10/2016.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name =  "MesCoffres")
public class MesCoffres {

    @XmlElement(name = "idCoffre")
    private  Integer idCoffre;

    public Integer getIdCoffre() {
        return idCoffre;
    }

    public void setIdCoffe(Integer value) {
        this.idCoffre = value;
    }
}