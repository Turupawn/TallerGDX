package rosalila.studio.taller.gdx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class GameOverScreen extends AbstractScreen {

	Stage stg;
	TallerGDX game;
	public GameOverScreen(TallerGDX game) {
		super(game);
		this.game=game;
	}
	
	@Override
	public void show() {
		super.show();
		stg=new Stage();
		Gdx.input.setInputProcessor(stg);
		
		Image gameover=new Image(new Texture("badlogic.jpg"));
		gameover.addListener(new ClickListener(){
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				game.setScreen(game.Play);
				return false;
			}
		});
		stg.addActor(gameover);
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);
		
		stg.draw();
		System.out.println("holamundo");
	}

	@Override
	public void hide() {
		super.hide();
		Gdx.input.setInputProcessor(null);
	}
}
