package dataStructures;
import java.util.*;

public class CeasarsCypher {
    public static char[] encoder = new char[26];
    public static char[] decoder = new char[26];

    public static void CeasarsCyper1(int rotation) {
        for (int i = 0; i < 26; i++) {
            encoder[i] = (char) ('A' + (i + rotation) % 26);
            decoder[i] = (char) ('A' + (i - rotation + 26) % 26);
        }
    }

    public static void transform(String msg, char[] code) {
        char[] message = msg.toCharArray();
        for (int i = 0; i < msg.length(); i++) {
            if (Character.isUpperCase(message[i])) {
                int j = message[i] - 'A';
                message[i] = code[j];
            }
        }
        System.out.println(message);
    }

    // public static String encoderF(String message){
    // String s=transform(message,encoder);
    // return s;
    // }
    // public static String decoderF(String message){
    // return transform(message,decoder);
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the message");
        String message=sc.nextLine();
        System.out.println("opion 1.encrypt\noption 2.decrypt");
        int op=sc.nextInt();
        System.out.println("enter the key/no of shift");
        int shift=sc.nextInt();
        CeasarsCyper1(shift);
        switch(op){
            case 1:
                System.out.println("the message when encoded:");
                transform(message,encoder);
                break;
            case 2:
                System.out.println("the message when decoded:");
                transform(message,decoder);
                break;
            
        }
    }
}
