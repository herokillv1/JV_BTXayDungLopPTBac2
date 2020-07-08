public class QuadraticEquation {
    double a, b, c;
    double delta;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        this.delta = Math.pow(b,2) - 4*a*c;
        return this.delta;
    }

    public double getRoot1(){
       return (-b+Math.pow(delta,0.5))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.pow(delta,0.5))/(2*a);
    }

}
