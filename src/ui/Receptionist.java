package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import org.omg.CosNaming.IstringHelper;
import    java.util.*;

import clinical.Clinic;
import clinical.DoctorC;
import clinical.Patient;
import medicalrecord.Requests;
import receptionist.AWSReceptionist;
import receptionist.AWSReceptionistImplService;
import receptionist.Consultations;
import receptionist.PercriptionDetails;
import receptionist.Perscription;

import java.awt.Font;
import java.awt.List;
import java.awt.datatransfer.FlavorListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class Receptionist {
	private JCheckBox Pdead;
	private JScrollPane scrollPane;
	public JFrame frame;
	private JLabel doctor;
	private JTextField textDate;
	private JTextField textID;
	private JButton clear;
	private JButton save;
	private JLabel lblDate;
	private JLabel lblPatiendId;
	private JLabel lblClinic;
	private JLabel lbldoc;
	private JLabel lblclinic;
	private  JCheckBox attended ;
	private JComboBox comboDoctor;
	private JButton repeat;
	private JButton missedap;
	private JCheckBox Pselfharm;
	private String usernamin;
	DefaultListModel<String> listModel = new DefaultListModel<>();
	private JList<String> lista=new JList<>(listModel);	
	private JScrollBar scrollBar;
	private AWSReceptionistImplService x=new AWSReceptionistImplService();
	private AWSReceptionist receptionist;

	private JComboBox comboclinic;
	private JTextField searchid;
	private JButton contact;
	private JLabel enimerosi;
	private JButton btnPatient;
	private JLabel lblpname;
	private JLabel lblpAddress;
	private JLabel lblPDocN;
	private JLabel lblPid;
	private JLabel lblPdis;
	private JLabel lblPDescr;
	private JLabel lblNewLabel_1;
	private JTextField textDescription;
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receptionist window = new Receptionist("magkas");
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the application.
	 */
	public Receptionist(String username) {
		 usernamin=username;
		receptionist=x.getAWSReceptionistImplPort();
		initialize();
		lathos();
		frame.setVisible(true);
	}

		// TODO Auto-generated constructor stub
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void lathos(){
		textDate.setVisible(false);
		 textID.setVisible(false);
		comboDoctor.setVisible(false);
		comboclinic.setVisible(false);
		 clear.setVisible(false);
		 save.setVisible(false);
		 lblDate.setVisible(false);
		 lblPatiendId.setVisible(false);
		 lblClinic.setVisible(false);
		doctor.setVisible(false);
		lista.setVisible(false);
		lblclinic.setVisible(false);
		lbldoc.setVisible(false);
		attended.setVisible(false);
		repeat.setVisible(false);
		contact.setVisible(false);
		enimerosi.setVisible(false);
		lblpname.setVisible(false);
		lblpAddress.setVisible(false);
		lblPDocN.setVisible(false);
		lblPid.setVisible(false);
		lblPdis.setVisible(false);
		lblPDescr.setVisible(false);
		Pselfharm.setVisible(false);
		Pdead.setVisible(false);
		lblNewLabel_1.setVisible(false);
		textDescription.setVisible(false);

	}
	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("Receptionist");
		lblNewLabel.setBounds(0, 11, 680, 61);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Diary = new JButton("Diary");
		Diary.setBounds(36, 112, 109, 44);
		frame.getContentPane().add(Diary);
		Diary.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textDescription.setVisible(false);

				lblclinic.setText("");
				lbldoc.setText("");
			    	textDate.setText("");
			    	textID.setText("");
					enimerosi.setVisible(false);
			    	attended.setSelected(false);
			    	attended.setVisible(true);
				comboDoctor.setVisible(false);
				textDate.setVisible(true);
				 textID.setVisible(true);
				comboclinic.setVisible(false);
				 clear.setVisible(false);
				 save.setVisible(true);				
				 save.setText("Save");
				 lblDate.setVisible(true);
				 lblPatiendId.setVisible(true);
				 lblClinic.setVisible(true);
				doctor.setVisible(true);
				lista.setVisible(false);
				lblclinic.setVisible(true);
				lbldoc.setVisible(true);
				repeat.setVisible(false);
				contact.setVisible(false);
				lblpname.setVisible(false);
				lblpAddress.setVisible(false);
				lblPDocN.setVisible(false);
				lblPid.setVisible(false);
				lblPdis.setVisible(false);
				lblPDescr.setVisible(false);
				Pselfharm.setVisible(false);
				Pdead.setVisible(false);
				lblNewLabel_1.setVisible(false);

				int id =Integer.parseInt(searchid.getText());
				Consultations con=receptionist.returnMostRecentConsultationOfPatient(id);
				lblclinic.setText(con.getClinic().getName());
				lbldoc.setText(con.getDoctorC().getDoctorName());
			    	textDate.setText(con.getDate());
			    	textID.setText(Integer.toString(con.getPatient().getId()));
			    	textDate.setEditable(false);
			    	textID.setEditable(false);
			    	if (con.getAttented()==1)
			    	attended.setSelected(true);
			}
		});
		JButton prescription = new JButton("Prescription");
		prescription.setBounds(180, 112, 114, 44);
		frame.getContentPane().add(prescription);
prescription.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textDescription.setVisible(false);

				listModel.clear();
				enimerosi.setVisible(false);
				comboDoctor.setVisible(false);
				textDate.setVisible(false);
				 textID.setVisible(false);
				comboclinic.setVisible(false);
				 clear.setVisible(false);
				 save.setVisible(false);
				 lblDate.setVisible(false);
				 lblPatiendId.setVisible(false);
				 lblClinic.setVisible(false);
				doctor.setVisible(false);
				lista.setVisible(true);
				lblclinic.setVisible(false);
				lbldoc.setVisible(false);
				attended.setVisible(false);
				repeat.setVisible(true);
				contact.setVisible(false);
				lblpname.setVisible(false);
				lblpAddress.setVisible(false);
				lblPDocN.setVisible(false);
				lblPid.setVisible(false);
				lblPdis.setVisible(false);
				lblPDescr.setVisible(false);
				Pselfharm.setVisible(false);
				Pdead.setVisible(false);
				lblNewLabel_1.setVisible(false);

				int id =Integer.parseInt(searchid.getText());
				java.util.List<PercriptionDetails> perc=receptionist.returnLastPerscriptionDetailsByPId(id);
				 for (PercriptionDetails name : perc) {
					 listModel.addElement(name.getPharmako().getName()+ ".  " +name.getQuantity());
			    	}
			
				//pernw id kai sinergazome me tin vasi
			}
		});
		JButton newappoi = new JButton("Add appointment");
		newappoi.setBounds(334, 112, 125, 44);
		frame.getContentPane().add(newappoi);
		 newappoi.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					textDescription.setVisible(false);

					enimerosi.setVisible(false);
					comboDoctor.setVisible(true);
					textDate.setVisible(true);
					textDate.setText("");
					textID.setText("");
					 textID.setVisible(true);
					comboclinic.setVisible(true);
					 clear.setVisible(true);
					 save.setVisible(true);
					 save.setText("Save");
					 lblDate.setVisible(true);
					 lblPatiendId.setVisible(true);
					 lblClinic.setVisible(true);
					doctor.setVisible(true);
					lista.setVisible(false);
					lblclinic.setVisible(false);
					lbldoc.setVisible(false);
					textDate.setEditable(true);
					textDate.setText("");
			    	textID.setEditable(true);
			    	attended.setVisible(false);
					repeat.setVisible(false);
					contact.setVisible(false);
					lblpname.setVisible(false);
					lblpAddress.setVisible(false);
					lblPDocN.setVisible(false);
					lblPid.setVisible(false);
					lblPdis.setVisible(false);
					lblPDescr.setVisible(false);
					Pselfharm.setVisible(false);
					Pdead.setVisible(false);
					lblNewLabel_1.setVisible(false);
					int id=Integer.parseInt(searchid.getText());
					textID.setText(""+receptionist.returnMostRecentConsultationOfPatient(id).getPatient().getId());
					textDate.setText(receptionist.returnMostRecentConsultationOfPatient(id).getDate());

				}
			});
		
		doctor = new JLabel("Doctor");
		doctor.setBounds(83, 257, 62, 20);
		frame.getContentPane().add(doctor);
		doctor.setVisible(false);
		
		 lblDate = new JLabel("Date");
		 lblDate.setBounds(83, 301, 46, 14);
		frame.getContentPane().add(lblDate);
		
		textDate = new JTextField();
		textDate.setBounds(178, 298, 86, 20);
		frame.getContentPane().add(textDate);
		textDate.setColumns(10);
		
		 lblPatiendId = new JLabel("patient id");
		 lblPatiendId.setBounds(83, 344, 65, 14);
		frame.getContentPane().add(lblPatiendId);
		
		textID = new JTextField();
		textID.setBounds(178, 341, 86, 20);
		frame.getContentPane().add(textID);
		textID.setColumns(10);
		
		lblClinic = new JLabel("clinic");
		lblClinic.setBounds(83, 381, 46, 14);
		frame.getContentPane().add(lblClinic);
		
		 clear = new JButton("clear");
		 clear.setBounds(52, 420, 89, 23);
		frame.getContentPane().add(clear);
		 clear.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					textDate.setText("");
					textID.setText("");
				}
			});
		
		 save = new JButton("save");
		 save.setBounds(200, 420, 89, 23);
		frame.getContentPane().add(save);
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (save.getText().equals("Send Request")){
					System.out.println("efta ksorismeno");
					int id =Integer.parseInt(searchid.getText());
					String text=textDescription.getText();
					receptionist.Requests xRequests=new receptionist.Requests();
					xRequests.setDetails(text);
					xRequests.setStatus(0);
					xRequests.setPatient(receptionist.returnPatientById(id));
					receptionist.insertRequest(xRequests, usernamin);
					return;
					
				}
				if (attended.isVisible()){
					int id =Integer.parseInt(searchid.getText());
					Consultations con=receptionist.returnMostRecentConsultationOfPatient(id);
					if (attended.isSelected()){					
					con.setAttented(1);
					receptionist.updateConsultation(con,usernamin);
					return;
					}else{
						con.setAttented(0);
						receptionist.updateConsultation(con,usernamin);
						return;
					}
					
				}
				 java.util.List<receptionist.Clinic> clin=receptionist.returnClinics();
				 receptionist.Clinic kliniki = null;
			        for(receptionist.Clinic name: clin){
			        	
			        	if(comboclinic.getSelectedItem().equals(name.getName()))
			        		kliniki=name;			        	
}
			        receptionist.DoctorC giattros=null;
			        java.util.List<receptionist.DoctorC> giatroi=receptionist.returnDoctors();      
			        for (receptionist.DoctorC name : giatroi) {
			        	
			        	if(comboDoctor.getSelectedItem().equals(name.getDoctorName())){
			        		
			        		giattros=name;
			        		break;}
			        	}
				String date=textDate.getText();
				
				String iD=textID.getText();
				int id =Integer.parseInt(iD);
				System.out.println(id);

				if( date!=null ||   iD!=null  )
					if( date.equals("") || iD.equals("")|| kliniki==null || giattros==null){
						//prob dont save
						System.out.println("niaou");
					}else{
						Consultations consultations=new Consultations();
						consultations.setClinic(kliniki);
						consultations.setDate(date);
						consultations.setDropin(0);
						consultations.setPerscriptioId(null);
						consultations.setPatient(receptionist.returnPatientById(id));
						consultations.setAttented(0);
						consultations.setUpdated(0);
						consultations.setDoctorC(giattros);
						receptionist.insertConsultation(consultations,usernamin);

					}
			}
		});
		 lista.setBounds(200, 198, 393, 200);
		 lista.setBorder(new CompoundBorder(new CompoundBorder(), null));
		 lista.setVisibleRowCount(15);
		 lista.setForeground(Color.MAGENTA);
		 frame.getContentPane().add(lista);
		lista.setValueIsAdjusting(true);
		lista.setVisibleRowCount(10);
		lista.setFixedCellHeight(15);
		lista.setFixedCellWidth(100);
        lista.setSize(200,200);
        lista.setLocation(200,200);
        lista.setVisible(true);
		lista.setModel(listModel);
        
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lista.setFont(new Font("Serif", Font.ITALIC, 14));
		
        
        lista.setLayoutOrientation(JList.VERTICAL);
        
         comboDoctor = new JComboBox();
        comboDoctor.setBounds(173, 257, 91, 20);
        frame.getContentPane().add(comboDoctor);
        
        comboclinic = new JComboBox();
        comboclinic.setBounds(178, 372, 86, 20);
        frame.getContentPane().add(comboclinic);
        
        searchid = new JTextField();
        searchid.setBounds(178, 167, 86, 20);
        frame.getContentPane().add(searchid);
        searchid.setColumns(10);
        
         lbldoc = new JLabel("New label");
        lbldoc.setBounds(174, 260, 46, 14);
        frame.getContentPane().add(lbldoc);
        
         lblclinic = new JLabel("New label");
        lblclinic.setBounds(180, 375, 46, 14);
        frame.getContentPane().add(lblclinic);
        
         attended = new JCheckBox("attended");
        attended.setBounds(303, 256, 97, 23);
        frame.getContentPane().add(attended);
        
         missedap = new JButton("missed ap/ment");
        missedap.setBounds(484, 112, 109, 44);
        frame.getContentPane().add(missedap);
missedap.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				listModel.clear();
				textDescription.setVisible(false);

				enimerosi.setVisible(false);
				comboDoctor.setVisible(false);
				textDate.setVisible(false);
				 textID.setVisible(false);
				comboclinic.setVisible(false);
				 clear.setVisible(false);
				 save.setVisible(false);
				 lblDate.setVisible(false);
				 lblPatiendId.setVisible(false);
				 lblClinic.setVisible(false);
				doctor.setVisible(false);
				lista.setVisible(true);
				lblclinic.setVisible(false);
				lbldoc.setVisible(false);
				attended.setVisible(false);
				repeat.setVisible(false);
				contact.setVisible(true);
				lblpname.setVisible(false);
				lblpAddress.setVisible(false);
				lblPDocN.setVisible(false);
				lblPid.setVisible(false);
				lblPdis.setVisible(false);
				lblPDescr.setVisible(false);
				Pselfharm.setVisible(false);
				Pdead.setVisible(false);
				lblNewLabel_1.setVisible(false);
				java.util.List<receptionist.Patient> perc=receptionist.returnNotAttentedPatients();
				 for (receptionist.Patient name : perc) {
					 listModel.addElement(name.getName()+ ".  " +name.getId()+ ".  " +name.getPhoneNumber()+ ".  " +name.getPhoneNumber() );
			    	}
			
				//pernw id kai sinergazome me tin vasi
			}
		});
        
         repeat = new JButton("repeat");
        repeat.setBounds(311, 420, 89, 23);
        frame.getContentPane().add(repeat);
        repeat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(!listModel.isEmpty()){
					int id =Integer.parseInt(searchid.getText());
					java.util.List<PercriptionDetails> perc=receptionist.returnLastPerscriptionDetailsByPId(id);
					Perscription toInsert=new Perscription();
					toInsert.setPatient(perc.get(0).getPerscription().getPatient());
					toInsert.setStartDate(getTodayDateString());
					toInsert.setExpDate(getTodayDateString());
					receptionist.insertPerscription(toInsert,usernamin);
					id=getLastPerAdded();
					toInsert.setId(id);
					for(int o=0;o<perc.size();o++){
						perc.get(o).setPerscription(toInsert);
						System.out.println(perc.size());
						receptionist.insertPerscriptionDetail(perc.get(o),usernamin);
					}
				}
			}
		});
        contact = new JButton("contact");
        contact.setBounds(441, 256, 89, 23);
        frame.getContentPane().add(contact);
contact.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			if (!lista.isSelectionEmpty())
				enimerosi.setVisible(true);
			    	}
			
				//pernw id kai sinergazome me tin vasi
					});
        
        enimerosi = new JLabel("concerned  informed");
        enimerosi.setBounds(451, 290, 178, 25);
        frame.getContentPane().add(enimerosi);
        
        btnPatient = new JButton("patient");
        btnPatient.setBounds(618, 112, 114, 44);
        frame.getContentPane().add(btnPatient);
        
        lblpname = new JLabel("Name");
        lblpname.setBounds(300, 196, 159, 20);
        frame.getContentPane().add(lblpname);
        
        lblpAddress = new JLabel("address");
        lblpAddress.setBounds(300, 221, 178, 20);
        frame.getContentPane().add(lblpAddress);
        
        lblPDocN = new JLabel("Doctor");
        lblPDocN.setBounds(300, 257, 159, 17);
        frame.getContentPane().add(lblPDocN);
        
        lblPid = new JLabel("patient ID");
        lblPid.setBounds(300, 286, 102, 20);
        frame.getContentPane().add(lblPid);
        
        lblPdis = new JLabel("disease");
        lblPdis.setBounds(300, 317, 159, 20);
        frame.getContentPane().add(lblPdis);
        
        lblPDescr = new JLabel("Description");
        lblPDescr.setBounds(300, 320, 329, 75);
        frame.getContentPane().add(lblPDescr);
        
         Pselfharm = new JCheckBox("Self Harm");
        Pselfharm.setBounds(311, 407, 97, 36);
        frame.getContentPane().add(Pselfharm);
        
         Pdead = new JCheckBox("Dead");
        Pdead.setBounds(441, 407, 109, 36);
        frame.getContentPane().add(Pdead);
        
        lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setBounds(506, 224, 87, 21);
        frame.getContentPane().add(lblNewLabel_1);
        
        JButton request = new JButton("Request");
        request.setBounds(751, 112, 109, 44);
        frame.getContentPane().add(request);
        
        textDescription = new JTextField();
        textDescription.setText("Description");
        textDescription.setBounds(200, 254, 200, 141);
        frame.getContentPane().add(textDescription);
        textDescription.setColumns(10);
        request.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				enimerosi.setVisible(false);
				comboDoctor.setVisible(false);
				textDate.setVisible(false);
				 textID.setVisible(false);
				comboclinic.setVisible(false);
				 clear.setVisible(false);
				 save.setVisible(true);
				 save.setText("Send Request");
				 lblDate.setVisible(false);
				 lblPatiendId.setVisible(false);
				 lblClinic.setVisible(false);
				doctor.setVisible(false);
				lista.setVisible(false);
				lblclinic.setVisible(false);
				lbldoc.setVisible(false);
				attended.setVisible(false);
				repeat.setVisible(false);
				contact.setVisible(false);
				lblpname.setVisible(false);
				lblpAddress.setVisible(false);
				lblPDocN.setVisible(false);
				lblPid.setVisible(false);
				lblPdis.setVisible(false);
				lblPDescr.setVisible(false);
				Pselfharm.setVisible(false);
				Pdead.setVisible(false);
				lblNewLabel_1.setVisible(false);
				textDescription.setVisible(true);

				
			}
		});
btnPatient.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				enimerosi.setVisible(false);
				comboDoctor.setVisible(false);
				textDate.setVisible(false);
				 textID.setVisible(false);
				comboclinic.setVisible(false);
				 clear.setVisible(false);
				 save.setVisible(false);
				 lblDate.setVisible(false);
				 lblPatiendId.setVisible(false);
				 lblClinic.setVisible(false);
				doctor.setVisible(false);
				lista.setVisible(false);
				lblclinic.setVisible(false);
				lbldoc.setVisible(false);
				attended.setVisible(false);
				repeat.setVisible(false);
				contact.setVisible(false);
				lblpname.setVisible(true);
				lblpAddress.setVisible(true);
				lblPDocN.setVisible(true);
				lblPid.setVisible(true);
				lblPdis.setVisible(true);
				lblPDescr.setVisible(true);
				Pselfharm.setVisible(true);
				Pdead.setVisible(true);
				lblNewLabel_1.setVisible(true);
				textDescription.setVisible(false);

receptionist.Patient xPatient;
			xPatient=receptionist.returnPatientById(Integer.parseInt(searchid.getText()));
			lblpname.setText(xPatient.getName());
			lblpAddress.setText(xPatient.getAdress());
			lblPDocN.setText(xPatient.getDoctor().getDoctorName());
			lblPdis.setText(xPatient.getDiName().getName());
			lblPDescr.setText(xPatient.getDescription());
			Pselfharm.setSelected(xPatient.isSelfharm());
			Pdead.setSelected(xPatient.isDead());
			lblPid.setText( Integer.toString(xPatient.getId()));
			lblNewLabel_1.setText(Integer.toString(xPatient.getPhoneNumber()));
			Pselfharm.setEnabled(false);	
			Pdead.setEnabled(false);
}
		});
        java.util.List<receptionist.Clinic> clin=receptionist.returnClinics();
        for(receptionist.Clinic name: clin){
        	comboclinic.addItem(name.getName());
        }
        java.util.List<receptionist.DoctorC> giatroi=receptionist.returnDoctors();      
      for (receptionist.DoctorC name : giatroi) {
    	  comboDoctor.addItem(name.getDoctorName());
    	}

        //frame.add(panel);
	}
	public int getLastPerAdded() {
		java.util.List<Perscription> olw=receptionist.returnPrescriptions();
		int max=-1;
		for (int z=0;z<olw.size();z++){
			if(max<olw.get(z).getId())
				max=olw.get(z).getId();
		}
		return max;
	}
	public static Date today() {
	    final Calendar cal = Calendar.getInstance();
	    return cal.getTime();
	}
	public static String getTodayDateString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(today()));
        return dateFormat.format(today());
	}
}
