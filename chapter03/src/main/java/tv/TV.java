package tv;

public class TV {
	private int channel;	//1 - 255
	private int volume;		//0 - 100
	private boolean power;
	
	public TV() {
		this(1,0,false);
	}
	
	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void power(boolean on) {
		this.power = on;
	}
	
	public void volume(int volume) {
		if(this.power) {
			if(volume<0) this.volume = 100;
			else if(volume>100) this.volume = 0;
			else this.volume = volume;
		}
	}

	public void volume(boolean up) {
		if(up) volume(this.volume+1);
		else volume(this.volume-1);
		
	}
	
	public void channel(int channel) {
		if(this.power) {
			if(channel<=0) {
				this.channel = 255;
			}else if(channel > 255){
				this.channel = 1;
			}else this.channel = channel;
		}
	}
	
	public void channel(boolean up) {
		if(up) channel(this.channel+1);
		else channel(this.channel-1);
	}

	public void status() {
		StringBuilder sb = new StringBuilder();
		sb.append("TV[power="+(power?"on":"off"))
		.append(", channel="+channel)
		.append(", volume="+volume + "]");
		
		System.out.println(sb);
	}
}
