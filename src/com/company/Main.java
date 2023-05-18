package com.company;

public class Main {

    public static void main(String[] args) {
	sayHello("Sanja");
	sayGoodbye("Marko");
    }

    public static void  sayHello(String name){
        System.out.println("Hello " +name);
    }
    public static void sayGoodbye(String name){
        //TODO:Add support for multiple users
        System.out.println("Good bye " +name);
    }
    private int age = 7;

    public Main(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
// komentar edna linija
    /*
    komentar
    poveke
    linii
     */

}
