/**
 * Created by Alexandr on 21.06.2017.
 */
public class Player {
    int b;
    private int x = 51, y = 51, speed_x = 4, speed_y = 4, d = 51, speed_c = 5,length=340;


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getD() {
        return d;
    }

    public int getL() {
        return length;
    }

    public int getSpeed_x() {
        return speed_x;
    }

    public int getSpeed_y() {
        return speed_y;
    }

    public void move1() {

        if ((x >= 950) || (x <= 50)) {
            speed_x = -speed_x;
        }
        if ((y >= 420) || (y <= 20)) {
            speed_y = -speed_y;
        }
        if((y>400||y<40)&&(x>d&&x<d+length)){speed_y = -speed_y;}
        x += speed_x;
        y += speed_y;
    }

    public void move2(int s) {
        if (d >= 50 && d <= 610) {
            d += 4 * s;
        } else if ((d > 45 && d < 50) && (s == 1)) {
            d += 4 * s;
        } else if ((d > 610 && d < 615) && (s == -1)) {
            d += 4 * s;
        }
    }

    public void play(int s) {//do {
        move1();
        move2(s);
    } //while(y>=410||y<=30&&(x<=d||x>=d+340));

    public void stop() {
    x+=0;y+=0;
    }
}

