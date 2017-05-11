
package medicalrecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PharmakoTreats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PharmakoTreats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pharmako" type="{http://medicalRecord/}Pharmako" minOccurs="0"/>
 *         &lt;element name="disease" type="{http://medicalRecord/}Disease" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PharmakoTreats", propOrder = {
    "pharmako",
    "disease"
})
public class PharmakoTreats {

    protected Pharmako pharmako;
    protected Disease disease;

    /**
     * Gets the value of the pharmako property.
     * 
     * @return
     *     possible object is
     *     {@link Pharmako }
     *     
     */
    public Pharmako getPharmako() {
        return pharmako;
    }

    /**
     * Sets the value of the pharmako property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pharmako }
     *     
     */
    public void setPharmako(Pharmako value) {
        this.pharmako = value;
    }

    /**
     * Gets the value of the disease property.
     * 
     * @return
     *     possible object is
     *     {@link Disease }
     *     
     */
    public Disease getDisease() {
        return disease;
    }

    /**
     * Sets the value of the disease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Disease }
     *     
     */
    public void setDisease(Disease value) {
        this.disease = value;
    }

}
