
package receptionist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for returnMostRecentConsultationOfPatientResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="returnMostRecentConsultationOfPatientResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://receptionist/}Consultations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnMostRecentConsultationOfPatientResponse", propOrder = {
    "_return"
})
public class ReturnMostRecentConsultationOfPatientResponse {

    @XmlElement(name = "return")
    protected Consultations _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Consultations }
     *     
     */
    public Consultations getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Consultations }
     *     
     */
    public void setReturn(Consultations value) {
        this._return = value;
    }

}
