/**
 * 
 */
package com.redphoenix.prison.api;

import com.redphoenix.prison.entities.Prisoner;

/**
 * @author RedPhoenix
 *
 */
public interface PrisonerDAO {
	public Prisoner createPrisoner(String firstname, String lastname, int age);
	public boolean removePrisoner(int id);
	public Prisoner findPrisoner(int id);
	public void render();
	public void move();
	public void sleep();
	public void eat();
	public void fight();
	public void work();
}
