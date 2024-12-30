
public class Arrays {

    public static void main(String[] args) {
        // Arrays Initialization
        String [] members = new String[3];
        members[0] = "Sarfraz";
        members[1] = "Afzal";
        System.out.println(java.util.Arrays.toString(members));

        int [] numbers = {3,1,5,2,5};
        java.util.Arrays.sort(numbers);
        System.out.println(java.util.Arrays.toString(numbers));

        // 2D Arrays Initialization
        int [][] matrix = new int [2][3];
        matrix[0][0]=1;
        matrix[1][0]=2;
        matrix[0][1]=3;
        matrix[1][1]=4;
        System.out.println(java.util.Arrays.deepToString(matrix));  
    }
}