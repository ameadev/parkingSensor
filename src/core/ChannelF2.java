package core;

import java.util.Observable;
import java.util.Observer;

public class ChannelF2 implements Observer 
{
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof ChannelF1)
		{
			System.out.println(o);
		}
		
	}


}
