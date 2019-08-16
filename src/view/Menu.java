package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

import javax.swing.JOptionPane;
import java.awt.Font;

@SuppressWarnings("serial")
public class Menu extends JFrame {
	
	private static int number1 = 0;
	private static String relativeCalc = "";
	private static String operator = "";

	private JPanel contentPane;
	private static JTextField txtDisplay;
	private static JTextField txtOperation;
	private static JTextField txtRelative;

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
		
		txtRelative = new JTextField();
		txtRelative.setEditable(false);
		txtRelative.setFont(new Font("Tahoma", Font.PLAIN, 9));
		txtRelative.setBounds(5, 4, 153, 16);
		contentPane.add(txtRelative);
		txtRelative.setColumns(10);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDisplay.setEditable(false);
		txtDisplay.setBounds(5, 23, 127, 23);
		contentPane.add(txtDisplay);
		txtDisplay.setColumns(10);
		
		txtOperation = new JTextField();
		txtOperation.setEditable(false);
		txtOperation.setHorizontalAlignment(SwingConstants.CENTER);
		txtOperation.setBounds(134, 23, 24, 23);
		contentPane.add(txtOperation);
		txtOperation.setColumns(10);
		
		JPanel ctnNumbers = new JPanel();
		ctnNumbers.setBounds(5, 58, 153, 114);
		contentPane.add(ctnNumbers);
		ctnNumbers.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txtDisplay.getText();
				txtDisplay.setText(text + "1");
			}
		});
		ctnNumbers.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txtDisplay.getText();
				txtDisplay.setText(text + "2");
			}
		});
		ctnNumbers.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txtDisplay.getText();
				txtDisplay.setText(text + "3");
			}
		});
		ctnNumbers.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txtDisplay.getText();
				txtDisplay.setText(text + "4");
			}
		});
		ctnNumbers.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txtDisplay.getText();
				txtDisplay.setText(text + "5");
			}
		});
		ctnNumbers.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txtDisplay.getText();
				txtDisplay.setText(text + "6");
			}
		});
		ctnNumbers.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txtDisplay.getText();
				txtDisplay.setText(text + "7");
			}
		});
		ctnNumbers.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txtDisplay.getText();
				txtDisplay.setText(text + "8");
			}
		});
		ctnNumbers.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txtDisplay.getText();
				txtDisplay.setText(text + "9");
			}
		});
		ctnNumbers.add(btn9);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
				txtOperation.setText("");
				txtRelative.setText("");
				relativeCalc = "";
				number1 = 0;
			}
		});
		ctnNumbers.add(btnC);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txtDisplay.getText();
				txtDisplay.setText(text + "0");
			}
		});
		ctnNumbers.add(btn0);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equalsController();
			}
		});
		ctnNumbers.add(btnEquals);
		
		JPanel ctnOperations = new JPanel();
		ctnOperations.setBounds(5, 187, 153, 67);
		contentPane.add(ctnOperations);
		ctnOperations.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorController("+");
			}
		});
		ctnOperations.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorController("-");
			}
		});
		ctnOperations.add(btnMinus);
		
		JButton btnTimes = new JButton("*");
		btnTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorController("*");
			}
		});
		ctnOperations.add(btnTimes);
		
		JLabel label = new JLabel("");
		ctnOperations.add(label);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorController("/");
			}
		});
		ctnOperations.add(btnDivide);
		
		JLabel label_1 = new JLabel("");
		ctnOperations.add(label_1);
		
	}
	
	/**
	 * Control the operations
	 */
	public static void operatorController(String opType) {
		try {
			number1 = Integer.parseInt(txtDisplay.getText());
			relativeCalc = relativeCalc + txtDisplay.getText();
			txtOperation.setText(opType);
		}catch(NumberFormatException ex){
			txtOperation.setText(opType);
		}finally {
			operator = opType;
			txtDisplay.setText("");
		}
	}
	
	/**
	 * Control the equals function
	 */
	public static void equalsController() {
		try {
			int number2 = Integer.parseInt(txtDisplay.getText());
			int result = 0;
			switch(txtOperation.getText()) {
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
			default:
				JOptionPane.showMessageDialog(null, "Select a operator");
				break;
			}
			txtDisplay.setText(Integer.toString(result));
			relativeCalc = relativeCalc + operator + number2;
			txtRelative.setText(relativeCalc);
			relativeCalc = relativeCalc + "=";
			txtOperation.setText("");
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Insert a number");
		}
	}
}
