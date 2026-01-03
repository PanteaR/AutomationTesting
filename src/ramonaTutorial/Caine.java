package ramonaTutorial;

public class Caine  implements Mamifer, AnimalDeCompanie{
//ne defini atribute care nu au modificator de acces
    int numarPicioare = 4;

    //cream o metoda cu modificator de acces implicit

    int getNumarPicioare(){
        return numarPicioare;
    }



    @Override
    public void reproducere() {
        System.out.println("Eu sunt un caine si imi hranesc puii cu lapte");
    }

    @Override
    public void mananca() {
        System.out.println("Eu sunt un caine si imi place sa mananc oase");

    }

    @Override
    public void sunet() {
        System.out.println("Ham ham");

    }

    @Override
    public void vaneaza() {
        System.out.println("eu sunt un caine de companie si nu pot vana");

    }
    private void alearga(){
        System.out.println("eu sunt un animal si alerg");
    }
}
