/**
 * Created by win808mac on 8/10/16.
 */
public class Main {

    public static void main(String [] args) {

        Kata kata = new Kata();

        //explode()
        System.out.println("kata.explode(Example)-> " + kata.explode("example"));
        System.out.println("kata.explode(Example)-> " + kata.explode("cat"));
        System.out.println("kata.explode(Example)-> " + kata.explode("monkey"));
        System.out.println("kata.explode(Example)-> " + kata.explode("c"));
        System.out.println("kata.explode(Example)-> " + kata.explode(""));
        System.out.println("kata.explode(Example)-> " + kata.explode("seahorse"));
        System.out.println("kata.explode(Example)-> " + kata.explode("wide"));

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

        //backAround examples
        System.out.println();
        System.out.println("kata.backAround(Example)-> " + kata.backAround("cat"));
        System.out.println("kata.backAround(Example)-> " + kata.backAround("hello"));
        System.out.println("kata.backAround(Example)-> " + kata.backAround("a"));
        System.out.println("kata.backAround(Example)-> " + kata.backAround("hope"));
        System.out.println("kata.backAround(Example)-> " + kata.backAround("tenacity"));
        System.out.println("kata.backAround(Example)-> " + kata.backAround("fight"));

        //first22 examples
        System.out.println();
        System.out.println("kata.front22(Example)-> " + kata.front22("Kitten"));
        System.out.println("kata.front22(Example)-> " + kata.front22("Ha"));
        System.out.println("kata.front22(Example)-> " + kata.front22("abc"));
        System.out.println("kata.front22(Example)-> " + kata.front22("carbon"));
        System.out.println("kata.front22(Example)-> " + kata.front22("strong"));
        System.out.println("kata.front22(Example)-> " + kata.front22("future"));

        //delDel examples
        System.out.println();
        System.out.println("kata.delDel(Examples)-> " + kata.delDel("adelbc"));
        System.out.println("kata.delDel(Examples)-> " + kata.delDel("adelHello"));
        System.out.println("kata.delDel(Examples)-> " + kata.delDel("adebbc"));
        System.out.println("kata.delDel(Examples)-> " + kata.delDel("sdelorry"));
        System.out.println("kata.delDel(Examples)-> " + kata.delDel("adele"));
        System.out.println("kata.delDel(Examples)-> " + kata.delDel("hodelpper"));

        //startOz examples
        System.out.println();
        System.out.println("kata.startOz(Examples)-> " + kata.startOz("ozymandias"));
        System.out.println("kata.startOz(Examples)-> " + kata.startOz("bzoo"));
        System.out.println("kata.startOz(Examples)-> " + kata.startOz("ox"));
        System.out.println("kata.startOz(Examples)-> " + kata.startOz("kitten"));
        System.out.println("kata.startOz(Examples)-> " + kata.startOz("ozzy"));
        System.out.println("kata.startOz(Examples)-> " + kata.startOz("hozzy"));

        //endUp examples
        System.out.println();
        System.out.println("kata.endUp(Examples)-> " + kata.endUp("Hello"));
        System.out.println("kata.endUp(Examples)-> " + kata.endUp("hi there"));
        System.out.println("kata.endUp(Examples)-> " + kata.endUp("Hi"));
        System.out.println("kata.endUp(Examples)-> " + kata.endUp("roar"));
        System.out.println("kata.endUp(Examples)-> " + kata.endUp("whoop"));
        System.out.println("kata.endUp(Examples)-> " + kata.endUp("raise"));


        //explode 2
        System.out.println();
        System.out.println(kata.explode1("Olympic"));

    }

}
