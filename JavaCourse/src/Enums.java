import java.util.logging.Level;

public enum Enums {
//    Level
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int lvlNum;

    private Enums(int num) {
        this.lvlNum = num;
    }

    public int getLvl() {
        return this.lvlNum;
    }

    public int setLvl(int num) {
        return this.lvlNum = num;
    }
}
