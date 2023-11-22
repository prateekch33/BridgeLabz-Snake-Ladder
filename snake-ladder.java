import java.util.*;

class SnakeLadder {
    int pos,dice;
    SnakeLadder() {
        pos=0;
    }
    public void dice() {
        dice=(int)(Math.random()*6)+1;
    }
    public static void main(String[] args) {
        SnakeLadder ob=new SnakeLadder();
    }
}