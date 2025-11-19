package Challenge_3_Animaux_et_Sons;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Chien chien = new Chien();
        Chat chat = new Chat();
        Vache vache = new Vache();

        animalList.add(chien);
        animalList.add(chat);
        animalList.add(vache);

        for(Animal animal : animalList){
            animal.faireSon();
            animal.manger();
        }

    }
}