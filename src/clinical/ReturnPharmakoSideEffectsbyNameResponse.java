
package clinical;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for returnPharmakoSideEffectsbyNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="returnPharmakoSideEffectsbyNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://clinical/}PharmakoSideEffects" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnPharmakoSideEffectsbyNameResponse", propOrder = {
    "_return"
})
public class ReturnPharmakoSideEffectsbyNameResponse {

    @XmlElement(name = "return", nillable = true)
    protected List<PharmakoSideEffects> _return;

    /**
     * Gets the value of the return property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the return property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PharmakoSideEffects }
     * 
     * 
     */
    public List<PharmakoSideEffects> getReturn() {
        if (_return == null) {
            _return = new ArrayList<PharmakoSideEffects>();
        }
        return this._return;
    }

}
