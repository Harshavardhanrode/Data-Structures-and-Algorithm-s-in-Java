import java.util.Scanner;
public class Twod_Array {
    public static void main(String args[]){
        Scanner x =new Scanner(System.in);
        /*//declaration of 2d array
        int matrix[][] = new int[3][4];
        // row lngth and coloumn length 
        int n=matrix.length,m=matrix[0].length;
        // Take from user input
        for(int i=0;i<n;i++){
            System.out.print("Enter row elements one by one  "+ i + ":");
            for(int j=0;j<m;j++){
                matrix[i][j]= x.nextInt();
            }
            System.out.println("  ");
        }

        // displaying 2d array
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }*/


        //print matrix in spiral way
        int matrix1[][] = {
            {4,5,6},
            {0,1,3},
           
            {45,67,89}
        };
        printspirial(matrix1);
        System.out.println();


        //sum of diagonal elements method1
        System.out.println("sum of digonal is:" + sumdigonalmethod1(matrix1));
        //sum of diagonal elements method2
        System.out.println("sum of digonal is:" + sumdigonalmethod1(matrix1));


    }





    public static void printspirial(int matrix[][]){
        int startrow=0;
        int startcolomn =0;
        int endrow=matrix.length-1;
        int endcolomn=matrix[0].length-1;

        while(startrow<=endrow && startcolomn<=endcolomn){
            //for top display
            for(int i=startcolomn;i<=endcolomn;i++){
                System.out.print(matrix[startrow][i] +" ");
            }

            //for right display
            for(int  i=startrow+1;i<=endrow;i++){
                 System.out.print(matrix[i][endcolomn]+ " ");
            }

             //for bottom display
             for(int i=endcolomn-1;i>=startcolomn;i--){
                 System.out.print(matrix[endrow][i]+ " ");
             }

             //for left display
            for(int i=endrow-1;i>=startrow+1;i--){
                System.out.print(matrix[i][startcolomn]+ " ");
            }
            startcolomn++;
            startrow++;
            endrow--;
            endcolomn--;
        }
    }

    public static int sumdigonalmethod1(int matrix[][]){  //TC = o(n*2)
        int sum=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j)
                    sum += matrix[i][j];
            
                else if((i+j)==matrix.length-1)
                    sum+=matrix[i][j];
                }
        }
        return sum;
    }


    public static int sumdigonalmethod2(int matrix[][]){
        int sum =0;

        for(int i=0;i<matrix.length;i++){
            
            sum+=matrix[i][i];

            if(i != matrix.length-1-i)
                sum+=matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    

}
