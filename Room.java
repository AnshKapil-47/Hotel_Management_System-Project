package HotelManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.*;

import net.proteanit.sql.DbUtils;

public class Room extends JFrame
{
	JTable table;
	
	JButton back;
	
	Room()
	{
		JPanel panel = new JPanel();
		panel.setBounds(5,5,890,590);
		panel.setBackground(new Color(3,45,48));
		panel.setLayout(null);
		add(panel);
		
		
		table = new JTable();
		table.setBounds(10,40,500,400);
		table.setBackground(new Color(3,45,48));
		table.setForeground(Color.WHITE);
		panel.add(table);
		
		
		try
		{
			conn c = new conn();
			
			String roomInfo = "SELECT * FROM room";
			ResultSet resultSet = c.statement.executeQuery(roomInfo);
			table.setModel(DbUtils.resultSetToTableModel(resultSet));
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
		back = new JButton("BACK");
		back.setBounds(200,500,120,30);
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
		
		JLabel room = new JLabel("Rom No.");
		room.setBounds(12,15,80,19);
		room.setForeground(Color.WHITE);
		room.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(room);
		
		
		JLabel availability = new JLabel("Availability");
		availability.setBounds(119,15,80,19);
		availability.setForeground(Color.WHITE);
		availability.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(availability);
		
		
		JLabel clean = new JLabel("Clean Status");
		clean.setBounds(216,15,150,19);
		clean.setForeground(Color.WHITE);
		clean.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(clean);
		
		
		JLabel price = new JLabel("Price");
		price.setBounds(330,15,80,19);
		price.setForeground(Color.WHITE);
		price.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(price);
		
		
		JLabel bed = new JLabel("Bed Type");
		bed.setBounds(410,15,80,19);
		bed.setForeground(Color.WHITE);
		bed.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(bed);
		
		ImageIcon imageicon = new ImageIcon("src/icon/roomm.png");
		Image i1 = imageicon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
		ImageIcon image = new ImageIcon(i1);
		JLabel l1 = new JLabel(image);
		l1.setBounds(600,200,200,200);
		panel.add(l1);
		
		
		setUndecorated(true);
		setLayout(null);
		setSize(900,600);
		setLocation(400,90);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Room();
	}

}
