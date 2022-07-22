package functionalinterface;

//To ensure that it is a functional interface, use the annotation @FunctionalInterface

@FunctionalInterface
public interface Calculator {
       int add(int a,int b);
       //int subtract(int a,int b);
}
