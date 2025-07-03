package HotelManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class Employee extends JFrame
{
	Employee()
	{
		
		JPanel panel = new JPanel();
		panel.setBounds(5,5,990,590);
		panel.setBackground(new Color(3,45,48));
		panel.setLayout(null);
		add(panel);
		
		
		JTable table= new JTable();
		table.setBounds(10,34,980,450);
		table.setBackground(new Color(3,45,48));
		table.setForeground(Color.WHITE);
		panel.add(table);
		
		
		try
		{
			conn c = new conn();
			
			String q = "SELECT * FROM employee";
			ResultSet resultSet = c.statement.executeQuery(q);
			table.setModel(DbUtils.resultSetToTableModel(resultSet));
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		
		
		JButton back = new JButton("BACK");
		back.setBounds(350,500,120,30);
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
		
		
		JLabel label1 = new JLabel("Name");
		label1.setBounds(41,11,70,19);
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label1);
		
		
		JLabel label2 = new JLabel("Age");
		label2.setBounds(159,11,70,19);
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label2);
		
		
		JLabel label3 = new JLabel("Gender");
		label3.setBounds(273,11,70,19);
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label3);
		
		
		JLabel label4 = new JLabel("Job");
		label4.setBounds(416,11,70,19);
		label4.setForeground(Color.WHITE);
		label4.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label4);
		
		
		JLabel label5 = new JLabel("Salary");
		label5.setBounds(536,11,70,20);
		label5.setForeground(Color.WHITE);
		label5.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label5);
		
		
		JLabel label6 = new JLabel("Phone");
		label6.setBounds(653,11,70,19);
		label6.setForeground(Color.WHITE);
		label6.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label6);
		
		
		JLabel label7 = new JLabel("Email");
		label7.setBounds(786,11,70,19);
		label7.setForeground(Color.WHITE);
		label7.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label7);
		
		
		JLabel label8 = new JLabel("Aadhar");
		label8.setBounds(894,11,105,20);
		label8.setForeground(Color.WHITE);
		label8.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label8);
		
		
		setUndecorated(true);
		setLayout(null);
		setLocation(330,100);
		setSize(1000,600);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Employee();
	}

}
