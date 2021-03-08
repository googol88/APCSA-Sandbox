import java.util.Arrays;

public class Snake {

	public static final int MAX_SEGMENTS = 100;
	public static final int RIGHT = 0;
	public static final int UP = 1;
	public static final int LEFT = 2;
	public static final int DOWN = 3;
	
	private int[][] segments;
	private int numSegments;
	private int direction;
	
	public Snake() {
		segments = new int[MAX_SEGMENTS][2];
    segments[0][0] = 4;
    segments[0][1] = 9;
    segments[1][0] = 3;
    segments[1][1] = 9;
    segments[2][0] = 2;
    segments[2][1] = 9;
    for (int i = 3; i < segments.length; i++) {
      segments[i][0] = -1;
      segments[i][1] = -1;
    }
    numSegments = 3;
    direction = RIGHT;
	}
	
	/* returns whether or not the head of the snake has the same coordinates
	 * as another segment of the snake, indicating a self-collision. 
	 */
	public boolean collidedWithSelf() {
		for(int i = 1; i < segments.length; i++) {
      if(segments[i][0] == segments[0][0] && segments[i][1] == segments[0][1]) {
        return true;
      }
    }
    return false;
	}
	public static void main(String[] args) {
    Snake snek = new Snake();
    System.out.println(Arrays.deepToString(snek.segments));
    System.out.println(snek.collidedWithSelf());
  }
}
