import java.util.ArrayList;

public class Queens
{
    private final int size;
    private int currentMax;
    private ArrayList<Board> solutions;

    public Queens(int size)
    {
        this.size = size;
        solutions = new ArrayList<>();
        findMax(0, new Board(size));
        for (Board b : solutions)
        {
            b.printBoard();
        }
    }


    private void findMax(int row, Board board)
    {
        for (int i = 0; i < size; i++)
        {
            Board copy = board.copy();
            if (board.isValidMove(row, i))
            {
                copy.putPiece(row, i);
                if (row != size - 1)
                    findMax(row + 1, copy);
            }
            checkResult(copy);
        }
    }



    private void checkResult(Board board)
    {
        if (board.countPieces() >= currentMax)
        {
            if (currentMax < board.countPieces())
            {
                solutions = new ArrayList<>();
                currentMax = board.countPieces();
            }
            if(!solutions.contains(board))
                solutions.add(board);
        }
    }

    public int getCurrentMax()
    {
        return currentMax;
    }
}