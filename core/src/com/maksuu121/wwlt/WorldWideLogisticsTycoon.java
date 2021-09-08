package com.maksuu121.wwlt;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class WorldWideLogisticsTycoon extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	public static Texture R730txt;
	public static Texture R580txt;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		R730txt = new Texture("badlogic.jpg");
		R580txt = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		R730txt.dispose();
		R580txt.dispose();
	}
}
