package ArrayQuestions.src;

import java.util.Arrays;

public class matrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},

        };

        System.out.println(Arrays.toString((transpose(matrix))));
    }
        static int[][] transpose(int[][] matrix) {
            int[][] temp = matrix;
            int[][] res = new int [matrix[0].length][matrix.length];

            for (int i = 0; i < res.length; i++) {
                for(int j = 0; j < matrix.length; j++){
                            res[i][j] = matrix[j][i];

                    }
                }

            for(int i = 0; i < res.length; i++){
                System.out.println(Arrays.toString(res[i]));
            }
            return res;
            }

        }

