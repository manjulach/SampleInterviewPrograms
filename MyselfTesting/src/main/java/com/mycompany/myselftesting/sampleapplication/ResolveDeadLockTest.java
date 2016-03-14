/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myselftesting.sampleapplication;

/**
 *
 * @author Sreeja
 */
public class ResolveDeadLockTest {
    public static void main(String args[]){ 
    ResolveDeadLockTest test = new ResolveDeadLockTest();
    
    final A a = test.new A();
    final B b = test.new B();
    
    //Thread-1
    Runnable block1 = new Runnable() {
        public void run() {
            synchronized(b) {
                try{
                    Thread.sleep(100);
                } catch( InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (a){
                    System.out.println("In block 1");
                }
            }
        }
    };
    
    //Thread-2
    Runnable block2 = new Runnable() {
        @Override
        public void run() {
            synchronized(b) {
                synchronized(a){
                    System.out.println("In block 2");
                }
            }
        }
    };
     
    new Thread(block1).start();
    new Thread(block2).start();
    }
    //Resource A
    private class A{
        private int i=10;
        public int getI() {
            return i;
        }
        public void setI(int i){
            this.i = i;
        }
    }
    //Resource B
    private class B{
        private int i = 20;
        public int getI(){
            return i;
        }
        public void setI(int i){
            this.i = i;
        }
    }
}
