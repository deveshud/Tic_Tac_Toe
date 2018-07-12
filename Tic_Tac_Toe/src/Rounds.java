import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Rounds extends Panel implements ActionListener{
JLabel l,l1,l2,l3,l4,l5;
JButton jb1,jb2;
JPanel jp,jp1;;
	public Rounds() {
		Game.thrd=false;
		MyRunnable.i=1;
		timer.f.setVisible(false);
		timer.f.dispose();
		
		Base.f.setSize(550,150);
	//l=new JLabel("Akshay Dixit");
	//l3=new JLabel("Reg Number=RA1511003030101");
	l1=new JLabel("Devesh Bhardwaj");
	l4=new JLabel("Reg Number=RA1511003030107");
	//l2=new JLabel("Shrey Kumar Soni");
	//l5=new JLabel("Reg Number=RA1511003030117");
	
	jb1=new JButton("<---- Back");
	jb2=new JButton("Exit");
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	jp=new JPanel();
	jp1=new JPanel();
	jp.setLayout(new GridLayout(5,1));
	jp1.setLayout(new GridLayout(1,2));
	//jp.add(l);
	//jp.add(l3);
	jp.add(l1);
	jp.add(l4);
	//jp.add(l2);
	//jp.add(l5);
	jp1.add(jb1);
	jp1.add(jb2);
	this.add(jp);
	this.add(jp1);


	Base.f.add(this);// TODO Auto-generated constructor stub
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		if(b==jb1)
		{
	Base.f.setVisible(false);
Base f=new Base();

			// TODO Auto-generated method stub
		}
		else
			System.exit(0);
		
	}

}
