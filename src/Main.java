/**
 * Created by win808mac on 8/10/16.
 */
public class Main {

    public static void main(String [] args) {

        Kata kata = new Kata();

        //explode()
        System.out.println("kata.explode(Example)-> " + kata.explode("example"));
        System.out.println("kata.explode(cat)-> " + kata.explode("cat"));
        System.out.println("kata.explode(monkey)-> " + kata.explode("monkey"));
        System.out.println("kata.explode(c)-> " + kata.explode("c"));
        System.out.println("kata.explode()-> " + kata.explode(""));
        System.out.println("kata.explode(seahorse)-> " + kata.explode("seahorse"));
        System.out.println("kata.explode(wide)-> " + kata.explode("wide"));

        //notString examples
        System.out.println();
        System.out.println("kata.notString(candy)-> " + kata.notString("candy"));
        System.out.println("kata.notString(x)-> " + kata.notString("x"));
        System.out.println("kata.notString(not bad)-> " + kata.notString("not bad"));
        System.out.println("kata.notString(silly)-> " + kata.notString("silly"));
        System.out.println("kata.notString(not silly)-> " + kata.notString("not silly"));
        System.out.println("kata.notString(north)-> " + kata.notString("north"));

        //missingChar examples
        System.out.println();
        System.out.println("kata.missingChar(kitten,1)-> " + kata.missingChar("kitten", 1));
        System.out.println("kata.missingChar(kitten,0)-> " + kata.missingChar("kitten", 0));
        System.out.println("kata.missingChar(kitten,4)-> " + kata.missingChar("kitten", 4));
        System.out.println("kata.missingChar(distill,3)-> " + kata.missingChar("distill", 3));
        System.out.println("kata.missingChar(distill,1)-> " + kata.missingChar("distill", 1));
        System.out.println("kata.missingChar(kettle,2)-> " + kata.missingChar("kettle", 2));
        System.out.println("kata.missingChar(kettle,4)-> " + kata.missingChar("kettle", 4));

        //frontBack examples
        System.out.println();
        System.out.println("kata.frontBack(code)-> " + kata.frontBack("code"));
        System.out.println("kata.frontBack(a)-> " + kata.frontBack("a"));
        System.out.println("kata.frontBack(ab)-> " + kata.frontBack("ab"));
        System.out.println("kata.frontBack(sandy)-> " + kata.frontBack("sandy"));
        System.out.println("kata.frontBack(volley)-> " + kata.frontBack("volley"));
        System.out.println("kata.frontBack(olympic)-> " + kata.frontBack("olympic"));

        //frontThree examples
        System.out.println();
        System.out.println("kata.frontThree(java)-> " + kata.frontThree("java"));
        System.out.println("kata.frontThree(chocolate)-> " + kata.frontThree("chocolate"));
        System.out.println("kata.frontThree(abc)-> " + kata.frontThree("abc"));
        System.out.println("kata.frontThree(defense)-> " + kata.frontThree("defense"));
        System.out.println("kata.frontThree(offense)-> " + kata.frontThree("offense"));
        System.out.println("kata.frontThree(mat)-> " + kata.frontThree("mat"));

        //backAround examples
        System.out.println();
        System.out.println("kata.backAround(cat)-> " + kata.backAround("cat"));
        System.out.println("kata.backAround(hello)-> " + kata.backAround("hello"));
        System.out.println("kata.backAround(a)-> " + kata.backAround("a"));
        System.out.println("kata.backAround(hope)-> " + kata.backAround("hope"));
        System.out.println("kata.backAround(tenacity)-> " + kata.backAround("tenacity"));
        System.out.println("kata.backAround(fight)-> " + kata.backAround("fight"));

        //first22 examples
        System.out.println();
        System.out.println("kata.front22(Kitten)-> " + kata.front22("Kitten"));
        System.out.println("kata.front22(Ha)-> " + kata.front22("Ha"));
        System.out.println("kata.front22(abc)-> " + kata.front22("abc"));
        System.out.println("kata.front22(carbon)-> " + kata.front22("carbon"));
        System.out.println("kata.front22(strong)-> " + kata.front22("strong"));
        System.out.println("kata.front22(future)-> " + kata.front22("future"));

        //delDel examples
        System.out.println();
        System.out.println("kata.delDel(adelbc)-> " + kata.delDel("adelbc"));
        System.out.println("kata.delDel(adelHello)-> " + kata.delDel("adelHello"));
        System.out.println("kata.delDel(adebbc)-> " + kata.delDel("adebbc"));
        System.out.println("kata.delDel(sdelorry)-> " + kata.delDel("sdelorry"));
        System.out.println("kata.delDel(adele)-> " + kata.delDel("adele"));
        System.out.println("kata.delDel(hodelpper)-> " + kata.delDel("hodelpper"));

        //startOz examples
        System.out.println();
        System.out.println("kata.startOz(ozymandias)-> " + kata.startOz("ozymandias"));
        System.out.println("kata.startOz(bzoo)-> " + kata.startOz("bzoo"));
        System.out.println("kata.startOz(ox)-> " + kata.startOz("ox"));
        System.out.println("kata.startOz(kitten)-> " + kata.startOz("kitten"));
        System.out.println("kata.startOz(ozzy)-> " + kata.startOz("ozzy"));
        System.out.println("kata.startOz(hozzy)-> " + kata.startOz("hozzy"));

        //endUp examples
        System.out.println();
        System.out.println("kata.endUp(hello)-> " + kata.endUp("hello"));
        System.out.println("kata.endUp(hi there)-> " + kata.endUp("hi there"));
        System.out.println("kata.endUp(Hi)-> " + kata.endUp("Hi"));
        System.out.println("kata.endUp(roar)-> " + kata.endUp("roar"));
        System.out.println("kata.endUp(whoop)-> " + kata.endUp("whoop"));
        System.out.println("kata.endUp(raise)-> " + kata.endUp("raise"));


        //explode 2
        System.out.println();
        System.out.println(kata.explode1("Olympic"));

    }

}
