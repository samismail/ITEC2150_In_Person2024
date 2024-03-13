package InterfaceDemo;
import java.util.ArrayList;
import java.util.Scanner;
public class GameUI {
    public static void main(String[] args) {

        ISavable k1 = new King("Henry the King", 2, "one at a time in any direction", "Black");

        ISavable q1 = new Queen("Elizabeth the Queen", 6, "any direction as far", "White");
    }

    public void saveObject(ISavable isobj) {
        //use a for loop to iterate data by index value
        for (int i = 0; i < isobj.write().get(); i++) {
            System.out.println(isobj.write().get(i));
        }
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        // 1 or 0 1 is for entering some string value 0 is for exit
    }
    public static void loading(ISavable isobj){

    }

}

