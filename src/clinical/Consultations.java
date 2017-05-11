
package clinical;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Consultations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Consultations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="patient" type="{http://clinical/}Patient" minOccurs="0"/>
 *         &lt;element name="doctorC" type="{http://clinical/}DoctorC" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attented" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dropin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="perscriptioId" type="{http://clinical/}Perscription" minOccurs="0"/>
 *         &lt;element name="clinic" type="{http://clinical/}Clinic" minOccurs="0"/>
 *         &lt;element name="updated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="consultationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consultations", propOrder = {
    "patient",
    "doctorC",
    "date",
    "attented",
    "dropin",
    "perscriptioId",
    "clinic",
    "updated",
    "consultationId"
})
public class Consultations {

    protected Patient patient;
    protected DoctorC doctorC;
    protected String date;
    protected int attented;
    protected int dropin;
    protected Perscription perscriptioId;
    protected Clinic clinic;
    protected int updated;
    protected int consultationId;

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
     * Gets the value of the doctorC property.
     * 
     * @return
     *     possible object is
     *     {@link DoctorC }
     *     
     */
    public DoctorC getDoctorC() {
        return doctorC;
    }

    /**
     * Sets the value of the doctorC property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoctorC }
     *     
     */
    public void setDoctorC(DoctorC value) {
        this.doctorC = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the attented property.
     * 
     */
    public int getAttented() {
        return attented;
    }

    /**
     * Sets the value of the attented property.
     * 
     */
    public void setAttented(int value) {
        this.attented = value;
    }

    /**
     * Gets the value of the dropin property.
     * 
     */
    public int getDropin() {
        return dropin;
    }

    /**
     * Sets the value of the dropin property.
     * 
     */
    public void setDropin(int value) {
        this.dropin = value;
    }

    /**
     * Gets the value of the perscriptioId property.
     * 
     * @return
     *     possible object is
     *     {@link Perscription }
     *     
     */
    public Perscription getPerscriptioId() {
        return perscriptioId;
    }

    /**
     * Sets the value of the perscriptioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perscription }
     *     
     */
    public void setPerscriptioId(Perscription value) {
        this.perscriptioId = value;
    }

    /**
     * Gets the value of the clinic property.
     * 
     * @return
     *     possible object is
     *     {@link Clinic }
     *     
     */
    public Clinic getClinic() {
        return clinic;
    }

    /**
     * Sets the value of the clinic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clinic }
     *     
     */
    public void setClinic(Clinic value) {
        this.clinic = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     */
    public int getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     */
    public void setUpdated(int value) {
        this.updated = value;
    }

    /**
     * Gets the value of the consultationId property.
     * 
     */
    public int getConsultationId() {
        return consultationId;
    }

    /**
     * Sets the value of the consultationId property.
     * 
     */
    public void setConsultationId(int value) {
        this.consultationId = value;
    }

}
