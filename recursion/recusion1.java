// public class recursion1 {
//     public static void  printRev( String str, int idx){
//         if(idx==0){
//             System.out.println(str.charAt(idx));
//             return;
//         }
//         System.out.println(str.charAt(idx));
//         printRev(str, idx-1);

//     }

//     public static void main(String[] args) {
//         String str="abcd";
//         printRev(str, str.length()-1);
//     }
// }


public class recusion1{
    public static int  first=-1;
    public static int  last=-1 ;


    public static void findOccurance(String str, int idx, char element) {

        char curr= str.charAt(element);
        if(  curr   ==element){
            if(first==-1){
                first =idx;

            }else{
                last =idx;
            }
        }

        findOccurance(str, idx+1,element);
        
    }
    public static void main(String[] args) {
        String str="abaacdaefaah";
        findOccurance(str,0,'a');
    }

}




