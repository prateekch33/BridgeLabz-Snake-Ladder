import java.util.*;

class SnakeLadder {
    int pos,dice;
    SnakeLadder() {
        pos=0;
    }
    public void dice() {
        dice=(int)(Math.random()*6)+1;
        System.out.println("Dice Rolled");
    }
    public void checker() {
        int state=(int)(Math.random()*10)%3;
        if(state==0) {
            pos+=dice;
            if(pos>100) {
                pos-=dice;
            }
        } else if(pos==1) {
            pos-=dice;
        }
    }
    public void playAutomatically() {
        while(pos!=100) {
            checker();
            if(pos<0) pos=0;
        }
    }
    public static void main(String[] args) {
        SnakeLadder ob=new SnakeLadder();
        ob.dice();
        ob.checker();
        ob.playAutomatically();
    }
}