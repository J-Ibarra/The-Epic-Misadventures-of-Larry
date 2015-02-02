package com.steftmax.larrys_epic_misadventures.entity;

import com.steftmax.larrys_epic_misadventures.draw.Drawable;
import com.steftmax.larrys_epic_misadventures.level.LevelObject;
import com.steftmax.larrys_epic_misadventures.map.old.TiledMap;
import com.steftmax.larrys_epic_misadventures.math.AABB;
import com.steftmax.larrys_epic_misadventures.math.Vector2;
import com.steftmax.larrys_epic_misadventures.sprite.Sprite;
import com.steftmax.larrys_epic_misadventures.update.Updatable;

public abstract class Entity extends LevelObject implements Drawable, Updatable {

	public final Vector2 lastPos, newPos, velocity;
	protected float HP;
	protected final int mass, maxHP;
	protected Sprite sprite;
	public final AABB hitbox;
	protected TiledMap map;
	protected boolean isOnGround = false;
	

	public Entity(TiledMap map, float x, float y, final int mass, final int maxHP) {
		this.map = map;
		this.HP = maxHP;
		this.maxHP = maxHP;
		this.mass = mass;
		newPos = new Vector2(x, y);
		lastPos = new Vector2(x, y);
		velocity = new Vector2(0,0);
		hitbox = new AABB(0, 0, 0, 0);
		sprite = new Sprite();
	}

	protected void updateHitbox() {
		final int width = sprite.width;
		final int height = sprite.height;

		hitbox.setBounds((int) newPos.x, (int) newPos.y - height, width, height);
	}
	
	@Deprecated
	public AABB getHitbox() {
		return hitbox;
	}

	public void onCollide(Entity collideEnt) {
		// TODO
	}
	
	

	
//	public void applyForce(float x, float y) {
//		//F = m * a
//		//a = F / m
//		
////		last_acceleration = acceleration
////		position += velocity * time_step + ( 0.5 * last_acceleration * time_step^2 )
////		new_acceleration = force / mass 
////		avg_acceleration = ( last_acceleration + new_acceleration ) / 2
////		velocity += avg_acceleration * time_step
//	}
}
