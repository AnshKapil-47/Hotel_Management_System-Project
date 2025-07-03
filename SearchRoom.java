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

public class SearchRoom extends JFrame implements ActionListener
{
	JCheckBox checkBox;
	
	Choice choice;
	
	JTable table;
	
	JButton add,back;
	
	SearchRoom()
	{
		JPanel panel = new JPanel();
		panel.setBounds(5,5,690,490);
		panel.setBackground(new Color(3,45,48));
		panel.setLayout(null);
		add(panel);
		
		
		JLabel searchForRoom = new JLabel("Search For Room");
		searchForRoom.setBounds(250,11,186,31);
		searchForRoom.setForeground(Color.WHITE);
		searchForRoom.setFont(new Font("Tahoma",Font.BOLD,20));
		panel.add(searchForRoom);
		
		
		JLabel rbt = new JLabel("Room Bed Type :");
		rbt.setBounds(50,73,120,17);
		rbt.setForeground(Color.WHITE);
		rbt.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(rbt);
		
		
		JLabel rn = new JLabel("Room Number");
		rn.setBounds(20,162,120,20);
		rn.setForeground(Color.WHITE);
		rn.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(rn);
		
		
		JLabel av = new JLabel("Availability");
		av.setBounds(167,162,120,20);
		av.setForeground(Color.WHITE);
		av.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(av);
		
		
		JLabel cs = new JLabel("Clean Status");
		cs.setBounds(300,162,120,20);
		cs.setForeground(Color.WHITE);
		cs.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(cs);
		
		
		JLabel pr = new JLabel("Price");
		pr.setBounds(442,162,120,20);
		pr.setForeground(Color.WHITE);
		pr.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(pr);
		
		
		JLabel bt = new JLabel("Bed Type");
		bt.setBounds(575,162,120,20);
		bt.setForeground(Color.WHITE);
		bt.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(bt);
		
		checkBox = new JCheckBox("Only Display Available");
		checkBox.setBounds(400,69,205,23);
		checkBox.setForeground(Color.WHITE);
		checkBox.setBackground(new Color(3,45,48));	
		panel.add(checkBox);
		
		
		choice = new Choice();
		choice.add("Single Bed");
		choice.add("Double Bed");
		choice.setForeground(Color.WHITE);
		choice.setBounds(173,70,120,20);
		choice.setBackground(new Color(16,108,115));
		panel.add(choice);
		
		table = new JTable();
		table .setBounds(0,187,700,150);
		table.setBackground(new Color(3,45,48));
		table.setForeground(Color.WHITE);
		panel.add(table);
		
		try
		{
			conn c = new conn();
			String q = "SELECT * FROM room";
			ResultSet resultset = c.statement.executeQuery(q);
			table.setModel(DbUtils.resultSetToTableModel(resultset));
			
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		
		
		add = new JButton("SEARCH");
		add.setBounds(200,400,120,30);
		add.setBackground(Color.BLACK);
		add.setForeground(Color.WHITE);
		add.setMnemonic(KeyEvent.VK_S);
		add.setToolTipText("Alt + S");
		add.addActionListener(this);
		panel.add(add);
		
		
		back = new JButton("BACK");
		back.setBounds(380,400,120,30);
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setMnemonic(KeyEvent.VK_X);
		back.setToolTipText("Alt + X");
		back.addActionListener(this);
		panel.add(back);
		
		
		
		setUndecorated(true);
		setLayout(null);
		setLocation(450,150);
		setSize(700,500);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()== add)
		{
			String qq = "SELECT * FROM room where bed_type = '"+choice.getSelectedItem()+"'";
			String q1 = "SELECT * FROM room where availability = 'Available' And bed_type = '"+choice.getSelectedItem()+"'";
			
			try
			{
				conn c = new conn();
				ResultSet resultset = c.statement.executeQuery(qq);
				table.setModel(DbUtils.resultSetToTableModel(resultset));
				
				if(checkBox.isSelected())
				{
					ResultSet resultset1 = c.statement.executeQuery(q1);
					table.setModel(DbUtils.resultSetToTableModel(resultset1));
				}
			}
			catch(Exception E)
			{
				E.printStackTrace();
			}
		}
		else
		{
			setVisible(false);
		}
	}
	
	
	public static void main(String[] args) 
	{
		new SearchRoom();
	}

}
