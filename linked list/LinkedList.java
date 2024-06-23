public class LinkedList {
    public static node head;
    public static node tail;
    public static int size;

    public static class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }

    }

    // adding node at first position
    public void addnodetofirst(int data){
        node newnode  = new node(data);
        size++;
        if(head==null){
            head = tail=newnode;
            return ;
        }
        newnode.next = head;
        head = newnode;
    }

    // adding node at middle position
    public void addnodeAtmiddle(int index,int data){

        if(index==0)
        {
            addnodetofirst(data);
            return;
        }
        else if(index==size){
            addnodetofirst(data);
            return;

        }
        else if(index>size){
            System.out.println("worng index entered");
            return;
        }
        node newnode = new node(data);
        size++;
        node temp = head;
        int i=0;
        while (i< index-1){
            temp = temp.next;
            i++;
        } 

        newnode.next = temp.next;
        temp.next = newnode;

    }

    // adding node at last position
    public void addnodetolast(int data){
        node newnode  = new node(data);
        size++;
        if(head==null){
            head = tail=newnode;
            return ;
        }
        tail.next = newnode;
        tail = newnode;
    }

    // delete the node from first position
    public int deletefromFirst(){

        if(size==0){
            System.out.println("linklist is empty");
            return Integer.MAX_VALUE;
        }else if(head == tail){
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;

    }
    //delete the node from last position 
    public int deletefromlast(){

        if(size==0){
            System.out.println("linklist is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }

       
        int value  = tail.data;
        node prev = head;
        int i=0;
        while (i<size-2){
            prev = prev.next;
            i++;
        }
        prev.next = null;
        tail = prev;
        size--;
        return value;

    }

    //to delete nth node from last
    public void deleteNth_nodeFromLast(int n){
        int i=1;
        if(size==n){
            head = head.next;
            return;
        }

        node prev = head;
        while(i<size-n){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

        // for searching a key t return its index
    public int SearchKey(int key){

        node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data== key)
                return i;
            else
                temp = temp.next;
                i++;    
        }
        return -1;
    }


    // to revese the given linklist
    public void reverselinklist(){
        node prev = null;
        node current  = tail = head;
        node Next ;

        while (current != null) {
            Next = current.next ;
            current.next = prev;
            prev = current;
            current = Next;  
        }
        head = prev;
    } 

    // to check if their loop exist in linklist
    public  boolean Isloopexist(){
        node Single = head;
        node Double = head;

        while (Single != null && Double != null ){
            Single = Single.next;
            Double = Double.next.next;
            if(Single == Double)
                return true;    
        }
        return false;
    }
    public node middleoflist(){
        node slow =head;
        node fast =head;

        while(fast !=  null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

   
    public void printlinklist(){
        node temp = head;
        while(temp !=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            
        }
        System.out.println("null");
        System.out.println("size of linklist is "+ size);
    } 
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

         l1.addnodetofirst(4);
         l1.deletefromlast();
         l1.addnodetolast(4);
         l1.addnodetolast(5);
         l1.addnodetolast(6);
         l1.addnodetolast(7);
         l1.printlinklist(); 
         
        int key = 17;
        if(l1.SearchKey(key)== -1)
            System.out.println("key doesn't exist");
        else    
            System.out.println("position of key is :" + l1.SearchKey(key));

        l1.reverselinklist();
        l1.printlinklist(); 
        System.out.println("is :"+ l1.middleoflist().data);   
        // System.out.println(l1.deletefromFirst()+"is removed from first");
        // l1.printlinklist();  
        // System.out.println(l1.deletefromlast()+ " is removed from last");
        // l1.printlinklist();
        // System.out.println(l1.deletefromlast()+ " is removed from last");
        


        
        
    }
    
}
