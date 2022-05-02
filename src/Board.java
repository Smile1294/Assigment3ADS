import java.util.Arrays;

public class Board
{
    private final int[][] board;
    private final int size;

    public Board(int size)
    {
        this.size = size;
        board = new int[size][size];
    }



    public void putPiece(int x, int y)
    {
        board[x][y] = 1;
    }


    public int countPieces()
    {
        int count = 0;
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if (board[i][j] == 1)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isValidMove(int x, int y)
    {
        return checkHorizontal(y) && checkVertical(x) && checkDiagonal(x, y);
    }

    private boolean checkVertical(int x)
    {
        for (int i = 0; i < size; i++)
        {
            if (board[x][i] == 1)
                return false;
        }
        return true;
    }

    public int[][] getBoard()
    {
        return board;
    }

    private boolean checkHorizontal(int y)
    {
        for (int i = 0; i < size; i++)
        {
            if (board[i][y] == 1)
                return false;
        }
        return true;
    }

    private boolean checkDiagonal(int x, int y)
    {
        for (int i = 0; i < size; i++)
        {
            if (x + i < size && y + i < size)
            {
                if (board[x + i][y + i] == 1)
                    return false;
            }

            if (x - i >= 0 && y - i >= 0)
            {
                if (board[x - i][y - i] == 1)
                    return false;
            }
            if (x + i < size && y - i >= 0)
            {
                if (board[x + i][y - i] == 1)
                    return false;
            }
            if (x - i >= 0 && y + i < size)
            {
                if (board[x - i][y + i] == 1)
                    return false;
            }
        }
        return true;
    }

    public void printBoard()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print(board[j][i]);
            }
            System.out.println();

        }
        System.out.println();

    }

    public Board copy()
    {
        Board copy = new Board(size);
        for (int i = 0; i < size; i++)
        {
            System.arraycopy(board[i], 0, copy.board[i], 0, size);
        }
        return copy;
    }
    @Override
    public boolean equals(Object o){
        return Arrays.deepEquals(((Board) o).getBoard(), getBoard());
    }
}