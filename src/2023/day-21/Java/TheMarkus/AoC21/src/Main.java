import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        String[][] map = scanThatMap();

    }

    private static void loadLineIntoMap(String line, String[][] map, int currentY){
        char[] chars = line.toCharArray();
        for (int i = 0; i < line.length(); i++){
            map[i][currentY] = String.valueOf(chars[i]);
        }
    }

    private static String[][] scanThatMap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter that map: ");
        String input = "";
        String[][] map = new String[0][0];
        int currentLine = 0;

        if (sc.hasNext()) {
            input=sc.next();
            map = new String[input.length()][input.length()];
            loadLineIntoMap(input, map, currentLine++);

            while (sc.hasNext()){
                input=sc.next();
                loadLineIntoMap(input, map, currentLine++);
            }
        }
        return map;
    }


}