package ui;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import clinical.AWSClinicalStaff;
import clinical.AWSClinicalStaffImplService;
import clinical.Consultations;
import clinical.Disease;
import clinical.DoctorC;
import clinical.Overrule;
import clinical.Patient;
import clinical.PatientSideEffects;
import clinical.PercriptionDetails;
import clinical.Perscription;
import clinical.Pharmako;
import clinical.PharmakoSideEffects;
import clinical.PharmakoTreats;
import clinical.SelfHarmIncident;
import clinical.SideEffect;
import medicalrecord.AWSMedicalRecord;
import medicalrecord.AWSMedicalRecordImplService;
import medicalrecord.Transaction;

import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.ListModel;

public class ClinicalStaff extends JFrame {

	//DefaultListModel listModel;
	//DefaultListModel listModel1;
	int currentProduct=0;
	int patientListNumber=0;
	private JTextField id;
	public AWSClinicalStaffImplService ok=new AWSClinicalStaffImplService();
	public AWSClinicalStaff clinicalStaff;
	List<Patient> patients;
	DefaultListModel modelPatients=new DefaultListModel();
	List<Disease> diseases;
	DefaultListModel modelDiseases=new DefaultListModel();
	List<SideEffect>allergies;
	DefaultListModel modelAllergies=new DefaultListModel();
	List<Pharmako>pharmako;
	DefaultListModel modelPharmako=new DefaultListModel();
	List<DoctorC>doctors;
	DefaultListModel modelDoctors=new DefaultListModel();
	Consultations lastConsult;
	Perscription lastPerscription;
	List<PercriptionDetails>lastPrescriptionDetails;
	DefaultListModel modelPrescriptionDetails=new DefaultListModel();
	List<PatientSideEffects>patientSideEffects;
	DefaultListModel modelPatientSideEffects=new DefaultListModel();
	List<PharmakoTreats>pharmakoTreats;
	DefaultListModel modelPharmakoTreats=new DefaultListModel();
	List<PharmakoSideEffects>pharmakoSideEffects;
	
	DefaultListModel modelPharmakoSideEffects=new DefaultListModel();
	List<PercriptionDetails> previousPrescriptionDetails;
	DefaultListModel modelPreviousPrescription=new DefaultListModel();
	DefaultListModel detailsModel;
	JTextArea txtDrugSideEffects;
	JTextArea txtTreats;
	JLabel lblConsultDate;
	JTextArea txtSelfHarm;
	JLabel lblTreats ;
	JButton btnAddSelfHarmIncident;
	JTextArea diagnosis ;
	JLabel lbldisease;
	JLabel lblDoctor;
	JLabel lblAdress;
	JLabel lblPhoneNumber;
	JCheckBox checkBoxDead;
	JCheckBox checkBoxSelfharmful;
	JComboBox comboBoxDoctor;
	JComboBox comboDiseases;
	JList listAlergies;
	JButton search;
	JButton allPatients;
	JButton btnInsertDrug;
	JComboBox comboBoxPatientAllergies ;
	JLabel lblAllergies;
	JButton btnAddAllergy;
	JLabel lblSideeffects;
	JButton btnDeleteDrug;
	JLabel lblRecordSelfHarm;
	JButton btnDeleteAllergy;
	Patient currentPatient; 
	private JTextField txtAdress;
	private JTextField txtPhone;
	private JScrollPane previousPrescription;
	private JList previousDetails;
	private JTextField txtQuantity;
	private JLabel lblX;
	String username;
	List<Consultations>notUpdatedConsults;

	   private class MyListCellRenderer extends DefaultListCellRenderer {

	        @Override
	        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

	            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
	           // label.setOpaque(true); // Highlight only when selected
	           // label.setOpaque(true); // Highlight always
                label.setEnabled(true);     

	            if(patients.get(index).isSelfharm()){
	            	label.setOpaque(true);
	                label.setBackground(Color.YELLOW);	
	            }
	            
	            for (Consultations c : notUpdatedConsults) {
					if(patients.get(index).getId()==c.getPatient().getId()){
		                label.setBackground(Color.RED);
		                return label;
					}
				}
	            return label;
	        }
	    }
	
	public ClinicalStaff(String user) {
		username=user;
		clinicalStaff=ok.getAWSClinicalStaffImplPort();
		notUpdatedConsults=clinicalStaff.returnAttentedNotUpdatedConsultations();

		//AWSMedicalRecordImplService op=new AWSMedicalRecordImplService();
		//AWSMedicalRecord ole=op.getAWSMedicalRecordImplPort();
		//List<Transaction> opas=ole.returnTransaction();
		
		getContentPane().setLayout(null);
		diseases=clinicalStaff.returnDiseases();
		//listModel = new DefaultListModel();
		
		JLabel lblCurrent = new JLabel("Patients");
		lblCurrent.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrent.setBounds(112, 11, 162, 32);
		getContentPane().add(lblCurrent);
		
		
		JScrollPane results1 = new JScrollPane();
		//results1.setLocation(200, 0);
		results1.setBounds(75, 57, 260, 400);
		 detailsModel = new DefaultListModel();

		//listModel1 = new DefaultListModel();
		
		JList list1 = new JList(modelPatients);
        list1.setCellRenderer(new MyListCellRenderer());
        
		list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GridBagConstraints gbc_list1 = new GridBagConstraints();
		gbc_list1.gridheight = 5;
		gbc_list1.gridwidth = 11;
		gbc_list1.insets = new Insets(0, 0, 0, 5);
		gbc_list1.fill = GridBagConstraints.BOTH;
		gbc_list1.gridx = 2;
		gbc_list1.gridy = 8;
		
		results1.setViewportView(list1);
		getContentPane().add(results1, gbc_list1);
		
		
		patients =clinicalStaff.returnAllPatients();
		int i=0;
		for (Patient patient : patients) {
			modelPatients.addElement(patient.getName()+" | "+patient.getDiName().getName()+" | ");
			list1.getCellRenderer().getListCellRendererComponent(list1, patient.isSelfharm(), i, false, false);
		}
		
		JLabel lblTotalPrice = new JLabel("Search Id");
		lblTotalPrice.setBounds(123, 468, 78, 14);
		getContentPane().add(lblTotalPrice);
		
		id = new JTextField();
		id.setBounds(211, 465, 109, 20);
		getContentPane().add(id);
		id.setColumns(10);
		
		 search = new JButton("Search Id");
		search.setBounds(211, 496, 89, 23);
		getContentPane().add(search);
		
		JLabel lblOverview = new JLabel("Details");
		lblOverview.setBounds(526, 20, 46, 14);
		getContentPane().add(lblOverview);
		
		 allPatients = new JButton("All Patients");
		allPatients.setBounds(96, 496, 89, 23);
		getContentPane().add(allPatients);
		
		 diagnosis = new JTextArea();
		diagnosis.setBounds(399, 88, 307, 61);
		getContentPane().add(diagnosis);
		
		JLabel lblDiagnosis = new JLabel("Diagnosis");
		lblDiagnosis.setBounds(399, 57, 78, 16);
		getContentPane().add(lblDiagnosis);
		
		 lbldisease = new JLabel("Disease");
		lbldisease.setBounds(399, 178, 78, 14);
		getContentPane().add(lbldisease);
		
		comboDiseases = new JComboBox();
		
		for (Disease disease : diseases) {
			comboDiseases.addItem(disease.getName());
		}
		comboDiseases.setBounds(520, 175, 130, 20);
		getContentPane().add(comboDiseases);
		
		 checkBoxDead = new JCheckBox("Dead");
		checkBoxDead.setBounds(723, 89, 97, 23);
		getContentPane().add(checkBoxDead);
		
		 checkBoxSelfharmful = new JCheckBox("SelfHarmful");
		checkBoxSelfharmful.setBounds(723, 126, 97, 23);
		getContentPane().add(checkBoxSelfharmful);
		
		 comboBoxDoctor = new JComboBox();
		comboBoxDoctor.setBounds(520, 230, 130, 20);
		getContentPane().add(comboBoxDoctor);
		doctors=clinicalStaff.returnDoctors();
		for (DoctorC sideEffect : doctors) {
			comboBoxDoctor.addItem(sideEffect.getDoctorName());
		}
		/////////////
		
		//////////////
		 lblDoctor = new JLabel("Doctor");
		lblDoctor.setBounds(399, 233, 78, 14);
		getContentPane().add(lblDoctor);
		
		 lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(399, 290, 78, 14);
		getContentPane().add(lblAdress);
		
		 lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setBounds(399, 333, 78, 14);
		getContentPane().add(lblPhoneNumber);
		
		txtAdress = new JTextField();
		txtAdress.setBounds(520, 287, 130, 20);
		getContentPane().add(txtAdress);
		txtAdress.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(520, 330, 130, 20);
		getContentPane().add(txtPhone);
		
		JScrollPane prescriptionDetails = new JScrollPane();
		prescriptionDetails.setBounds(840, 176, 109, 238);
		getContentPane().add(prescriptionDetails);
		JList detailsList = new JList(detailsModel);
		detailsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		prescriptionDetails.setViewportView(detailsList);
		
		JComboBox comboBoxPharmaka = new JComboBox();
		
		pharmako=clinicalStaff.returnPharmako();
		for (Pharmako ph : pharmako) {
			comboBoxPharmaka.addItem(ph.getName());
		}
		comboBoxPharmaka.setBounds(693, 197, 130, 20);
		getContentPane().add(comboBoxPharmaka);
		comboBoxPharmaka.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lastConsult==null || noRecentConsult ||currentPatient.isDead()){
					JOptionPane.showMessageDialog(null, "No Consultation.");
					return;
				}
				if(pharmakoSideEffects!=null)
					pharmakoSideEffects.clear();
				if(pharmakoTreats!=null)
					pharmakoTreats.clear();
				txtTreats.setText("");
				txtDrugSideEffects.setText("");
				pharmakoSideEffects=clinicalStaff.returnPharmakoSideEffectsbyName(pharmako.get(comboBoxPharmaka.getSelectedIndex()).getName());
				pharmakoTreats=clinicalStaff.returnPharmakoTreatsByDrugName(pharmako.get(comboBoxPharmaka.getSelectedIndex()).getName());
				for (PharmakoSideEffects sideEffect : pharmakoSideEffects) {
					txtDrugSideEffects.setText(txtDrugSideEffects.getText()+sideEffect.getSideEffect().getName()+"\n");
				}
				for (PharmakoTreats sideEffect2 : pharmakoTreats) {
					txtTreats.setText(txtTreats.getText()+sideEffect2.getDisease().getName()+"\n");
				}
			}
		});
		
		
		JLabel lblNewLabel = new JLabel("Drugs:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(708, 162, 97, 30);
		getContentPane().add(lblNewLabel);
		
		 btnInsertDrug = new JButton("Add Drug");
		btnInsertDrug.setBounds(660, 229, 89, 23);
		getContentPane().add(btnInsertDrug);
		btnInsertDrug.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try {
					if(lastConsult==null || noRecentConsult ||currentPatient.isDead()){
						JOptionPane.showMessageDialog(null, "No Consultation.");
						return;
					}
					String tmpr=txtQuantity.getText();
					System.out.println(txtQuantity.getText());
					Integer.parseInt(tmpr);
					PercriptionDetails tmPercriptionDetails=new PercriptionDetails();
					tmPercriptionDetails.setQuantity(Integer.parseInt(tmpr));
					tmPercriptionDetails.setPharmako(pharmako.get(comboBoxPharmaka.getSelectedIndex()));
					if(clinicalStaff.returnPatientAllergy(currentPatient.getId(), tmPercriptionDetails.getPharmako().getName())){
						int dialogButton = JOptionPane.YES_NO_OPTION;
						int dialogResult = JOptionPane.showConfirmDialog (null, "Patient allergies!Overrule?","Warning",dialogButton);
						if(dialogResult == JOptionPane.NO_OPTION){
							return;
						}
						Overrule tmp=new Overrule();
						tmp.setPatient(currentPatient);
						tmp.setUsername(username);
						tmp.setDetails(pharmako.get(comboBoxPharmaka.getSelectedIndex()).getName());
						clinicalStaff.insertOverrule(tmp, username);
					}
					
					tmPercriptionDetails.setPerscription(lastConsult.getPerscriptioId());
					clinicalStaff.insertPerscriptionDetails(tmPercriptionDetails, username);
					detailsModel.removeAllElements();
					lastPrescriptionDetails=clinicalStaff.returnLastPerscriptionDetailsByPId(lastConsult.getPatient().getId());
					for (PercriptionDetails sideEffect : lastPrescriptionDetails) {
						detailsModel.addElement(sideEffect.getPharmako().getName()+":"+sideEffect.getQuantity());
					}
				} catch (Exception e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(null, "Give A Number pls");
				}
				
				//clinicalStaff.insertPerscriptionDetails(c, arg1)pharmako.get(comboBoxPharmaka.getSelectedIndex());
			}
		});
		
		JScrollPane AllergiesScrollPane = new JScrollPane();
		AllergiesScrollPane.setBounds(493, 380, 109, 238);
		getContentPane().add(AllergiesScrollPane);
		
		 listAlergies = new JList(modelAllergies);
		AllergiesScrollPane.setViewportView(listAlergies);
	//	List<SideEffect>allergies
		
		
		
		
		 comboBoxPatientAllergies = new JComboBox();
		comboBoxPatientAllergies.setBounds(345, 433, 130, 20);
		allergies=clinicalStaff.returnSideEffects();
		for (SideEffect sideEffect : allergies) {
			comboBoxPatientAllergies.addItem(sideEffect.getName());
		}
		getContentPane().add(comboBoxPatientAllergies);
		
		 lblAllergies = new JLabel("Allergies");
		lblAllergies.setHorizontalAlignment(SwingConstants.CENTER);
		lblAllergies.setBounds(360, 398, 97, 30);
		getContentPane().add(lblAllergies);
		
		 btnAddAllergy = new JButton("Add Allergy");
		btnAddAllergy.setBounds(345, 465, 132, 23);
		getContentPane().add(btnAddAllergy);
		
		
		btnAddAllergy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lastConsult==null || noRecentConsult ||currentPatient.isDead()){
					JOptionPane.showMessageDialog(null, "No Consultation.");
					return;
				}
				PatientSideEffects tmPatientSideEffects=new PatientSideEffects();
				tmPatientSideEffects.setPatient(currentPatient);
				tmPatientSideEffects.setSideEffect(allergies.get(comboBoxPatientAllergies.getSelectedIndex()));
				
				if(clinicalStaff.insertPatientSideEffects(tmPatientSideEffects, username)){
					comboBoxPatientAllergies.removeAllItems();
					allergies=clinicalStaff.returnSideEffects();
					for (SideEffect sideEffect : allergies) {
						comboBoxPatientAllergies.addItem(sideEffect.getName());
					}
					modelAllergies.removeAllElements();
					patientSideEffects=clinicalStaff.returnPatientSideEffectsByPatientId(currentPatient.getId());
					for (PatientSideEffects sideEffect : patientSideEffects) {
						modelAllergies.addElement(sideEffect.getSideEffect().getName());
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Already has this allergy");
				}
			}
		});
		
		 txtDrugSideEffects = new JTextArea();
		txtDrugSideEffects.setBounds(699, 285, 121, 61);
		getContentPane().add(txtDrugSideEffects);
		
		 lblSideeffects = new JLabel("SideEffects:");
		lblSideeffects.setHorizontalAlignment(SwingConstants.CENTER);
		lblSideeffects.setBounds(723, 263, 82, 14);
		getContentPane().add(lblSideeffects);
		
		 btnDeleteDrug = new JButton("Delete Drug");
		btnDeleteDrug.setBounds(850, 425, 89, 23);
		getContentPane().add(btnDeleteDrug);
		btnDeleteDrug.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(lastConsult==null || noRecentConsult ||currentPatient.isDead()){
					JOptionPane.showMessageDialog(null, "No Consultation.");
					return;

				}
				if(detailsList.getSelectedIndex()<0 ||detailsList.getSelectedIndex()>lastPrescriptionDetails.size()){
					JOptionPane.showMessageDialog(null, "Select a drug man.");
				}
				clinicalStaff.deletePerscrtiptionDetails(lastPrescriptionDetails.get(detailsList.getSelectedIndex()), username);
				detailsModel.removeAllElements();
				lastPrescriptionDetails=clinicalStaff.returnLastPerscriptionDetailsByPId(lastConsult.getPatient().getId());
				for (PercriptionDetails sideEffect : lastPrescriptionDetails) {
					detailsModel.addElement(sideEffect.getPharmako().getName()+":"+sideEffect.getQuantity());
				}
				
			}
		});
		
		
		 btnDeleteAllergy = new JButton("Delete Allergy");
		btnDeleteAllergy.setBounds(493, 629, 109, 23);
		getContentPane().add(btnDeleteAllergy);
		btnDeleteAllergy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lastConsult==null || noRecentConsult ||currentPatient.isDead()){
					JOptionPane.showMessageDialog(null, "No Consultation.");
					return;
				}
				PatientSideEffects tmPatientSideEffects=patientSideEffects.get(listAlergies.getSelectedIndex());
				if(tmPatientSideEffects!=null)
					clinicalStaff.deletePatientSideEffects(tmPatientSideEffects, username);
				comboBoxPatientAllergies.removeAllItems();
				allergies=clinicalStaff.returnSideEffects();
				for (SideEffect sideEffect : allergies) {
					comboBoxPatientAllergies.addItem(sideEffect.getName());
				}
				modelAllergies.removeAllElements();
				patientSideEffects=clinicalStaff.returnPatientSideEffectsByPatientId(currentPatient.getId());
				for (PatientSideEffects sideEffect : patientSideEffects) {
					modelAllergies.addElement(sideEffect.getSideEffect().getName());
				}
			}
		});
		
		 txtTreats = new JTextArea();
		txtTreats.setBounds(699, 377, 121, 61);
		getContentPane().add(txtTreats);
		
		 lblTreats = new JLabel("Treats:");
		lblTreats.setHorizontalAlignment(SwingConstants.CENTER);
		lblTreats.setBounds(723, 352, 82, 14);
		getContentPane().add(lblTreats);
		
		 lblRecordSelfHarm = new JLabel("Record Self Harm Incident:");
		lblRecordSelfHarm.setBounds(650, 485, 140, 14);
		getContentPane().add(lblRecordSelfHarm);
		
		 txtSelfHarm = new JTextArea();
		txtSelfHarm.setBounds(650, 522, 324, 82);
		getContentPane().add(txtSelfHarm);
		
		 btnAddSelfHarmIncident = new JButton("Add");
		btnAddSelfHarmIncident.setBounds(650, 616, 89, 23);
		getContentPane().add(btnAddSelfHarmIncident);
		btnAddSelfHarmIncident.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lastConsult==null || noRecentConsult ||currentPatient.isDead()){
					JOptionPane.showMessageDialog(null, "No Consultation.");
					return;
				}
				
				if(!checkLastPrescriptionDetailsForSelf()){
					JOptionPane.showMessageDialog(null, "No drug causes self harm.");
					return;
				}
				SelfHarmIncident tmp=new SelfHarmIncident();
				tmp.setDetails(txtSelfHarm.getText());
				tmp.setPatient(currentPatient);
				clinicalStaff.insertSelfHarmIncident(tmp, username);
			}
		});
		
		 lblConsultDate = new JLabel("New label");
		lblConsultDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultDate.setBounds(33, 527, 168, 32);
		getContentPane().add(lblConsultDate);
		
		previousPrescription = new JScrollPane();
		previousPrescription.setBounds(840, 11, 109, 153);
		getContentPane().add(previousPrescription);
		
		previousDetails = new JList(modelPreviousPrescription);
		previousDetails.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		previousPrescription.setViewportView(previousDetails);
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(774, 242, 56, 20);
		getContentPane().add(txtQuantity);
		txtQuantity.setColumns(10);
		
		lblX = new JLabel("x");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(774, 206, 46, 44);
		getContentPane().add(lblX);
		
		
		
		
		///
		
		////
		
		
		list1.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				patientListNumber=list1.getSelectedIndex();
				System.out.println(patientListNumber);
				if(patientListNumber<0)
					return;
				currentPatient=patients.get(patientListNumber);
				setPatient();
			}
		});
		
		
		
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				modelPatients.removeAllElements();
				try {
					Patient toInsert=clinicalStaff.returnPatientById(Integer.parseInt(id.getText()));
					currentPatient=toInsert;
					setPatient();
					modelPatients.addElement("Name: "+toInsert.getName()+"\n"
							+"  | Details:"+toInsert.getDescription());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Give a Number or correct Patient id");

				}
			}
		});
		
		allPatients.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				modelPatients.removeAllElements();
				patients =clinicalStaff.returnAllPatients();
				
				for (Patient patient : patients) {
					modelPatients.addElement(patient.getName()+" | "+patient.getDiName().getName()+" | ");
				}
				
			}
		});
		
		
		comboBoxPharmaka.setSelectedIndex(0);
		comboBoxDoctor.setSelectedIndex(0);
		comboBoxPatientAllergies.setSelectedIndex(0);
		comboDiseases.setSelectedIndex(0);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(345, 595, 89, 23);
		getContentPane().add(btnUpdate);
		
		btnAllIncidents = new JButton("All Incidents");
		btnAllIncidents.setBounds(774, 616, 114, 23);
		getContentPane().add(btnAllIncidents);
		
		btnAllIncidents.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Incidents(clinicalStaff, currentPatient.getId());
			}
		});
		btnUpdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(lastConsult==null || noRecentConsult ||currentPatient.isDead()){
					JOptionPane.showMessageDialog(null, "No Consultation or Patient is Dead");
					return;
				}
				if(detailsModel.isEmpty() && !modelPreviousPrescription.isEmpty()){
					int dialogButton = JOptionPane.YES_NO_OPTION;
					int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to repeat the Previous Prescription?-","Warning",dialogButton);
					if(dialogResult == JOptionPane.YES_OPTION){
						for(int o=0;o<previousPrescriptionDetails.size();o++){
							previousPrescriptionDetails.get(o).setPerscription(lastConsult.getPerscriptioId());
							clinicalStaff.insertPerscriptionDetails(previousPrescriptionDetails.get(o),username);
						}
					}
				}
				
				currentPatient.setAdress(txtAdress.getText());	
				if(checkBoxDead.isSelected()){
					JOptionPane.showMessageDialog(null, "Dead or Patient is Dead");
				}
				currentPatient.setDead(checkBoxDead.isSelected());
				currentPatient.setSelfharm(checkBoxSelfharmful.isSelected());
				currentPatient.setDescription(diagnosis.getText());
				currentPatient.setDiName(diseases.get(comboDiseases.getSelectedIndex()));
				currentPatient.setDoctor(doctors.get(comboBoxDoctor.getSelectedIndex()));
				String tmp=txtPhone.getText();
				currentPatient.setPhoneNumber(Integer.parseInt(tmp));
				lastConsult.setUpdated(1);
				clinicalStaff.updatePatients(currentPatient,username);
				clinicalStaff.updateConsultations(lastConsult, username);
				allPatients.doClick();
			//	currentPatient.setName(tx);
			}
		});
		
		/*
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					toGoInDatabase.add(new TriplePair(invoiceNumber, getIdFromString((String) listModel.get(currentProduct)),Integer.getInteger(quantity.getText())));
					toGoInDatabase2.add(new Pair(invoiceNumber,getIdFromString((String) listModel.get(currentProduct)) ));
					listModel1.addElement(listModel.getElementAt(currentProduct));
					listModel.remove(currentProduct);
			    }
				if(e.getKeyCode()==KeyEvent.VK_DELETE){
					toGoInDatabase.remove(currentInInvoiceProduct);
					toGoInDatabase2.remove(currentInInvoiceProduct);
					listModel.addElement(listModel1.getElementAt(currentInInvoiceProduct));
					listModel1.remove(currentInInvoiceProduct);

				}
				
				if(typos==PRODUCTS_OFFERS){
					Calculate();
				}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					
			    }
				if(e.getKeyCode()==KeyEvent.VK_DELETE){
					toGoInDatabase.remove(currentInInvoiceProduct);
					toGoInDatabase2.remove(currentInInvoiceProduct);
					listModel.addElement(listModel1.getElementAt(currentInInvoiceProduct));
					listModel1.remove(currentInInvoiceProduct);

				}
				
				if(typos==PRODUCTS_OFFERS){
					Calculate();
				}
			}
		});
		
		insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String ok=quantity.getText();
				toGoInDatabase.add(new TriplePair(invoiceNumber, getIdFromString((String) listModel.get(currentProduct)),Integer.parseInt(ok)));
				toGoInDatabase2.add(new Pair(invoiceNumber,getIdFromString((String) listModel.get(currentProduct)) ));
				listModel1.addElement(listModel.getElementAt(currentProduct));
				listModel.remove(currentProduct);
				

					Calculate();
					quantity.setText("1");
			}
		});
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				toGoInDatabase.remove(currentInInvoiceProduct);
				toGoInDatabase2.remove(currentInInvoiceProduct);
				listModel.addElement(listModel1.getElementAt(currentInInvoiceProduct));
				listModel1.remove(currentInInvoiceProduct);
				

				if(typos==PRODUCTS_OFFERS||typos==PRODUCTSUPPLIERS){
					Calculate();
				}
			}
		});
		
		checkout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int id1,id2,id3=0;
				
				if(typos!=PRODUCTS){
				for(int i=0;i<toGoInDatabase.size();i++){
					id1=toGoInDatabase.get(i).invoiceNumber;
					id2=toGoInDatabase.get(i).itemId;
					id3=toGoInDatabase.get(i).quantity;
					try {
						if(typos==PRODUCTS_OFFERS)
						MoreFunctions.InsertDetails(MoreFunctions.INSERTDETAILSCLIENTINVOICE, id1, id2, id3);
						else {
							MoreFunctions.InsertDetails(MoreFunctions.INSERTDETAILSSUPPLIERINVOICE, id1, id2, id3);
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				}
				else{
					for(int i=0;i<toGoInDatabase2.size();i++){
						id1=toGoInDatabase2.get(i).offerId;
						id2=toGoInDatabase2.get(i).prodId;
						try {
							MoreFunctions.InsertDetails(MoreFunctions.INSERTDETAILSOFFER, id1, id2, id3);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				dispose();
			}
			
		});*/
		setSize(1000, 700);
		setVisible(true);
		
	
	}
	String returnWhatToAsk(){
		if(lastConsult==null){
			return "No appointment,do you want to create one?";
		}
		return "";
		
	}
	public boolean noRecentConsult=false;
	private JButton btnAllIncidents;
	
	void setPatient(){
		noRecentConsult=false;
		lastPrescriptionDetails=null;
		modelPreviousPrescription.removeAllElements();
		detailsModel.removeAllElements();
		txtTreats.setText("");
		txtDrugSideEffects.setText("");
		modelAllergies.removeAllElements();
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to open the record","Warning",dialogButton);
			if(dialogResult == JOptionPane.NO_OPTION){
				return;
			}
			
			checkBoxDead.setSelected(currentPatient.isDead());
			checkBoxSelfharmful.setSelected(currentPatient.isSelfharm());
			
		
		lastConsult=clinicalStaff.returnMostRecentConsultationOfPatient(currentPatient.getId());
		diagnosis.setText(currentPatient.getDescription());
		lbldisease.setText(currentPatient.getDiName().getName());
		lblDoctor.setText(currentPatient.getDoctor().getDoctorName());
		txtAdress.setText(currentPatient.getAdress());
		txtPhone.setText(currentPatient.getPhoneNumber()+"");
		lastConsult=clinicalStaff.returnMostRecentConsultationOfPatient(currentPatient.getId());

		if(lastConsult!=null&&lastConsult.getUpdated()==1){
			noRecentConsult=true;
			JOptionPane.showMessageDialog(null, "No Recent Consultation.");
		}
		if(modelAllergies!=null)
			modelAllergies.removeAllElements();
		if(modelPreviousPrescription!=null)
			modelPreviousPrescription.removeAllElements();
		modelAllergies.removeAllElements();
		patientSideEffects=clinicalStaff.returnPatientSideEffectsByPatientId(currentPatient.getId());
		for (PatientSideEffects sideEffect : patientSideEffects) {
			modelAllergies.addElement(sideEffect.getSideEffect().getName());
		}
		comboBoxDoctor.setSelectedItem(currentPatient.getDoctor().getDoctorName());
		comboDiseases.setSelectedItem(currentPatient.getDiName().getName());
		if(lastConsult==null){
			JOptionPane.showMessageDialog(null, "No consultation.");
			return;
		}
		if(lastConsult.getPerscriptioId()==null){
			Perscription toAdd=new Perscription();
			toAdd.setPatient(currentPatient);
			toAdd.setStartDate(getTodayDateString());
			toAdd.setExpDate(getTodayDateString());
			clinicalStaff.insertPerscription(toAdd, username);
			toAdd.setId(getLastPerAdded());
			lastConsult.setPerscriptioId(toAdd);
			clinicalStaff.updateConsultations(lastConsult, username);			
			//return;
		}
		

		lastPrescriptionDetails=clinicalStaff.returnLastPerscriptionDetailsByPId(lastConsult.getPatient().getId());
		for (PercriptionDetails sideEffect : lastPrescriptionDetails) {
			detailsModel.addElement(sideEffect.getPharmako().getName()+":"+sideEffect.getQuantity());
		}
		
		if(lastConsult.getPerscriptioId()==null)
			previousPrescriptionDetails=clinicalStaff.returnLastPerscriptionDetailsByPId(currentPatient.getId());
		else {
			
			//modelPrescriptionDetails
			Perscription tmPerscription=secondHighest();
			if(tmPerscription==null);
			else {
				previousPrescriptionDetails=clinicalStaff.returnLastPerscriptionDetailsByPrescriptionId(tmPerscription.getId());
			}
		}
		if(previousPrescriptionDetails==null)
			return;
		for (PercriptionDetails sideEffect : previousPrescriptionDetails) {
			modelPreviousPrescription.addElement(sideEffect.getPharmako().getName()+","+sideEffect.getQuantity());
		}

	}
	public static Date today() {
	    final Calendar cal = Calendar.getInstance();
	    return cal.getTime();
	}

	
	
	public boolean checkLastPrescriptionDetailsForSelf(){
		List<PharmakoSideEffects>tmp;
		for (PercriptionDetails sideEffect : lastPrescriptionDetails) {
			tmp=clinicalStaff.returnPharmakoSideEffectsbyName(sideEffect.getPharmako().getName());
			for (PharmakoSideEffects pharmakoSideEffects : tmp) {
				if(pharmakoSideEffects.getSideEffect().getName().equals("SelfHarm")){
					return true;
				}
			}
		}
		return false;
		
	}
	
		public static String getTodayDateString() {
	        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        System.out.println(dateFormat.format(today()));
	        return dateFormat.format(today());
		}
	
		public int getLastPerAdded() {
			java.util.List<Perscription> olw=clinicalStaff.returnPerscriptions();
			int max=-1;
			for (int z=0;z<olw.size();z++){
				if(max<olw.get(z).getId())
					max=olw.get(z).getId();
			}
			return max;
		}
		
	Perscription secondHighest(){
		
		  int high1 = Integer.MIN_VALUE;
		    int high2 = Integer.MIN_VALUE;
		    int index=-1;
		    int idex2=1;
		    int counter=0;
		    List<Perscription> tmPerscriptions=clinicalStaff.returnPerscriptions();
		    for (Perscription num : tmPerscriptions) {
		    	if(num.getPatient()!=null && num.getPatient().getId()==currentPatient.getId()){
			      if (num.getId() > high1) {
			        high2 = high1;
			        idex2=index;
			        high1 = num.getId();
			        index=counter;
			     }else if (num.getId() > high2) {
			        high2 = num.getId();
			        idex2=counter;
			        
			      }
		    	}
		    	counter++;
		    }
		    if(idex2==-1)
		    	return null;
		    return tmPerscriptions.get(idex2);
		 }
}
