package Controller;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Model.ConnectDB;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SignUp extends JFrame {
	JFrame fc= new JFrame();
	JLabel lbsignup = new JLabel("SIGN UP");
//	JLabel lb = new JLabel("SIGN UP");
	
	JLabel lbuser = new JLabel("USERNAME");
	JTextField tfusername = new JTextField(15);
	JLabel lbpassword = new JLabel("PASSWORD");
	JTextField tfpassword = new JTextField(15);
	JButton btforget = new JButton("Forgotten");
	JButton btsignup = new JButton("Log in");
	JButton btcreateacA = new JButton("Create Account");
	JLabel lbq = new JLabel("Rights");
	String gender[] = {"Admin"};
	JComboBox cbq = new JComboBox(gender);
	Connection conn;
	Statement stmt;
	ResultSet rs;
	PreparedStatement ps;
	public SignUp() {
		lbsignup.setLayout(null);
		lbsignup.setBounds(200,100,100,30);
		lbsignup.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbsignup.setForeground(Color.BLUE);
		fc.setLocation(500,200);
		fc.setLayout(null);
		fc.add(lbsignup);
		JLabel lbLogo = new JLabel("");
		lbLogo.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Pictures\\Screenshots\\2.png"));
		lbLogo.setBounds(10, 10, 1500, 80);
		fc.getContentPane().add(lbLogo);
		lbuser.setBounds(80,80,80,210);
		lbuser.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(lbuser);
		tfusername.setBounds(180,175,200,25);
		tfusername.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(tfusername);
		lbpassword.setBounds(80,120,80,210);
		lbpassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(lbpassword);
		tfpassword.setBounds(180,215,200,25);
		tfpassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(tfpassword);
		lbq.setBounds(90,250,100,20);
		lbq.setFont(new Font("Tahoma", Font.BOLD, 12));
		btforget.setBounds(60,280,100,25);
		btforget.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(btforget);
		btsignup.setBounds(180,280,100,25);
		btsignup.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(btsignup);
		btcreateacA.setBounds(300,280,150,25);
		btcreateacA.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(btcreateacA);
		btforget.setBackground(Color.BLUE);
		btsignup.setBackground(Color.BLUE);
		btcreateacA.setBackground(Color.BLUE);
		
	
		    fc.pack();
			fc.setSize(500,400);
			fc.setVisible(true);
			
			 btsignup.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				String username= tfusername.getText();
				String password= new String (tfpassword.getText());
				String username1= tfusername.getText();
				String password1= new String (tfpassword.getText());
				StringBuilder sb = new StringBuilder();
		
			if (username.equals("")) {
			sb.append("Vui lòng nhập lại");
			}
				
			if (password.equals("")) {
				sb.append("Vui lòng nhập lại");
				}
			if (sb.length()>0) {
			
		return ;
			}
			else 	 if (username1.equals("lanlords") && password1.endsWith("lanlords")) {
					//				JOptionPane.showMessageDialog( this,"successfull");
				 //new lanlords();//			new ();
									fc.dispose();
									JOptionPane.showMessageDialog(null, "Successfull");
							
									
								}
				if (username.equals("Admin") && password.endsWith("Admin")) {
	//				JOptionPane.showMessageDialog( this,"successfull");
					new choose();
					fc.dispose();
					JOptionPane.showMessageDialog(null, "Successfull");
				}else  if (username1.equals("lanlords") && password1.endsWith("lanlords")) {
						//				JOptionPane.showMessageDialog( this,"successfull");
					 new lanlords();//			new ();
										fc.dispose();
										JOptionPane.showMessageDialog(null, "Successfull");
								
										
									//}
				
				}else {
					JOptionPane.showMessageDialog(null, "Failed");	
					new Createaccount();
					fc.dispose();
				}}

					});
			
		

			btcreateacA.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new Createaccount();
					fc.dispose();
					
				}
			});
			btforget.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new forgotpass();
					fc.dispose();
					
				}
			});
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignUp();
	}
}
