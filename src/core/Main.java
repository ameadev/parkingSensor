package core;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sensor senseur_1 = new Sensor(1, 10, 45);
		ChannelF1 channelF1_s1 = new ChannelF1(senseur_1);
		ChannelF2 channelF2_s1 = new ChannelF2();
		
		channelF1_s1.addObserver(channelF2_s1);
		
	    
		do 
		{
			Thread tS_1 = new Thread(new RunSensor(senseur_1));
			try {
				Thread.sleep(senseur_1.getRate());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tS_1.start();
			Thread tC_1 = new Thread(new RunChannelF1(channelF1_s1));
			tC_1.start();			
		}
		while (true);
		
		
	}

}
