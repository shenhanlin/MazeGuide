/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

/**
 *
 * @author hjs29282
 */
public class Maze
{

    private int maze[][];
    private int count;

    public Maze(int[][] a)
    {
        maze = a;
        count = 0;
    }

    public void findTheWay(int r, int c, int[][] maze)
    {

        if (!findEnd(r, c))
        {
            if (r - 1 > -1 && upAvailability(r, c))
            {
                maze[r - 1][c] = 2;// {lace a queen              
                findTheWay(r - 1, c, maze);
            }

            if (r + 1 < maze.length && downAvailability(r, c))
            {
                maze[r + 1][c] = 2;// {lace a queen             
                findTheWay(r + 1, c, maze);

            }

            if (c + 1 < maze[r].length && rightAvailability(r, c))
            {
                maze[r][c + 1] = 2;// {lace a queen
                findTheWay(r, c + 1, maze);

            }

            if (c - 1 > -1 && leftAvailability(r, c))
            {
                maze[r][c - 1] = 2;// {lace a queen
                findTheWay(r, c - 1, maze);


            }

        } else
        {

            count++;
            System.out.println("------------------------------------------");
            System.out.println("The "+count+"th way to escape this maze");            
            printMaze();

        }
        maze[r][c] = 0;



    }

    public boolean findEnd(int r, int c)
    {
        if (r - 1 > -1 && c - 1 > -1 && r + 1 < maze.length && c + 1 < maze[r].length)
        {
            if (maze[r - 1][c] == 4 || maze[r + 1][c] == 4
                    || maze[r][c - 1] == 4 || maze[r][c + 1] == 4)
            {
                return true;
            }
        }
        return false;
    }

    public boolean upAvailability(int r, int c)
    {

        if (maze[r - 1][c] == 0)
        {
            return true;
        }

        return false;

    }

    public boolean downAvailability(int r, int c)
    {

        if (maze[r + 1][c] == 0)
        {
            return true;
        }

        return false;
    }

    public boolean rightAvailability(int r, int c)
    {
        if (maze[r][c + 1] == 0)
        {
            return true;
        }

        return false;
    }

    public boolean leftAvailability(int r, int c)
    {

        if (maze[r][c - 1] == 0)
        {
            return true;
        }

        return false;
    }

    public void printMaze()
    {
        for (int i = 0; i < maze.length; i++)
        {
            for (int j = 0; j < maze[i].length; j++)
            {

                System.out.print(maze[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
