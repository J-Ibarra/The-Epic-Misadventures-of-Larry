package com.steftmax.temol.content;

import java.util.HashSet;
import java.util.Set;

import com.steftmax.temol.content.entity.ControllableEntity;
import com.steftmax.temol.content.entity.Entity;
import com.steftmax.temol.content.map.old.TiledMap;
import com.steftmax.temol.resource.ResourceManager;

public class Level {

	private Set<Entity> entities = new HashSet<Entity>();
	public TiledMap map;
	public ControllableEntity player;
	public ResourceManager manager;
	
	
	public Level(ResourceManager man) {
		this.manager = man;
	}


	public Set<Entity> getLevelObjects() {
		return entities;
	}

	public void addLevelEntity(Entity ent) {
		entities.add(ent);
	}
	
	public void setMap(TiledMap map) {
		this.map = map;
	}

	public void removeEntity(Entity ent) {
		entities.remove(ent);
	}

	/**
	 * @param larry
	 */
	public void setPlayer(ControllableEntity player) {
		this.player = player;
		addLevelEntity(player);
	}
}