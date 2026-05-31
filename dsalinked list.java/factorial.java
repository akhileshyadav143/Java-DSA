// // class Node {
// //     int data;
// //     Node next;

// //     Node(int data) {
// //         this.data = data;
// //         this.next = null;
// //     }
// // }

// // public class LinkedListDemo {

// //     Node head;

// //     // Insert at end
// //     void insert(int data) {
// //         Node newNode = new Node(data);

// //         if (head == null) {
// //             head = newNode;
// //             return;
// //         }

// //         Node temp = head;

// //         while (temp.next != null) {
// //             temp = temp.next;
// //         }

// //         temp.next = newNode;
// //     }

// //     // Display list
// //     void display() {
// //         Node temp = head;

// //         while (temp != null) {
// //             System.out.print(temp.data + " -> ");
// //             temp = temp.next;
// //         }

// //         System.out.println("null");
// //     }

// //     public static void main(String[] args) {

// //         LinkedListDemo list = new LinkedListDemo();

// //         list.insert(10);
// //         list.insert(20);
// //         list.insert(30);

// //         list.display();
// //     }
// // }




//  class Node {
//      int data;
//     Node next;
//    Node(int data) {
//         this.data = data;
//          this.next = null;
//      }
// }
//  public class LinkedListSearch {
//     Node head;

//     void insert(int data) {
//         Node newNode = new Node(data);

//         if(head == null) {
//              head = newNode;
//              return;
//        }

//         Node temp = head;
//          while(temp.next != null) {
//              temp = temp.next;
//          }
//          temp.next = newNode;
//      }
//      void search(int value) {
//         Node temp = head;

//         while(temp != null) {
//              if(temp.data == value) {
//                  System.out.println("Value Found");
//                  return;
//              }
//              temp = temp.next;
// }
//          System.out.println("Value Not Found");
//     }

//     //for nth term 


//      public static void main(String[] args) {
//          LinkedListSearch list = new LinkedListSearch();

//          list.insert(10);
//          list.insert(20);
//          list.insert(30);
//          list.insert(40);

//          list.search(30);
//    list .head .next . next . next =list .head.next
// ;
// if(list.()){
//     System.out.println("loop deteced")

// }else{
//     System.out.println("loop noit detected")
// }

//      }
//  }


  
class factorial{
    public static void main(String[] args) {
        int n=2,fac=1;
        
        fac=fac*n;
        System.out.println(fac);
    }
}
