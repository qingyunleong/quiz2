import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz2 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz2 window = new Quiz2();
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
	public Quiz2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel1 = new JLabel("How much water should I drink?");
		lblNewLabel1.setForeground(new Color(255, 255, 255));
		lblNewLabel1.setBackground(new Color(0, 0, 128));
		lblNewLabel1.setFont(new Font("Candara", Font.BOLD, 27));
		
		JLabel lblNewLabel = new JLabel("My weight (kg) :");
		lblNewLabel.setForeground(new Color(255, 250, 205));
		lblNewLabel.setFont(new Font("Candara Light", Font.PLAIN, 25));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnTELLME = new JButton("TELL ME");
		btnTELLME.setBackground(new Color(255, 240, 245));
		btnTELLME.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int weight;
				double w;
				
				try {
					weight=Integer.parseInt(textField.getText());
					
					w=weight*40;
					JOptionPane.showMessageDialog(null, "Hi bro, you should drink " + w + " ml of water a day!!");
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnTELLME.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(62)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(25)
							.addComponent(lblNewLabel1, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(147)
							.addComponent(btnTELLME, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addComponent(lblNewLabel1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnTELLME, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(34))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
