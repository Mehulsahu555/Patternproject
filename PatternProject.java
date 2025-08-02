import java.util.regex.Pattern;

import javax.swing.*;
public class PatternProject
{
    void SquarePattern()
    {
        System.out.println("---------- Square Pattern ---------\n");
        int i, j;
        for ( i = 1 ; i <= 5 ; i++){
            for ( j = 1 ; j <= 5 ; j++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }
    void triangle()
    {
              System.out.println("---------- Triangle Pattern ---------\n");
               int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
        }
     void HollowSquarePattern() {
        System.out.println("---------- Hollow Square Pattern ---------\n");
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
 void InvertedTrianglePattern() {
        System.out.println("---------- Inverted Triangle Pattern ---------\n");
        int i, j;
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
void XPattern(){
    System.out.println("---------- X Pattern ---------\n");
    int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
}
void MPattern(){
     System.out.println("---------- M Pattern ---------\n");
     int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || (i == j && i <= n / 2) || (i + j == n - 1 && i <= n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
}
void PyramidPattern(){
     System.out.println("---------- Pyramid Pattern ---------\n");
     int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
}
void  InvertedPyramidPattern(){
     System.out.println("---------- Inverted Pyramid Pattern ---------\n");
     int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
}
void ZeroPattern(){
    System.out.println("---------- Zero Pattern ---------\n");
    int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
} 
void InfinityPattern(){
    System.out.println("---------- Infinity Pattern ---------\n");
    int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == n / 2 && j < n / 2) || (j == n / 2 && i > n / 2) || (i == n / 2 && j > n / 2) || (j == n / 2 && i < n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
}
void PlusPattern(){
     System.out.println("---------- Plus Pattern ---------\n");
     int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2 || j == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
}
void KPattern(){
    System.out.println("---------- K Pattern ---------\n");
    int n = 5 , s = n / 2;
    for (int i = 1 ; i <= 5 ; i++){
        System.out.println("* " + " ".repeat(s) + "*");
        s = (i < (n/2+1)) ? --s : ++s;
    }
}
void AlphabetPattern(){
    System.out.println("---------- Alphabet Pattern ---------\n");
     int n = 5;
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
}
void NumberPattern(){
    System.out.println("---------- Number Pattern ---------\n");
     int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
}
void  PyramidPatternwithNumbers(){
    System.out.println("---------- Pyramid Pattern with Number ---------\\n");
    int n = 5;
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(num + "   ");
                num++;
            }
            System.out.println();
        }
}

    static void MainModule()
    {
        System.out.println("Pattern Generator");
        System.out.print("1. Square Pattern\t2. L Shape Pattern\n3.trienglr \t4.HollowSquare \n5. InvertTrianglePattern \t6. X Pattern \n7. M Pattern \t8. Pyramid Pattern \n9. Inverted Pyramid Pattern \t10. Zero Pattern \n11. Infinity Pattern \t12. Plus Pattern \n13. K Pattern \t14. Alphabet Pattern \n15 Number Pattern \t16. Pyramid Pattern with Number");
        String c;
        System.out.println("Choose any one of them....");
        c = JOptionPane.showInputDialog("Enter Your Choice --- ");
        PatternProject p = new PatternProject();
        if (c.equals("1")){
            p.SquarePattern();
        }
        else if (c.equals("2")){
            p.SquarePattern();
        }
        else if (c.equals("3")){
            p.triangle();
        }
         else if (c.equals("4")){
            p.HollowSquarePattern();
        }
         else if (c.equals("5")){
            p.InvertedTrianglePattern();
        }
         else if (c.equals("6")){
            p.XPattern();
        }
         else if (c.equals("7")){
            p.MPattern();
        }
        else if (c.equals("8")){
            p.PyramidPattern();
        }
        else if (c.equals("9")){
            p.InvertedPyramidPattern();
        }
        else if (c.equals("10")){
            p.ZeroPattern();
        }
        else if (c.equals("11")){
            p.InfinityPattern();
        }
        else if (c.equals("12")){
            p.PlusPattern();
        }
        else if (c.equals("13")){
            p.KPattern();
        }
        else if (c.equals("14")){
            p.AlphabetPattern();
        }
        else if (c.equals("15")){
            p.NumberPattern();
        }
        else if (c.equals("16")){
            p.PyramidPatternwithNumbers();
        }
        System.out.println("\nDo you want to continue.. Press 1 else any key");
        c = JOptionPane.showInputDialog("Enter Your Choice --- ");
        if (c.equals("1")){
            MainModule();
        }
    }
    public static void main(String args[]){
        MainModule();
    }
}