package ui;
import healthservice.*;
import receptionist.*;
import receptionist.*;
import medicalrecord.*;
import clinical.*;
import login.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.omg.CORBA.SystemException;

import login.AWSLogin;
import login.AWSLoginImplService;

import javax.swing.ButtonGroup;

public class register_login {

	private JFrame frame;
	private JTextField name;
	private JTextField password;
	private JButton login;
	private JButton Register;
	private JLabel username;
	private JLabel lblPassword;
	private JRadioButton doctor;
	private JRadioButton receptionist;
	private JRadioButton Medical;
	private JRadioButton healthservise;
	private JButton enter;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public AWSLoginImplService lg=new AWSLoginImplService();
	public AWSLogin lgg;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					register_login window = new register_login();
					window.lgg=window.lg.getAWSLoginImplPort();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public register_login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 708, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Label label = new Label("Health Care");
		label.setFont(new Font("Arial", Font.BOLD, 22));
		label.setAlignment(Label.CENTER);
		
		 Register = new JButton("Register");
		Register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				username.setVisible(true);
				lblPassword.setVisible(true);
				doctor.setVisible(true);
				receptionist.setVisible(true);
				Medical.setVisible(true);
				healthservise.setVisible(true);
				enter.setVisible(true);
			}
		});
		
		 login = new JButton("Log In");
		 login.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					username.setVisible(true);
					lblPassword.setVisible(true);
					doctor.setVisible(false);
					receptionist.setVisible(false);
					Medical.setVisible(false);
					healthservise.setVisible(false);
					enter.setVisible(true);
			
				}
			});
		 username = new JLabel("Username");
		
		name = new JTextField();
		name.setColumns(10);
		
		 lblPassword = new JLabel("Password");
		
		password = new JTextField();
		password.setColumns(10);
		
		 doctor = new JRadioButton("Doctor");
		 buttonGroup.add(doctor);
		
		 receptionist = new JRadioButton("Receptionist");
		 buttonGroup.add(receptionist);
		
		 Medical = new JRadioButton("Medical staff");
		 buttonGroup.add(Medical);
		
		 healthservise = new JRadioButton("Health service");
		 buttonGroup.add(healthservise);
		
		 enter = new JButton("Enter");
		 enter.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Boolean egkrinete=true;
					int type;
				
					String usernamin=name.getText();
					String ppasword=password.getText();
				
					if (Medical.isVisible()){
					if (doctor.isSelected())
						type=1;
					if (receptionist.isSelected())
						type=2;
					if (Medical.isSelected())
						type=3;
					if (Medical.isSelected())
						type=4;				
					//elegxos k prosthesi vasii
					}else{
						type=lgg.login(usernamin, ppasword);
						if (type==1){
							System.out.println("magkas1");
							ClinicalStaff ola=new ClinicalStaff(usernamin);
						}else if(type==2){
							Medicall_record_staff record_staff=new Medicall_record_staff(usernamin);
						}else if(type==3){
						Receptionist x=new Receptionist(usernamin);
						frame.setVisible(false);
						}else if (type==4){
							Health jHealth=new Health();
						}else{
							//minimalathous
							System.out.println("l");
						}
					}
					//prosthesi stin vasi!!
				}
			});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(label, GroupLayout.PREFERRED_SIZE, 692, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(60)
					.addComponent(login, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(Register, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(username)
							.addGap(32)
							.addComponent(name, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPassword)
							.addGap(34)
							.addComponent(password, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
					.addGap(56)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(healthservise)
						.addComponent(receptionist)
						.addComponent(doctor)
						.addComponent(Medical))
					.addGap(333))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(97)
					.addComponent(enter, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(login, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(Register, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(35)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(username)))
							.addGap(11)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPassword)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(doctor)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(receptionist)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Medical)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(healthservise)))
					.addGap(25)
					.addComponent(enter)
					.addContainerGap(178, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
