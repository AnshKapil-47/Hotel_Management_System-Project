package HotelManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class AddRoom extends JFrame implements ActionListener
{
	JTextField  t2,t4;
	
	JComboBox t3,t5,t6;
	
	JButton b1,b2;
	
	AddRoom()
	{
		JPanel panel = new JPanel();
		panel.setBounds(5,5,875,490);
		panel.setBackground(new Color(3,45,48));
		panel.setLayout(null);
		add(panel);
		
		JLabel l1 = new JLabel("Add Rooms");
		l1.setBounds(194,10,160,22);
		l1.setFont(new Font("Tahoma",Font.BOLD,22));
		l1.setForeground(Color.WHITE);
		panel.add(l1);
		
		
		JLabel l2 = new JLabel("Room Number");
		l2.setBounds(64,70,152,22);
		l2.setFont(new Font("Tahoma",Font.BOLD,14));
		l2.setForeground(Color.WHITE);
		panel.add(l2);
		
		t2 = new JTextField();
		t2.setBounds(200,70,156,20);
		t2.setFont(new Font("Tahoma",Font.PLAIN,14));
		t2.setForeground(Color.WHITE);
		t2.setBackground(new Color(16,108,115));
		panel.add(t2);
		
		
		JLabel l3 = new JLabel("Availability");
		l3.setBounds(64,110,152,22);
		l3.setFont(new Font("Tahoma",Font.BOLD,14));
		l3.setForeground(Color.WHITE);
		panel.add(l3);
		
		t3 = new JComboBox( new String[] {"Available" , "Occupied"} );
		t3.setBounds(200,110,156,20);
		t3.setFont(new Font("Tahoma",Font.PLAIN,14));
		t3.setForeground(Color.WHITE);
		t3.setBackground(new Color(16,108,115));
		panel.add(t3);
		
		
		JLabel l4 = new JLabel("Price");
		l4.setBounds(64,150,152,22);
		l4.setFont(new Font("Tahoma",Font.BOLD,14));
		l4.setForeground(Color.WHITE);
		panel.add(l4);
		
		t4 = new JTextField();
		t4.setBounds(200,150,156,20);
		t4.setFont(new Font("Tahoma",Font.PLAIN,14));
		t4.setForeground(Color.WHITE);
		t4.setBackground(new Color(16,108,115));
		panel.add(t4);
		
		
		JLabel l5 = new JLabel("Cleaning Status");
		l5.setBounds(64,190,152,22);
		l5.setFont(new Font("Tahoma",Font.BOLD,14));
		l5.setForeground(Color.WHITE);
		panel.add(l5);
		
		t5 = new JComboBox( new String[] {"Cleaned" , "Dirty"} );
		t5.setBounds(200,190,156,20);
		t5.setFont(new Font("Tahoma",Font.PLAIN,14));
		t5.setForeground(Color.WHITE);
		t5.setBackground(new Color(16,108,115));
		panel.add(t5);
		
		
		JLabel l6 = new JLabel("Bed Type");
		l6.setBounds(64,230,152,22);
		l6.setFont(new Font("Tahoma",Font.BOLD,14));
		l6.setForeground(Color.WHITE);
		panel.add(l6);
		
		t6 = new JComboBox( new String[] {"Single Bed" , "Double Bed"} );
		t6.setBounds(200,230,156,20);
		t6.setFont(new Font("Tahoma",Font.PLAIN,14));
		t6.setForeground(Color.WHITE);
		t6.setBackground(new Color(16,108,115));
		panel.add(t6);
		
		
		b1 = new JButton("Add");
		b1.setBounds(64,321,111,33);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		b1.setMnemonic(KeyEvent.VK_A);
		b1.setToolTipText("Alt + A");
		panel.add(b1);
		
		
		b2 = new JButton("Back");
		b2.setBounds(198,321,111,33);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		b2.setMnemonic(KeyEvent.VK_X);
		b2.setToolTipText("Alt + X");
		panel.add(b2);
		
		
		ImageIcon imageicon = new ImageIcon("src/icon/roomser.png");
		Image i1 = imageicon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
		ImageIcon image1 = new ImageIcon(i1);
		JLabel label = new JLabel(image1);
		label.setBounds(500,60,300,300);
		panel.add(label);
		
		
		setEnterFocus(t2, t3);
        setEnterFocus(t3, t4);
        setEnterFocus(t4, t5);
        setEnterFocus(t5, t6);
        
        
		setUndecorated(true);
		setLocation(20,140);
		setLayout(null);
		setSize(885,500);
		setVisible(true);
	}
	
	
	private void setEnterFocus(JComponent from, JComponent to) 
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
		if(e.getSource() == b1)
		{
			try
			{
				conn c = new conn();
				
				String room = t2.getText();
				String ava = (String) t3.getSelectedItem();
				String status = (String) t5.getSelectedItem();
				String price = t4.getText();
				String type = (String) t6.getSelectedItem();
				
				String q = "INSERT INTO room VALUES ( '"+room+"' , '"+ava+"' , '"+status+"' , '"+price+"' , '"+type+"')";
				c.statement.executeUpdate(q);
				
				JOptionPane.showMessageDialog(null, "Successfull Added");
				this.setVisible(false);
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
		new AddRoom();
	}

}
