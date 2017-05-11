package ui;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

import clinical.AWSClinicalStaff;
import clinical.SelfHarmIncident;

import javax.swing.JList;

public class Incidents extends JFrame {
	public Incidents(AWSClinicalStaff toUSe,int pId) {
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(95, 66, 623, 350);
		getContentPane().add(scrollPane);
		DefaultListModel modelIncidents=new DefaultListModel<>();
		List<SelfHarmIncident> to=toUSe.returnSelfHarmIncidentByPatientId(pId);
		
		JList list = new JList(modelIncidents);
		
		
		for (SelfHarmIncident selfHarmIncident : to) {
			modelIncidents.addElement(selfHarmIncident.getPatient().getName()+"|"+selfHarmIncident.getDetails());
		}
		scrollPane.setViewportView(list);
		
		setSize(1000, 700);
		setVisible(true);
	}

}
