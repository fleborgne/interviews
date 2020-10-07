package fr.sandbox;

import java.io.File;
import java.io.FileWriter;

/**
 * Snake App
 */
public class SnakeApplication {
    public static void main(String[] args) throws Exception {
        File htmlFile = new File("snail.html");
        htmlFile.createNewFile();
        try (FileWriter writer = new FileWriter(htmlFile)) {

            Snake snake = new SquareSnake(8);

            String result = snake.display();
            System.out.println(result);
            writer.write(result);
        }

    }
}
