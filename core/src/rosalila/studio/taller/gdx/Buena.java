package rosalila.studio.taller.gdx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Buena extends Image

{
	
	public Buena(TallerGDX game)
	{
		super(new Texture("buena.png"));
		addListener(new TouchBuena(this,game));
		setY((float)((Gdx.graphics.getHeight()-this.getHeight())*Math.random()));
	}
	
	@Override
	public void act (float delta)
	{
		super.act(delta);
		setPosition(getX()+1, getY());
	}
}
