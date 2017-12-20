package core;

public class RunSensor implements Runnable 
{
	
	private Sensor sensor;
	
	public RunSensor(Sensor sensor) 
	{
		this.sensor = sensor;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		sensor.readParkingSensorData();
		
		
	}

}
