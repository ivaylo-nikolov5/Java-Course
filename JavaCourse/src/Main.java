public class Main {
    public static void main(String[] args) {
        Enums lvl = Enums.LOW;

        int x = lvl.getLvl();
        System.out.println(Enums.valueOf("LOW"));
        lvl.setLvl(5);
        System.out.println(lvl.getLvl());
    }
}