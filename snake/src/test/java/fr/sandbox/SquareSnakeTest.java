package fr.sandbox;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 *
 */
public class SquareSnakeTest {
    @Test
    public void checkSquareSnakeContent_square_1() {
        SquareSnake snake = new SquareSnake(1);
        assertArrayEquals(new int[][]{{1}}, snake.getMatrix());
    }

    @Test
    public void checkSquareSnakeContent_square_2() {
        SquareSnake snake = new SquareSnake(2);
        assertArrayEquals(new int[][]{{1, 4}, {2, 3}}, snake.getMatrix());
    }

    @Test
    public void checkSquareSnakeContent_square_3() {
        SquareSnake snake = new SquareSnake(3);
        assertArrayEquals(new int[][]{{1, 8, 7}, {2, 9, 6}, {3, 4, 5}}, snake.getMatrix());
    }
}
