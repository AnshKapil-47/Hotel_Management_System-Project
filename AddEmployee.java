package HotelManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class AddEmployee extends JFrame implements ActionListener
{
	JTextField nameText,ageText,salaryText,phoneText,aadharText,emailText;
	
	JRadioButton radioButtonM,radioButtonF;

	JComboBox comboBox;
	
	JButton add,back;
	
	AddEmployee()
	{
		JPanel panel = new JPanel();
		panel.setBounds(5,5,875,490);
		panel.setLayout(null);
		panel.setBackground(new Color(3,45,48));
		add(panel);
		
		
		JLabel name = new JLabel("NAME");
		name.setBounds(60,30,150,27);
		name.setFont(new Font("serif",Font.BOLD,17));
		name.setForeground(Color.WHITE);
		panel.add(name);
		
		nameText = new JTextField();
		nameText.setBounds(200,30,150,27);
		nameText.setBackground(new Color(16,108,115));
		nameText.setFont(new Font("Tahoma",Font.BOLD,14));
		nameText.setForeground(Color.WHITE);
		panel.add(nameText);
		
		
		JLabel age = new JLabel("AGE");
		age.setBounds(60,80,150,27);
		age.setFont(new Font("serif",Font.BOLD,17));
		age.setForeground(Color.WHITE);
		panel.add(age);
		
		ageText = new JTextField();
		ageText.setBounds(200,80,150,27);
		ageText.setBackground(new Color(16,108,115));
		ageText.setFont(new Font("Tahoma",Font.BOLD,14));
		ageText.setForeground(Color.WHITE);
		panel.add(ageText);
		
		
		JLabel gender = new JLabel("GENDER");
		gender.setBounds(60,130,150,27);
		gender.setFont(new Font("serif",Font.BOLD,17));
		gender.setForeground(Color.WHITE);
		panel.add(gender);
		
		radioButtonM = new JRadioButton("MALE");
		radioButtonM.setBounds(200,130,70,27);
		radioButtonM.setBackground(new Color(3,45,48));
		radioButtonM.setFont(new Font("Tahoma",Font.BOLD,14));
		radioButtonM.setForeground(Color.WHITE);
		panel.add(radioButtonM);
		
		radioButtonF = new JRadioButton("FEMALE");
		radioButtonF.setBounds(280,130,100,27);
		radioButtonF.setBackground(new Color(3,45,48));
		radioButtonF.setFont(new Font("Tahoma",Font.BOLD,14));
		radioButtonF.setForeground(Color.WHITE);
		panel.add(radioButtonF);
		
		
		ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radioButtonM);
        genderGroup.add(radioButtonF);
        
        
		JLabel job = new JLabel("JOB");
		job.setBounds(60,180,150,27);
		job.setFont(new Font("serif",Font.BOLD,17));
		job.setForeground(Color.WHITE);
		panel.add(job);
		
		comboBox = new JComboBox(new String[] {"Front Desk" , "Housekeeping" , "Kitchen Staff" , "Room Service" , "Manager","Accountant" , "Chef" });
		comboBox.setBackground(new Color(16,108,115));
		comboBox.setBounds(200,180,150,30);
		comboBox.setFont((new Font("Tahoma",Font.BOLD,14)));
		comboBox.setForeground(Color.WHITE);
		panel.add(comboBox);
		
		
		JLabel salary = new JLabel("SALARY");
		salary.setBounds(60,230,150,27);
		salary.setFont(new Font("serif",Font.BOLD,17));
		salary.setForeground(Color.WHITE);
		panel.add(salary);
		
		salaryText = new JTextField();
		salaryText.setBounds(200,230,150,27);
		salaryText.setBackground(new Color(16,108,115));
		salaryText.setFont(new Font("Tahoma",Font.BOLD,14));
		salaryText.setForeground(Color.WHITE);
		panel.add(salaryText);
		
		
		JLabel phone = new JLabel("PHONE");
		phone.setBounds(60,280,150,27);
		phone.setFont(new Font("serif",Font.BOLD,17));
		phone.setForeground(Color.WHITE);
		panel.add(phone);
		
		phoneText = new JTextField();
		phoneText.setBounds(200,280,150,27);
		phoneText.setBackground(new Color(16,108,115));
		phoneText.setFont(new Font("Tahoma",Font.BOLD,14));
		phoneText.setForeground(Color.WHITE);
		panel.add(phoneText);
		
		
		JLabel aadhar = new JLabel("AADHAR");
		aadhar.setBounds(60,330,150,27);
		aadhar.setFont(new Font("serif",Font.BOLD,17));
		aadhar.setForeground(Color.WHITE);
		panel.add(aadhar);
		
		aadharText = new JTextField();
		aadharText.setBounds(200,330,150,27);
		aadharText.setBackground(new Color(16,108,115));
		aadharText.setFont(new Font("Tahoma",Font.BOLD,14));
		aadharText.setForeground(Color.WHITE);
		panel.add(aadharText);
		
		
		JLabel email = new JLabel("EMAIL");
		email.setBounds(60,380,150,27);
		email.setFont(new Font("serif",Font.BOLD,17));
		email.setForeground(Color.WHITE);
		panel.add(email);
		
		emailText = new JTextField();
		emailText.setBounds(200,380,150,27);
		emailText.setBackground(new Color(16,108,115));
		emailText.setFont(new Font("Tahoma",Font.BOLD,14));
		emailText.setForeground(Color.WHITE);
		panel.add(emailText);
		
		
		JLabel AED = new JLabel("ADD EMPLOYEE DETAILS");
		AED.setBounds(450,24,445,35);
		AED.setFont(new Font("Tahoma",Font.BOLD,31));
		AED.setForeground(Color.WHITE);
		panel.add(AED);
		
		
		add = new JButton("ADD");
		add.setBounds(80,420,100,30);
		add.setBackground(Color.BLACK);
		add.setForeground(Color.WHITE);
		add.addActionListener(this);
		add.setMnemonic(KeyEvent.VK_A);
		add.setToolTipText("Alt + A");
		panel.add(add);
		
		
		back = new JButton("BACK");
		back.setBounds(200,420,100,30);
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		back.setMnemonic(KeyEvent.VK_X);
		back.setToolTipText("Alt + X");
		panel.add(back);
		
		
		ImageIcon imageicon = new ImageIcon("src/icon/addemp.png");
		Image i1 = imageicon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
		ImageIcon image1 = new ImageIcon(i1);
		JLabel label = new JLabel(image1);
		label.setBounds(500,100,300,300);
		panel.add(label);
		
		setEnterFocus(nameText, ageText);
		setEnterFocus(ageText, radioButtonM);

		// This replaces old radioButtonM logic
		setRadioGroupEnterFocus(radioButtonM, radioButtonF, comboBox);

		setEnterFocus(comboBox, salaryText);
		setEnterFocus(salaryText, phoneText);
		setEnterFocus(phoneText, aadharText);
		setEnterFocus(aadharText, emailText);

			
		
		setUndecorated(true);
		setLocation(20,140);
		setLayout(null);
		setSize(885,500);
		setVisible(true);
	}
	
	private void setEnterFocus(JComponent current, JComponent next) {
	    current.addKeyListener(new KeyAdapter() {
	        public void keyPressed(KeyEvent e) {
	            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
	                next.requestFocus();
	            }
	        }
	    });
	}
	
	
	private void setRadioGroupEnterFocus(JRadioButton rb1, JRadioButton rb2, JComponent next) {
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
		if(e.getSource()== add)
		{
			String name = nameText.getText();
			String age = ageText.getText();
			String salary = salaryText.getText();
			String phone = phoneText.getText();
			String email = emailText.getText();
			String aadhar = aadharText.getText();
			String job = (String) comboBox.getSelectedItem();
			String gender = null;
			if(radioButtonM.isSelected())
			{
				gender = "Male";
			}
			else if(radioButtonF.isSelected())
			{
				gender = "Female";
			}
			
			//error in name
			if (name.matches(".*\\d.*")) {
	            JOptionPane.showMessageDialog(null, "Name cannot contain digits!");
	            return; // Stop further execution
	        }
			
			
			//error in phone number
			if (!phone.matches("\\d{10}")) {
			    JOptionPane.showMessageDialog(null, "Phone number must be exactly 10 digits and contain only numbers!");
			    return;
			}
			
			
			//error in aadhar
			if (!aadhar.matches("\\d+")) {
			    JOptionPane.showMessageDialog(null, "Aadhar number must contain only digits!");
			    return;
			}
			
			
			//error in age
			int ageVal = 0;
	        try {
	            ageVal = Integer.parseInt(age);
	            if (ageVal < 18 || ageVal > 70) {
	                JOptionPane.showMessageDialog(null, "Age must be between 18 and 999!");
	                return;
	            }
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(null, "Age must be a valid number!");
	            return;
	        }
	        
	        //email error
	        if (!email.endsWith("@gmail.com")) {
	            JOptionPane.showMessageDialog(null, "Email must end with @gmail.com!");
	            return;
	        }
	        
	        
			try
			{
				conn c = new conn();
				
				String q = "INSERT INTO employee VALUES ( '"+name+"' , '"+age+"' , '"+gender+"' , '"+job+"' , '"+salary+"' , '"+phone+"' , '"+email+"' , '"+aadhar+"')";
				c.statement.executeUpdate(q);
				
				JOptionPane.showMessageDialog(null, "Employee Added");
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
		new AddEmployee();
	}

}
