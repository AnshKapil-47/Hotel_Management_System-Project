package HotelManagementSystem;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Reception extends JFrame 
{
	Reception() 
    {
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5, 220, 700); 
        panel1.setBackground(new Color(3, 45, 48));
        add(panel1);

 
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(230, 5, 1130, 700); 
        panel.setBackground(new Color(3, 45, 48));
        add(panel);

    
        ImageIcon imageIcon = new ImageIcon("src/icon/cccc.gif");
        Image i1 = imageIcon.getImage().getScaledInstance(700, 650, Image.SCALE_DEFAULT);
        ImageIcon image1 = new ImageIcon(i1);
        JLabel label = new JLabel(image1);
        label.setBounds(200, 20, 700, 650);
        panel.add(label); 


        ImageIcon imageIcon1 = new ImageIcon("src/icon/login.gif");
        Image i11 = imageIcon1.getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT);
        ImageIcon image11 = new ImageIcon(i11);
        JLabel label1 = new JLabel(image11);
        label1.setBounds(20, 495, 180, 150);
        panel1.add(label1); 
       
        JButton btnNCF = new JButton("New Customer Form");
        btnNCF.setBounds(30,20,150,30);
        btnNCF.setBackground(Color.BLACK);
        btnNCF.setForeground(Color.WHITE);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
        	{
        		try
        		{
        			new NewCustomer();
        		}
        		catch(Exception E)
        		{
        			E.printStackTrace();
        		}
        	}
        });
        
        
        JButton btnROOM = new JButton("Room");
        btnROOM.setBounds(30,60,150,30);
        btnROOM.setBackground(Color.BLACK);
        btnROOM.setForeground(Color.WHITE);
        panel1.add(btnROOM);
        btnROOM.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		try
        		{
        			new Room();
        		}
        		catch(Exception E)
        		{
        			E.printStackTrace();
        		}
        	}
        });
        
        
        JButton btnDepartment = new JButton("Department");
        btnDepartment.setBounds(30,100,150,30);
        btnDepartment.setBackground(Color.BLACK);
        btnDepartment.setForeground(Color.WHITE);
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		try
        		{
        			new Department();
        		}
        		catch(Exception E)
        		{
        			E.printStackTrace();
        		}
        	}
        });
        
        
        JButton btnAEI = new JButton("All Employee Info");
        btnAEI.setBounds(30,140,150,30);
        btnAEI.setBackground(Color.BLACK);
        btnAEI.setForeground(Color.WHITE);
        panel1.add(btnAEI);
        btnAEI.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		try
        		{
        			new Employee();
        		}
        		catch(Exception E)
        		{
        			E.printStackTrace();
        		}
        	}
        });	
        
        
        JButton btnCI = new JButton("Customer Info");
        btnCI.setBounds(30,180,150,30);
        btnCI.setBackground(Color.BLACK);
        btnCI.setForeground(Color.WHITE);
        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		try
        		{
        			new CustomerInfo();
        		}
        		catch(Exception E)
        		{
        			E.printStackTrace();
        		}
        	}
        });	
        
        
        JButton btnMI = new JButton("Manager Info");
        btnMI.setBounds(30,220,150,30);
        btnMI.setBackground(Color.BLACK);
        btnMI.setForeground(Color.WHITE);
        panel1.add(btnMI);
        btnMI.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		try
        		{
        			new ManagerInfo();
        		}
        		catch(Exception E)
        		{
        			E.printStackTrace();
        		}
        	}
        });
        
        
        JButton btnCO = new JButton("Check Out");
        btnCO.setBounds(30,260,150,30);
        btnCO.setBackground(Color.BLACK);
        btnCO.setForeground(Color.WHITE);
        panel1.add(btnCO);
        btnCO.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		try
        		{
        			new CheckOut();
        		}
        		catch(Exception E)
        		{
        			E.printStackTrace();
        		}
        	}
        });
        
        
        JButton btnUC = new JButton("Update Check-In Details");
        btnUC.setBounds(30,300,150,30);
        btnUC.setBackground(Color.BLACK);
        btnUC.setForeground(Color.WHITE);
        panel1.add(btnUC);
        btnUC.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		try
        		{
        			new UpdateCheck();
        		}
        		catch(Exception E)
        		{
        			E.printStackTrace();
        		}
        	}
        });
        
        
        JButton btnURS = new JButton("Update Room Status");
        btnURS.setBounds(30,340,150,30);
        btnURS.setBackground(Color.BLACK);
        btnURS.setForeground(Color.WHITE);
        panel1.add(btnURS);
        btnURS.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		try
        		{
        			new UpdateRoom();
        		}
        		catch(Exception E)
        		{
        			E.printStackTrace();
        		}
        	}
        });
        
        
        JButton btnPUS = new JButton("Pick-Up Service");
        btnPUS.setBounds(30,380,150,30);
        btnPUS.setBackground(Color.BLACK);
        btnPUS.setForeground(Color.WHITE);
        panel1.add(btnPUS);
        btnPUS.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		try
        		{
        			new PickUp();
        		}
        		catch(Exception E)
        		{
        			E.printStackTrace();
        		}
        	}
        });	
        
        
        JButton btnSR = new JButton("Search Room");
        btnSR.setBounds(30,420,150,30);
        btnSR.setBackground(Color.BLACK);
        btnSR.setForeground(Color.WHITE);
        panel1.add(btnSR);
        btnSR.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		try
        		{
        			new SearchRoom();
        		}
        		catch(Exception E)
        		{
        			E.printStackTrace();
        		}
        	}
        });	
        
        
        JButton logout = new JButton("Logout");
        logout.setBounds(20,460,95,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.setMnemonic(KeyEvent.VK_L);
        logout.setToolTipText("Alt + L");
        panel1.add(logout);
        logout.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		try
        		{
        			System.exit(500);
        		}
        		catch(Exception E)
        		{
        			E.printStackTrace();
        		}
        	}
        });	
        
        
        JButton back = new JButton("Back");
		back.setBounds(120,460,95,30);
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setMnemonic(KeyEvent.VK_X);
		back.setToolTipText("Alt + X");
		panel1.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					setVisible(false);
					new Dashboard();
				}
				catch(Exception E)
				{
					E.printStackTrace();
				}
			}
		});
		
		  
        setLayout(null);
        setSize(1350, 700); 
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    
    public static void main(String[] args) 
    {
        new Reception();
    }
}
