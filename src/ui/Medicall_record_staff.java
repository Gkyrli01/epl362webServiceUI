package ui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.SelectableChannel;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;

import medicalrecord.AWSMedicalRecord;
import medicalrecord.AWSMedicalRecordImplService;
import medicalrecord.Clinic;
import medicalrecord.Disease;
import medicalrecord.DoctorC;
import medicalrecord.Pharmako;
import medicalrecord.PharmakoSideEffects;
import medicalrecord.SideEffect;
import receptionist.AWSReceptionist;
import receptionist.AWSReceptionistImplService;

import javax.sound.sampled.LineEvent;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class Medicall_record_staff extends JFrame {
	
	private JButton Request ;
	private JLabel lblphone;
	private String usernamin;
	private JButton update ;
	private AWSMedicalRecordImplService xAwsMedicalRecordImplService=new AWSMedicalRecordImplService();
	private AWSMedicalRecord MR;
	private JFrame frame;
	private JButton add;
	DefaultListModel<String> listModel = new DefaultListModel<>();
	private JList<String> lista=new JList<>(listModel);	
	DefaultListModel<String> listModeld = new DefaultListModel<>();
	private JList<String> drugs=new JList<>(listModeld);	
	DefaultListModel<String> listModels = new DefaultListModel<>();
	private JList<String> sideeff=new JList<>(listModels);	
	private JTextField textname;
	private JTextField textidadr;
	private JTextField textnumber;
	private JLabel lblname;
	private JLabel lblidAdd;
	private JButton sidee;
	private medicalrecord.Pharmako [] aita=new medicalrecord.Pharmako [1];
	private medicalrecord.Requests [] xRequests=new medicalrecord.Requests [1];
	private medicalrecord.Patient [] xPatient=new medicalrecord.Patient [1];
	private JLabel lblrname2;
	private JLabel lblrname;
	private JLabel lblid;
	private JLabel lbldesc;
	private JScrollPane scrollPane;
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medicall_record_staff window = new Medicall_record_staff("magkas");
					window.frame.setVisible(true);
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
	public Medicall_record_staff(String username) {
		usernamin=username;
		MR=xAwsMedicalRecordImplService.getAWSMedicalRecordImplPort();
		initialize();
		lathos();
	}
private void lathos(){
	lista.setVisible(false);
	update.setVisible(false);
	add.setVisible(false);
	textname.setVisible(true);
	lblidAdd.setVisible(false);
	lblname.setVisible(false);
	lblphone.setVisible(false);
	textidadr.setVisible(false);
	textname.setVisible(false);
	textnumber.setVisible(false);
	drugs.setVisible(false);
	sidee.setVisible(false);
	sideeff.setVisible(false);
	 lblrname2.setVisible(false);
	 lblrname.setVisible(false);
	 lblid.setVisible(false);
	 lbldesc.setVisible(false);
}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Medical Records Staff");
		lblNewLabel.setBounds(10, 11, 756, 38);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		 Request = new JButton("Reguest");
		Request.setBounds(20, 116, 112, 38);
		frame.getContentPane().add(Request);
		Request.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lista.setVisible(true);
				update.setVisible(false);
				add.setVisible(true);
				textname.setVisible(false);
				lblidAdd.setVisible(false);
				lblname.setVisible(false);
				lblphone.setVisible(false);
				textidadr.setVisible(false);
				textname.setVisible(false);
				textnumber.setVisible(false);
				drugs.setVisible(false);
				sidee.setVisible(false);
				sideeff.setVisible(false);
				 lblrname2.setVisible(false);
				 lblrname.setVisible(false);
				 lblid.setVisible(false);
				 lbldesc.setVisible(false);
				
				listModel.clear();
				add.setText("select");
				java.util.List<medicalrecord.Requests> perc=MR.returnRequests();
				 for (medicalrecord.Requests name : perc) {
					 listModel.addElement(name.getPatient().getId()+"   "+name.getPatient().getName());
			    	}
				 
			}
		});
		
		JButton Drug = new JButton("Drug");
		Drug.setBounds(142, 116, 100, 38);
		frame.getContentPane().add(Drug);
Drug.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lista.setVisible(false);
				update.setVisible(true);
				add.setVisible(true);
				textname.setVisible(false);
				lblidAdd.setVisible(false);
				lblname.setVisible(true);
				textidadr.setVisible(false);
				textname.setVisible(true);
				textnumber.setVisible(false);
				lblphone.setVisible(false);
				drugs.setVisible(true);
				sidee.setVisible(true);
				sideeff.setVisible(true);
				listModeld.clear();
				listModels.clear();
				listModels.clear();
				add.setText("add");
				 lblrname2.setVisible(false);
				 lblrname.setVisible(false);
				 lblid.setVisible(false);
				 lbldesc.setVisible(false);
				java.util.List<medicalrecord.SideEffect> perc=MR.returnSideEffect();
				 for (medicalrecord.SideEffect name : perc) {
					 listModels.addElement(name.getName());
			    	}				 
			    	
			
				//pernw id kai sinergazome me tin vasi
			}
		});
	
		 update = new JButton("update");
		update.setBounds(60, 512, 121, 38);
		frame.getContentPane().add(update);
		update.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (lblrname.getText().equals("Patient Details")){
					
					String lines[] = xRequests[0].getDetails().split(" ");
					for (int i=0;i<lines.length;i++){
				       if (lines[i].equals("phone")|| lines[i].equals("phone")|| lines[i].equals("Tilefono") || lines[i].equals("tilefono") || lines[i].equals("tilefwno") ||lines[i].equals( "telephone")){
			 xPatient[0].setPhoneNumber(Integer.parseInt(lines[i+1]));
		}else if(lines[i].equals("address")||lines[i].equals("diefthinsi")||lines[i].equals("Diefthinsi")|| lines[i].equals("address"))
			xPatient[0].setAdress(lines[i+1]+" "+lines[i+2]+" "+lines[i+3]);
				}
					MR.updatePatient(xPatient[0], usernamin);
					xRequests[0].setStatus(1);
					MR.updateRequest(xRequests[0], usernamin);
					return;
				}
				medicalrecord.Pharmako xPharmako1=new Pharmako();
				medicalrecord.SideEffect xSideEffect=new SideEffect();
				xPharmako1.setName(listModeld.getElementAt(0));
			System.out.println(MR.insertPharmako(xPharmako1, usernamin));
			aita[0]=xPharmako1;
			
			}
		});
		JButton SideEffects = new JButton("Side effects");
		SideEffects.setBounds(252, 116, 100, 38);
		frame.getContentPane().add(SideEffects);
SideEffects.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 lblrname2.setVisible(false);
				 lblrname.setVisible(false);
				 lblid.setVisible(false);
				 lbldesc.setVisible(false);
				lista.setVisible(false);
				update.setVisible(false);
				add.setVisible(false);
				textname.setVisible(false);
				lblidAdd.setVisible(false);
				lblname.setVisible(true);
				textidadr.setVisible(false);
				textname.setVisible(true);
				textnumber.setVisible(false);
				lblphone.setVisible(false);
				drugs.setVisible(false);
				sidee.setVisible(true);
				sideeff.setVisible(true);									 
				listModels.clear();
				java.util.List<medicalrecord.SideEffect> perc=MR.returnSideEffect();
				 for (medicalrecord.SideEffect name : perc) {
					 listModels.addElement(name.getName());
			    	}	
				//pernw id kai sinergazome me tin vasi
			}
		});
		
		JButton Disease = new JButton("Disease");
		Disease.setBounds(362, 116, 94, 38);
		frame.getContentPane().add(Disease);
		Disease.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 lblrname2.setVisible(false);
				 lblrname.setVisible(false);
				 lblid.setVisible(false);
				 lbldesc.setVisible(false);
				add.setText("add");
				lblphone.setVisible(false);
				lista.setVisible(true);
				update.setVisible(false);
				add.setVisible(true);
				textname.setVisible(false);
				lblidAdd.setVisible(false);
				lblname.setVisible(true);
				textidadr.setVisible(false);
				textname.setVisible(true);
				textnumber.setVisible(false);
				drugs.setVisible(false);
				sidee.setVisible(false);
				sideeff.setVisible(false);
				textname.setText("");
				listModel.clear();
				java.util.List<medicalrecord.Disease> perc=MR.returnDisease();
				 for (medicalrecord.Disease name : perc) {
					 listModel.addElement(name.getName() );
			    	}
			
				//pernw id kai sinergazome me tin vasi
			}
		});
		
		
		JButton Clinic = new JButton("Clinic");
		Clinic.setBounds(471, 116, 100, 38);
		frame.getContentPane().add(Clinic);
		Clinic.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 lblrname2.setVisible(false);
				 lblrname.setVisible(false);
				 lblid.setVisible(false);
				 lbldesc.setVisible(false);
				add.setText("add");
				lista.setVisible(true);
				update.setVisible(false);
				add.setVisible(true);	
				lblphone.setText("phone");
				lblphone.setVisible(true);
				textname.setVisible(true);
				lblidAdd.setText("Address");
				lblidAdd.setVisible(true);
				lblname.setVisible(true);
				textidadr.setVisible(true);
				textname.setVisible(true);
				textnumber.setVisible(true);
				drugs.setVisible(false);
				sidee.setVisible(false);
				sideeff.setVisible(false);
				textidadr.setText("");
				textname.setText("");
				textnumber.setText("");
				listModel.clear();
				
				java.util.List<medicalrecord.Clinic> perc=MR.returnClinics();
				 for (medicalrecord.Clinic name : perc) {
					 listModel.addElement(name.getName()+"  " +name.getAdress()+ ".  " +name.getPhoneNumber());
			    	}
				// TODO Auto-generated method stub
				
			}
		});
		JButton Doctor = new JButton("Doctor");
		Doctor.setBounds(581, 116, 100, 38);
		frame.getContentPane().add(Doctor);
Doctor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 lblrname2.setVisible(false);
				 lblrname.setVisible(false);
				 lblid.setVisible(false);
				 lbldesc.setVisible(false);
				add.setText("add");
				lista.setVisible(true);
				update.setVisible(false);
				add.setVisible(true);
				textname.setVisible(true);
				lblidAdd.setText("ID");
				lblidAdd.setVisible(true);
				lblname.setVisible(true);
				textidadr.setVisible(false);
				textname.setVisible(true);
				textnumber.setVisible(false);
				lblphone.setVisible(false);
				listModel.clear();
				textname.setText("");
				java.util.List<medicalrecord.DoctorC> perc=MR.returnDoctors();
				 for (medicalrecord.DoctorC name : perc) {
					 listModel.addElement(name.getDoctorName()+"  " +name.getId());
			    	}
				// TODO Auto-generated method stub
				
			}
		});
		JButton Transaction = new JButton("Transaction");
		Transaction.setBounds(30, 165, 102, 38);
		frame.getContentPane().add(Transaction);
Transaction.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 lblrname2.setVisible(false);
				 lblrname.setVisible(false);
				 lblid.setVisible(false);
				 lbldesc.setVisible(false);
				lista.setVisible(true);
				update.setVisible(false);
				add.setVisible(false);
				textname.setVisible(false);
				lblidAdd.setVisible(false);
				lblname.setVisible(false);
				textidadr.setVisible(false);
				textname.setVisible(false);
				textnumber.setVisible(false);
				lblphone.setVisible(false);
				drugs.setVisible(false);
				sidee.setVisible(false);
				sideeff.setVisible(false);

				listModel.clear();
				
				java.util.List<medicalrecord.Transaction> perc=MR.returnTransaction();
				 for (medicalrecord.Transaction name : perc) {
					 listModel.addElement(name.getId()+"  " +name.getUsername()+ ".  " +name.getDetails() );
					 
			    	}
			
				//pernw id kai sinergazome me tin vasi
			}
		});
		
		add = new JButton("add");
		add.setBounds(234, 512, 100, 38);
		frame.getContentPane().add(add);
add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if((add.getText()).equals("reject")){
					xRequests[0].setStatus(2);
					MR.updateRequest(xRequests[0], usernamin);
				}
				if (drugs.isVisible()){
					String ddrugs="";
					ddrugs=textname.getText();
					if(ddrugs!=""){
						listModeld.addElement(ddrugs);
						textname.setText("");
					}
				}
				if("select".equals(add.getText())){
					
					java.util.List<medicalrecord.Requests> perc=MR.returnRequests();
					 for (medicalrecord.Requests name : perc) {
						 if(lista.getSelectedValue().equals(name.getPatient().getId()+"   "+name.getPatient().getName())){
							 xRequests[0]=name;
			
						 }
						
				    	}
					 System.out.println("pano sou");
					 java.util.List<medicalrecord.Patient> doc=MR.returnPatients();
						for (medicalrecord.Patient name:doc ){
							if(name.getId()==xRequests[0].getPatient().getId()){
								 
								xPatient[0]=name;
								 lista.setVisible(false);
								 add.setText("reject");
								 update.setVisible(true);
								 lblrname2.setVisible(true);
								 
								 lblphone.setVisible(true);
								 lblphone.setText("Requested changes");
								 lblrname.setText("Patient Details");
								 lblrname.setVisible(true);
								 lblrname2.setText(xRequests[0].getPatient().getName()+"    "+ Integer.toString(xRequests[0].getPatient().getId())+"  "+ xRequests[0].getPatient().getDiName().getName());
								 lblid.setVisible(true);
								 lblid.setText(xRequests[0].getPatient().getAdress()+"  "+xRequests[0].getPatient().getPhoneNumber());
								 lbldesc.setVisible(true);
								 lbldesc.setText(xRequests[0].getDetails());
								 break;
							}
						}
					
				}
				if (lblidAdd.isVisible()){
					if(lblphone.isVisible()){
						String name=textname.getText();
						String address=textidadr.getText();
						String phon=textnumber.getText();
						int phone=-1;
						 phone=Integer.parseInt(textnumber.getText());
						 if (name==""|| address=="" || phon=="" ){
							 //minima lathous
							 return;
						 }else{
							 medicalrecord.Clinic xClinic=new Clinic();
							 xClinic.setAdress(address);
							 xClinic.setName(name);
							 xClinic.setPhoneNumber(phone);
							 MR.insertClinic(xClinic, usernamin);return;
						 }
					}else{
						String name=textname.getText();						
						if (name==""){
							return;
						}else{
								medicalrecord.DoctorC xDoctorC = new DoctorC();
								xDoctorC.setDoctorName(name);
							
								MR.insertDoctor(xDoctorC, usernamin);
								return;
					}
				}}else{
					String name=textname.getText();
					if (name!="");
					medicalrecord.Disease xDisease=new Disease();
					xDisease.setName(name);
					MR.insertDisease(xDisease, usernamin);
					return;
				}
				
				
				
			}
		});
        
        textname = new JTextField();
        textname.setBounds(30, 272, 135, 30);
        frame.getContentPane().add(textname);
        textname.setColumns(10);
        
         lblname = new JLabel("name");
        lblname.setBounds(28, 226, 104, 35);
        frame.getContentPane().add(lblname);
        
         lblidAdd = new JLabel("id");
        lblidAdd.setBounds(30, 312, 135, 14);
        frame.getContentPane().add(lblidAdd);
        
        textidadr = new JTextField();
        textidadr.setBounds(30, 337, 135, 30);
        frame.getContentPane().add(textidadr);
        textidadr.setColumns(10);
        
         lblphone = new JLabel("Phone Number");
        lblphone.setBounds(30, 378, 135, 22);
        frame.getContentPane().add(lblphone);
        
        textnumber = new JTextField();
        textnumber.setBounds(30, 411, 135, 22);
        frame.getContentPane().add(textnumber);
        textnumber.setColumns(10);
        
        drugs = new JList();
        drugs.setBounds(200, 499, 152, -297);
		 drugs.setBorder(new CompoundBorder(new CompoundBorder(), null));
		 drugs.setLocation(200,200);
        frame.getContentPane().add(drugs);
        drugs.setVisible(true);
		drugs.setModel(listModeld);
		drugs.setValueIsAdjusting(true);
		drugs.setFixedCellHeight(15);
		
		drugs.setFixedCellWidth(100);
        drugs.setSize(200,300);
        sideeff = new JList();
        sideeff.setBounds(400, 499, 152, -297);
        frame.getContentPane().add(sideeff);
        sideeff.setVisible(true);
		 sideeff.setBorder(new CompoundBorder(new CompoundBorder(), null));
		 
			sideeff.setFixedCellWidth(100);
	        sideeff.setSize(200,300);
	        sideeff.setLocation(410,200);
		sideeff.setModel(listModels);
		sideeff.setValueIsAdjusting(true);
		sideeff.setFixedCellHeight(15);
        sidee = new JButton("add side effect");
        sidee.setBounds(429, 514, 121, 34);
        frame.getContentPane().add(sidee);
        
         lblrname = new JLabel("New label");
        lblrname.setBounds(23, 202, 157, 22);
        frame.getContentPane().add(lblrname);
        
         lblrname2 = new JLabel("New label");
        lblrname2.setBounds(200, 202, 410, 59);
        frame.getContentPane().add(lblrname2);
        
         lblid = new JLabel("New label");
        lblid.setBounds(200, 260, 410, 22);
        frame.getContentPane().add(lblid);
        
        lbldesc = new JLabel("New label");
        lbldesc.setBounds(200, 299, 410, 202);
        frame.getContentPane().add(lbldesc);
        
        scrollPane = new JScrollPane();
        scrollPane.setBounds(190, 200, 517, 300);
        frame.getContentPane().add(scrollPane);
        
         lista = new JList();
         scrollPane.setViewportView(lista);
         lista.setForeground(Color.GREEN);
         lista.setBorder(new CompoundBorder(new CompoundBorder(), null));
         lista.setVisibleRowCount(15);
         lista.setValueIsAdjusting(true);
         lista.setFixedCellHeight(15);
         lista.setFixedCellWidth(100);
         lista.setVisible(true);
         lista.setModel(listModel);
         
         lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         lista.setFont(new Font("Serif", Font.ITALIC, 14));
         
        
        lista.setLayoutOrientation(JList.VERTICAL);
        sidee.addActionListener(new ActionListener( ) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				if(drugs.isVisible()){
					medicalrecord.SideEffect xSideEffect=null;
				medicalrecord.PharmakoSideEffects xSideEffects=new PharmakoSideEffects();
				 java.util.List<medicalrecord.SideEffect> s=MR.returnSideEffect();
				 
			        for(medicalrecord.SideEffect name: s){
			        	
			        	if(sideeff.getSelectedValue().equals(name.getName()))
			        		xSideEffect=name;			        	
}
				
				 
				xSideEffects.setPharmako(aita[0]);
				xSideEffects.setSideEffect(xSideEffect);
				MR.insertPharmakoSideEffect(xSideEffects,usernamin);
				}else{
					String malakia=textname.getText();
					if(malakia!=""){
						medicalrecord.SideEffect xSideEffect=new SideEffect();
						xSideEffect.setName(malakia);
						MR.insertSideEffect(xSideEffect,usernamin);
					}
				}
					}
			
		});
		frame.setVisible(true);


	}
}
