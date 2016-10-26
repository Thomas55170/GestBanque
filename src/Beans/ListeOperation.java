package Beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by etienne on 25/10/2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ListingOperation")
public class ListeOperation {

    @XmlElement(name = "Operation", type= Operation.class)
    private List<Operation> _ListeOperation;

    public ListeOperation(){}

    public List<Operation> getListeOperation(){
        return this._ListeOperation;
    }

    public void setListeOperation(List<Operation> aListeOperation){
        this._ListeOperation = aListeOperation;
    }


}
