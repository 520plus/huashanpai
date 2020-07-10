package com.example.springsecurity.pojo;

import java.util.Scanner;

public class test {


        public static int C;
        public static void  mgs(int A,int B){
            if(C<A){
                C=A;
                if(C<B){
                    C=B;
                }
            }
            if(C%A==0&&C%B==0){
                return ;
            }
            else{
                C++;
                mgs(A,B);

            }
        }
        public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            int  A=s.nextInt();
            int  B=s.nextInt();
            mgs(A,B);
            System.out.println("A和B的最小公倍数是："+C);
        }

}
