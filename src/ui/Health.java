package ui;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import healthservice.AWSHealthService;
import healthservice.AWSHealthServiceImplService;

public class Health extends JFrame {
	
	AWSHealthServiceImplService implService=new AWSHealthServiceImplService();
	AWSHealthService healthService;
	
	public Health() {
		getContentPane().setLayout(null);
		healthService=implService.getAWSHealthServiceImplPort();
		JTextArea txtReport = new JTextArea();
		txtReport.setBounds(168, 94, 693, 420);
		getContentPane().add(txtReport);
		
		txtReport.setText(healthService.returnReport());
		setSize(1000, 700);
		setVisible(true);
	}
}
