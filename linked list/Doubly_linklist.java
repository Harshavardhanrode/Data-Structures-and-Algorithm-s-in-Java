/**
 * Doubly_linklist
 */
public class Doubly_linklist {

    public static class node{
        node prev;
        int data;
        node next;

       public node(int data){
            this.data = data;
            prev = null;
            next =null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;


    public void addnodeFirst(int data){
        node newnode = new node(data);
        size++;
        if(head==null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head= newnode;
    }
    public void addnodetolast(int data){
        node newnode = new node(data);
        size++;
        if(head==null){
            head=tail=null;
            return;
        }
        newnode.prev=tail;
        tail.next = newnode;
        tail= newnode;
    }

    public int removefirst(){
        if(head == null){
            System.out.println("Dlinklist is empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }

        int val = head.data;
        head= head.next;
        head.prev = null;
        size--;
        return val;

    }

    public int removelast(){
        if(head == null){
            System.out.println("Dlinklist is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }

        int val = tail.data;
        tail= tail.prev;
        tail.next = null;
        size--;
        return val;

    }
    
    public void reverselinklist(){
        node current= head;
        node prevoius = null;
        node nextpart;
        while (current != null) {
            nextpart = current.next;
            current.next = prevoius;
            current.prev = nextpart;
            
            prevoius = current;
            current = nextpart;   
        }
        head=prevoius;

    }
    public void printDlinklist(){
        node temp = head;

        while (temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;    
        }
        System.out.println("null");
        System.out.println("size is :"+ size);
    }
    public static void main(String args[]){
        Doubly_linklist d1 = new Doubly_linklist();
        d1.addnodeFirst(1);
        d1.addnodeFirst(2);
        d1.addnodetolast(3);
        d1.addnodetolast(5);
        d1.printDlinklist();
        System.out.println("element removed : "+ d1.removelast());
        d1.printDlinklist();
        System.out.println("element removed : "+ d1.removelast());

        // d1.head = new node(1); 
        // node second = new node(2);
        // node third = new node(3);

        // head.next = second;
        // second.next= third;
        // second.prev = head;
        // third.prev = second;


        d1.printDlinklist();
        d1.reverselinklist();
        d1.printDlinklist();

    }
}