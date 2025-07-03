package HotelManagementSystem;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.*;

public class NewCustomer extends JFrame implements ActionListener
{
	JComboBox comboBox;
	
	JTextField numberText,nameText,countryText,depositeText;
	
	JRadioButton radioButtonM,radioButtonF;
	
	Choice c1;
	
	JLabel date;
	
	JButton add,back;
	
	NewCustomer()
	{
		
		JPanel panel = new JPanel();
		panel.setBounds(5,5,840,540);
		panel.setBackground(new Color(3,45,48));
		panel.setLayout(null);
		add(panel);
		
		
		ImageIcon imageicon = new ImageIcon("src/icon/customer.png");
		Image i1 = imageicon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
		ImageIcon image = new ImageIcon(i1);
		JLabel l1 = new JLabel(image);
		l1.setBounds(550,150,200,200);
		panel.add(l1);
		
		
		JLabel label = new JLabel("NEW CUSTOMER FORM");
		label.setBounds(118,11,260,53);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma",Font.BOLD,20));
		panel.add(label);
		
		
		JLabel label1 = new JLabel("ID :");
		label1.setBounds(35,76,200,14);
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(label1);
		
		comboBox = new JComboBox(new String[] {"Passport" , "Aadhar" , "Voter Id" , "Driving License"});
		comboBox.setBounds(271,73,150,20);
		comboBox.setBackground(new Color(3,45,48));
		comboBox.setForeground(Color.WHITE);
		comboBox.setFont(new Font("Tahoma",Font.PLAIN,14));
		panel.add(comboBox);
		
		
		JLabel labelnumber = new JLabel("Number :");
		labelnumber.setBounds(35,111,200,14);
		labelnumber.setForeground(Color.WHITE);
		labelnumber.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(labelnumber);
		
		numberText = new JTextField();
		numberText.setBounds(271,111,150,20);
		numberText.setBackground(new Color(16,108,115));
		numberText.setFont(new Font("Tahoma",Font.BOLD,14));
		numberText.setForeground(Color.WHITE);
		panel.add(numberText);
		
		
		JLabel labelname = new JLabel("Name :");
		labelname.setBounds(35,151,200,14);
		labelname.setForeground(Color.WHITE);
		labelname.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(labelname);
		
		nameText = new JTextField();
		nameText.setBounds(271,151,150,20);
		nameText.setBackground(new Color(16,108,115));
		nameText.setFont(new Font("Tahoma",Font.BOLD,14));
		nameText.setForeground(Color.WHITE);
		panel.add(nameText);
		
		
		JLabel labelgender = new JLabel("Gender :");
		labelgender.setBounds(35,191,200,14);
		labelgender.setForeground(Color.WHITE);
		labelgender.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(labelgender);
		
		radioButtonM = new JRadioButton("MALE");
		radioButtonM.setBounds(271,191,80,12);
		radioButtonM.setBackground(new Color(3,45,48));
		radioButtonM.setFont(new Font("Tahoma",Font.BOLD,14));
		radioButtonM.setForeground(Color.WHITE);
		panel.add(radioButtonM);
		
		radioButtonF = new JRadioButton("FEMALE");
		radioButtonF.setBounds(350,191,90,12);
		radioButtonF.setBackground(new Color(3,45,48));
		radioButtonF.setFont(new Font("Tahoma",Font.BOLD,14));
		radioButtonF.setForeground(Color.WHITE);
		panel.add(radioButtonF);
		
		
		ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radioButtonM);
        genderGroup.add(radioButtonF);
        
        
		JLabel labelcountry = new JLabel("Country :");
		labelcountry.setBounds(35,231,200,14);
		labelcountry.setForeground(Color.WHITE);
		labelcountry.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(labelcountry);
		
		countryText = new JTextField();
		countryText.setBounds(271,231,150,20);
		countryText.setBackground(new Color(16,108,115));
		countryText.setFont(new Font("Tahoma",Font.BOLD,14));
		countryText.setForeground(Color.WHITE);
		panel.add(countryText);
		
		
		JLabel labelroom = new JLabel("Allocated Room :");
		labelroom.setBounds(35,274,200,14);
		labelroom.setForeground(Color.WHITE);
		labelroom.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(labelroom);
		
		c1 = new Choice();
		try
		{
			conn c = new conn();
			
			String q = "SELECT * FROM room";
			ResultSet resultSet = c.statement.executeQuery(q);
			
			while(resultSet.next())
			{
				c1.add(resultSet.getString("roomnumber"));
			}
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		c1.setBounds(271,274,150,20);
		c1.setBackground(new Color(3,45,48));
		c1.setFont(new Font("Tahoma",Font.BOLD,14));
		c1.setForeground(Color.WHITE);
		panel.add(c1);
		
		
		JLabel labelcis = new JLabel("Checked-In :");
		labelcis.setBounds(35,314,200,14);
		labelcis.setForeground(Color.WHITE);
		labelcis.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(labelcis);
		
		Date date1 = new Date();
		
		date = new JLabel(""+date1);
		date.setBounds(271,314,200,14);
		date.setForeground(Color.WHITE);
		date.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(date);
		
		
		JLabel labeldeposite = new JLabel("Deposite :");
		labeldeposite.setBounds(35,359,200,18);
		labeldeposite.setForeground(Color.WHITE);
		labeldeposite.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(labeldeposite);
		
		depositeText = new JTextField();
		depositeText.setBounds(271,359,150,20);
		depositeText.setBackground(new Color(16,108,115));
		depositeText.setFont(new Font("Tahoma",Font.BOLD,14));
		depositeText.setForeground(Color.WHITE);
		panel.add(depositeText);
		
		
		add = new JButton("ADD");
		add.setBounds(100,430,120,30);
		add.setForeground(Color.WHITE);
		add.setBackground(Color.BLACK);
		add.setMnemonic(KeyEvent.VK_A);
		add.setToolTipText("Alt + A");
		add.addActionListener(this);
		panel.add(add);
		
		
		back = new JButton("BACK");
		back.setBounds(260,430,120,30);
		back.setForeground(Color.WHITE);
		back.setBackground(Color.BLACK);
		back.setMnemonic(KeyEvent.VK_X);
		back.setToolTipText("Alt + X");
		back.addActionListener(this);
		panel.add(back);
		
		setEnterFocus(comboBox,numberText);
		setEnterFocus(numberText,nameText);
		setEnterFocus(nameText,radioButtonM);
		
		setRadioEnterFocus(radioButtonM,radioButtonF,countryText);
		
		setEnterFocus(countryText,c1);
		setEnterFocus(c1,depositeText);
		
		
		setUndecorated(true);
		setLayout(null);
		setLocation(450,100);
		setSize(850,550);
		setVisible(true);
	}
	
	
	private void setEnterFocus(Component from, Component to) {
		from.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					to.requestFocus();
				}
			}
		});
	}
	
	
	private void setRadioEnterFocus(JRadioButton rb1, JRadioButton rb2, JComponent next)
	{
		KeyAdapter adapter = new KeyAdapter() {
	        public void keyPressed(KeyEvent e) {
	            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
	                if (rb1.isSelected() || rb2.isSelected()) {
	                    next.requestFocus();
	                }
	            }
	        }
	    };
	    rb1.addKeyListener(adapter);
	    rb2.addKeyListener(adapter);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == add)
		{
			conn c = new conn();
			
			String radioBTn = null;
			if(radioButtonM.isSelected())
			{
				radioBTn = "Male";
			}
			else if(radioButtonF.isSelected())
			{
				radioBTn = "Female";
			}
			
			String s1 = (String) comboBox.getSelectedItem();
			String s2 = numberText.getText();
			String s3 = nameText.getText();
			String s4 = radioBTn;
			String s5 = countryText.getText();
			String s6 = c1.getSelectedItem();
			String s7 = date.getText();
			String s8 = depositeText.getText();
		
			
			if (s3.matches(".*\\d.*")) {
	            JOptionPane.showMessageDialog(null, "Name cannot contain digits!");
	            return; // Stop further execution
	        }
			
			
			if (!s2.matches("\\d+")) {
			    JOptionPane.showMessageDialog(null, "Number must contain only digits!");
			    return;
			}
			
			
			if (!s8.matches("\\d+")) {
			    JOptionPane.showMessageDialog(null, "Deposite contain only digits!");
			    return;
			}
			
			
			try
			{		
				String q = "INSERT INTO customer VALUES ( '"+s1+"' , '"+s2+"' , '"+s3+"' , '"+s4+"' , '"+s5+"' , '"+s6+"' , '"+s7+"' , '"+s8+"')";
				String q1 = "UPDATE room set availability = 'Occupied' where roomnumber = "+s6;
				c.statement.executeUpdate(q);
				c.statement.executeUpdate(q1);
				
				
				JOptionPane.showMessageDialog(null, "Added Successfully");
				setVisible(false);
			}catch(Exception E)
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
		new NewCustomer();
	}

}
