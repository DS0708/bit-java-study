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
		if(!power) return;
		
		if(volume<0) volume = 100;
		else if(volume >100) volume=0;
		else this.volume = volume;
	}

	public void volume(boolean up) {
//		if(up) volume(this.volume+1);
//		else volume(this.volume-1);
		volume(this.volume + (up? 1 : -1));
	}
	
	public void channel(int channel) {
		if(!power) return;
		
		if(channel < 1) channel = 255;
		else if(channel >255) channel = 1;
		else this.channel = channel;
	}
	
	public void channel(boolean up) {
		channel(this.channel + (up? 1 : -1));
	}

	public void status() {
		StringBuilder sb = new StringBuilder();
		sb.append("TV[power="+(power?"on":"off"))
		.append(", channel="+channel)
		.append(", volume="+volume + "]");
		
		System.out.println(sb);
	}
}
