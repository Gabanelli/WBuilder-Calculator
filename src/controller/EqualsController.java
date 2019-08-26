package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class EqualsController implements ActionListener {
	
	private JTextField txtDisplay;
	private JTextField txtRelative;
	public static boolean isResult = false;
	
	public EqualsController(JTextField txtDisplay, JTextField txtRelative) {
		this.txtDisplay = txtDisplay;
		this.txtRelative = txtRelative;
	}
	
	public void calculateNumbers() {
		int number2 = Integer.parseInt(this.txtDisplay.getText());
		String numberAndOperator = this.txtRelative.getText();
		if(numberAndOperator.equals("0") || number2 == 0) {
			this.txtRelative.setText("Use a operator");
		}else {
			String[] numberAndOperatorDivided = numberAndOperator.split(" ");
			int number1 = Integer.parseInt(numberAndOperatorDivided[0]);
			int result = 0;
			switch(numberAndOperatorDivided[1]) {
			case "+":
				result = number1 + number2;
				break;
			case "-":
				result = number1 - number2;
				break;
			case "*":
				result = number1 * number2;
				break;
			case "/":
				result = number1 / number2;
				break;
			}
			this.txtDisplay.setText(Integer.toString(result));
			this.txtRelative.setText("");
			EqualsController.isResult = true;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		calculateNumbers();
	}

}
