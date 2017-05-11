
package clinical;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PercriptionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PercriptionDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="perscription" type="{http://clinical/}Perscription" minOccurs="0"/>
 *         &lt;element name="pharmako" type="{http://clinical/}Pharmako" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercriptionDetails", propOrder = {
    "perscription",
    "pharmako",
    "quantity"
})
public class PercriptionDetails {

    protected Perscription perscription;
    protected Pharmako pharmako;
    protected int quantity;

    /**
     * Gets the value of the perscription property.
     * 
     * @return
     *     possible object is
     *     {@link Perscription }
     *     
     */
    public Perscription getPerscription() {
        return perscription;
    }

    /**
     * Sets the value of the perscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perscription }
     *     
     */
    public void setPerscription(Perscription value) {
        this.perscription = value;
    }

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
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

}
