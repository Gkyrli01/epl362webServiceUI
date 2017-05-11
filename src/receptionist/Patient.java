
package receptionist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Patient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doctor" type="{http://receptionist/}DoctorC" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="adress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dead" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Selfharm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="diName" type="{http://receptionist/}Disease" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient", propOrder = {
    "name",
    "doctor",
    "id",
    "adress",
    "dead",
    "description",
    "selfharm",
    "diName",
    "phoneNumber"
})
public class Patient {

    protected String name;
    protected DoctorC doctor;
    protected int id;
    protected String adress;
    protected boolean dead;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Selfharm")
    protected boolean selfharm;
    protected Disease diName;
    protected int phoneNumber;

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
     * Gets the value of the doctor property.
     * 
     * @return
     *     possible object is
     *     {@link DoctorC }
     *     
     */
    public DoctorC getDoctor() {
        return doctor;
    }

    /**
     * Sets the value of the doctor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoctorC }
     *     
     */
    public void setDoctor(DoctorC value) {
        this.doctor = value;
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

    /**
     * Gets the value of the adress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdress() {
        return adress;
    }

    /**
     * Sets the value of the adress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdress(String value) {
        this.adress = value;
    }

    /**
     * Gets the value of the dead property.
     * 
     */
    public boolean isDead() {
        return dead;
    }

    /**
     * Sets the value of the dead property.
     * 
     */
    public void setDead(boolean value) {
        this.dead = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the selfharm property.
     * 
     */
    public boolean isSelfharm() {
        return selfharm;
    }

    /**
     * Sets the value of the selfharm property.
     * 
     */
    public void setSelfharm(boolean value) {
        this.selfharm = value;
    }

    /**
     * Gets the value of the diName property.
     * 
     * @return
     *     possible object is
     *     {@link Disease }
     *     
     */
    public Disease getDiName() {
        return diName;
    }

    /**
     * Sets the value of the diName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Disease }
     *     
     */
    public void setDiName(Disease value) {
        this.diName = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     */
    public void setPhoneNumber(int value) {
        this.phoneNumber = value;
    }

}
