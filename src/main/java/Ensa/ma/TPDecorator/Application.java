package Ensa.ma.TPDecorator;

public class Application {
public static void main(String[] args) {

ComposantAbstrait composantAbstrait=new ComposantConcretImpl1();
composantAbstrait.operation();

System.out.println("Première décoration");

composantAbstrait=new DecorateurConcretImpl1(composantAbstrait);
composantAbstrait.operation();

System.out.println("Deuxième décoration");

composantAbstrait=new DecorateurConcretImpl2(composantAbstrait);
composantAbstrait.operation();
}}
