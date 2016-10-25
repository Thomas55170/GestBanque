package Beans;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by etienne on 25/10/2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ListingClient")
public class ListeClientBanque {

    @XmlElement(name = "ClientBanque", type= ClientBanque.class)
    private List<ClientBanque> _ListeClientBanque;

    public ListeClientBanque(){}

    public List<ClientBanque> getListeClientBanque(){
        return this._ListeClientBanque;
    }

    public void setListeClientBanque(List<ClientBanque> aListeClientBanque){
        this._ListeClientBanque = aListeClientBanque;
    }


}
