
// Ну типо микро-тестовый проект на java, начал изучение 02.06.2021.

public class Main {

    static int height = 10;
    static int width = 100;

    static String write(int x, int y) {
        String map = null;
        for(int y1 = 0; y1 < height; y1++) {
            map += "\n";
            for(int x1 = 0; x1 < width; x1++) {
                if(y1 == y && x1 == x) {
                    map += '0';
                }
                else {
                    map += "*";
                }
            }
        }
        return map;
    }

    public static void main(String[] args) {

        System.out.println("[firstProject] " + height + ':' + width);
        System.out.println(write(4, 5));

    }
}