import java.time.temporal.Temporal;
import java.util.*;
class Polynomial{
    class Node{
        int cofcnt;
        int pwr;
        Node next;
        Node(int cofcnt, int pwr){
            this.cofcnt = cofcnt;
            this.pwr = pwr;
            this.next = null;
        }
    }
    Node head;
    Polynomial(){
        head = null;
    }

    Scanner sc = new Scanner(System.in);
    public void initPolynomial(int len){
        for(int i=0; i<len; i++){
            System.out.println("enter the coeff followed by power");
            int coff=sc.nextInt();
            int power=sc.nextInt();
            Node newNode = new Node(coff,power);
            if(head == null) head = newNode;
            else{
                Node currNode = head;
                while(currNode.next != null){
                    currNode = currNode.next;
                }
                currNode.next = newNode;
            }
        }
    }

    private void pushToPoly(int coeff, int pow){
        Node newNode = new Node(coeff, pow);
        if(head == null) head = newNode;
        else{
            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }


    public Polynomial addPoly(Polynomial poly2){
        Polynomial result=new Polynomial();
        for(Node tempOf1=head;tempOf1!=null;tempOf1=tempOf1.next){
            boolean foundMatch=false;
            for(Node TempOf2=poly2.head;TempOf2!=null;TempOf2=TempOf2.next){
                if(TempOf2.pwr==tempOf1.pwr){
                    int resultPwr=TempOf2.pwr;
                    int resultCoeff=TempOf2.cofcnt+tempOf1.cofcnt;
                    result.pushToPoly(resultCoeff, resultPwr);
                    foundMatch=true;
                    break;
                }
            }
            if(foundMatch==false){
                result.pushToPoly(tempOf1.cofcnt,tempOf1.pwr);
            }
        }
        return result;
    }


    public int HighestPwr(){
        int highest=head.pwr;
        for(Node temp=head;temp!=null;temp=temp.next){
            if(highest<temp.pwr){
                highest=temp.pwr;
            }
        }
        return highest;
    }

    public Polynomial fixPolynomial(){
        Polynomial fixed=new Polynomial();
        int HigstPwr=HighestPwr();
        for(int i=HighestPwr();i>=0;i--){
            int sumOfCoeff=0;
            for(Node temp=head;temp!=null;temp=temp.next){
                if(temp.pwr==i){
                    sumOfCoeff+=temp.cofcnt;
                }
            }
            fixed.pushToPoly(sumOfCoeff,i);
        }
        return fixed;

    }
        
    public char findHistDeg(Polynomial p1,Polynomial p2){
        int p1deg=p1.HighestPwr();
        int p2deg=p2.HighestPwr();
        if (p1deg>p2deg){
            return '1';
        }
        return '2';
    }
    
    public void printPoly(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.cofcnt + "x" + "^" + currNode.pwr);
            currNode = currNode.next;
            if(currNode != null) System.out.print(" + ");
        }
        System.out.println();
    }
    
}


public class ass1q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Polynomial poly1 = new Polynomial();
        Polynomial poly2 = new Polynomial();
        System.out.println("1st Polynomial");
        System.out.println("Enter the length of 1st polynomial: ");
        int length1 = sc.nextInt();
        poly1.initPolynomial(length1);
        System.out.println("2nd Polynomial");
        System.out.println("Enter the length of 2nd polynomial: ");
        int length2 = sc.nextInt();
        poly2.initPolynomial(length2);
        poly1.printPoly();
        poly2.printPoly();
        Polynomial poly1New=poly1.fixPolynomial();
        Polynomial poly2New=poly2.fixPolynomial();

        
        Polynomial result;

        if (poly1.findHistDeg(poly1New,poly2New)=='1'){
        result=poly1New.addPoly(poly2New);
        }
        else{
            result=poly2New.addPoly(poly1New);
        }
        result.printPoly();
        sc.close();
    }
}
