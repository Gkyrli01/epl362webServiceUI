
package healthservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the healthservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReturnReport_QNAME = new QName("http://healthService/", "returnReport");
    private final static QName _ReturnReportResponse_QNAME = new QName("http://healthService/", "returnReportResponse");
    private final static QName _ReturnDiseasesResponse_QNAME = new QName("http://healthService/", "returnDiseasesResponse");
    private final static QName _ReturnPharmaka_QNAME = new QName("http://healthService/", "returnPharmaka");
    private final static QName _ReturnDiseases_QNAME = new QName("http://healthService/", "returnDiseases");
    private final static QName _ReturnPrescritpionsResponse_QNAME = new QName("http://healthService/", "returnPrescritpionsResponse");
    private final static QName _ReturnPrescritpions_QNAME = new QName("http://healthService/", "returnPrescritpions");
    private final static QName _ReturnPharmakaResponse_QNAME = new QName("http://healthService/", "returnPharmakaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: healthservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnPrescritpions }
     * 
     */
    public ReturnPrescritpions createReturnPrescritpions() {
        return new ReturnPrescritpions();
    }

    /**
     * Create an instance of {@link ReturnPharmakaResponse }
     * 
     */
    public ReturnPharmakaResponse createReturnPharmakaResponse() {
        return new ReturnPharmakaResponse();
    }

    /**
     * Create an instance of {@link ReturnPrescritpionsResponse }
     * 
     */
    public ReturnPrescritpionsResponse createReturnPrescritpionsResponse() {
        return new ReturnPrescritpionsResponse();
    }

    /**
     * Create an instance of {@link ReturnPharmaka }
     * 
     */
    public ReturnPharmaka createReturnPharmaka() {
        return new ReturnPharmaka();
    }

    /**
     * Create an instance of {@link ReturnDiseases }
     * 
     */
    public ReturnDiseases createReturnDiseases() {
        return new ReturnDiseases();
    }

    /**
     * Create an instance of {@link ReturnDiseasesResponse }
     * 
     */
    public ReturnDiseasesResponse createReturnDiseasesResponse() {
        return new ReturnDiseasesResponse();
    }

    /**
     * Create an instance of {@link ReturnReport }
     * 
     */
    public ReturnReport createReturnReport() {
        return new ReturnReport();
    }

    /**
     * Create an instance of {@link ReturnReportResponse }
     * 
     */
    public ReturnReportResponse createReturnReportResponse() {
        return new ReturnReportResponse();
    }

    /**
     * Create an instance of {@link Disease }
     * 
     */
    public Disease createDisease() {
        return new Disease();
    }

    /**
     * Create an instance of {@link Pharmako }
     * 
     */
    public Pharmako createPharmako() {
        return new Pharmako();
    }

    /**
     * Create an instance of {@link Patient }
     * 
     */
    public Patient createPatient() {
        return new Patient();
    }

    /**
     * Create an instance of {@link Perscription }
     * 
     */
    public Perscription createPerscription() {
        return new Perscription();
    }

    /**
     * Create an instance of {@link DoctorC }
     * 
     */
    public DoctorC createDoctorC() {
        return new DoctorC();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthService/", name = "returnReport")
    public JAXBElement<ReturnReport> createReturnReport(ReturnReport value) {
        return new JAXBElement<ReturnReport>(_ReturnReport_QNAME, ReturnReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthService/", name = "returnReportResponse")
    public JAXBElement<ReturnReportResponse> createReturnReportResponse(ReturnReportResponse value) {
        return new JAXBElement<ReturnReportResponse>(_ReturnReportResponse_QNAME, ReturnReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnDiseasesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthService/", name = "returnDiseasesResponse")
    public JAXBElement<ReturnDiseasesResponse> createReturnDiseasesResponse(ReturnDiseasesResponse value) {
        return new JAXBElement<ReturnDiseasesResponse>(_ReturnDiseasesResponse_QNAME, ReturnDiseasesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnPharmaka }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthService/", name = "returnPharmaka")
    public JAXBElement<ReturnPharmaka> createReturnPharmaka(ReturnPharmaka value) {
        return new JAXBElement<ReturnPharmaka>(_ReturnPharmaka_QNAME, ReturnPharmaka.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnDiseases }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthService/", name = "returnDiseases")
    public JAXBElement<ReturnDiseases> createReturnDiseases(ReturnDiseases value) {
        return new JAXBElement<ReturnDiseases>(_ReturnDiseases_QNAME, ReturnDiseases.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnPrescritpionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthService/", name = "returnPrescritpionsResponse")
    public JAXBElement<ReturnPrescritpionsResponse> createReturnPrescritpionsResponse(ReturnPrescritpionsResponse value) {
        return new JAXBElement<ReturnPrescritpionsResponse>(_ReturnPrescritpionsResponse_QNAME, ReturnPrescritpionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnPrescritpions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthService/", name = "returnPrescritpions")
    public JAXBElement<ReturnPrescritpions> createReturnPrescritpions(ReturnPrescritpions value) {
        return new JAXBElement<ReturnPrescritpions>(_ReturnPrescritpions_QNAME, ReturnPrescritpions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnPharmakaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthService/", name = "returnPharmakaResponse")
    public JAXBElement<ReturnPharmakaResponse> createReturnPharmakaResponse(ReturnPharmakaResponse value) {
        return new JAXBElement<ReturnPharmakaResponse>(_ReturnPharmakaResponse_QNAME, ReturnPharmakaResponse.class, null, value);
    }

}
