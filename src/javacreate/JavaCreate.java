package javacreate;
import java.awt.EventQueue;
import net.proteanit.sql.DbUtils;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
public class JavaCreate {

	 JFrame frame0;
	private JTextField txtduration;
	private JTextField txtgenre;
	private JTextField txtname;
	private JTable table;
	private JTextField txtid;
	protected Object frame01;
	protected Object frame10;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaCreate window = new JavaCreate();
					window.frame0.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaCreate() {
		initialize();
		//Connect();
		//table_load();
	}
	//Connection con=null;

	/*public void Connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/signup","root"," ");
		}catch(ClassNotFoundException e) {
			
		}catch(SQLException ex) {
			
		}
	}*/

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame0 = new JFrame();
		frame0.setBounds(400, 100, 698, 405);
		frame0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame0.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seen");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(299, 4, 193, 21);
		frame0.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBorder(new TitledBorder(null, "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 36, 378, 246);
		frame0.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Movie name");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 36, 110, 18);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Genre");
		lblNewLabel_3.setForeground(Color.CYAN);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(22, 97, 68, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Duration");
		lblNewLabel_4.setForeground(Color.CYAN);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(22, 151, 98, 18);
		panel.add(lblNewLabel_4);
		
		txtduration = new JTextField();
		txtduration.setForeground(Color.BLACK);
		txtduration.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtduration.setBounds(130, 149, 188, 20);
		panel.add(txtduration);
		txtduration.setColumns(10);
		
		txtgenre = new JTextField();
		txtgenre.setForeground(Color.BLACK);
		txtgenre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtgenre.setBounds(130, 97, 188, 20);
		panel.add(txtgenre);
		txtgenre.setColumns(10);
		
		txtname = new JTextField();
		txtname.setForeground(Color.BLACK);
		txtname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtname.setBounds(130, 34, 188, 20);
		panel.add(txtname);
		txtname.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.CYAN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				try {
					String name,genre, duration,id;
					name = txtname.getText();
					
					genre = txtgenre.getText();
					duration = txtduration.getText();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","");
					
					@SuppressWarnings("deprecation")
					//String sql="Select * From signup where Username='"+tusername.getText()+"' and Password='"+tpassword.getText().toString()+"'";
					
					PreparedStatement per = con.prepareStatement("insert into movietracer (name,genre,duration)values(?,?,?)");
					
					per.setString(1, name);
					
					per.setString(2, genre);
					per.setString(3, duration);
					
					per.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Added!!!!!!");
					//table_load();
					txtname.setText("");
				
					
					txtgenre.setText("");
					txtduration.setText("");
					txtname.requestFocus();
					
					ResultSet rs;
					 per = con.prepareStatement("select * from movietracer");
					rs = per.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(39, 201, 89, 36);
		panel.add(btnNewButton);
		
		JButton btnExit = new JButton("Back");
		btnExit.setBackground(Color.BLACK);
		btnExit.setForeground(Color.CYAN);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnExit)
				{
					if(e.getSource()==btnExit)
					{
						option x=new option();
			            x.frame3.setVisible(true);
	                    frame0.dispose();
					}
					
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBounds(152, 201, 89, 36);
		panel.add(btnExit);
		
		JButton btnClear = new JButton("Exit");
		btnClear.setBackground(Color.BLACK);
		btnClear.setForeground(Color.CYAN);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame0.dispose();
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClear.setBounds(261, 201, 89, 36);
		panel.add(btnClear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(411, 36, 261, 281);
		frame0.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.CYAN);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 271, 368, 84);
		frame0.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Movie ID");
		lblNewLabel_2_1.setForeground(Color.CYAN);
		lblNewLabel_2_1.setBounds(10, 20, 78, 15);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblNewLabel_2_1);
		
		txtid = new JTextField();
		txtid.setForeground(Color.BLACK);
		txtid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				try { 
					 
					String id = txtid.getText();
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","");
					PreparedStatement per= con.prepareStatement("Select name,genre,duration from movietracer where id=?");
					per.setString(1, id);
					ResultSet rs=per.executeQuery();
					if(rs.next()==true) {
						String name = rs.getString(1);
						String genre = rs.getString(2);
						String duration = rs.getString(3);
						txtname.setText(name);
						txtgenre.setText(genre);
						txtduration.setText(duration);
						
					}
					else {
						txtname.setText("");
						txtgenre.setText("");
						txtduration.setText("");
					}
				}
				catch(SQLException ex) {
					
				}
			}
		});
		txtid.setBounds(153, 18, 116, 20);
		txtid.setColumns(10);
		panel_1.add(txtid);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name,genre, duration,id;
				name = txtname.getText();
				
				genre = txtgenre.getText();
				duration = txtduration.getText();
				id=txtid.getText();
				try {
					
					System.out.println("Hello");
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","");
					
					@SuppressWarnings("deprecation")
					//String sql="Select * From signup where Username='"+tusername.getText()+"' and Password='"+tpassword.getText().toString()+"'";
					
					PreparedStatement per = con.prepareStatement("update movietracer set name=?,genre=?,duration=? where id=?");
					
					per.setString(1, name);
					
					per.setString(2, genre);
					per.setString(3, duration);
					per.setString(4, id);
					
					per.executeUpdate();
					
					JOptionPane.showMessageDialog(null, "Record Updated!!!!!!");
					//table_load();
					txtname.setText("");
				
					
					txtgenre.setText("");
					txtduration.setText("");
					txtid.setText("");
					txtname.requestFocus();
					
					//ResultSet rs;
					// per = con.prepareStatement("select * from movietracer");
					//rs = per.executeQuery();
					//table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(SQLException e1) {
					e1.printStackTrace();
				}
				catch(ClassNotFoundException e2) {
					
				}
				
			}
		});
			
		
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(Color.BLACK);
		btnDelete.setForeground(Color.CYAN);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String name,genre, duration,id;
					name = txtname.getText();
					
					genre = txtgenre.getText();
					duration = txtduration.getText();
					id=txtid.getText();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","");
					
					@SuppressWarnings("deprecation")
					//String sql="Select * From signup where Username='"+tusername.getText()+"' and Password='"+tpassword.getText().toString()+"'";
					
					PreparedStatement per = con.prepareStatement("delete from movietracer where id=?");
					
					
					per.setString(1, id);
					
					per.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Deleted!!!!!!");
					//table_load();
					txtname.setText("");
				
					
					txtgenre.setText("");
					txtduration.setText("");
					txtname.requestFocus();
					
					ResultSet rs;
					 per = con.prepareStatement("select * from movietracer");
					rs = per.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDelete.setBounds(543, 328, 99, 34);
		frame0.getContentPane().add(btnDelete);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setForeground(Color.CYAN);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String name,genre, duration,id;
					name = txtname.getText();
					
					genre = txtgenre.getText();
					duration = txtduration.getText();
					id=txtid.getText();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","");
					
					@SuppressWarnings("deprecation")
					//String sql="Select * From signup where Username='"+tusername.getText()+"' and Password='"+tpassword.getText().toString()+"'";
					
					PreparedStatement per = con.prepareStatement("update movietracer set name=?,genre=?,duration=? where id=?");
					
					per.setString(1, name);
					
					per.setString(2, genre);
					per.setString(3, duration);
					per.setString(4, id);
					
					per.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Updated!!!!!!");
					//table_load();
					txtname.setText("");
				
					
					txtgenre.setText("");
					txtduration.setText("");
					txtname.requestFocus();
					
					ResultSet rs;
					 per = con.prepareStatement("select * from movietracer");
					rs = per.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setBounds(419, 328, 99, 34);
		frame0.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(JavaCreate.class.getResource("/javacreate/img.jpg")));
		lblNewLabel_2.setBounds(0, 4, 672, 362);
		frame0.getContentPane().add(lblNewLabel_2);
	}
}
