package module5;

class AIPlayer {
    private int hp;

    public void setHp(int hp) {
        this.hp = hp;
        if (this.hp < 0) {
            throw new IllegalArgumentException("Ok value");
        }
        if (this.hp > 100) {
            throw new IllegalArgumentException("Invalid value");
        }
    }
}

class AIPlayerTest {
    public static void main(String[] args) {
        AIPlayer player = new AIPlayer();

        //Ok value
        try {
            player.setHp(50);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }

        //Invalid value
        try {
            player.setHp(-1);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }
    }
}
