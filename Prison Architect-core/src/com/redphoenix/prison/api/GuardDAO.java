/**
 * 
 */
package com.redphoenix.prison.api;

import com.redphoenix.prison.entities.Guard;

/**
 * @author RedPhoenix
 *
 */
public interface GuardDAO {
	public Guard createGuard();
	public boolean removeGuard(int id);
	public Guard findGuard(int id);
	public void render();
	public void move();
	public void fight();
}
