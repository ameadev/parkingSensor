package core;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Sensor> sensors = new ArrayList<>();
		ArrayList<ChannelF1> channelF1s = new ArrayList<>();

//		ChannelF2 channelF2_s1 = new ChannelF2();
		Parking parking = new Parking();

		for (int i = 1; i <= 5 ; i++) {
			sensors.add(new Sensor(i, 10, 500000)); // Creation of the sensor
			ChannelF1 channelF1 = new ChannelF1(sensors.get(sensors.size() - 1)); // Creation of the chanel
			channelF1.addObserver(parking);
			channelF1s.add(channelF1);
		}

//		ChannelF1 channelF1_s1 = new ChannelF1(senseur_1);
//		channelF1_s1.addObserver(channelF2_s1);

		do
		{
			int i = 0;
			for (Sensor sensor : sensors) {
				Thread tS_1 = new Thread(new RunSensor(sensor));
				try {
					Thread.sleep(sensor.getRate());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				tS_1.start();
				Thread tC_1 = new Thread(new RunChannelF1(channelF1s.get(i)));
				tC_1.start();
				i++;
			}
		}
		while (true);
		
		
	}

}
