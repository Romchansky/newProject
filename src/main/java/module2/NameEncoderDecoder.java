package module2;

public class NameEncoderDecoder {

    public String encode(String name) {
        String encodeName = name
                .replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a", "5");
        return "NOTFORYOU" + encodeName + "YESNOTFORYOU";
    }

    public String decode(String name) {
        String decodeName = name
                .substring(9)
                .replace("YESNOTFORYOU", "")
                .replace("YES", "")
                .replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a")
                .strip();
        return decodeName;
    }

    public static void main(String[] args) {

        NameEncoderDecoder nameEncoderDecoder = new NameEncoderDecoder();

        String nameEncode = nameEncoderDecoder.encode("Crab");
        System.out.println("nameEncoderDecoder.encode(\"Crab\") " + nameEncode);

        String nameDecode = nameEncoderDecoder.decode(nameEncode);
        System.out.println("nameEncoderDecoder.decode(nameEncode)" + nameDecode);

        String nameDecodeTwo = nameEncoderDecoder.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU");
        System.out.println("nameEncoderDecoder.encode(\"NOTFORYOUNOTFORYOUYESNOTFORYOU\")" + nameDecodeTwo);
    }
}

