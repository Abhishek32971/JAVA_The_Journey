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
        int[] arrCoef = new int[len];
        int[] arrPow = new int[len];
        System.out.println("Enter the coefficient of the polynomial one by one: ");
        for(int i=0; i<len; i++){
            arrCoef[i] = sc.nextInt();
        }
        
        System.out.println("Enter the powers of variables one by one");
        for(int i=0; i<len; i++){
            arrPow[i] = sc.nextInt();
        }
        for(int i=0; i<len; i++){
            Node newNode = new Node(arrCoef[i], arrPow[i]);
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

    private void pushToPoly(int cofcnt, int pwr){
        Node newNode = new Node(cofcnt, pwr);
        if(head == null) head = newNode;
        else{
            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }

    public void addPoly(Polynomial poly){
        Node poly2 = poly.head;
        Node poly1 = head;
        Polynomial resultPoly = new Polynomial();
        while((poly1 != null) || (poly2 != null)){
            if(poly1.pwr > poly2.pwr){
                resultPoly.pushToPoly(poly1.cofcnt, poly1.pwr);
                poly1 = poly1.next;
            }
            else if(poly2.pwr > poly1.pwr){
                resultPoly.pushToPoly(poly2.cofcnt, poly2.pwr);
                poly2 = poly2.next;
            }
            else if(poly1.pwr ==  poly2.pwr){
                resultPoly.pushToPoly(poly1.cofcnt + poly2.cofcnt, poly1.pwr);
                poly1 = poly1.next;
                poly2 = poly2.next;
            }
        }
        System.out.println("Resultant Polynomial");
        resultPoly.printPoly();
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
        System.out.println("Enter the degree of 1st polynomial: ");
        int length1 = sc.nextInt();
        poly1.initPolynomial(length1);
        System.out.println("2nd Polynomial");
        System.out.println("Enter the degree of 2nd polynomial: ");
        int length2 = sc.nextInt();
        poly2.initPolynomial(length2);
        poly1.printPoly();
        poly2.printPoly();
        poly1.addPoly(poly2);
        sc.close();
    }
}
