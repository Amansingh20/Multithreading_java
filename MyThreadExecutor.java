package com.tnsif.daythirteen.multithreading;
public class MyThreadExecutor {
public static void main(String[] args) {
MyThread Al = new MyThread();
System.out.println("Before runnable stage Thread is alive or not? "+ Al.isAlive ());
Al.start();
try {

Thread.sleep(4000);
}

catch (Exception e) {
System.out.println("Thread is Interrupted");
}
System.out.println("After Complete execution of Thread, is alive or not? "+ Al.isAlive ());
 }
