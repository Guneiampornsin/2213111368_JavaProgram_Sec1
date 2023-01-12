import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
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
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNumber1 = new JTextField();
		txtNumber1.setBounds(284, 58, 200, 40);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);

		JLabel lblNumber1 = new JLabel("Enter Number 1");
		lblNumber1.setBounds(87, 56, 123, 40);
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNumber1);

		JLabel lblNumber2 = new JLabel("Enter Number 2");
		lblNumber2.setBounds(87, 122, 123, 37);
		lblNumber2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNumber2);

		txtNumber2 = new JTextField();
		txtNumber2.setBounds(284, 122, 200, 40);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);

		JButton btnOk = new JButton("OK");
		btnOk.setBounds(140, 359, 119, 31);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, sum = 0;
				if(e.getSource()==btnOk) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					
					operator = (String)cmbOperator.getSelectedItem();
					if(operator.equals("+"))
						sum = num1+num2;
					if(operator.equals("-"))
						sum = num1-num2;
					if(operator.equals("*"))
						sum = num1-num2;
					if(operator.equals("/"))
						sum = num1-num2;
					lblResult.setText(String.format("%.2f",sum));
					
				}
			}
		});
		contentPane.add(btnOk);

		JRadioButton oneDigit = new JRadioButton("1 Digit");
		oneDigit.setBounds(284, 238, 109, 23);
		contentPane.add(oneDigit);
		
		JRadioButton twoDigit = new JRadioButton("2 Digit");
		twoDigit.setBounds(284, 264, 109, 23);
		contentPane.add(twoDigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(twoDigit);
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(352, 359, 119, 31);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnExit);

		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(284, 319, 80, 29);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblResult);
		
		JLabel lblNewLabel = new JLabel("Operator");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(87, 182, 102, 31);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(284, 187, 109, 25);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("How to show digit");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(87, 232, 149, 31);
		contentPane.add(lblNewLabel_1);
		
	}
}
