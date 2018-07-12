import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

public class Base implements ActionListener,WindowListener {
 static JFrame f;
JPanel jp;
JLabel label,l1,l2;
JButton jb1,jb2;
JTextField et1,et2;
static String str="",str1="";	
    

public Base()     //This is the first class of the Game 
    
    {
	Game.thrd=true;
	f=new JFrame();	
	f.setTitle("Tic-Tac-Toe");
	jp =new JPanel(null);   	
    	f.addWindowListener(this);
    	URL url;
		url=Base.class.getResource("/back2.png");
        label=new JLabel(new ImageIcon(url)); // how to add an image in java  
        // JLabel l=new JLabel("Welcome to Tic-Tac-Toe");
	    // how to change text of label l.setFont(new Font("Forte",Font.BOLD,24));
        
    	label.setBounds(50,0,600,600);
    	URL url1;
		url1=Base.class.getResource("/true.jpg");
    
    	ImageIcon icon=new ImageIcon(url1);
        Image img = icon.getImage() ;  
   	    Image newimg = img.getScaledInstance( 125,125,  java.awt.Image.SCALE_SMOOTH ) ;  
        icon = new ImageIcon( newimg );
        jb1=new JButton();
        jb1.addActionListener(this);
    	jb1.setIcon(icon);
     	jb1.setBounds(100,540,150,150);
     	
     	URL url2;
		url2=Base.class.getResource("/false.jpg");
    	ImageIcon icon1=new ImageIcon(url2); // to change an image of size of a button 
   	    Image img1 = icon1.getImage() ;  
   	    Image newimg1 = img1.getScaledInstance( 125,125,  java.awt.Image.SCALE_SMOOTH ) ;  
   	    icon1 = new ImageIcon( newimg1 );
    	jb2=new JButton();
    	jb2.addActionListener(this);
    	jb2.setIcon(icon1);
    	jb2.setBounds(450,540,150,150);
    	jp.add(label);
    	Font ft=new Font("Forte",2,16);
    	
    	l1=new JLabel("Let's Go Buddy");
    	l1.setFont(ft);
    	l1.setBounds(120,680,300,40);
    	l2=new JLabel("Click To Exit");
    	l2.setFont(ft);
    	l2.setBounds(460,680,100,40);
    	et1=new JTextField();
    	
    	JLabel lab1=new JLabel("Player 1");
    	//lab1.setBackground(Color.BLACK);
    	lab1.setBounds(40,0,100,40);
    	lab1.setFont(ft);
    	
    	lab1.setForeground(Color.BLACK);
    	
    
    	et1.setBounds(100,0,200,40);
    	et2=new JTextField();
    	JLabel lab2=new JLabel("Player 2");
    	lab2.setBounds(400,0,100,40);
    	lab2.setForeground(Color.BLACK);	
    	lab2.setFont(ft);
  // lab2.setBackground(Color.CYAN);
    	
    	et2.setBounds(460,0,200,40);
    	et1.setFont(ft);
    	et2.setFont(ft);
    
    	jp.add(jb1);
        jp.add(l1);
    	jp.add(jb2);
      	jp.add(l2);
      	jp.add(lab1);
      	jp.add(lab2);
      	jp.add(et1);
      	jp.add(et2);
    	f.add(jp);
    	
    	f.setVisible(true);
    	f.setSize(700,750);
    	f.setResizable(false);
    	JOptionPane.showMessageDialog(f,"Welcome to Tic-Tac-Toe","HEYA THERE !",1);
   // String string=JOptionPane.showInputDialog(f, "Enter number of rounds","Rounds",JOptionPane.WARNING_MESSAGE);
    //	int x=Integer.parseInt(string);
   // int abcd=JOptionPane.showInputDialog(this,"Enter number of rounds","Rounds",JOptionPane.WARNING_MESSAGE);
    	// 	JOptionPane.showMessageDialog(null,"Enter the number of rounds in the ROUNDS field");
    	
	}

	public static void main(String[] args) {
	 
	Base obj =new Base();// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		if(b==jb1)
		{
			str=et1.getText().toString();
			str1=et2.getText().toString();
			JOptionPane.showMessageDialog(f,str+" goes for X");
			jp.setVisible(false);
			//Thread t=new Thread(new Game());
			//t.start();
			Game g=new Game();
			//Thread t=new Thread(g);
			//t.start();
			this.f.add(g);
		// TODO Auto-generated method stub
			//timer t=new timer();
		}
		else
			System.exit(0);
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.exit(0);// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
