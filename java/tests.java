import java.util.*;
public class tests {
    public static void main(String[] args){

        Scanner in= new Scanner(System.in);
        int num =0;
        
        
        
        System.out.println("please enter the number of words you'd like to enter:");
        num=in.nextInt();
        String[] words=new String[num];

        for (int i=0;i<num;i++){
            System.out.println("please enter the word");
            words[i] = in.next();
        }
       
        for (int i=0;i<words.length;i++){
           System.out.println(words[i]+" - "+ words[i].length());
        }
        System.out.println("the number of long words is "+ countLongWords(words));
        System.out.println("has a long word?"+hasLongWord(words));
        

    }
    public static int countLongWords(String[] word){
        int total=0;
      for (int i=0;i<word.length;i++){
           if (word[i].length() > 5){
                total++;
           }
           else{
            continue;
           }
      }
      return total;
    }
    public static boolean hasLongWord(String[] word){
        for (int i=0;i<word.length;i++){
            if (word[i].length()>5){
                return true;
                
            }
            
        }
        return false;

    }

}
