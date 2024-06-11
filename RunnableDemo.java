?package com.tnsif.daythirteen.multithreading;
//Runnable Interface
//interface is blueprint of a class
//Interface cannot create object 
//Interface can have only abstract methods 
//implements keyword
class ThreadOne extends Thread {
public void run()
{
for (int i=0; i<5; i++) {
System.out.println("print thread one");
}
try {
Thread.sleep (500);
}
catch (Exception e)
{
}
}
class ThreadTwo extends Thread {
 public void run()
{
for (int i=0;i<5;i++) {
System.out.println("print thread two");
}
try {
Thread.sleep(1000);
}

catch (Exception e)
}
}
}
public class RunnableDemo {
public static void main(String[] args) {
ThreadOne objl = new ThreadOne(); 
ThreadTwo obj2 = new ThreadTwo();
objl.start(); obj2.start();
}
}