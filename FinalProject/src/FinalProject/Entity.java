package FinalProject;

public class Entity {
	private int[] position;
	private String name;
	
	public Entity(int[] pos, String name) {
		position = pos;
		this.name = name;
	}
	
	public int[] getPosition() {
		return position;
	}
	public void setPosition(int[] pos) {
		position = pos;
	}
	
	public String getName() {
		return name;
	}
}
