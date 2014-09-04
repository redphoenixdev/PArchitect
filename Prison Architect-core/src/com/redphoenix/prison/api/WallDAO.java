/**
 * 
 */
package com.redphoenix.prison.api;

import com.redphoenix.prison.objects.Wall;

/**
 * @author RedPhoenix
 *
 */
public interface WallDAO {
	public Wall createWall(int x, int y);
	public boolean removeWall(int id);
	public Wall findWall(int id);
}
