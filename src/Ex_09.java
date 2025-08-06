public class Ex_09 {
    public static void main(String[] args) {

    }
}

class Marine {
    int x=0, y=0;
    int hp = 60;
    int weapon = 6;
    int armor = 0;

    void weaponUp() {
        weapon++;
    }
    void armorUp() {
        armor++;
    }
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// static 붙여야 하는 것
// weapon, armor - 모든 인스턴스에 공통적인 값 가짐
// weaponUp(), armorUp() - static변수에 대한 메서드