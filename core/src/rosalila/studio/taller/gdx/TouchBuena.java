package rosalila.studio.taller.gdx;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class TouchBuena extends ClickListener
{
	Image image;
	TallerGDX game;
	public TouchBuena(Image image, TallerGDX game)
	{
		this.game=game;
		this.image = image;
	}
	@Override
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
		super.touchDown(event, x, y, pointer, button);
		System.out.println("Toque la pelotita buena!");
		image.remove();
		return true;
	}
}
