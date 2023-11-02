package javacreate;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class login {

	 JFrame frame2;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame2 = new JFrame();
		frame2.setBounds(400, 100, 698, 405);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel.setBounds(292, 31, 97, 39);
		frame2.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setBounds(153, 114, 126, 28);
		frame2.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(Color.CYAN);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(153, 183, 126, 24);
		frame2.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBackground(new Color(204, 255, 255));
		textField.setBounds(372, 123, 143, 23);
		frame2.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 10));
		passwordField.setBackground(new Color(204, 255, 255));
		passwordField.setBounds(372, 188, 143, 24);
		frame2.getContentPane().add(passwordField);
		
		JDialog dia=new JDialog();
		JButton btn=new JButton("Retry");
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBorder(new LineBorder(new Color(51, 102, 153), 3));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn)
				{
					dia.dispose();
				}
				if(e.getSource()==btnNewButton)
		        {
		            String d="Nidhi";
		            String d1="201106040";
		            String d3="Delida";
		            String d4="201106024";
		            String pass=new String(passwordField.getPassword());
		            if((textField.getText().equals(d))&&(pass.equals(d1)))
		            {
		            	option x=new option();
			            x.frame3.setVisible(true);
                        frame2.dispose();
                        
		            }
		            else if((textField.getText().equals(d3))&&(pass.equals(d4)))
		            {
		            	option x=new option();
			            x.frame3.setVisible(true);
                        frame2.dispose();
		            	
		            }
		            else
		            {
		                
		                dia.setBounds(650,300,200,90);
		                dia.setVisible(true);
		                dia.getContentPane().setLayout(null);
		                JLabel lab=new JLabel("Incorect Password");
		                lab.setBounds(40,10,200,20);
		                dia.getContentPane().add(lab);
		                btn.setBounds(50,30,70,20);
		                dia.getContentPane().add(btn);
		                btn.addActionListener(this);
		                		

		            }

		        }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(204, 255, 255));
		btnNewButton.setBounds(292, 261, 97, 39);
		frame2.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 153));
		panel.setBounds(123, 31, 436, 39);
		frame2.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 102, 153));
		panel_1.setBounds(554, 66, 5, 254);
		frame2.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 102, 153));
		panel_2.setBounds(123, 66, 5, 254);
		frame2.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(51, 102, 153));
		panel_3.setBounds(123, 315, 435, 5);
		frame2.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(login.class.getResource("/javacreate/img2.png")));
		lblNewLabel_3.setBounds(0, 0, 684, 368);
		frame2.getContentPane().add(lblNewLabel_3);
	}
}
