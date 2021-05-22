package eu.sig.training.ch02;

public class BoardFactory {
    private Square[][] grid;
    private Board board;
    private int width;
    private int height;

    BoardFactory(Square[][] grid) {
        assert grid != null;
        this.grid = grid;
        this.board = new Board(grid);
        this.width = board.getWidth();
        this.height = board.getHeight();
    }

    Board create() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                createBoard(x, y);
            }
        }
        return this.board;
    }

    private void createBoard(int x, int y) {
        Square square = grid[x][y];
        assert Direction.values() != null;
        for (Direction dir : Direction.values()) {
            Square neighbour = getNeigbour(dir, x, y);
            square.link(neighbour, dir);
        }
    }

    private Square getNeigbour(Direction dir, int x, int y) {
        int dirX = (width + x + dir.getDeltaX()) % width;
        int dirY = (height + y + dir.getDeltaY()) % height;
        return grid[dirX][dirY];
    }
}

class Board {
    @SuppressWarnings("unused")
    public Board(Square[][] grid) {}

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }
}

class Square {
    @SuppressWarnings("unused")
    public void link(Square neighbour, Direction dir) {}
}

class Direction {

    public static Direction[] values() {
        return null;
    }

    public int getDeltaY() {
        return 0;
    }

    public int getDeltaX() {
        return 0;
    }
}
