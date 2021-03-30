import java.util.Arrays;
import java.util.Comparator;

class Main {

//       public static void main(String[] args) {
//
//              String a = "a";
//              String b = "b";
//              String d = "d";
//              String c = a + b + d;
//
//              StringBuilder sb = new StringBuilder();
//              sb.append(a).append(b);
//              sb.toString();
//
//              StringBuffer sbuff = new StringBuffer();
//              sb.append(a).append(b);
//              sb.toString();
//
//
//
//
//       }

    public static void main(String[] args) {
        People[] array = new People[3];
        array[0] = new People("name1", "sadas1", 35);
        array[1] = new People("name2", "sadas2", 22);
        array[2] = new People("name3", "sadas3", 73);


        Arrays.sort(array, new PeopleComparatorAge());

        System.out.println(Arrays.toString(array));

        Arrays.sort(array, new PeopleComparatorName());

        System.out.println(Arrays.toString(array));

    }

    static class PeopleComparatorAge implements Comparator<People> {
        @Override
        public int compare(People o1, People o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

    static class PeopleComparatorName implements Comparator<People> {
        @Override
        public int compare(People o1, People o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

}

