package com.driver;

public class Main {
    static class Product{
        public int product(int x, int y) {
            return  x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p= new Product();
        int prod=p.product(1,2, 3);
        System.out.println(prod);
    }
}

