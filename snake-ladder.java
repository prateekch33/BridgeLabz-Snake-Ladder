class SnakeLadder {
    int pos, dice, countRoll;

    SnakeLadder() {
        pos = 0;
        countRoll = 0;
    }

    public void dice() {
        dice = (int) (Math.random() * 6) + 1;
        countRoll++;
        System.out.println("Dice Rolled");
    }

    public void checker() {
        int state = (int) (Math.random() * 10) % 3;
        if (state == 0) {
            pos += dice;
            if (pos > 100) {
                pos -= dice;
            }
            dice();
            checker();
        } else if (pos == 1) {
            pos -= dice;
        }
    }

    public void playAutomatically() {
        while (pos != 100) {
            dice();
            checker();
            if (pos < 0)
                pos = 0;
            System.out.printf("Position: %d\n", pos);
        }
    }

    public int getCountRoll() {
        return countRoll;
    }

    public static void main(String[] args) {
        SnakeLadder ob1 = new SnakeLadder();
        SnakeLadder ob2 = new SnakeLadder();

        ob1.playAutomatically();
        ob2.playAutomatically();
        if (ob1.getCountRoll() > ob2.getCountRoll()) {
            System.out.println("Player 1 wins");
        } else {
            System.out.println("Player 2 wins");
        }
    }
}