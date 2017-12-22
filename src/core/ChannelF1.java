package core;

import java.util.Observable;

public class ChannelF1 extends Observable
{
	
	Sensor channelF1Input;
	String f1Output;

	public ChannelF1(Sensor channelF1Input) 
	{
		this.channelF1Input = channelF1Input;
	}
	
	//lit OPT du senseur et maj fiOutput 'DÉTECTÉ' ou 'NA'
	public void setF1Output() 
	{
		String oldF1Output = f1Output;
		String output = channelF1Input.getOpt();

		if (output != null) {
			output = output.substring(output.indexOf("P")+1, output.indexOf("P")+2);
			if (output.equals("1")) f1Output = "Occupé";
			else f1Output = "Libre";
			if (f1Output != oldF1Output)
			{
				setChanged();
				notifyObservers(this.f1Output);
			}
		}

		
	}
	
	public String getF1Output()
	{
		return f1Output;
	}
	
	public String toString () 
	{
		return channelF1Input.getId()+ "-" + f1Output;
	}

}
