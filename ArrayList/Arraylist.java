import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(20);
        list1.add(15);
        list1.add(-1);
        System.out.println(list1);

        System.out.println("Reversed arrayList is:");
        for(int i=list1.size()-1;i>=0;i--){
            System.out.print(list1.get(i)+" ");
        }

        int largest = Integer.MIN_VALUE;
        for(int i=0;i<list1.size();i++){
            largest = Integer.max(largest,list1.get(i));
            
        }
        System.out.println("largest value of arrayList is:"+ largest);
        

        // swapping function 
        swap(list1, 1, 4);
        System.out.println("new array is "+ list1);


        // sort the arraylist
        System.out.print("sorted arraylist is :");
        Collections.sort(list1);
        System.out.println(list1);

        System.out.println("sorted in desending order:");
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);

        // multidimentional arraylist
        ArrayList<ArrayList<Integer>> mainlist= new ArrayList<>();
        ArrayList<Integer>l1 =new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        ArrayList<Integer>l2 =new ArrayList<>();
        l2.add(2);
        l2.add(4);
        l2.add(6);
        ArrayList<Integer>l3 =new ArrayList<>();
        l3.add(3);
        l3.add(6);
        l3.add(9);

        mainlist.add(l1);
        mainlist.add(l2);
        mainlist.add(l3);

        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer>currentlist = mainlist.get(i);
            for(int j =0;j<currentlist.size();j++){
                System.out.print(currentlist.get(j));
            }
            System.out.println();
        }

        System.out.println(mainlist);



        // maximum water problem
        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(6);
        list2.add(0);
        list2.add(8);
        list2.add(1);
        list2.add(2);
        list2.add(10);
        System.out.println(list2);
        System.out.println("max water in above list is :"+ maxwater(list2));


        //pairsum problem1
        // array must be sorted
        ArrayList<Integer>list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(8);
        list3.add(10);
        list3.add(12);
        list3.add(100);
        int sum = 112; 
        System.out.println(sum+ " sum is present or not : "+ pairsum1(list3, sum));

        // pairsum problem2
        // array must be sorted and rotated
        ArrayList<Integer>list4 = new ArrayList<>();
        list4.add(14);
        list4.add(15);
        list4.add(6);
        list4.add(8);
        list4.add(12);
        list4.add(13);
        int sum1 = 29; 
        System.out.println(sum1+ " sum is present or not : "+ pairsum2(list4, sum1));

        




    }
    public static boolean pairsum1(ArrayList<Integer>list,int sum){
        int start = 0;
        int end = list.size()-1;
        while(start!= end){
            if(list.get(start)+list.get(end) == sum)
                return true;
            else if(list.get(start)+list.get(end) < sum) 
                start++; 
            else  
                end--;  

        }
        return false;
    }
    public static boolean pairsum2(ArrayList<Integer>list,int sum1){
        int breakingpoint = -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                breakingpoint ++;
                break;
            }
        }

        int n = list.size();

        
        int start = breakingpoint+1;
        int end = breakingpoint;
        while(start!= end){
            if(list.get(start)+list.get(end) == sum1)
                return true;
            else if(list.get(start)+list.get(end) < sum1) 
                start = (start+1)%n; 
            else  
                end = (n+end-1)%n;  

        }
        return false;
    }
    public static int maxwater(ArrayList<Integer>list){
        int maxwater = 0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int height = Integer.min(list.get(i), list.get(j));
                int width = j-i;
                int currentwater = height*width;

                 maxwater = Integer.max(maxwater, currentwater);
            }
        }
        return maxwater;
    }
    public static void swap(ArrayList<Integer>list,int x,int y){
        int temp = list.get(x);
        list.set(x, list.get(y));
        list.set(y, temp);
    }
    
}
