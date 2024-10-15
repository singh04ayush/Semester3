import java.util.Scanner;
class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); //sc obj of Scanner class
        System.out.print("Enter size of First matrix: ");
        int row1 = sc.nextInt(); //first matrix sizes
        int col1 = sc.nextInt();
        System.out.print("Enter size of Second Matrix: ");
        int row2 = sc.nextInt(); //second matrix sizes
        int col2 = sc.nextInt();
        if(col1!=row2){ //condition check for muliplication
            System.out.println("Multiplcation Not Possible");
            sc.close();
            return; //if failed return
        }
        int[][] M1 = new int[row1][col1]; //1st matrix decleartion in form of array
        System.out.println("Enter First Matrix");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                M1[i][j]=sc.nextInt(); //scanning each element of 1st matrix
            }
        }
        int[][] M2 = new int[row2][col2]; //2nd matrix declaration
        System.out.println("Enter Second Matrix");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                M2[i][j]=sc.nextInt(); //scanning elements of 2nd matrix
            }
        }
        
        int result[][]= new int[row1][col2]; //result matrix for storing the result
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                result[i][j]=0;
                for(int z=0;z<col2;z++){
                    result[i][j]+=M1[i][z]*M2[z][j]; //respective cal for each element & storing
                }
            }
        }
        System.out.println("Resultant matrix is");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(result[i][j]+" ");//printing result matrix
            }
            System.out.println(); //for formatting
        }
        sc.close(); //sc obj stream closed
        
    }
}
