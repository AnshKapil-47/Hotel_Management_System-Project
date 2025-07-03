package HotelManagementSystem;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.*;

public class CheckOut extends JFrame
{
	CheckOut()
	{
		JPanel panel = new JPanel();
		panel.setBounds(5,5,790,390);
		panel.setLayout(null);
		panel.setBackground(new Color(3,45,48));
		add(panel);
		
		
		JLabel l1 = new JLabel("Check-Out");
		l1.setBounds(100,20,150,30);
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Tahoma",Font.PLAIN,20));
		panel.add(l1);
		
		
		JLabel l2 = new JLabel("Customer ID :");
		l2.setBounds(30,80,150,30);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(l2);
		
		Choice Customer = new Choice();
		Customer.setBounds(200,80,150,25);
		panel.add(Customer);
		
		
		JLabel l3 = new JLabel("Room Number :");
		l3.setBounds(30,130,150,30);
		l3.setForeground(Color.WHITE);
		l3.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(l3);
		
		JLabel l3rm = new JLabel();
		l3rm.setBounds(200,130,150,30);
		l3rm.setForeground(Color.WHITE);
		l3rm.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(l3rm);
		
		
		JLabel l4 = new JLabel("Check-In Time :");
		l4.setBounds(30,180,150,30);
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(l4);
		
		JLabel l4cit = new JLabel();
		l4cit.setBounds(200,180,250,30);
		l4cit.setForeground(Color.WHITE);
		l4cit.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(l4cit);
		
		
		JLabel l5 = new JLabel("Check-Out Time :");
		l5.setBounds(30,230,150,30);
		l5.setForeground(Color.WHITE);
		l5.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(l5);
		
		Date date = new Date();
		
		
		JLabel l5cot = new JLabel(""+date);
		l5cot.setBounds(200,230,250,30);
		l5cot.setForeground(Color.WHITE);
		l5cot.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(l5cot);
		
		
		try
		{
			conn c = new conn();
			ResultSet resultset = c.statement.executeQuery("SELECT * FROM customer");
			
			while(resultset.next())
			{
				Customer.add(resultset.getString("number"));
			}
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		
		
		JButton checkout = new JButton("Check-Out");
		checkout.setBounds(30,300,120,30);
		checkout.setForeground(Color.WHITE);
		checkout.setBackground(Color.BLACK);
		checkout.setMnemonic(KeyEvent.VK_O);
		checkout.setToolTipText("Alt + O");
		panel.add(checkout);
		checkout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				try
				{
					conn cv = new conn();
					cv.statement.executeUpdate("DELETE FROM customer WHERE number = '"+Customer.getSelectedItem()+"'");
					cv.statement.executeUpdate("UPDATE room SET availability = 'Available' 	WHERE roomnumber = '"+l3rm.getText()+"'");
					
					JOptionPane.showMessageDialog(null, "Done");
				}
				catch (Exception E)
				{
					E.printStackTrace();
				}
			}
		});
		
		
		JButton check = new JButton("Check");
		check.setBounds(300,300,120,30);
		check.setForeground(Color.WHITE);
		check.setBackground(Color.BLACK);
		check.setMnemonic(KeyEvent.VK_C);
		check.setToolTipText("Alt + C");
		panel.add(check);
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				conn c = new conn();
				try
				{
					ResultSet res = c.statement.executeQuery("SELECT * FROM customer where number = '"+Customer.getSelectedItem()+"'");
					while(res.next())
					{
						l3rm.setText(res.getString("room"));
						l4cit.setText(res.getString("checkintime"));
					}
				}
				catch (Exception E)
				{
					E.printStackTrace();
				}
			}
		});
		
		JButton back = new JButton("Back");
		back.setBounds(170,300,120,30);
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setMnemonic(KeyEvent.VK_X);
		back.setToolTipText("Alt + X");
		panel.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
			}
		});
		
		setUndecorated(true);
		setLocation(500,210);
		setLayout(null);
		setSize(800,400);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new CheckOut();
	}

}
