package HotelManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;

import javax.swing.*;

import net.proteanit.sql.DbUtils;

public class Department extends JFrame
{
	Department()
	{
		JPanel panel = new JPanel();
		panel.setBounds(5,5,690,490);
		panel.setBackground(new Color(3,45,48));
		panel.setLayout(null);
		add(panel);
		
		JTable table= new JTable();
		table.setBounds(0,40,700,350);
		table.setBackground(new Color(3,45,48));
		table.setForeground(Color.WHITE);
		panel.add(table);
		
		
		try
		{
			conn c = new conn();
			
			String q = "SELECT * FROM department";
			ResultSet resultSet = c.statement.executeQuery(q);
			
			table.setModel(DbUtils.resultSetToTableModel(resultSet));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		JButton back = new JButton("BACK");
		back.setBounds(400,410,120,30);
		back.setForeground(Color.WHITE);
		back.setBackground(Color.BLACK);
		back.setMnemonic(KeyEvent.VK_X);
		back.setToolTipText("Alt + X");
		panel.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
			}
		});
		
		
		JLabel label = new JLabel("Department");
		label.setBounds(145,11,105,20);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label);
		
		
		JLabel label2 = new JLabel("Budget");
		label2.setBounds(431,11,105,20);
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label2);
		
		
		setUndecorated(true);
		setLayout(null);
		setLocation(550,130);
		setSize(700,500);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Department();
	}

}
