
/**
 * Created by 3299779 on 07/09/2016.
 */
public class RunProgram {

    public static void main(String[] args) {

        myArrayList<Integer> list = new myArrayList<Integer>();

        //Add metoden:
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        //expandList metoden:
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);


        System.out.println("toString Metoden:");
        list.toString();

        System.out.println("Get metoden:");
        System.out.println(list.get(1));

        System.out.println("remove metoden:");
        list.remove(1);
        list.toString();
    }
}
