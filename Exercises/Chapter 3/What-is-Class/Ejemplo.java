public class Ejemplo { // Only one class can have the public modifier, usually our main class
    public static void main(String[] args) { // We add the main method and also arguments
        MyClass object = new MyClass(); // We create an instance of MyClass
        object.greet(); // Invoke the greet method
    }
}

class MyClass { // Creating a class (MyClass)
    public void greet() { // This method is public and doesn't return a value
        System.out.println("I am the best Java programmer"); // Prints "I am the best Java programmer" to the console
    }
}