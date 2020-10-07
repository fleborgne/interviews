package fr.sandbox;

public class SquareSnake implements Snake {
    private final int edge;
    private final int[][] matrix;

    public SquareSnake(int edge) {
        this.edge = edge;
        matrix = new int[edge][edge];
        initialize();
    }

    // @VisibleForTesting
    protected int[][] getMatrix() {
        return matrix;
    }

    // Init snake position in the square
    private void initialize() {
        int max = edge - 1;
        int min = 0;
        int i = 1;
        int x = 0, y = 0;

        while (max > min) {
            y = x = min;
            for (; x < max; x++) {
                matrix[x][y] = i++;
            }
            for (; y < max; y++) {
                matrix[x][y] = i++;
            }
            //back
            for (; x > min; x--) {
                matrix[x][y] = i++;
            }
            for (; y > min; y--) {
                matrix[x][y] = i++;
            }
            // find next iteration position
            --max;
            ++min;
        }
        // limit case edge is an odd number
        if (edge % 2 == 1) {
            matrix[min][min] = i;
        }


    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body><table border=1>");
        for (int i = 0; i < edge; i++) {
            sb.append("<tr>");
            for (int j = 0; j < edge; j++) {
                sb.append("<td>").append(this.matrix[i][j]).append("</td>");
            }
            sb.append("</td>");
        }

        sb.append("</table></body></html>");
        return sb.toString();
    }
}