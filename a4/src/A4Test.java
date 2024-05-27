import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class A4Test {
    public static void main(String[] args) throws FileNotFoundException {
        //  Scanner scanner = new Scanner( new File(simplesolveable.txt"));
        //  Scanner scanner = new Scanner( new File(simpleunsolveable.txt"));
        Scanner scanner = new Scanner( new File("threelayers.txt"));
        //     Scanner scanner = new Scanner( new File(twolayersolveable.txt"));
         // Scanner scanner = new Scanner( new File("twolayersunsolveable.txt"));

        int noOfCols = scanner.nextInt();
        int noOfRows = scanner.nextInt();
        int noOfLayers = scanner.nextInt();

        scanner.nextLine();
        scanner.nextLine();
        char[][][] matrix =  new char[noOfLayers][noOfRows][noOfCols];

        for (int l = 0; l < noOfLayers; l++) {
            for (int i = 0; i < noOfRows; i++) {
                String line = scanner.nextLine();

                for (int j = 0; j < noOfCols; j++) {
                    matrix[l][i][j] = line.charAt(j);
                }
                System.out.println(Arrays.toString(matrix[l][i]));
            }

            if(scanner.hasNext()) {
                scanner.nextLine();
                System.out.println();
            }
        }


        Graph graph = new Graph(matrix);
//        boolean connected = graph.isDiscoverable();
        //      System.out.println(connected);
        //graph.shortedPath();
        System.out.println(graph.getShortestPathCost());
        System.out.println(graph.getShortestPath());

    }
}
