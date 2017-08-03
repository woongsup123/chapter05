package prob2;

public class SmartPhone extends MusicPhone {
	
	@Override
	public void execute( String function ) {
		
		if ( function == "음악") {
			playMusic();
		}
		else if ( function == "통화") {
			super.execute( function );
		}
		else if ( function == "앱") {
			runApp();
		}
	}
	
	private void runApp() {
		System.out.println("앱실행");
	}

	@Override
	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	
}
