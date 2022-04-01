import java.util.ArrayList;

public class Matrix {


    public static int numberOfNonZeroValues(int[][] matrix) {



        int counter =0;



        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] != 0) {


                   counter++;


                }

            }

        }

        //System.out.println(counter); 11

        return counter;
    }


    public static ArrayList<Integer> indexOfColumnsWithSameValues(int[][] matrix) {
        ArrayList<Integer> cuc = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            boolean isnull = true;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == matrix[i+1][j]) {


                    System.out.println(j); //1
                    cuc.add(j);

                }

            }



        }


        return cuc;
    }
}
