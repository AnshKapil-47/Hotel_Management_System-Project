package HotelManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class admin extends JFrame implements ActionListener
{ 
	
	JButton add_Employee,add_Room,add_Drivers,logout,back;
	
	admin()
	{
		
		add_Employee = new JButton("ADD EMPLOYEE");
		add_Employee.setBounds(250,150,200,30);
		add_Employee.setBackground(Color.WHITE);
		add_Employee.setForeground(Color.BLACK);
		add_Employee.setFont(new Font("Tahoma",Font.BOLD,15));
		add_Employee.setMnemonic(KeyEvent.VK_E);
		add_Employee.setToolTipText("Alt + E");
		add_Employee.addActionListener(this);
		add(add_Employee);
		
		
		add_Room = new JButton("ADD ROOM");
		add_Room.setBounds(250,300,200,30);
		add_Room.setBackground(Color.WHITE);
		add_Room.setForeground(Color.BLACK);
		add_Room.setFont(new Font("Tahoma",Font.BOLD,15));
		add_Room.setMnemonic(KeyEvent.VK_R);
		add_Room.setToolTipText("Alt + R");
		add_Room.addActionListener(this);
		add(add_Room);
		
		add_Drivers = new JButton("ADD DRIVERS");
		add_Drivers.setBounds(250,450,200,30);
		add_Drivers.setBackground(Color.WHITE);
		add_Drivers.setForeground(Color.BLACK);
		add_Drivers.setFont(new Font("Tahoma",Font.BOLD,15));
		add_Drivers.setMnemonic(KeyEvent.VK_D);
		add_Drivers.setToolTipText("Alt + D");
		add_Drivers.addActionListener(this);
		add(add_Drivers);
		
		
		logout = new JButton("Logout");
		logout.setBounds(10,615,95,30);
		logout.setBackground(Color.BLACK);
		logout.setForeground(Color.WHITE);
		logout.setFont(new Font("Tahoma",Font.BOLD,15));
		logout.setMnemonic(KeyEvent.VK_L);
		logout.setToolTipText("Alt + L");
		logout.addActionListener(this);
		add(logout);
		
		
		back = new JButton("Back");
		back.setBounds(110,615,95,30);
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Tahoma",Font.BOLD,15));
		back.setMnemonic(KeyEvent.VK_X);
		back.setToolTipText("Alt + X");
		back.addActionListener(this);
		add(back);
		
		
		ImageIcon i1 = new ImageIcon("src/icon/employees.png");
		Image l1 = i1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
		ImageIcon imageicon1 = new ImageIcon(l1);
		JLabel label = new JLabel(imageicon1);
		label.setBounds(70,110,120,120);
		add(label);
		
		
		ImageIcon i11 = new ImageIcon("src/icon/room.png");
		Image l11 = i11.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
		ImageIcon imageicon11 = new ImageIcon(l11);
		JLabel label1 = new JLabel(imageicon11);
		label1.setBounds(70,260,120,120);
		add(label1);
		
		
		ImageIcon i111 = new ImageIcon("src/icon/driver.png");
		Image l111 = i111.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
		ImageIcon imageicon111 = new ImageIcon(l111);
		JLabel label11 = new JLabel(imageicon111);
		label11.setBounds(70,410,120,120);
		add(label11);
		
		
		ImageIcon i2 = new ImageIcon("src/icon/login.gif");
		Image l2 = i2.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
		ImageIcon imageicon2 = new ImageIcon(l2);
		JLabel label2 = new JLabel(imageicon2);
		label2.setBounds(900,200,300,300);
		add(label2);
		
		
		add(add_Room);
		getContentPane().setBackground(new Color(3,45,48));
		setLayout(null);
		setSize(1350,700);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == add_Employee)
		{
			new AddEmployee();
		}
		else if (e.getSource() == add_Room)
		{
			new AddRoom();
		}
		else if (e.getSource() == add_Drivers)
		{
			new addDriver();
		}
		else if (e.getSource() == logout)
		{
			System.exit(102);
		}
		else if (e.getSource() == back)
		{
			new Dashboard();
			setVisible(false);
		}
	}
	
	public static void main(String[] args) 
	{
		new admin();
	}

}
