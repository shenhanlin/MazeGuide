
import maze.Maze;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hjs29282
 */
public class TestMaze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a[][] = {
            {1, 1, 1, 1, 1},
            {3, 0, 1, 0, 1},
            {1, 0, 1, 0, 4},
            {0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1}};

        int c[][] = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
            {1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1},
            {4, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1},
            {1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1},
            {1, 0, 1, 5, 1, 0, 1, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

        Maze b = new Maze(c);

        b.findTheWay(8, 3, c);
    }
}
