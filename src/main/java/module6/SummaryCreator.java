package module6;

public class SummaryCreator {

    public String create(String text) {
        String textNew = text;
        final int wordLength = 15;
        StringBuilder stringBuilder = new StringBuilder();

        if(text.length() <=15 ) {
            return textNew;
        }else{
            char ch = textNew.charAt(15);
            if (stringBuilder.capacity() >= wordLength && Character.isLetter(ch)) {
                return textNew.substring(0, 15) + "...";
            }
            if (stringBuilder.capacity() >= wordLength && !Character.isLetter(ch)) {
                return textNew.substring(0, 15);
            }
        }
        return "";
    }


    public static void main(String[] args) {


        SummaryCreator summaryCreator = new SummaryCreator();
        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));
        //Java is very po...
        String longPhrase = "Java is very po pular language";
        System.out.println(summaryCreator.create(longPhrase));
        String longPhrase1 = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase1));
    }
}