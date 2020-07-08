import java.util.Scanner;

public class BTXayDungLopPTBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a : ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b : ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c : ");
        double c = scanner.nextDouble();
        System.out.println();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("Delta của PT là : "+quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant()>=0){
            System.out.println();
            System.out.println("Hai ngiệm của PT là : ");
            System.out.println();
            System.out.println("Nghiệm 1 : "+quadraticEquation.getRoot1());
            System.out.println();
            System.out.println("Nghiệm 2 : "+quadraticEquation.getRoot2());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
