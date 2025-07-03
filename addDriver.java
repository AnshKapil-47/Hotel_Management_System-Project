package HotelManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class addDriver extends JFrame implements ActionListener
{
	JTextField nameText,ageText,carCText,carNText,locText;
	
	JComboBox comboBox,comboBox1;
	
	JButton add,back;
	
	addDriver()
	{
		JPanel panel = new JPanel();
		panel.setBounds(5,5,875,490);
		panel.setLayout(null);
		panel.setBackground(new Color(3,45,48));
		add(panel);
		
		
		JLabel label = new JLabel("ADD DRIVERS");
		label.setBounds(194,10,160,22);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma",Font.BOLD,22));
		panel.add(label);
		
		
		JLabel name = new JLabel("NAME");
		name.setBounds(64,70,102,22);
		name.setForeground(Color.WHITE);
		name.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(name);
		
		nameText = new JTextField();
		nameText.setBounds(174,70,156,20);
		nameText.setBackground(new Color(16,108,115));
		nameText.setForeground(Color.WHITE);
		nameText.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(nameText);
		
		
		JLabel age = new JLabel("AGE");
		age.setBounds(64,110,102,22);
		age.setForeground(Color.WHITE);
		age.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(age);
		
		ageText = new JTextField();
		ageText.setBounds(174,110,156,20);
		ageText.setBackground(new Color(16,108,115));
		ageText.setForeground(Color.WHITE);
		ageText.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(ageText);
		
		
		JLabel gender = new JLabel("GENDER");
		gender.setBounds(64,150,102,22);
		gender.setForeground(Color.WHITE);
		gender.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(gender);
		
		comboBox = new JComboBox(new String[] { "Male" , "Female"});
		comboBox.setBounds(176,150,154,20);
		comboBox.setBackground(new Color(16,108,115));
		comboBox.setForeground(Color.WHITE);
		comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(comboBox);
		
		
		JLabel carC = new JLabel("CAR COMPANY");
		carC.setBounds(64,190,110,22);
		carC.setForeground(Color.WHITE);
		carC.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(carC);
		
		carCText = new JTextField();
		carCText.setBounds(174,190,156,20);
		carCText.setBackground(new Color(16,108,115));
		carCText.setForeground(Color.WHITE);
		carCText.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(carCText);
		
		
		JLabel carN = new JLabel("CAR NAME");
		carN.setBounds(64,230,102,22);
		carN.setForeground(Color.WHITE);
		carN.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(carN);
		
		carNText = new JTextField();
		carNText.setBounds(174,230,156,20);
		carNText.setBackground(new Color(16,108,115));
		carNText.setForeground(Color.WHITE);
		carNText.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(carNText);
		
		
		JLabel available = new JLabel("AVAILABLE");
		available.setBounds(64,270,102,22);
		available.setForeground(Color.WHITE);
		available.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(available);
		
		comboBox1 = new JComboBox(new String[] { "Yes" , "No"});
		comboBox1.setBounds(176,270,154,20);
		comboBox1.setBackground(new Color(16,108,115));
		comboBox1.setForeground(Color.WHITE);
		comboBox1.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(comboBox1);
		
		
		JLabel loc = new JLabel("LOCATION");
		loc.setBounds(64,310,102,22);
		loc.setForeground(Color.WHITE);
		loc.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(loc);
		
		locText = new JTextField();
		locText.setBounds(174,310,156,20);
		locText.setBackground(new Color(16,108,115));
		locText.setForeground(Color.WHITE);
		locText.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(locText);
		
		
		add = new JButton("ADD");
		add.setBounds(64,380,111,33);
		add.setBackground(Color.BLACK);
		add.setForeground(Color.WHITE);
		add.setMnemonic(KeyEvent.VK_A);
		add.addActionListener(this);
		add.setToolTipText("Alt + A");
		panel.add(add);
		
		
		back = new JButton("BACK");
		back.setBounds(198,380,111,33);
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setMnemonic(KeyEvent.VK_X);
		back.setToolTipText("Alt + X");
		back.addActionListener(this);
		panel.add(back);
		
		
		ImageIcon imageicon = new ImageIcon("src/icon/license.png");
		Image i1 = imageicon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
		ImageIcon image = new ImageIcon(i1);
		JLabel l1 = new JLabel(image);
		l1.setBounds(500,60,300,300);
		panel.add(l1);
		
		addEnterFocus(nameText, ageText);
        addEnterFocus(ageText, comboBox);
        addEnterFocus(comboBox, carCText);
        addEnterFocus(carCText, carNText);
        addEnterFocus(carNText, comboBox1);
        addEnterFocus(comboBox1, locText);
        addEnterFocus(locText, add);
        
		
		setUndecorated(true);
		setLocation(20,140);
		setLayout(null);
		setSize(885,500);
		setVisible(true);
	}
	
	 private void addEnterFocus(JComponent from, JComponent to) 
	 {
	        from.addKeyListener(new KeyAdapter()
	        {
	            public void keyPressed(KeyEvent e) 
	            {
	                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
	                    to.requestFocus();
	                }
	            }
	        });
	    }
	 
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == add)
		{
			String name = nameText.getText();
			String age = ageText.getText();
			String gender = (String) comboBox.getSelectedItem();
			String company = carCText.getText();
			String carname = carNText.getText();
			String available = (String) comboBox1.getSelectedItem();
			String location = locText.getText();
			
			if(name.matches(".*\\d.*"))
			{
				JOptionPane.showMessageDialog(null, "Name cannot contain digits!");
	            return;
			}
			
			
			int ageVal = 0;
	        try {
	            ageVal = Integer.parseInt(age);
	            if (ageVal < 18 || ageVal > 60) {
	                JOptionPane.showMessageDialog(null, "Age must be between 18 and 999!");
	                return;
	            }
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(null, "Age must be a valid number!");
	            return;
	        }
	        
	        
			try
			{
				conn c = new conn();
				
				String q = "INSERT INTO driver VALUES ( '"+name+"' , '"+age+"' , '"+gender+"' , '"+company+"' , '"+carname+"' , '"+available+"' , '"+location+"')";
				c.statement.executeUpdate(q);
				
				JOptionPane.showMessageDialog(null, "Driver Added");
				setVisible(false);
			}catch(Exception E)
			{
				E.getStackTrace();
			}
		}
		else
		{
			setVisible(false);
		}
	}
	
	
	public static void main(String[] args)
	{
		new addDriver();
	}

}
