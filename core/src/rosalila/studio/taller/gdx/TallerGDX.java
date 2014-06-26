package rosalila.studio.taller.gdx;

import com.badlogic.gdx.Game;

public class TallerGDX extends Game
{
	static AbstractScreen GameOver,Play;

	@Override
	public void create() {
		GameOver = new GameOverScreen(this);
		Play = new GamePlayScreen(this);
		setScreen(Play);
		
	}	
}
