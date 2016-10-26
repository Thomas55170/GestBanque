package Beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.ArrayList;


/**
 * Created by pcthomas on 25/10/2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ListeCoffresBoutique")
public class ListeCoffresBoutique {

    @XmlElement(name = "Coffre", type= Coffre.class)
    private List<Coffre> _ListeCoffresBoutique;

    public ListeCoffresBoutique(){}

    public List<Coffre> getListeCoffresBoutique(){
        return this._ListeCoffresBoutique;
    }

    public void setListeCoffresBoutique(List<Coffre> aListeCoffresBoutique){
        this._ListeCoffresBoutique = aListeCoffresBoutique;
    }

}
