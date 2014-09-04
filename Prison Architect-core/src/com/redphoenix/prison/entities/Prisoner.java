/**
 * 
 */
package com.redphoenix.prison.entities;

import com.badlogic.gdx.graphics.Texture;

/**
 * @author RedPhoenix
 *
 */
public class Prisoner {
	
	private int id;
	private Texture texture;
	private String firstname;
	private String lastname;
	private int age;
	private int conviction_id;
	private int task_id;
	private int health;
	
	public Prisoner(){
		setHealth(100);
	}
	
	public Prisoner(int id, String firstname, String lastname, int age, int conviction_id){
		setId(id);
		setFirstname(firstname);
		setLastname(lastname);
		setAge(age);
		setConviction_id(conviction_id);
		setHealth(100);
		setTask_id(0);
		setTexture(new Texture(""));
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
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the conviction_id
	 */
	public int getConviction_id() {
		return conviction_id;
	}
	/**
	 * @param conviction_id the conviction_id to set
	 */
	public void setConviction_id(int conviction_id) {
		this.conviction_id = conviction_id;
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
