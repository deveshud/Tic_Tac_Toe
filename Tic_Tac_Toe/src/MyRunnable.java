
public class MyRunnable implements Runnable {
static int i=1;
	@Override
	public void run() {
		try
		{
			
			while(Game.thrd==true)
			{
			//if(Game.thrd==false)
				//break;
				timer.l.setText("Time is =="+i);	
				i++;
				Thread.sleep(1000);// TODO Auto-generated method stub
			}
			
		
			}catch(Exception e)
		{
	
		}
	
	//timer.f.setEnabled(false);
	
	}


}
