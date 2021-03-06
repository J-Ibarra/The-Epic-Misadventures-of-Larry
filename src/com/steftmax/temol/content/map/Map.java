package com.steftmax.temol.content.map;

import com.steftmax.temol.graphics.Drawable;
import com.steftmax.temol.graphics.SpriteBatch;

/**
 * @author pieter3457
 *
 */
public class Map implements Drawable{
	private MapData data;

	public Map(MapData data) {
		this.data = data;
	}

	/* (non-Javadoc)
	 * @see com.steftmax.larrys_epic_misadventures.draw.Drawable#draw(com.steftmax.larrys_epic_misadventures.draw.SpriteBatch)
	 */
	@Override
	public void draw(SpriteBatch batch) {
		for (int i = 0; i< data.layers.size(); i++) {
			data.layers.get(i).draw(batch);
			
		}
	}
	
}
