import javax.swing.*;
public class timer {
static JFrame f;
static JLabel l;
public timer()
{
	f=new JFrame("Timer Starts");
	l=new JLabel();
	f.add(l);
	f.setSize(200,100);
	f.setVisible(true);
	Thread thread=new Thread(new MyRunnable());
	thread.start();
}
	public static void main(String[] args) {
//timer t=new timer();
//Thread thread=new Thread(new MyRunnable());
//thread.start();
	}

}
