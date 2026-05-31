// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class Main {

//     static Node reverse(Node head, int k) {

//         Node current = head;
//         Node prev = null;
//         Node next = null;

//         int count = 0;

        
//         while (current != null && count < k) {

//             next = current.next;
//             current.next = prev;
//             prev = current;
//             current = next;

//             count++;
//         }

       
//         if (next != null) {
//             head.next = reverse(next, k);
//         }

//         return prev;
//     }

//     static void printList(Node head) {

//         while (head != null) {
//             System.out.print(head.data + " ");
//             head = head.next;
//         }
//     }



       
//     public static void main(String[] args) {

//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = new Node(5);
//         head.next.next.next.next.next = new Node(6);
//         head.next.next.next.next.next.next = new Node(7);
//         head.next.next.next.next.next.next.next = new Node(8);

//         int k = 3;

//         head = reverse(head, k);

//         printList(head);
//     }
// }





// class Node {

//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//     }
// }

// public class Main {

//     static Node reverse(Node head) {

//         Node prev = null;
//         Node current = head;
//         Node next = null;

//         while (current != null) {

//             next = current.next;
//             current.next = prev;
//             prev = current;
//             current = next;
//         }

//         return prev;
//     }

   
//     static Node add(Node l1, Node l2) {

//         Node dummy = new Node(0);
//         Node temp = dummy;

//         int carry = 0;

//         while (l1 != null || l2 != null || carry != 0) {

//             int sum = carry;

//             if (l1 != null) {
//                 sum += l1.data;
//                 l1 = l1.next;
//             }
 
//             if (l2 != null) {
//                 sum += l2.data;
//                 l2 = l2.next;
//             }

//             carry = sum / 10;

//             temp.next = new Node(sum % 10);

//             temp = temp.next;
//         }

//         return dummy.next;
//     }

   
//     static void print(Node head) {

//         while (head != null) {

//             System.out.print(head.data + " ");

//             head = head.next;
//         }
//     }

//     public static void main(String[] args) {

//         Node l1 = new Node(2);
//         l1.next = new Node(4);
//         l1.next.next = new Node(6);

//         Node l2 = new Node(5);
//         l2.next = new Node(6);
//         l2.next.next = new Node(3);

//         l1 = reverse(l1);
//         l2 = reverse(l2);

      
//         Node result = add(l1, l2);

       
//         result = reverse(result);

//         print(result);
//     }
// }


// l1    l2       carry    sum   ans
// 2     5          0        7    7
  //  4      6        0        10    0
//    3      4       1         8     8
// class Node {

//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//     }
// }

// public class Main {

//     static Node add(Node l1, Node l2) {

//         Node dummy = new Node(0);

//         Node temp = dummy;

//         int carry = 0;

//         while (l1 != null || l2 != null) {

//             int sum = carry;

//             if (l1 != null) {
//                 sum = sum + l1.data;
//                 l1 = l1.next;
//             }

//             if (l2 != null) {
//                 sum = sum + l2.data;
//                 l2 = l2.next;
//             }

//             carry = sum / 10;

//             int digit = sum % 10;

//             temp.next = new Node(digit);

//             temp = temp.next;
//         }

//         if (carry > 0) {
//             temp.next = new Node(carry);
//         }

//         return dummy.next;
//     }

//     static void print(Node head) {

//         while (head != null) {

//             System.out.print(head.data + " ");

//             head = head.next;
//         }
//     }

//     public static void main(String[] args) {

//         Node l1 = new Node(2);
//         l1.next = new Node(4);
//         l1.next.next = new Node(3);

//         Node l2 = new Node(5);
//         l2.next = new Node(6);
//         l2.next.next = new Node(4);

//         Node result = add(l1, l2);

//         print(result);
//     }
// }


  

// l1= 132456
// k=3
//  do part may  divide kerna hai
// 3 samalsest
// and 3 garater
 



// import java.util.*;

// class Node {           

//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//     }
// }

// public class Main {

//     static void print(Node head) {

//         while (head != null) {

//             System.out.print(head.data + " ");

//             head = head.next;
//         }

//         System.out.println();
//     }

//     public static void main(String[] args) {

//         int arr[] = {1,3,2,4,5,6};

//         Arrays.sort(arr);

//         Node smallHead = null, smallTail = null;
//         Node greatHead = null, greatTail = null;

//         int k = 3;

//         // Smallest k
//         for (int i = 0; i < k; i++) {

//             Node temp = new Node(arr[i]);

//             if (smallHead == null) {
//                 smallHead = smallTail = temp;
//             } else {
//                 smallTail.next = temp;
//                 smallTail = temp;
//             }
//         }

//         // Greater elements
//         for (int i = k; i < arr.length; i++) {

//             Node temp = new Node(arr[i]);

//             if (greatHead == null) {
//                 greatHead = greatTail = temp;
//             } else {
//                 greatTail.next = temp;
//                 greatTail = temp;
//             }
//         }

//         System.out.println("Smallest Part:");
//         print(smallHead);

//         System.out.println("Greater Part:");
//         print(greatHead);
//     }
// }



 