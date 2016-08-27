package com.edu.misc;

public class AnonymousExample {

    interface HelloWorld {
        void greet();

        void greetSomeone(String someone);
    }

    public void sayHello() {

        class EnglishGreeting implements HelloWorld {

            String name = "world";

            @Override
            public void greet() {
                System.out.println("word");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        class FrenchGreeting implements HelloWorld {

            String name = "mundo";

            @Override
            public void greet() {
                System.out.println("mundo");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();
        HelloWorld frenchGreeting = new FrenchGreeting();

        englishGreeting.greet();
        englishGreeting.greetSomeone("Ted");
        frenchGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
    }

    public static void main(String[] args) {
        AnonymousExample myApp = new AnonymousExample();
        myApp.sayHello();
    }
}
