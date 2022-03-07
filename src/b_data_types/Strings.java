package b_data_types;

public class Strings {
    public static void main(String[] args) {
        referencesVsObjects();
        System.out.println();
        equality();
        System.out.println();
        chaining();
        System.out.println();
        methods();
        System.out.println();
        stringVsStringBuilder();
        System.out.println();
        stringBuilderMethods();
    }

    private static void referencesVsObjects(){
        System.out.println("---References Vs Objects");
        String s1 = "abc";
        String s2 = s1; // both references refer to the same object

        s1 = s1.concat("def"); // a new String object is created and s1 now refers to that new object
        System.out.println(s1 + " " + s2); // abcdef abc

        String s3 = "Java";
        s3.concat(" 11 Certification"); // not saved, so the garbage collector will clean it
        System.out.println(s3);
    }

    private static void equality(){
        System.out.println("---Equality:");
        String name1 = "Sean";
        String name2 = "Sean";
        System.out.println(name1 == name2); // true, checking references

        String name3 = new String("Sean");
        System.out.println(name1 == name3); // false
        System.out.println(name1.equals(name3)); // true, checking object contents
        System.out.println(name1 == new String("Sean").intern()); // true, intern uses the in-pool version if present
    }

    private static void chaining(){
        System.out.println("---Chaining:");
        String s = "qwe" // new object
                .concat("rty") // new object, which is then fused with the previous string into a new object
                .toUpperCase() // new object with uppercase content is made
                .replace('E', 'O'); // new object with replacement is made and stored into variable 's'
        // the previous 4 leftover objects will be cleaned by the garbage collector
        System.out.println(s); // QWORTY
    }

    private static void methods(){
        System.out.println("---Methods:");
        String x = "light";

        System.out.println(x.charAt(2)); // i

        System.out.println(x.concat(" switch")); // light switch
        System.out.println(x); // light

        System.out.println(x.equalsIgnoreCase("LIGHT")); // true
        System.out.println(x.equalsIgnoreCase("gilth")); // false

        System.out.println(x.length()); // 5

        x = "Lightning switch";
        System.out.println(x.replace('i', '|')); // l|ghtn|ng sw|tch

        System.out.println(x.substring(5)); // ning switch
        System.out.println("unhappy".substring(2)); // happy
        System.out.println("Harbison".substring(3)); // bison
        System.out.println("emptiness".substring(9)); // "" (empty string)
        System.out.println("hamburger".substring(4, 8)); // urge
        System.out.println("smiles".substring(1, 5)); // mile

        System.out.println(x.toLowerCase());
        System.out.println(x.toUpperCase());

        x = " hi ";
        System.out.println(x + "t"); // " hi t"
        System.out.println(x.trim() + "t"); // "hit"
    }

    private static void stringVsStringBuilder(){
        System.out.println("---String vs StringBuilder:");
        String x1 = "abc";
        x1 = x1.concat("def");
        System.out.println(x1); // abcdef, "abc" object garbage collected

        // StringBuilder does the same without wasting memory
        StringBuilder sb = new StringBuilder("abc");
        sb.append("def");
        System.out.println(sb); // abcdef

        StringBuilder sb2= new StringBuilder( "abc");
        // only one object used:
        sb2.append("def").reverse().insert(3, "---");
        System.out.println(sb2); // fed---cba
    }

    private static void stringBuilderMethods(){
        System.out.println("---StringBuilder methods:");
        StringBuilder sb = new StringBuilder("set");
        sb.append("point");
        System.out.println(sb); // set point

        StringBuilder sb2 = new StringBuilder("pi = ");
        sb2.append(3.142f); // accepts different data types
        System.out.println(sb2); // pi = 3.142

        sb = new StringBuilder("0123456789");
        sb.delete(4, 6); // 01236789
        sb.insert(4, "---"); // 0123---6789
        sb.reverse(); // 9876---3210
        System.out.println(sb.toString());

        // capacity autogrows with +2
        StringBuilder sb4 = new StringBuilder();
        System.out.println(sb4.length()); // 0
        System.out.println(sb4.capacity()); // 16
        sb4.append("1234"); // length = 4

        sb4.insert(1, "x"); // index must <= length
        System.out.println(sb4.toString()); // 1x234
        System.out.println(sb4.length()); // 5
        System.out.println(sb4.capacity()); // 16
        sb4.append("1234567890123456");
        System.out.println(sb4.toString()); // 1x2341234567890123456
        System.out.println(sb4.length()); // 21
        System.out.println(sb4.capacity()); // 34 (2*16 + 2)

        sb4.insert(19, "y"); // OK, 19 <= 21
        System.out.println(sb4.toString()); // 1x23412345678901234y56
        System.out.println(sb4.length()); // 22

        sb4.insert(22, "z"); // OK, 22 <= 22
        System.out.println(sb4.toString()); // 1x23412345678901234y56z
        System.out.println(sb4.length()); // 23

        // index cannot be greater than the length
        //sb4.insert(24, "p"); // StringIndexOutOfBoundsException
        System.out.println(""+null);
    }
}
