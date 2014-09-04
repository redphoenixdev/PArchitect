/**
 * 
 */
package com.redphoenix.prison.objects;

import com.badlogic.gdx.graphics.Texture;

/**
 * @author RedPhoenix
 *
 */
public class Floor {
	
	private int id;
	private int tile_x, tile_y;
	private Texture texture;
	private boolean isBuilding;
	
	public Floor(int tile_x, int tile_y){
		setTile_x(tile_x);
		setTile_y(tile_y);
		setTexture(new Texture(""));
		setBuilding(false);
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
	 * @return the tile_x
	 */
	public int getTile_x() {
		return tile_x;
	}
	/**
	 * @param tile_x the tile_x to set
	 */
	public void setTile_x(int tile_x) {
		this.tile_x = tile_x;
	}
	/**
	 * @return the tile_y
	 */
	public int getTile_y() {
		return tile_y;
	}
	/**
	 * @param tile_y the tile_y to set
	 */
	public void setTile_y(int tile_y) {
		this.tile_y = tile_y;
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
	 * @return the isBuilding
	 */
	public boolean isBuilding() {
		return isBuilding;
	}
	/**
	 * @param isBuilding the isBuilding to set
	 */
	public void setBuilding(boolean isBuilding) {
		this.isBuilding = isBuilding;
	}


}
