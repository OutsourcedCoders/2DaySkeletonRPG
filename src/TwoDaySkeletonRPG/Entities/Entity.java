package TwoDaySkeletonRPG.Entities;

class Entity{
	private int x, y;
	private int health, damage;
	private String name;
	private String[] sprites;
	
	boolean moveTo(int x,int y){
		this.x = x;
		this.y = y;
		return true;
	}
	
	boolean moveTo(int[] dir){
		if(dir.length != 2)
			return false;
		this.x = dir[0];
		this.y = dir[1];
		return true;
	}

	int[] currentLocation(){
		int[] dir = {this.x, this.y};
		return dir;
	}

	int getX(){
		return x;
	}

	int getY(){
		return y;
	}
}
