package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ClearController;
import controller.EqualsController;
import controller.NumberController;
import controller.OperationController;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;

import java.awt.Font;

@SuppressWarnings("serial")
public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField txtDisplay;
	private JTextField txtRelative;
	private JButton[] numberButtons = {new JButton("1"), new JButton("2"), new JButton("3"), new JButton("4"), 
			new JButton("5"), new JButton("6"), new JButton("7"), new JButton("8"), new JButton("9"), new JButton("0"), };
	private JButton[] operationButtons = {new JButton("+"), new JButton("-"), new JButton("*"), new JButton("/")};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 169, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Calc");
		
		txtRelative = new JTextField();
		txtRelative.setEditable(false);
		txtRelative.setFont(new Font("Tahoma", Font.PLAIN, 9));
		txtRelative.setBounds(5, 4, 153, 16);
		contentPane.add(txtRelative);
		txtRelative.setColumns(10);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDisplay.setEditable(false);
		txtDisplay.setBounds(5, 23, 153, 23);
		contentPane.add(txtDisplay);
		txtDisplay.setColumns(10);
		txtDisplay.setText("0");
		
		JPanel ctnNumbers = new JPanel();
		ctnNumbers.setBounds(5, 58, 153, 114);
		contentPane.add(ctnNumbers);
		ctnNumbers.setLayout(new GridLayout(0, 3, 0, 0));
		
		for(int i = 7; i > 0 ; i++) {
			this.numberButtons[i] = new JButton(Integer.toString(i));
			ctnNumbers.add(this.numberButtons[i]);
			NumberController number = new NumberController(i, txtDisplay);
			numberButtons[i].addActionListener(number);
			if(i%3 == 0) {
				i = i - 6;
			}
		}
		
		JButton btnClear = new JButton("C");
		ctnNumbers.add(btnClear);
		ClearController clear = new ClearController(txtDisplay, txtRelative);
		btnClear.addActionListener(clear);
		
		this.numberButtons[0] = new JButton("0");
		ctnNumbers.add(this.numberButtons[0]);
		NumberController number = new NumberController(0, txtDisplay);
		numberButtons[0].addActionListener(number);
		
		JButton btnEquals = new JButton("=");
		ctnNumbers.add(btnEquals);
		EqualsController equals = new EqualsController(txtDisplay, txtRelative);
		btnEquals.addActionListener(equals);
		
		JPanel ctnOperations = new JPanel();
		ctnOperations.setBounds(5, 187, 153, 67);
		contentPane.add(ctnOperations);
		ctnOperations.setLayout(new GridLayout(0, 2, 0, 0));
		
		for(JButton btn : operationButtons) {
			ctnOperations.add(btn);
			OperationController control = new OperationController(txtDisplay, txtRelative, btn.getText());
			btn.addActionListener(control);
		}
		
	}
}
