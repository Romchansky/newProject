package module4.core.one;

class Stars {

    int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        int oneStar = count % 10;
        int tenSign = count / 10 % 10;
        int hundredSigh = count / 100 % 10;
        int thousandSigh = count / 1000;

        return "X".repeat(thousandSigh) + "Y".repeat(hundredSigh) +
                "Z".repeat(tenSign) + "*".repeat(oneStar);

    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(101);


        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}





