package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ClearController implements ActionListener {
	
	private JTextField txtDisplay;
	private JTextField txtRelative;
	
	public ClearController(JTextField txtDisplay, JTextField txtRelative) {
		this.txtDisplay = txtDisplay;
		this.txtRelative = txtRelative;
	}
	
	public void clear() {
		this.txtDisplay.setText("");
		this.txtRelative.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		clear();
	}

}
