package rosalila.studio.taller.gdx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class Mala extends Image
{
	final TallerGDX g;
	public Mala(TallerGDX game)
	{
		super(new Texture("mala.png"));
		this.g = game;
		setY((float)((Gdx.graphics.getHeight()-this.getHeight())*Math.random()));
		
		addListener(new ClickListener(){
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
			{
				super.touchDown(event, x, y, pointer, button);
				System.out.println("Toque la pelotita mala!");
				g.setScreen(g.GameOver);
				return true;
			}
		});
	}
	
	@Override
	public void act (float delta)
	{
		super.act(delta);
		setPosition(getX()+1, getY());
	}
}
