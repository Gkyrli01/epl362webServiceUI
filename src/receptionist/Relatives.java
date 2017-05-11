
package receptionist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Relatives complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Relatives">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="patient" type="{http://receptionist/}Patient" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relatives", propOrder = {
    "patient",
    "name",
    "phone",
    "id"
})
public class Relatives {

    protected Patient patient;
    protected String name;
    protected int phone;
    protected int id;

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link Patient }
     *     
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Patient }
     *     
     */
    public void setPatient(Patient value) {
        this.patient = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     */
    public int getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     */
    public void setPhone(int value) {
        this.phone = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
