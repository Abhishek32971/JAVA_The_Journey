import java.util.*;
public class countVowals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s1= sc.nextLine();
        s1=s1.toLowerCase();
        int vcount=0,cCount=0;
        for(char c:s1.toCharArray()){
            if (c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
                vcount++;
            }
            else if(c!=' '){
                cCount++;
            }
        }
        System.out.printf("The Vowal count in the string :%d\n",vcount);
        System.out.printf("The consonant count in the string :%d\n",cCount);
    }
}
