package module6;

class NameParser {
    public String parse(String[] names) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < names.length; i++) {
             builder.append(names[i].split(" ")[0]);

            if (i != names.length - 1) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}
