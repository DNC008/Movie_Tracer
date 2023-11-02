package javacreate;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class recommend {

	 JFrame frame4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					recommend window = new recommend();
					window.frame4.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public recommend() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame4 = new JFrame();
		frame4.getContentPane().setBackground(Color.BLACK);
		frame4.setTitle("                                                              RECOMMENDATIONS");
		frame4.setBounds(300, -35, 920,800);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("AVENGERS ENDGAME");
		lblNewLabel.setIcon(new ImageIcon(recommend.class.getResource("/javacreate/endgame.gif")));
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setBounds(10, 10, 300, 337);
		frame4.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setToolTipText("PIRATES OF THE CARIBBEAN\r\n");
		lblNewLabel_1.setIcon(new ImageIcon(recommend.class.getResource("/javacreate/pirates.gif")));
		lblNewLabel_1.setBackground(Color.PINK);
		lblNewLabel_1.setBounds(10, 357, 389, 200);
		frame4.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setToolTipText("THE BOSS BABY");
		lblNewLabel_2.setIcon(new ImageIcon(recommend.class.getResource("/javacreate/bossbaby.gif")));
		lblNewLabel_2.setBackground(Color.PINK);
		lblNewLabel_2.setBounds(320, 10, 258, 270);
		frame4.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setToolTipText("HARRY POTTER ");
		lblNewLabel_3.setIcon(new ImageIcon(recommend.class.getResource("/javacreate/harrypotter.gif")));
		lblNewLabel_3.setBounds(265, 567, 240, 170);
		frame4.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setToolTipText("YOUR NAME");
		lblNewLabel_4.setIcon(new ImageIcon(recommend.class.getResource("/javacreate/kiminonawa.gif")));
		lblNewLabel_4.setBounds(417, 287, 480, 270);
		frame4.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setToolTipText("HOW TO TRAIN YOUR DRAGON");
		lblNewLabel_5.setIcon(new ImageIcon(recommend.class.getResource("/javacreate/dragon.gif")));
		lblNewLabel_5.setBounds(10, 567, 240, 170);
		frame4.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(recommend.class.getResource("/javacreate/annabelle.gif")));
		lblNewLabel_3_1.setToolTipText("ANNABELLE");
		lblNewLabel_3_1.setBounds(503, 567, 283, 170);
		frame4.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(recommend.class.getResource("/javacreate/showman.gif")));
		lblNewLabel_2_1.setToolTipText("THE GREATEST SHOWMAN");
		lblNewLabel_2_1.setBackground(Color.PINK);
		lblNewLabel_2_1.setBounds(577, 38, 320, 270);
		frame4.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(0, 0, 45, 13);
		frame4.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("B\r\nA\r\nC\r\nK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton)
				{
					option x=new option();
		            x.frame3.setVisible(true);
                    frame4.dispose();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBackground(new Color(204, 255, 255));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(806, 690, 77, 41);
		frame4.getContentPane().add(btnNewButton);
	}
}
