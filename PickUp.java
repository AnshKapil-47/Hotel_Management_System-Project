package HotelManagementSystem;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;

import javax.swing.*;

import net.proteanit.sql.DbUtils;

public class PickUp extends JFrame
{
	PickUp()
	{
		JPanel panel = new JPanel();
		panel.setBounds(5,5,790,590);
		panel.setLayout(null);
		panel.setBackground(new Color(3,45,48));
		add(panel);
		
		
		JLabel pus = new JLabel("Pick Up Service");
		pus.setBounds(90,11,160,25);
		pus.setForeground(Color.WHITE);
		pus.setFont(new Font("Tahoma",Font.BOLD,20));
		panel.add(pus);
		
		
		JLabel toc = new JLabel("Type of Car :");
		toc.setBounds(32,97,89,25);
		toc.setForeground(Color.WHITE);
		toc.setFont(new Font("Tahoma",Font.PLAIN,14));
		panel.add(toc);
		
		
		Choice c = new Choice();
		c.setBounds(123,97,150,25);
		panel.add(c);
		
		try
		{
			conn C = new conn();
			String q = "SELECT * FROM driver";
			ResultSet resultset = C.statement.executeQuery(q);
			
			while(resultset.next())
			{
				c.add(resultset.getString("carname"));
			}
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		
		
		
		JTable table = new JTable();
		table .setBounds(10,233,800,250);
		table.setBackground(new Color(3,45,48));
		table.setForeground(Color.WHITE);
		panel.add(table);
		
		try
		{
			conn C = new conn();
			String q = "SELECT * FROM driver";
			ResultSet resultset = C.statement.executeQuery(q);
			table.setModel(DbUtils.resultSetToTableModel(resultset));
			
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		
		
		JLabel name = new JLabel("Name");
		name.setBounds(24,208,46,17);
		name.setForeground(Color.WHITE);
		name.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(name);
		
		
		JLabel age = new JLabel("Age");
		age.setBounds(165,208,46,17);
		age.setForeground(Color.WHITE);
		age.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(age);
		
		
		JLabel gender = new JLabel("Gender");
		gender.setBounds(264,208,74,17);
		gender.setForeground(Color.WHITE);
		gender.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(gender);
		
		
		JLabel company = new JLabel("Company");
		company.setBounds(366,208,100,17);
		company.setForeground(Color.WHITE);
		company.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(company);
		
		
		JLabel carname = new JLabel("Car Name");
		carname.setBounds(486,208,100,17);
		carname.setForeground(Color.WHITE);
		carname.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(carname);
		
		
		JLabel ava = new JLabel("Available");
		ava.setBounds(600,208,100,17);
		ava.setForeground(Color.WHITE);
		ava.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(ava);
		
		
		JLabel loc = new JLabel("Location");
		loc.setBounds(700,208,100,17);
		loc.setForeground(Color.WHITE);
		loc.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(loc);
		
		
		JButton display = new JButton("Display");
		display.setBounds(200,500,120,30);
		display.setBackground(Color.BLACK);
		display.setForeground(Color.WHITE);
		display.setMnemonic(KeyEvent.VK_D);
		display.setToolTipText("Alt + D");
		panel.add(display);
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String q = "SELECT * FROM driver WHERE carname = '"+c.getSelectedItem()+"'";
				try
				{
					conn c = new conn();
					ResultSet resultset = c.statement.executeQuery(q);
					table.setModel(DbUtils.resultSetToTableModel(resultset));
				}
				catch(Exception E)
				{
					E.printStackTrace();
				}
			}
		});
		
		
		JButton back = new JButton("Back");
		back.setBounds(420,500,120,30);
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
		setSize(800,600);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new PickUp();
	}

}
