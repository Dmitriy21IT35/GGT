package com.company;

public class Main {

        static class Formula {
            public double N;

            public Formula(double N) {
                this.N = N;
            }

            public void displayformula() {
                double S=Math.pow(-1,N)*1/Math.pow(2,N);
                System.out.println(S);
                System.out.println(N);
            }
        }

        public static void main(String[] args) {
            Formula formula=new Formula(2);
            formula.displayformula();
            formula.N=3;
        }
    }
