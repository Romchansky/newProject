package module3;

public class CheapStocks {

    public static void main(String[] args) {
        CheapStocks cheapStocks = new CheapStocks();
        cheapStocks.getCheapStocks(new String[]{"Tozeo 402", "ok 5", "cux 386", "bele 331", "ha 722", "Gy 414",
                "wo 119", "ihzyr 523", "Kedo 97", "wyceq 212", "Ax 85"});

    }

    public String getCheapStocks(String[] stocks) {

        String[] parts; // = new String[stocks.length]; эту часть кода можно опустить
        String name;
        int number;
        String result = "";
        for (String stock : stocks) {
            parts = stock.split(" ");
            name = parts[0];
            number = Integer.parseInt(parts[1]);
            if (number < 200) {
                result += " " + name;
            }
        }
        return result;
    }
}