
package receptionist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for returnDoctorsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="returnDoctorsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://receptionist/}DoctorC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnDoctorsResponse", propOrder = {
    "_return"
})
public class ReturnDoctorsResponse {

    @XmlElement(name = "return", nillable = true)
    protected List<DoctorC> _return;

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
     * {@link DoctorC }
     * 
     * 
     */
    public List<DoctorC> getReturn() {
        if (_return == null) {
            _return = new ArrayList<DoctorC>();
        }
        return this._return;
    }

}
