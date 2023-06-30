package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		// TODO Auto-generated method stub
		if(function.equals("앱")) {
			app();
			return;
		}else if (function.equals("음악")) {
			smart_music();
			return;
		}
		super.execute(function);
	}

	private void smart_music() {
		// TODO Auto-generated method stub
		System.out.println("다운로드해서 음악재생 ");
	}

	private void app() {
		// TODO Auto-generated method stub
		System.out.println("앱실행");
	}
	
}
