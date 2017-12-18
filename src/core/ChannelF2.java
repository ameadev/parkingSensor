package core;

public class ChannelF2 
{
	
	ChannelF1 channelF2Input;
	String F1Output;
	public ChannelF2(ChannelF1 channelF2Input) 
	{
		this.channelF2Input = channelF2Input;
		this.F1Output = this.channelF2Input.channelF1Output();
	}
	
	public String channelF2Outout() 
	{
		if (this.channelF2Input.channelF1Output().equals(F1Output)) 
		{
			//rien faire
		}
		else 
		{
			
		}
		return null;
	}

}
