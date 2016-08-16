/**
 * Created by win808mac on 8/10/16.
 */
public class Main {

    public static void main(String [] args) {
        
        //explode()
        System.out.println("kata.explode(Example)-> " + Kata.explode("example"));
        System.out.println("kata.explode(cat)-> " + Kata.explode("cat"));
        System.out.println("kata.explode(monkey)-> " + Kata.explode("monkey"));
        System.out.println("kata.explode(c)-> " + Kata.explode("c"));
        System.out.println("kata.explode()-> " + Kata.explode(""));
        System.out.println("kata.explode(seahorse)-> " + Kata.explode("seahorse"));
        System.out.println("kata.explode(wide)-> " + Kata.explode("wide"));

        //notString examples
        System.out.println();
        System.out.println("kata.notString(candy)-> " + Kata.notString("candy"));
        System.out.println("kata.notString(x)-> " + Kata.notString("x"));
        System.out.println("kata.notString(not bad)-> " + Kata.notString("not bad"));
        System.out.println("kata.notString(silly)-> " + Kata.notString("silly"));
        System.out.println("kata.notString(not silly)-> " + Kata.notString("not silly"));
        System.out.println("kata.notString(north)-> " + Kata.notString("north"));

        //missingChar examples
        System.out.println();
        System.out.println("kata.missingChar(kitten,1)-> " + Kata.missingChar("kitten", 1));
        System.out.println("kata.missingChar(kitten,0)-> " + Kata.missingChar("kitten", 0));
        System.out.println("kata.missingChar(kitten,4)-> " + Kata.missingChar("kitten", 4));
        System.out.println("kata.missingChar(distill,3)-> " + Kata.missingChar("distill", 3));
        System.out.println("kata.missingChar(distill,1)-> " + Kata.missingChar("distill", 1));
        System.out.println("kata.missingChar(kettle,2)-> " + Kata.missingChar("kettle", 2));
        System.out.println("kata.missingChar(kettle,4)-> " + Kata.missingChar("kettle", 4));

        //frontBack examples
        System.out.println();
        System.out.println("kata.frontBack(code)-> " + Kata.frontBack("code"));
        System.out.println("kata.frontBack(a)-> " + Kata.frontBack("a"));
        System.out.println("kata.frontBack(ab)-> " + Kata.frontBack("ab"));
        System.out.println("kata.frontBack(sandy)-> " + Kata.frontBack("sandy"));
        System.out.println("kata.frontBack(volley)-> " + Kata.frontBack("volley"));
        System.out.println("kata.frontBack(olympic)-> " + Kata.frontBack("olympic"));

        //frontThree examples
        System.out.println();
        System.out.println("kata.frontThree(java)-> " + Kata.frontThree("java"));
        System.out.println("kata.frontThree(chocolate)-> " + Kata.frontThree("chocolate"));
        System.out.println("kata.frontThree(abc)-> " + Kata.frontThree("abc"));
        System.out.println("kata.frontThree(defense)-> " + Kata.frontThree("defense"));
        System.out.println("kata.frontThree(offense)-> " + Kata.frontThree("offense"));
        System.out.println("kata.frontThree(mat)-> " + Kata.frontThree("mat"));

        //backAround examples
        System.out.println();
        System.out.println("kata.backAround(cat)-> " + Kata.backAround("cat"));
        System.out.println("kata.backAround(hello)-> " + Kata.backAround("hello"));
        System.out.println("kata.backAround(a)-> " + Kata.backAround("a"));
        System.out.println("kata.backAround(hope)-> " + Kata.backAround("hope"));
        System.out.println("kata.backAround(tenacity)-> " + Kata.backAround("tenacity"));
        System.out.println("kata.backAround(fight)-> " + Kata.backAround("fight"));

        //first22 examples
        System.out.println();
        System.out.println("kata.front22(Kitten)-> " + Kata.front22("Kitten"));
        System.out.println("kata.front22(Ha)-> " + Kata.front22("Ha"));
        System.out.println("kata.front22(abc)-> " + Kata.front22("abc"));
        System.out.println("kata.front22(carbon)-> " + Kata.front22("carbon"));
        System.out.println("kata.front22(strong)-> " + Kata.front22("strong"));
        System.out.println("kata.front22(future)-> " + Kata.front22("future"));

        //delDel examples
        System.out.println();
        System.out.println("kata.delDel(adelbc)-> " + Kata.delDel("adelbc"));
        System.out.println("kata.delDel(adelHello)-> " + Kata.delDel("adelHello"));
        System.out.println("kata.delDel(adebbc)-> " + Kata.delDel("adebbc"));
        System.out.println("kata.delDel(sdelorry)-> " + Kata.delDel("sdelorry"));
        System.out.println("kata.delDel(adele)-> " + Kata.delDel("adele"));
        System.out.println("kata.delDel(hodelpper)-> " + Kata.delDel("hodelpper"));

        //startOz examples
        System.out.println();
        System.out.println("kata.startOz(ozymandias)-> " + Kata.startOz("ozymandias"));
        System.out.println("kata.startOz(bzoo)-> " + Kata.startOz("bzoo"));
        System.out.println("kata.startOz(ox)-> " + Kata.startOz("ox"));
        System.out.println("kata.startOz(kitten)-> " + Kata.startOz("kitten"));
        System.out.println("kata.startOz(ozzy)-> " + Kata.startOz("ozzy"));
        System.out.println("kata.startOz(hozzy)-> " + Kata.startOz("hozzy"));

        //endUp examples
        System.out.println();
        System.out.println("kata.endUp(hello)-> " + Kata.endUp("hello"));
        System.out.println("kata.endUp(hi there)-> " + Kata.endUp("hi there"));
        System.out.println("kata.endUp(Hi)-> " + Kata.endUp("Hi"));
        System.out.println("kata.endUp(roar)-> " + Kata.endUp("roar"));
        System.out.println("kata.endUp(whoop)-> " + Kata.endUp("whoop"));
        System.out.println("kata.endUp(raise)-> " + Kata.endUp("raise"));


        //explode 2
        System.out.println();
        System.out.println(Kata.explode1("Olympic"));

    }

}
