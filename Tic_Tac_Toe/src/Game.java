import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

import javax.swing.*;
public class Game extends JPanel implements ActionListener
{

	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,b1,b2,b3;
	//Timer b4;
	int i=1,p,q,r,s,t,u,v,w,z,count=0;
	static boolean thrd=true;

	JLabel label;
	//int arr[]=new int[10];
	//static String arr="";

	public Game()
	{
		
		timer t=new timer();
	    // Thread thread=new Thread(new MyRunnable());
			//thread.start();	
		jb1=new JButton();
		//jb1.setIcon(null);
		jb2=new JButton();
		jb3=new JButton();
		jb4=new JButton();
		jb5=new JButton();
		jb6=new JButton();
		jb7=new JButton();
		jb8=new JButton();
		jb9=new JButton();
			jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		jb7.addActionListener(this);
		jb8.addActionListener(this);
		jb9.addActionListener(this);
    /*	ImageIcon icon=new ImageIcon("src/x.png");
        Image img = icon.getImage() ;  
   	    Image newimg = img.getScaledInstance( 125,125,  java.awt.Image.SCALE_SMOOTH ) ;  
        icon = new ImageIcon( newimg );
        jb1.setIcon(icon);
        jb2.setIcon(icon);
        jb3.setIcon(icon);
        jb4.setIcon(icon);
        jb5.setIcon(icon);
        jb6.setIcon(icon);
        jb7.setIcon(icon);
        jb8.setIcon(icon);
        jb9.setIcon(icon); */
	b1=new JButton("Quit");
	b2=new JButton("New Game");
	//b4=new Timer();
	b3=new JButton("Credits.....");
label =new JLabel("version 0.0.0.1");
		JLabel l=new JLabel();
		URL url;
		url=Game.class.getResource("/background.png");
		ImageIcon x=new ImageIcon(url);
		l.setIcon(x);
		this.setLayout(null);
		l.setBounds(60,30,600,600);
		jb1.setBounds(30,60,120,120);
		jb2.setBounds(220,60,120,120);
		jb3.setBounds(400,60,120,120);
		jb4.setBounds(30,220,120,120);
		jb5.setBounds(220,220,120,120);
		jb6.setBounds(400,220,120,120);
		jb7.setBounds(30,400,120,120);
		jb8.setBounds(220,400,120,120);
		jb9.setBounds(400,400,120,120);
		b1.setForeground(Color.BLACK);
		b2.setForeground(Color.BLACK);
		b1.setBounds(100,650,100,40);
		b2.setBounds(400,650,100,40);
		b3.setBounds(250,650,100,40);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	//	b3.setForeground(Color.BLACK);
    label.setBounds(550,650,100,80);
	label.setBackground(Color.WHITE);
		l.add(jb1);
		l.add(jb2);
		l.add(jb3);
		l.add(jb4);
		l.add(jb5);
		l.add(jb6);
		l.add(jb7);
		l.add(jb8);
		l.add(jb9);
	
		this.add(l);
	this.add(b1);
	this.add(b2);
	this.add(b3);
	
	this.add(label);
//	 timer();
	this.setBackground(Color.gray);	
	  jb1.setFocusPainted(false);
	Base.f.add(this);
	//Base.f.setTitle("Lets Play !");
	//Base.f.setVisible(true);
	}
	public static void main(String []ar)
	{
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton j=(JButton)e.getSource();
		URL url1,url2;
		url1=Game.class.getResource("/x.png");
		
		url2=Game.class.getResource("/o.png");

		ImageIcon x=new ImageIcon(url1);
        Image img = x.getImage() ;  
   	    Image newimg = img.getScaledInstance( 125,125,  java.awt.Image.SCALE_SMOOTH ) ;  
        x = new ImageIcon( newimg );
        ImageIcon o=new ImageIcon(url2);
        Image imgo = o.getImage() ;  
   	    Image newimgo = imgo.getScaledInstance( 125,125,  java.awt.Image.SCALE_SMOOTH ) ;  
        o = new ImageIcon( newimgo );
  
   //jb1.setFocusPainted(false);
		if(j==b1)
		{
			System.exit(0);// TODO Auto-generated method stub
		}
		else if(j==b2)
		{
			//Thread t=Thread.currentThread();
			//t.destroy();
			
			
			
			Base.f.pack();
			Base.f.setVisible(false);
			//Base.f.dispose();
			
			this.setEnabled(false);
			this.setVisible(false);
			thrd=false;
			//t.stop();
			timer.f.setVisible(false);
			timer.f.dispose();
			Base b=new Base();
			MyRunnable.i=1;
		thrd=true;
		
			
			
			 //closes the current panel on the frame
			
		}
		else if(j==b3)
	{
		
			this.setVisible(false);
		Rounds rs=new Rounds();
			Base.f.add(rs);
	}
		else if(j==jb1)
		{
			MyRunnable.i=1;
			count++;
			jb1.removeActionListener(this);
			
			
			 // jb1.setBackground(null);
			// jb1.setForeground(null);
			if(i==1)
			{
			jb1.setIcon(x);
			i++;
			p=1;
			
			}
			else
			{
				jb1.setIcon(o);
				i=1;
				p=2;
				
			}	
			check();
		jb2.setFocusPainted(false);
			//jb1.setText("<html><font color=white>3</font></html>");

		}
		else if(j==jb2)
		{
			MyRunnable.i=1;
			count++;
			if(i==1)
			{
				q=1;
			jb2.setIcon(x);
			i++;
			}
			else
			{
				q=2;
				jb2.setIcon(o);
				i=1;
			}
			check();
			jb2.removeActionListener(this);
			jb3.setFocusPainted(false);
		}
		else if(j==jb3)
		{
			MyRunnable.i=1;
			count++;
			if(i==1)
				{
				r=1;
				jb3.setIcon(x);
				i++;
				}
			else
			{
				r=2;
				jb3.setIcon(o);
				i=1;
			}
			check();
			jb3.removeActionListener(this);
			jb4.setFocusPainted(false);
		}
		else if(j==jb4)
		{
			MyRunnable.i=1;
			count++;
			if(i==1)
				{
				s=1;
				jb4.setIcon(x);
				i++;
				}
			else
			{
				s=2;
				jb4.setIcon(o);
				i=1;
			}
			check();
			jb4.removeActionListener(this);
			jb5.setFocusPainted(false);
		}
		else if(j==jb5)
		{
			MyRunnable.i=1;
			count++;
			if(i==1)
				{
				t=1;
				jb5.setIcon(x);
				i++;
				}
			else
			{
				t=2;
				jb5.setIcon(o);
				i=1;
			}
			check();
			jb5.removeActionListener(this);
			jb6.setFocusPainted(false);
		}
		else if(j==jb6)
		{
			MyRunnable.i=1;
			count++;
			if(i==1)
				{
				u=1;
				jb6.setIcon(x);
				i++;
				}
			else
			{
				u=2;
				jb6.setIcon(o);
				i=1;
			}
			check();
			jb6.removeActionListener(this);
			jb7.setFocusPainted(false);
			}
		else if(j==jb7)
		{
			MyRunnable.i=1;
			count++;
			if(i==1)
				{
				v=1;
				jb7.setIcon(x);
				i++;
				}
			else
			{
				v=2;
				jb7.setIcon(o);
				i=1;
			}
			check();
			jb7.removeActionListener(this);
			jb8.setFocusPainted(false);
		}
		else if(j==jb8)
		{
			MyRunnable.i=1;
			count++;
			if(i==1)
				{
				w=1;
				jb8.setIcon(x);
				i++;
				}
			else
			{
				w=2;
				jb8.setIcon(o);
			i=1;
			}
			check();
			jb8.removeActionListener(this);
			jb9.setFocusPainted(false);
		}
		else
		{
			MyRunnable.i=1;
			count++;
			if(i==1)
				{
				z=1;
				jb9.setIcon(x);
				i++;
				}
			else
			{ 
				z=2;
				jb9.setIcon(o);
				i=1;
			}
			check();
			jb9.removeActionListener(this);
		}
	}

	public void check()
		{
		if(count<9)
			{
			if(((p!=0)&&(p==q)&&(q==r))||((s!=0)&&(s==t)&&(t==u))||((v!=0)&&(v==w)&&(w==z))||((p!=0)&&(p==s)&&
	(s==v))||((q!=0)&&(q==t)&&(t==w))||((r!=0)&&(r==u)&&(u==z))||((p!=0)&&(p==t)&&(t==z))||((r!=0)&&(r==t)&&(t==v)))
			{
				if(i==1)
				{
					thrd=false;
					//arr=arr+(Base.str1);
				JOptionPane.showMessageDialog(this,"Winner is "+Base.str1);
				thrd=true;
			}
				else 
				{
					thrd=false;
					JOptionPane.showMessageDialog(this,"Winner is "+Base.str);	
					thrd=true;	
				}	
				jb1.removeActionListener(this);
				jb2.removeActionListener(this);
				jb3.removeActionListener(this);
				jb4.removeActionListener(this);
				jb5.removeActionListener(this);
				jb6.removeActionListener(this);
				jb7.removeActionListener(this);
				jb8.removeActionListener(this);
				jb9.removeActionListener(this);
			
			}
			}
			else
			{
				JOptionPane.showMessageDialog(this," Match is drawn ! ");	
			}
		}
	/*	public void run()
		{
			try
			{
				while(true)
			
			{
				label.setText(""+i);
				i++;
				Thread.sleep(1000);
			}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		} */
	/*public void timer()
		{
		try
		{
			while(true)
		{
			label.setText(""+i);
			i++;
			Thread.sleep(10000);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
		}
	}*/
}
