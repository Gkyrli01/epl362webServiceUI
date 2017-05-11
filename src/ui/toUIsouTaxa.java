package ui;


import java.io.BufferedWriter;
import java.util.List;

import clinical.*;
import clinical.Patient;
import login.*;
import medicalrecord.User;
import healthservice.*;
import medicalrecord.*;
import receptionist.*;
import receptionist.Consultations;

/* SOS
 * Aman exeis Medical gia paradeigma,prepei na prosexeis na dias stes sunartiseis tou to 
 * diko to object.px exeis USER, User klasi mporei na exoun oulla ta web services p exoume,
 * esy prepei na xrisimopoias jino p terkazei sto web service p xrisimopoias twra.
 * Ara me lia logia en mporeis na piaseis patient gia paradeigma p sunartisei allou webservice kai
 * na to xrisimopoihseis gia sunartish kapoiou allou webservice parolo p xereis oti en to idio prama stin
 * ousia.En antitheto stin logiki tou webservice na kammeis kati etsi.
 */

public class toUIsouTaxa {
/*
	public static void main(String[] args) {
		ClinicalStaff OlaAmigo=new ClinicalStaff("Kkokos");
	//	Health ok=new Health();
	}
*/	
	/*
	public static void main(String[] args) {
		AWSReceptionistImplService olImplService=new AWSReceptionistImplService();
		AWSReceptionist opAwsReceptionist=olImplService.getAWSReceptionistImplPort();
		
	Consultations okis=	opAwsReceptionist.returnMostRecentConsultationOfPatient(2);
	
	
		AWSClinicalStaffImplService ok=new AWSClinicalStaffImplService(); //Web Service t Clinical
		AWSClinicalStaff meToutoKaleisSunartisis=ok.getAWSClinicalStaffImplPort(); 
		
		List<Patient> ole=meToutoKaleisSunartisis.returnAllPatients();//Me touto kaleis sunartiseis.
		for(int i=0;i<ole.size();i++){
			System.out.println(ole.get(i).getDiName().getName());
		}
		AWSClinicalStaffImplService ola=new AWSClinicalStaffImplService();
		AWSClinicalStaff toUse=ola.getAWSClinicalStaffImplPort();
				
		System.out.println(toUse.returnPatientById(3).getDescription());
		
		AWSMedicalRecordImplService medicalRecordImplService=new AWSMedicalRecordImplService();
		AWSMedicalRecord medicalToUse=medicalRecordImplService.getAWSMedicalRecordImplPort();
		
		User kokos=new User();
		kokos.setType(3);
		kokos.setUsername("kokos");
		kokos.setPassword("kokos");
		
		if(medicalToUse.insertUser(kokos)){
			System.out.println("Neos User");
		}
		else {
			System.out.println("Exists aleady");
		}
		AWSLoginImplService lg=new AWSLoginImplService();
		AWSLogin login=lg.getAWSLoginImplPort();
		
		if(login.login(kokos.getUsername(), kokos.getPassword())==3){
			System.out.println("Succesful Login");
		}
		else {
			System.out.println("Fuck");
		}
		
		AWSHealthServiceImplService healthServiceImplService=new AWSHealthServiceImplService();
		AWSHealthService service=healthServiceImplService.getAWSHealthServiceImplPort();
		
		System.out.println(service.returnReport());
	}
	*/
}
