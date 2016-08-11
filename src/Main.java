/**
 * Created by win808mac on 8/10/16.
 */
public class Main {

    public static void main(String [] args) {

        Kata kata = new Kata();

        //explode()
        System.out.println("kata.explode(Example)-> " + kata.explode("example"));
        System.out.println("kata.explode(Example)-> " + ("cat"));
        System.out.println("kata.explode(Example)-> " + ("monkey"));
        System.out.println("kata.explode(Example)-> " + ("c"));
        System.out.println("kata.explode(Example)-> " + (""));
        System.out.println("kata.explode(Example)-> " + ("seahorse"));
        System.out.println("kata.explode(Example)-> " + ("wide"));

        //notString examples
        System.out.println();
        System.out.println("kata.notString(Example)-> " + kata.notString("candy"));
        System.out.println("kata.notString(Example)-> " + kata.notString("x"));
        System.out.println("kata.notString(Example)-> " + kata.notString("not bad"));
        System.out.println("kata.notString(Example)-> " + kata.notString("silly"));
        System.out.println("kata.notString(Example)-> " + kata.notString("not silly"));
        System.out.println("kata.notString(Example)-> " + kata.notString("north"));

        //missingChar examples
        System.out.println();
        System.out.println("kata.missingChar(Example)-> " + kata.missingChar("kitten", 1));
        System.out.println("kata.missingChar(Example)-> " + kata.missingChar("kitten", 0));
        System.out.println("kata.missingChar(Example)-> " + kata.missingChar("kitten", 4));
        System.out.println("kata.missingChar(Example)-> " + kata.missingChar("distill", 3));
        System.out.println("kata.missingChar(Example)-> " + kata.missingChar("distill", 1));
        System.out.println("kata.missingChar(Example)-> " + kata.missingChar("kettle", 2));
        System.out.println("kata.missingChar(Example)-> " + kata.missingChar("kettle", 4));

        //frontBack examples
        System.out.println();
        System.out.println("kata.frontBack(Example)-> " + kata.frontBack("code"));
        System.out.println("kata.frontBack(Example)-> " + kata.frontBack("a"));
        System.out.println("kata.frontBack(Example)-> " + kata.frontBack("ab"));
        System.out.println("kata.frontBack(Example)-> " + kata.frontBack("sandy"));
        System.out.println("kata.frontBack(Example)-> " + kata.frontBack("volley"));
        System.out.println("kata.frontBack(Example)-> " + kata.frontBack("olympic"));

        //frontThree examples
        System.out.println();
        System.out.println("kata.frontThree(Example)-> " + kata.frontThree("java"));
        System.out.println("kata.frontThree(Example)-> " + kata.frontThree("chocolate"));
        System.out.println("kata.frontThree(Example)-> " + kata.frontThree("abc"));
        System.out.println("kata.frontThree(Example)-> " + kata.frontThree("defense"));
        System.out.println("kata.frontThree(Example)-> " + kata.frontThree("offense"));
        System.out.println("kata.frontThree(Example)-> " + kata.frontThree("mat"));


    }

}
