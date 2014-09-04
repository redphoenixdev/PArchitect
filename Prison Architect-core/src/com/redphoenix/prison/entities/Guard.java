/**
 * 
 */
package com.redphoenix.prison.entities;

import com.badlogic.gdx.graphics.Texture;

/**
 * @author RedPhoenix
 *
 */
public class Guard {
	
	private int id;
	private Texture texture;
	private int task_id;
	private int health;
	
	public Guard(){
		setHealth(100);
	}
	
	public Guard(int id){
		setId(id);
		setTexture(new Texture(""));
		setTask_id(0);
		setHealth(100);
	}
	
	/**
	 * @return the texture
	 */
	public Texture getTexture() {
		return texture;
	}

	/**
	 * @param texture the texture to set
	 */
	public void setTexture(Texture texture) {
		this.texture = texture;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the task_id
	 */
	public int getTask_id() {
		return task_id;
	}
	/**
	 * @param task_id the task_id to set
	 */
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	
	

}
