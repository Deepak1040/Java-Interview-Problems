import java.util.ArrayList;
import java.util.List;


// 54. Spiral Matrix


public class SprialMatrix {
    public static void main(String[] args) {
        

        int matrix [][] ={  {1,2,3},
                            {4,5,6},
                            {7,8,9} };      
        /*  00 01 02  
            10 11 12                            
            20 21 22 
        */
        List<Integer> list = spiralOrder(matrix);
        System.out.println(list.toString());
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int row= matrix.length;
        int col=matrix[0].length;
        for(int i = 0,j=0; i < row ; i++,j++) {
            list.add(matrix[i][j]);    
        }


        return list;
    }
}
