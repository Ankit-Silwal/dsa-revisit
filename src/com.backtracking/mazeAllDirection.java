
import java.util.ArrayList;

public class mazeAllDirection {
  public static void main(String[] args) {
      boolean[][] maze={
        {true,true,false},
        {true,true,false},
        {true,true,true}
      };
      int[] target={2,2};
      System.out.println(findPath("",maze, 0, 0, target));
  }
  static ArrayList<String> findPath(String p,boolean[][] maze,int r,int c,int[] target){
    if(r==target[0]&&c==target[1]){
      ArrayList<String> ans=new ArrayList<>();
      ans.add(p);
      return ans;
    }
    maze[r][c]=false;
    ArrayList<String> list=new ArrayList<>();
    if(r<maze.length-1&&maze[r+1][c]){
      list.addAll(findPath(p+'D', maze, r+1, c, target));
    }
    if(r>0 && maze[r-1][c]){
      list.addAll(findPath(p+'U', maze, r-1, c, target));
    }
    if(c<maze.length-1 &&maze[r][c+1]){
      list.addAll(findPath(p+'R', maze, r, c+1, target));
    }
    if(c>0 && maze[r][c-1]){
      list.addAll(findPath(p+'L', maze, r, c-1, target));
    }
    maze[r][c]=true;
    return list;
  }
}
