
package clinical;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PharmakoSideEffects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PharmakoSideEffects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pharmako" type="{http://clinical/}Pharmako" minOccurs="0"/>
 *         &lt;element name="sideEffect" type="{http://clinical/}SideEffect" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PharmakoSideEffects", propOrder = {
    "pharmako",
    "sideEffect"
})
public class PharmakoSideEffects {

    protected Pharmako pharmako;
    protected SideEffect sideEffect;

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
     * Gets the value of the sideEffect property.
     * 
     * @return
     *     possible object is
     *     {@link SideEffect }
     *     
     */
    public SideEffect getSideEffect() {
        return sideEffect;
    }

    /**
     * Sets the value of the sideEffect property.
     * 
     * @param value
     *     allowed object is
     *     {@link SideEffect }
     *     
     */
    public void setSideEffect(SideEffect value) {
        this.sideEffect = value;
    }

}
