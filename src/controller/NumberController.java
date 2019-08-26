package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class NumberController implements ActionListener {

	private int number;
	private JTextField txtDisplay;
	
	public NumberController(int number, JTextField txtDisplay) {
		this.number = number;
		this.txtDisplay = txtDisplay;
	}
	
	public void returnNumber() {
		String actualText = txtDisplay.getText();
		if(actualText.equals("0") || EqualsController.isResult) {
			txtDisplay.setText(Integer.toString(number));
			EqualsController.isResult = false;
		}else {
			txtDisplay.setText(actualText + number);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		returnNumber();
	}

}
