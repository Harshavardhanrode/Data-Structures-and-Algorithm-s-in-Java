import java.util.*;

public class Array{
    public static void main(String[]args){
       int marks[] = new int[10];
       int num[] = {1,3,4}; 
       int num1[]= {1,4,5,80,9,70,5,4,1000,87,547,2,19}; 
       int num2[]= {2,4,7,9,500,1000,4000};
       int num3[]= {6,9,7,3,16,100};
       int num4[]= {4,8,5,2,3};



       updatearray(num) ;
       for(int i=0;i<num.length;i++)
            System.out.println(num[i]);

        //linear search
        int index = linearsearch(num1,15);
        if(index==-1)
            System.out.println("not found");
        else
            System.out.println("found at index :"+ index); 

        // largest number  and smallest number  
        System.out.println("smallest value of array is:"+ smallest(num1));
        System.out.println("largest value of array is:"+ largest(num1));

        //binary search
        
        System.out.println("key is at index :"+ binaryserach(num2, 1000));
        System.out.println("key is at index :"+ binaryserach(num2, 9));


        //reverse of array
        reversearray(num3);
        for(int i=0;i<num3.length;i++){
            System.out.print(num3[i]+ " ,");
        }

        //pairs in array
        System.out.println("pairs in array are:");
        pairs(num4);


        //print all subarrays

        System.out.println("all possible are:");
        subarrays(num4);

            
            




    }



    public static void updatearray(int marks[]){
        for(int i=0;i<marks.length;i++)
            marks[i] +=1;   
    }


    public static int linearsearch(int array[], int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key)
                return i;
          
        }
        return -1; 
    }



    public static int largest(int arr[]){
        int large = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>large)
                large = arr[i];    
        }
        return large;
    }
    public static int smallest(int arr[]){
        int small = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<small)
                small = arr[i];    
        }
        return small;
    }



    public static int binaryserach(int arr[],int key){
        int start = 0, end = arr.length-1;
        while (start<=end) {
            int mid = (start+end)/2;

            if(arr[mid]==key)
                return mid;   
            else if(key>arr[mid])
                start =mid+1; 
            else
                end = mid-1;  

        }
        return -1;
         

    }


    public static void reversearray(int arr[]){
       int first = 0,last= arr.length-1;
        while(first< last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;

        }
    }

    public static void pairs(int arr[]){
        int beginner = 0;
        while(beginner<=arr.length){
            for(int i=beginner+1;i<arr.length;i++){
                System.out.print("("+arr[beginner]+","+arr[i]+")");
            }
            System.out.println();
            beginner++;
        }
        
    }
    

    public static void subarrays(int arr[]){
        int beginning = 0;//j=end
        
        int count=0;
        for(int i=beginning;i<arr.length;i++){
            for(int j=beginning+1;j<arr.length;j++){
                System.out.print("(");
                int sum=0;
                for(int x=i;x<j;x++){
                    
                    System.out.print(arr[x]+",");
                    sum = sum+arr[x];
                    
                }
                if(sum>=8){
                    count++;
                }
                System.out.print(")");
            }
            System.out.println();
        }
        System.out.println(count);
    
}
}