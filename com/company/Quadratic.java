package com.company;

public class Quadratic {
int a,b,c;
float d;

    public Quadratic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void resultX(){
        if (a==0){
            if (b==0){
                System.out.println("Рівняння немає розвязку");
            }else {
                System.out.println("квадратний корінь з X = " + (c/b));
            }
        } else {
            d = b*b-4*a*c;
            if (d==0){
                System.out.println("Квадратний корінь Х = " + b/(2*a));
            } else {
                if (d>0){
                    System.out.println("Квадратний корінь Х1 = " + (-b+Math.pow(d,0.5))/(2*a));
                    System.out.println("Квадратний корінь Х2 = " + (-b+1/Math.sqrt(d))/(2*a));
                } else {
                    System.out.println("Рівняння немає розвязку");
                }
            }
        }

    }
}
