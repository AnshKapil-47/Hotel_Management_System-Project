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

public class Dashboard extends JFrame implements ActionListener
{
	JButton add,rec;
	
	Dashboard()
	{
		super("HOTEL MANAGEMENT SYSTEM");
		
		rec = new JButton("RECEPTION");
		rec.setBounds(425,510,140,30);
		rec.setFont(new Font("Tahoma",Font.BOLD,15));
		rec.setBackground(new Color(255,98,0));
		rec.setForeground(Color.WHITE);
		rec.setMnemonic(KeyEvent.VK_R);
		rec.setToolTipText("Alt + R");
		rec.addActionListener(this);
		add(rec);
		
		add = new JButton("ADMIN");
		add.setBounds(885,510,140,30);
		add.setFont(new Font("Tahoma",Font.BOLD,15));
		add.setBackground(new Color(255,98,0));
		add.setForeground(Color.WHITE);
		add.setMnemonic(KeyEvent.VK_A);
		add.setToolTipText("Alt + A");
		add.addActionListener(this);
		add(add);
		
		ImageIcon i11 = new ImageIcon("src/icon/boss.png");
		Image i2 = i11.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
		ImageIcon imageIcon11 = new ImageIcon(i2);
		JLabel label1 = new JLabel(imageIcon11);
		label1.setBounds(850,300,200,195);
		add(label1);
		
		ImageIcon i111 = new ImageIcon("src/icon/Reception.png");
		Image i22 = i111.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
		ImageIcon imageIcon111 = new ImageIcon(i22);
		JLabel label11 = new JLabel(imageIcon111);
		label11.setBounds(400,300,200,195);
		add(label11);
		
		ImageIcon imageIcon = new ImageIcon("src/icon/Dashboard.gif");
		Image i1 = imageIcon.getImage().getScaledInstance(1350,900,Image.SCALE_DEFAULT);
		ImageIcon imageIcon1 = new ImageIcon(i1);
		JLabel label = new JLabel(imageIcon1);
		label.setBounds(0,0,1350,900);
		add(label);
		
		
		setLayout(null);
		setSize(1350,700);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==rec)
		{
			new Reception();
			setVisible(false);
		}
		else
		{
			new login2();
			setVisible(false);
		}
	}
	
	public static void main(String[] args)
	{
		new Dashboard();
	}
}
