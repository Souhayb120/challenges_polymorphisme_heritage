package Challenge_1_Formes_Géométriques;


public class Main {
    public static void main(String[] args) {

        Form[] formes = {
                new Cercle(5),
                new Rectangle(3, 4),
                new Triangle(3,4)
        };

        for(Form form : formes){
            System.out.println(form.calculerAire());
        }

    }
}