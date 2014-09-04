/**
 * 
 */
package com.redphoenix.prison.api;

/**
 * @author RedPhoenix
 *
 */
public interface Floor {
	public Floor createFloor(int x, int y);
	public boolean removeFloor(int id);
	public Floor findFloor(int id);
}
