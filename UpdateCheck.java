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

import javax.swing.*;

import net.proteanit.sql.DbUtils;

public class UpdateCheck extends JFrame
{
	UpdateCheck()
	{
		JPanel panel = new JPanel();
		panel.setBounds(5,5,940,490);
		panel.setLayout(null);
		panel.setBackground(new Color(3,45,48));
		add(panel);
		
		
		ImageIcon imageicon = new ImageIcon("src/icon/updated.png");
		Image i1 = imageicon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
		ImageIcon i11 = new ImageIcon(i1);
		JLabel label = new JLabel(i11);
		label.setBounds(500,60,300,300);
		panel.add(label);
		
		
		JLabel l1 = new JLabel("Check-In Details");
		l1.setBounds(124,11,222,25);
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Tahoma",Font.BOLD,20));
		panel.add(l1);
		
		
		JLabel id = new JLabel("ID :");
		id.setBounds(25,88,46,14);
		id.setForeground(Color.WHITE);
		id.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(id);
		
		
		Choice c = new Choice();
		c.setBounds(248,88,140,25);
		panel.add(c);
		
		try
		{
			conn C = new conn();
			String q = "SELECT * FROM customer";
			ResultSet resultset = C.statement.executeQuery(q);
			
			while(resultset.next())
			{
				c.add(resultset.getString("number"));
			}
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		
		JLabel l2 = new JLabel("Room Number :");
		l2.setBounds(25,129,120,14);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(l2);
		
		JTextField t2 = new JTextField();
		t2.setBounds(248,129,140,20);
		panel.add(t2);
		
		
		JLabel l3 = new JLabel("Name :");
		l3.setBounds(25,174,97,14);
		l3.setForeground(Color.WHITE);
		l3.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(l3);
		
		JTextField t3 = new JTextField();
		t3.setBounds(248,174,140,20);
		panel.add(t3);
		
		
		JLabel l4 = new JLabel("Checked-In :");
		l4.setBounds(25,216,97,14);
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(l4);
		
		JTextField t4 = new JTextField();
		t4.setBounds(248,216,140,20);
		panel.add(t4);
		
		
		JLabel l5 = new JLabel("Amount Paid (Rs) :");
		l5.setBounds(25,261,180,14);
		l5.setForeground(Color.WHITE);
		l5.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(l5);
		
		JTextField t5 = new JTextField();
		t5.setBounds(248,261,140,20);
		panel.add(t5);
		
		
		JLabel l6 = new JLabel("Pending Amount (Rs) :");
		l6.setBounds(25,302,180,17);
		l6.setForeground(Color.WHITE);
		l6.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(l6);
		
		JTextField t6 = new JTextField();
		t6.setBounds(248,302,140,20);
		panel.add(t6);
		
		
		JButton update = new JButton("UPDATE");
		update.setBounds(56,378,89,23);
		update.setBackground(Color.BLACK);
		update.setForeground(Color.WHITE);
		update.setMnemonic(KeyEvent.VK_U);
		update.setToolTipText("Alt + U");
		panel.add(update);
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					conn C = new conn();
					String q = c.getSelectedItem();
					String room = t2.getText();
					String name = t3.getText();
					String check = t4.getText();
					String amount = t5.getText();
					
					
					if (!amount.matches("\\d")) 
					{
					    JOptionPane.showMessageDialog(null, "Phone number must be only numbers!");
					    return;
					}
					
					
					C.statement.executeUpdate("UPDATE customer SET room = '" + room + 
				               "', name = '" + name + 
				               "', checkintime = '" + check + 
				               "', deposit = '" + amount + 
				               "' WHERE numer = '" + q + "'");
					
					JOptionPane.showMessageDialog(null, "Updated Successfully");
					setVisible(false);
				}
				catch(Exception E)
				{
					E.printStackTrace();
				}
			}
		});
		
		
		JButton back = new JButton("BACK");
		back.setBounds(168,378,89,23);
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setMnemonic(KeyEvent.VK_X);
		back.setToolTipText("Alt + X");
		panel.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
			}
		});
		
		
		JButton check = new JButton("CHECK");
		check.setBounds(281,378,89,23);
		check.setBackground(Color.BLACK);
		check.setForeground(Color.WHITE);
		check.setMnemonic(KeyEvent.VK_C);
		check.setToolTipText("Alt + C");
		panel.add(check);
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String id = c.getSelectedItem();
				String q = "SELECT * FROM customer WHERE number = '"+id+"'";
				
				try
				{
					conn c = new conn();
					ResultSet resultset = c.statement.executeQuery(q);
					
					while(resultset.next())
					{
						t2.setText(resultset.getString("room"));
						t3.setText(resultset.getString("name"));
						t4.setText(resultset.getString("checkintime"));
						t5.setText(resultset.getString("deposit"));
					}
					
					ResultSet resultset1 = c.statement.executeQuery("SELECT * FROM room WHERE roomnumber = '"+t2.getText()+"'");
					
					while(resultset1.next())
					{
						String price = resultset1.getString("price");
						int amountpaid = Integer.parseInt(price) - Integer.parseInt(t5.getText());
						t6.setText(""+amountpaid);
					}
				}
				catch(Exception E)
				{
					E.printStackTrace();
				}
			}
		});
		
		setEnterFocus(c,t2);
		
		setUndecorated(true);
		setLocation(350,150);
		setLayout(null);
		setSize(950,500);
		setVisible(true);
	}
	
	private void setEnterFocus(Component from , Component to)
	{
		from.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e)
			{
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					to.requestFocus();
				}
			}
		});
	}
  
	public static void main(String[] args) 
	{
		new UpdateCheck();
	}

}
