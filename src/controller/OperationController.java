package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class OperationController implements ActionListener {
	
	private JTextField txtDisplay;
	private JTextField txtRelative;
	private String operator;
	
	public OperationController(JTextField txtDisplay, JTextField txtRelative, String operator) {
		this.txtDisplay = txtDisplay;
		this.txtRelative = txtRelative;
		this.operator = operator;
	}

	public void doOperation() {
		String number1 = this.txtDisplay.getText();
		this.txtRelative.setText(number1 + " " + this.operator);
		this.txtDisplay.setText("0");
	}
	
	public void actionPerformed(ActionEvent arg0) {
		doOperation();
	}
}