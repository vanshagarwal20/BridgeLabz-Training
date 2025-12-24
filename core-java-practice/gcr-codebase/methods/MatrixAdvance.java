package method;

public class MatrixAdvance {
	public static int[][] transpose(int[][] m){
        int[][] t = new int[m[0].length][m.length];
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                t[j][i] = m[i][j];
            }
        }
        return t;
    }

    public static int determinant(int[][] m){    	
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static void main(String[] args){
        int[][] mat = {{1,2},{3,4}};
        //Display
        System.out.println("Determinant -:" + determinant(mat));
        int[][] t = transpose(mat);
        System.out.println("Transpose:-");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(t[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
