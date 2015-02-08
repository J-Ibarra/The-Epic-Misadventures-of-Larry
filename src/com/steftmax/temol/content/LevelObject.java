package com.steftmax.temol.content;


/**
 * This class represents an object in a level
 * 
 * @author pieter3457
 *
 */
public abstract class LevelObject {
	// The level in which the object is in
	protected Level level;

	public void setLevel(Level level) {
		this.level = level;
	}

}