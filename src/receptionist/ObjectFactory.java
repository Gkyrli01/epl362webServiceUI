
package receptionist;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the receptionist package. 
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

    private final static QName _InsertRelative_QNAME = new QName("http://receptionist/", "insertRelative");
    private final static QName _ReturnMostRecentConsultationOfPatient_QNAME = new QName("http://receptionist/", "returnMostRecentConsultationOfPatient");
    private final static QName _ReturnMostRecentConsultationOfPatientResponse_QNAME = new QName("http://receptionist/", "returnMostRecentConsultationOfPatientResponse");
    private final static QName _ReturnDoctorsResponse_QNAME = new QName("http://receptionist/", "returnDoctorsResponse");
    private final static QName _ReturnLastPerscriptionDetailsByPIdResponse_QNAME = new QName("http://receptionist/", "returnLastPerscriptionDetailsByPIdResponse");
    private final static QName _UpdateRelativeResponse_QNAME = new QName("http://receptionist/", "updateRelativeResponse");
    private final static QName _ReturnDoctors_QNAME = new QName("http://receptionist/", "returnDoctors");
    private final static QName _InsertConsultationResponse_QNAME = new QName("http://receptionist/", "insertConsultationResponse");
    private final static QName _ReturnPrescriptions_QNAME = new QName("http://receptionist/", "returnPrescriptions");
    private final static QName _UpdateConsultation_QNAME = new QName("http://receptionist/", "updateConsultation");
    private final static QName _ReturnPatientById_QNAME = new QName("http://receptionist/", "returnPatientById");
    private final static QName _ReturnRelativesByPatientId_QNAME = new QName("http://receptionist/", "returnRelativesByPatientId");
    private final static QName _UpdateRelative_QNAME = new QName("http://receptionist/", "updateRelative");
    private final static QName _ReturnAllPatients_QNAME = new QName("http://receptionist/", "returnAllPatients");
    private final static QName _ReturnAttentedNotUpdatedConsultations_QNAME = new QName("http://receptionist/", "returnAttentedNotUpdatedConsultations");
    private final static QName _InsertRelativeResponse_QNAME = new QName("http://receptionist/", "insertRelativeResponse");
    private final static QName _DeleteConsultationResponse_QNAME = new QName("http://receptionist/", "deleteConsultationResponse");
    private final static QName _ReturnClinicsResponse_QNAME = new QName("http://receptionist/", "returnClinicsResponse");
    private final static QName _ReturnPrescriptionsResponse_QNAME = new QName("http://receptionist/", "returnPrescriptionsResponse");
    private final static QName _ReturnConsultations_QNAME = new QName("http://receptionist/", "returnConsultations");
    private final static QName _InsertPerscriptionDetail_QNAME = new QName("http://receptionist/", "insertPerscriptionDetail");
    private final static QName _ReturnNotAttentedPatientsResponse_QNAME = new QName("http://receptionist/", "returnNotAttentedPatientsResponse");
    private final static QName _InsertConsultation_QNAME = new QName("http://receptionist/", "insertConsultation");
    private final static QName _InsertTransaction_QNAME = new QName("http://receptionist/", "insertTransaction");
    private final static QName _ReturnConsultationsByIdResponse_QNAME = new QName("http://receptionist/", "returnConsultationsByIdResponse");
    private final static QName _UpdateConsultationResponse_QNAME = new QName("http://receptionist/", "updateConsultationResponse");
    private final static QName _DeleteRelativeResponse_QNAME = new QName("http://receptionist/", "deleteRelativeResponse");
    private final static QName _ReturnAllPatientsResponse_QNAME = new QName("http://receptionist/", "returnAllPatientsResponse");
    private final static QName _DeleteConsultation_QNAME = new QName("http://receptionist/", "deleteConsultation");
    private final static QName _InsertPerscription_QNAME = new QName("http://receptionist/", "insertPerscription");
    private final static QName _ReturnClinics_QNAME = new QName("http://receptionist/", "returnClinics");
    private final static QName _ReturnPatientByIdResponse_QNAME = new QName("http://receptionist/", "returnPatientByIdResponse");
    private final static QName _ReturnRelativesByPatientIdResponse_QNAME = new QName("http://receptionist/", "returnRelativesByPatientIdResponse");
    private final static QName _InsertPerscriptionResponse_QNAME = new QName("http://receptionist/", "insertPerscriptionResponse");
    private final static QName _InsertRequest_QNAME = new QName("http://receptionist/", "insertRequest");
    private final static QName _InsertRequestResponse_QNAME = new QName("http://receptionist/", "insertRequestResponse");
    private final static QName _DeleteRelative_QNAME = new QName("http://receptionist/", "deleteRelative");
    private final static QName _InsertTransactionResponse_QNAME = new QName("http://receptionist/", "insertTransactionResponse");
    private final static QName _ReturnConsultationsById_QNAME = new QName("http://receptionist/", "returnConsultationsById");
    private final static QName _InsertPerscriptionDetailResponse_QNAME = new QName("http://receptionist/", "insertPerscriptionDetailResponse");
    private final static QName _ReturnAttentedNotUpdatedConsultationsResponse_QNAME = new QName("http://receptionist/", "returnAttentedNotUpdatedConsultationsResponse");
    private final static QName _ReturnLastPerscriptionDetailsByPId_QNAME = new QName("http://receptionist/", "returnLastPerscriptionDetailsByPId");
    private final static QName _ReturnNotAttentedPatients_QNAME = new QName("http://receptionist/", "returnNotAttentedPatients");
    private final static QName _ReturnConsultationsResponse_QNAME = new QName("http://receptionist/", "returnConsultationsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: receptionist
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertRequestResponse }
     * 
     */
    public InsertRequestResponse createInsertRequestResponse() {
        return new InsertRequestResponse();
    }

    /**
     * Create an instance of {@link DeleteRelative }
     * 
     */
    public DeleteRelative createDeleteRelative() {
        return new DeleteRelative();
    }

    /**
     * Create an instance of {@link InsertTransactionResponse }
     * 
     */
    public InsertTransactionResponse createInsertTransactionResponse() {
        return new InsertTransactionResponse();
    }

    /**
     * Create an instance of {@link ReturnConsultationsById }
     * 
     */
    public ReturnConsultationsById createReturnConsultationsById() {
        return new ReturnConsultationsById();
    }

    /**
     * Create an instance of {@link InsertPerscriptionDetailResponse }
     * 
     */
    public InsertPerscriptionDetailResponse createInsertPerscriptionDetailResponse() {
        return new InsertPerscriptionDetailResponse();
    }

    /**
     * Create an instance of {@link InsertPerscriptionResponse }
     * 
     */
    public InsertPerscriptionResponse createInsertPerscriptionResponse() {
        return new InsertPerscriptionResponse();
    }

    /**
     * Create an instance of {@link InsertRequest }
     * 
     */
    public InsertRequest createInsertRequest() {
        return new InsertRequest();
    }

    /**
     * Create an instance of {@link ReturnAttentedNotUpdatedConsultationsResponse }
     * 
     */
    public ReturnAttentedNotUpdatedConsultationsResponse createReturnAttentedNotUpdatedConsultationsResponse() {
        return new ReturnAttentedNotUpdatedConsultationsResponse();
    }

    /**
     * Create an instance of {@link ReturnLastPerscriptionDetailsByPId }
     * 
     */
    public ReturnLastPerscriptionDetailsByPId createReturnLastPerscriptionDetailsByPId() {
        return new ReturnLastPerscriptionDetailsByPId();
    }

    /**
     * Create an instance of {@link ReturnNotAttentedPatients }
     * 
     */
    public ReturnNotAttentedPatients createReturnNotAttentedPatients() {
        return new ReturnNotAttentedPatients();
    }

    /**
     * Create an instance of {@link ReturnConsultationsResponse }
     * 
     */
    public ReturnConsultationsResponse createReturnConsultationsResponse() {
        return new ReturnConsultationsResponse();
    }

    /**
     * Create an instance of {@link UpdateConsultationResponse }
     * 
     */
    public UpdateConsultationResponse createUpdateConsultationResponse() {
        return new UpdateConsultationResponse();
    }

    /**
     * Create an instance of {@link DeleteRelativeResponse }
     * 
     */
    public DeleteRelativeResponse createDeleteRelativeResponse() {
        return new DeleteRelativeResponse();
    }

    /**
     * Create an instance of {@link ReturnConsultationsByIdResponse }
     * 
     */
    public ReturnConsultationsByIdResponse createReturnConsultationsByIdResponse() {
        return new ReturnConsultationsByIdResponse();
    }

    /**
     * Create an instance of {@link ReturnClinics }
     * 
     */
    public ReturnClinics createReturnClinics() {
        return new ReturnClinics();
    }

    /**
     * Create an instance of {@link ReturnPatientByIdResponse }
     * 
     */
    public ReturnPatientByIdResponse createReturnPatientByIdResponse() {
        return new ReturnPatientByIdResponse();
    }

    /**
     * Create an instance of {@link ReturnRelativesByPatientIdResponse }
     * 
     */
    public ReturnRelativesByPatientIdResponse createReturnRelativesByPatientIdResponse() {
        return new ReturnRelativesByPatientIdResponse();
    }

    /**
     * Create an instance of {@link ReturnAllPatientsResponse }
     * 
     */
    public ReturnAllPatientsResponse createReturnAllPatientsResponse() {
        return new ReturnAllPatientsResponse();
    }

    /**
     * Create an instance of {@link DeleteConsultation }
     * 
     */
    public DeleteConsultation createDeleteConsultation() {
        return new DeleteConsultation();
    }

    /**
     * Create an instance of {@link InsertPerscription }
     * 
     */
    public InsertPerscription createInsertPerscription() {
        return new InsertPerscription();
    }

    /**
     * Create an instance of {@link InsertRelativeResponse }
     * 
     */
    public InsertRelativeResponse createInsertRelativeResponse() {
        return new InsertRelativeResponse();
    }

    /**
     * Create an instance of {@link DeleteConsultationResponse }
     * 
     */
    public DeleteConsultationResponse createDeleteConsultationResponse() {
        return new DeleteConsultationResponse();
    }

    /**
     * Create an instance of {@link ReturnClinicsResponse }
     * 
     */
    public ReturnClinicsResponse createReturnClinicsResponse() {
        return new ReturnClinicsResponse();
    }

    /**
     * Create an instance of {@link ReturnPrescriptionsResponse }
     * 
     */
    public ReturnPrescriptionsResponse createReturnPrescriptionsResponse() {
        return new ReturnPrescriptionsResponse();
    }

    /**
     * Create an instance of {@link ReturnConsultations }
     * 
     */
    public ReturnConsultations createReturnConsultations() {
        return new ReturnConsultations();
    }

    /**
     * Create an instance of {@link UpdateRelative }
     * 
     */
    public UpdateRelative createUpdateRelative() {
        return new UpdateRelative();
    }

    /**
     * Create an instance of {@link ReturnAllPatients }
     * 
     */
    public ReturnAllPatients createReturnAllPatients() {
        return new ReturnAllPatients();
    }

    /**
     * Create an instance of {@link ReturnAttentedNotUpdatedConsultations }
     * 
     */
    public ReturnAttentedNotUpdatedConsultations createReturnAttentedNotUpdatedConsultations() {
        return new ReturnAttentedNotUpdatedConsultations();
    }

    /**
     * Create an instance of {@link InsertConsultation }
     * 
     */
    public InsertConsultation createInsertConsultation() {
        return new InsertConsultation();
    }

    /**
     * Create an instance of {@link InsertTransaction }
     * 
     */
    public InsertTransaction createInsertTransaction() {
        return new InsertTransaction();
    }

    /**
     * Create an instance of {@link InsertPerscriptionDetail }
     * 
     */
    public InsertPerscriptionDetail createInsertPerscriptionDetail() {
        return new InsertPerscriptionDetail();
    }

    /**
     * Create an instance of {@link ReturnNotAttentedPatientsResponse }
     * 
     */
    public ReturnNotAttentedPatientsResponse createReturnNotAttentedPatientsResponse() {
        return new ReturnNotAttentedPatientsResponse();
    }

    /**
     * Create an instance of {@link ReturnMostRecentConsultationOfPatient }
     * 
     */
    public ReturnMostRecentConsultationOfPatient createReturnMostRecentConsultationOfPatient() {
        return new ReturnMostRecentConsultationOfPatient();
    }

    /**
     * Create an instance of {@link ReturnMostRecentConsultationOfPatientResponse }
     * 
     */
    public ReturnMostRecentConsultationOfPatientResponse createReturnMostRecentConsultationOfPatientResponse() {
        return new ReturnMostRecentConsultationOfPatientResponse();
    }

    /**
     * Create an instance of {@link ReturnDoctorsResponse }
     * 
     */
    public ReturnDoctorsResponse createReturnDoctorsResponse() {
        return new ReturnDoctorsResponse();
    }

    /**
     * Create an instance of {@link ReturnLastPerscriptionDetailsByPIdResponse }
     * 
     */
    public ReturnLastPerscriptionDetailsByPIdResponse createReturnLastPerscriptionDetailsByPIdResponse() {
        return new ReturnLastPerscriptionDetailsByPIdResponse();
    }

    /**
     * Create an instance of {@link UpdateRelativeResponse }
     * 
     */
    public UpdateRelativeResponse createUpdateRelativeResponse() {
        return new UpdateRelativeResponse();
    }

    /**
     * Create an instance of {@link ReturnDoctors }
     * 
     */
    public ReturnDoctors createReturnDoctors() {
        return new ReturnDoctors();
    }

    /**
     * Create an instance of {@link InsertRelative }
     * 
     */
    public InsertRelative createInsertRelative() {
        return new InsertRelative();
    }

    /**
     * Create an instance of {@link UpdateConsultation }
     * 
     */
    public UpdateConsultation createUpdateConsultation() {
        return new UpdateConsultation();
    }

    /**
     * Create an instance of {@link ReturnPatientById }
     * 
     */
    public ReturnPatientById createReturnPatientById() {
        return new ReturnPatientById();
    }

    /**
     * Create an instance of {@link ReturnRelativesByPatientId }
     * 
     */
    public ReturnRelativesByPatientId createReturnRelativesByPatientId() {
        return new ReturnRelativesByPatientId();
    }

    /**
     * Create an instance of {@link InsertConsultationResponse }
     * 
     */
    public InsertConsultationResponse createInsertConsultationResponse() {
        return new InsertConsultationResponse();
    }

    /**
     * Create an instance of {@link ReturnPrescriptions }
     * 
     */
    public ReturnPrescriptions createReturnPrescriptions() {
        return new ReturnPrescriptions();
    }

    /**
     * Create an instance of {@link Disease }
     * 
     */
    public Disease createDisease() {
        return new Disease();
    }

    /**
     * Create an instance of {@link Requests }
     * 
     */
    public Requests createRequests() {
        return new Requests();
    }

    /**
     * Create an instance of {@link Pharmako }
     * 
     */
    public Pharmako createPharmako() {
        return new Pharmako();
    }

    /**
     * Create an instance of {@link Consultations }
     * 
     */
    public Consultations createConsultations() {
        return new Consultations();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link PercriptionDetails }
     * 
     */
    public PercriptionDetails createPercriptionDetails() {
        return new PercriptionDetails();
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
     * Create an instance of {@link Patient }
     * 
     */
    public Patient createPatient() {
        return new Patient();
    }

    /**
     * Create an instance of {@link Clinic }
     * 
     */
    public Clinic createClinic() {
        return new Clinic();
    }

    /**
     * Create an instance of {@link Relatives }
     * 
     */
    public Relatives createRelatives() {
        return new Relatives();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertRelative }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "insertRelative")
    public JAXBElement<InsertRelative> createInsertRelative(InsertRelative value) {
        return new JAXBElement<InsertRelative>(_InsertRelative_QNAME, InsertRelative.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnMostRecentConsultationOfPatient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnMostRecentConsultationOfPatient")
    public JAXBElement<ReturnMostRecentConsultationOfPatient> createReturnMostRecentConsultationOfPatient(ReturnMostRecentConsultationOfPatient value) {
        return new JAXBElement<ReturnMostRecentConsultationOfPatient>(_ReturnMostRecentConsultationOfPatient_QNAME, ReturnMostRecentConsultationOfPatient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnMostRecentConsultationOfPatientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnMostRecentConsultationOfPatientResponse")
    public JAXBElement<ReturnMostRecentConsultationOfPatientResponse> createReturnMostRecentConsultationOfPatientResponse(ReturnMostRecentConsultationOfPatientResponse value) {
        return new JAXBElement<ReturnMostRecentConsultationOfPatientResponse>(_ReturnMostRecentConsultationOfPatientResponse_QNAME, ReturnMostRecentConsultationOfPatientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnDoctorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnDoctorsResponse")
    public JAXBElement<ReturnDoctorsResponse> createReturnDoctorsResponse(ReturnDoctorsResponse value) {
        return new JAXBElement<ReturnDoctorsResponse>(_ReturnDoctorsResponse_QNAME, ReturnDoctorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnLastPerscriptionDetailsByPIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnLastPerscriptionDetailsByPIdResponse")
    public JAXBElement<ReturnLastPerscriptionDetailsByPIdResponse> createReturnLastPerscriptionDetailsByPIdResponse(ReturnLastPerscriptionDetailsByPIdResponse value) {
        return new JAXBElement<ReturnLastPerscriptionDetailsByPIdResponse>(_ReturnLastPerscriptionDetailsByPIdResponse_QNAME, ReturnLastPerscriptionDetailsByPIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRelativeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "updateRelativeResponse")
    public JAXBElement<UpdateRelativeResponse> createUpdateRelativeResponse(UpdateRelativeResponse value) {
        return new JAXBElement<UpdateRelativeResponse>(_UpdateRelativeResponse_QNAME, UpdateRelativeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnDoctors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnDoctors")
    public JAXBElement<ReturnDoctors> createReturnDoctors(ReturnDoctors value) {
        return new JAXBElement<ReturnDoctors>(_ReturnDoctors_QNAME, ReturnDoctors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertConsultationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "insertConsultationResponse")
    public JAXBElement<InsertConsultationResponse> createInsertConsultationResponse(InsertConsultationResponse value) {
        return new JAXBElement<InsertConsultationResponse>(_InsertConsultationResponse_QNAME, InsertConsultationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnPrescriptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnPrescriptions")
    public JAXBElement<ReturnPrescriptions> createReturnPrescriptions(ReturnPrescriptions value) {
        return new JAXBElement<ReturnPrescriptions>(_ReturnPrescriptions_QNAME, ReturnPrescriptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateConsultation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "updateConsultation")
    public JAXBElement<UpdateConsultation> createUpdateConsultation(UpdateConsultation value) {
        return new JAXBElement<UpdateConsultation>(_UpdateConsultation_QNAME, UpdateConsultation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnPatientById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnPatientById")
    public JAXBElement<ReturnPatientById> createReturnPatientById(ReturnPatientById value) {
        return new JAXBElement<ReturnPatientById>(_ReturnPatientById_QNAME, ReturnPatientById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnRelativesByPatientId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnRelativesByPatientId")
    public JAXBElement<ReturnRelativesByPatientId> createReturnRelativesByPatientId(ReturnRelativesByPatientId value) {
        return new JAXBElement<ReturnRelativesByPatientId>(_ReturnRelativesByPatientId_QNAME, ReturnRelativesByPatientId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRelative }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "updateRelative")
    public JAXBElement<UpdateRelative> createUpdateRelative(UpdateRelative value) {
        return new JAXBElement<UpdateRelative>(_UpdateRelative_QNAME, UpdateRelative.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnAllPatients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnAllPatients")
    public JAXBElement<ReturnAllPatients> createReturnAllPatients(ReturnAllPatients value) {
        return new JAXBElement<ReturnAllPatients>(_ReturnAllPatients_QNAME, ReturnAllPatients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnAttentedNotUpdatedConsultations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnAttentedNotUpdatedConsultations")
    public JAXBElement<ReturnAttentedNotUpdatedConsultations> createReturnAttentedNotUpdatedConsultations(ReturnAttentedNotUpdatedConsultations value) {
        return new JAXBElement<ReturnAttentedNotUpdatedConsultations>(_ReturnAttentedNotUpdatedConsultations_QNAME, ReturnAttentedNotUpdatedConsultations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertRelativeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "insertRelativeResponse")
    public JAXBElement<InsertRelativeResponse> createInsertRelativeResponse(InsertRelativeResponse value) {
        return new JAXBElement<InsertRelativeResponse>(_InsertRelativeResponse_QNAME, InsertRelativeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteConsultationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "deleteConsultationResponse")
    public JAXBElement<DeleteConsultationResponse> createDeleteConsultationResponse(DeleteConsultationResponse value) {
        return new JAXBElement<DeleteConsultationResponse>(_DeleteConsultationResponse_QNAME, DeleteConsultationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnClinicsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnClinicsResponse")
    public JAXBElement<ReturnClinicsResponse> createReturnClinicsResponse(ReturnClinicsResponse value) {
        return new JAXBElement<ReturnClinicsResponse>(_ReturnClinicsResponse_QNAME, ReturnClinicsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnPrescriptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnPrescriptionsResponse")
    public JAXBElement<ReturnPrescriptionsResponse> createReturnPrescriptionsResponse(ReturnPrescriptionsResponse value) {
        return new JAXBElement<ReturnPrescriptionsResponse>(_ReturnPrescriptionsResponse_QNAME, ReturnPrescriptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnConsultations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnConsultations")
    public JAXBElement<ReturnConsultations> createReturnConsultations(ReturnConsultations value) {
        return new JAXBElement<ReturnConsultations>(_ReturnConsultations_QNAME, ReturnConsultations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPerscriptionDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "insertPerscriptionDetail")
    public JAXBElement<InsertPerscriptionDetail> createInsertPerscriptionDetail(InsertPerscriptionDetail value) {
        return new JAXBElement<InsertPerscriptionDetail>(_InsertPerscriptionDetail_QNAME, InsertPerscriptionDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnNotAttentedPatientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnNotAttentedPatientsResponse")
    public JAXBElement<ReturnNotAttentedPatientsResponse> createReturnNotAttentedPatientsResponse(ReturnNotAttentedPatientsResponse value) {
        return new JAXBElement<ReturnNotAttentedPatientsResponse>(_ReturnNotAttentedPatientsResponse_QNAME, ReturnNotAttentedPatientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertConsultation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "insertConsultation")
    public JAXBElement<InsertConsultation> createInsertConsultation(InsertConsultation value) {
        return new JAXBElement<InsertConsultation>(_InsertConsultation_QNAME, InsertConsultation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "insertTransaction")
    public JAXBElement<InsertTransaction> createInsertTransaction(InsertTransaction value) {
        return new JAXBElement<InsertTransaction>(_InsertTransaction_QNAME, InsertTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnConsultationsByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnConsultationsByIdResponse")
    public JAXBElement<ReturnConsultationsByIdResponse> createReturnConsultationsByIdResponse(ReturnConsultationsByIdResponse value) {
        return new JAXBElement<ReturnConsultationsByIdResponse>(_ReturnConsultationsByIdResponse_QNAME, ReturnConsultationsByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateConsultationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "updateConsultationResponse")
    public JAXBElement<UpdateConsultationResponse> createUpdateConsultationResponse(UpdateConsultationResponse value) {
        return new JAXBElement<UpdateConsultationResponse>(_UpdateConsultationResponse_QNAME, UpdateConsultationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRelativeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "deleteRelativeResponse")
    public JAXBElement<DeleteRelativeResponse> createDeleteRelativeResponse(DeleteRelativeResponse value) {
        return new JAXBElement<DeleteRelativeResponse>(_DeleteRelativeResponse_QNAME, DeleteRelativeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnAllPatientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnAllPatientsResponse")
    public JAXBElement<ReturnAllPatientsResponse> createReturnAllPatientsResponse(ReturnAllPatientsResponse value) {
        return new JAXBElement<ReturnAllPatientsResponse>(_ReturnAllPatientsResponse_QNAME, ReturnAllPatientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteConsultation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "deleteConsultation")
    public JAXBElement<DeleteConsultation> createDeleteConsultation(DeleteConsultation value) {
        return new JAXBElement<DeleteConsultation>(_DeleteConsultation_QNAME, DeleteConsultation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPerscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "insertPerscription")
    public JAXBElement<InsertPerscription> createInsertPerscription(InsertPerscription value) {
        return new JAXBElement<InsertPerscription>(_InsertPerscription_QNAME, InsertPerscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnClinics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnClinics")
    public JAXBElement<ReturnClinics> createReturnClinics(ReturnClinics value) {
        return new JAXBElement<ReturnClinics>(_ReturnClinics_QNAME, ReturnClinics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnPatientByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnPatientByIdResponse")
    public JAXBElement<ReturnPatientByIdResponse> createReturnPatientByIdResponse(ReturnPatientByIdResponse value) {
        return new JAXBElement<ReturnPatientByIdResponse>(_ReturnPatientByIdResponse_QNAME, ReturnPatientByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnRelativesByPatientIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnRelativesByPatientIdResponse")
    public JAXBElement<ReturnRelativesByPatientIdResponse> createReturnRelativesByPatientIdResponse(ReturnRelativesByPatientIdResponse value) {
        return new JAXBElement<ReturnRelativesByPatientIdResponse>(_ReturnRelativesByPatientIdResponse_QNAME, ReturnRelativesByPatientIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPerscriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "insertPerscriptionResponse")
    public JAXBElement<InsertPerscriptionResponse> createInsertPerscriptionResponse(InsertPerscriptionResponse value) {
        return new JAXBElement<InsertPerscriptionResponse>(_InsertPerscriptionResponse_QNAME, InsertPerscriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "insertRequest")
    public JAXBElement<InsertRequest> createInsertRequest(InsertRequest value) {
        return new JAXBElement<InsertRequest>(_InsertRequest_QNAME, InsertRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "insertRequestResponse")
    public JAXBElement<InsertRequestResponse> createInsertRequestResponse(InsertRequestResponse value) {
        return new JAXBElement<InsertRequestResponse>(_InsertRequestResponse_QNAME, InsertRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRelative }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "deleteRelative")
    public JAXBElement<DeleteRelative> createDeleteRelative(DeleteRelative value) {
        return new JAXBElement<DeleteRelative>(_DeleteRelative_QNAME, DeleteRelative.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "insertTransactionResponse")
    public JAXBElement<InsertTransactionResponse> createInsertTransactionResponse(InsertTransactionResponse value) {
        return new JAXBElement<InsertTransactionResponse>(_InsertTransactionResponse_QNAME, InsertTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnConsultationsById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnConsultationsById")
    public JAXBElement<ReturnConsultationsById> createReturnConsultationsById(ReturnConsultationsById value) {
        return new JAXBElement<ReturnConsultationsById>(_ReturnConsultationsById_QNAME, ReturnConsultationsById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPerscriptionDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "insertPerscriptionDetailResponse")
    public JAXBElement<InsertPerscriptionDetailResponse> createInsertPerscriptionDetailResponse(InsertPerscriptionDetailResponse value) {
        return new JAXBElement<InsertPerscriptionDetailResponse>(_InsertPerscriptionDetailResponse_QNAME, InsertPerscriptionDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnAttentedNotUpdatedConsultationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnAttentedNotUpdatedConsultationsResponse")
    public JAXBElement<ReturnAttentedNotUpdatedConsultationsResponse> createReturnAttentedNotUpdatedConsultationsResponse(ReturnAttentedNotUpdatedConsultationsResponse value) {
        return new JAXBElement<ReturnAttentedNotUpdatedConsultationsResponse>(_ReturnAttentedNotUpdatedConsultationsResponse_QNAME, ReturnAttentedNotUpdatedConsultationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnLastPerscriptionDetailsByPId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnLastPerscriptionDetailsByPId")
    public JAXBElement<ReturnLastPerscriptionDetailsByPId> createReturnLastPerscriptionDetailsByPId(ReturnLastPerscriptionDetailsByPId value) {
        return new JAXBElement<ReturnLastPerscriptionDetailsByPId>(_ReturnLastPerscriptionDetailsByPId_QNAME, ReturnLastPerscriptionDetailsByPId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnNotAttentedPatients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnNotAttentedPatients")
    public JAXBElement<ReturnNotAttentedPatients> createReturnNotAttentedPatients(ReturnNotAttentedPatients value) {
        return new JAXBElement<ReturnNotAttentedPatients>(_ReturnNotAttentedPatients_QNAME, ReturnNotAttentedPatients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnConsultationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://receptionist/", name = "returnConsultationsResponse")
    public JAXBElement<ReturnConsultationsResponse> createReturnConsultationsResponse(ReturnConsultationsResponse value) {
        return new JAXBElement<ReturnConsultationsResponse>(_ReturnConsultationsResponse_QNAME, ReturnConsultationsResponse.class, null, value);
    }

}
