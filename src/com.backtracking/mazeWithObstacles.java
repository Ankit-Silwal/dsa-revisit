import java.util.ArrayList;

public class mazeWithObstacles {

  public static void main(String[] args) {
    boolean[][] maze = {
      { true,  true,  false },
      { false, true,  true  },
      { true,  true,  true  }
    };

    System.out.println(findPaths("", maze, 0, 0, new int[] {2, 2}));
  }

  static ArrayList<String> findPaths(String p,boolean[][] maze,int r,int c,int[] target) {
    if (r == target[0] && c == target[1]) {
      ArrayList<String> ans = new ArrayList<>();
      ans.add(p);
      return ans;
    }

    ArrayList<String> list = new ArrayList<>();
    if (r + 1 < maze.length && maze[r + 1][c]) {
      list.addAll(findPaths(p + "D", maze, r + 1, c, target));
    }
    if (c + 1 < maze[0].length && maze[r][c + 1]) {
      list.addAll(findPaths(p + "R", maze, r, c + 1, target));
    }

    return list;
  }
}
