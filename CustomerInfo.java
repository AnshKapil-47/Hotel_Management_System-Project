package HotelManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;

import javax.swing.*;

import net.proteanit.sql.DbUtils;

public class CustomerInfo extends JFrame
{
	CustomerInfo()
	{
		JPanel panel = new JPanel();
		panel.setBounds(5,5,890,590);
		panel.setLayout(null);
		panel.setBackground(new Color(3,45,48));
		add(panel);
		
		
		JTable table = new JTable();
		table .setBounds(10,40,885,450);
		table.setBackground(new Color(3,45,48));
		table.setForeground(Color.WHITE);
		panel.add(table);
		
		try
		{
			conn c = new conn();
			String q = "SELECT * FROM customer";
			ResultSet resultset = c.statement.executeQuery(q);
			table.setModel(DbUtils.resultSetToTableModel(resultset));
			
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		
		
		JLabel id = new JLabel("ID");
		id.setBounds(31,11,46,14);
		id.setForeground(Color.WHITE);
		id.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(id);
		
		
		JLabel number = new JLabel("Number");
		number.setBounds(138,11,66,14);
		number.setForeground(Color.WHITE);
		number.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(number);
		
		
		
		JLabel name = new JLabel("Name");
		name.setBounds(254,11,46,14);
		name.setForeground(Color.WHITE);
		name.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(name);
		
		
		JLabel gender = new JLabel("Gender");
		gender.setBounds(365,11,66,14);
		gender.setForeground(Color.WHITE);
		gender.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(gender);
		
		
		JLabel country = new JLabel("Country");
		country.setBounds(472,11,66,14);
		country.setForeground(Color.WHITE);
		country.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(country);
		
		
		JLabel room = new JLabel("Room No.");
		room.setBounds(574,11,73,14);
		room.setForeground(Color.WHITE);
		room.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(room);
		
		JLabel cit = new JLabel("CheckIn Time");
		cit.setBounds(681,11,97,14);
		cit.setForeground(Color.WHITE);
		cit.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(cit);
		
		
		JLabel depo = new JLabel("Deposite");
		depo.setBounds(795,11,97,14);
		depo.setForeground(Color.WHITE);
		depo.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(depo);
		
		
		JButton back = new JButton("BACK");
		back.setBounds(450,510,120,30);
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
		setLocation(400,70);
		setLayout(null);
		setSize(900,600);
		setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new CustomerInfo();
	}

}
