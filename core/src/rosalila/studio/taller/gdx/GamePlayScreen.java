package rosalila.studio.taller.gdx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class GamePlayScreen extends AbstractScreen {
	
	Stage stage;
	int frame=0;

	public GamePlayScreen(TallerGDX game) {
		super(game);
	}

	@Override
	public void show() {
		super.show();
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
	}
	
	@Override
	public void render(float delta)
	{
		Gdx.gl.glClearColor(0, 0, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.draw();
		stage.act();
		
		if(frame%100==0)
		{
			stage.addActor(new Buena(game));
			
		}
		
		if(frame%175==0)
		{
			stage.addActor(new Mala(game));
		}
		
		frame++;
	}
	
	@Override
	public void hide() {
		super.hide();
		Gdx.input.setInputProcessor(null);
	}
}
