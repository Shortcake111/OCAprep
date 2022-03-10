package e_object_oriented;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String vowelsS = "aei";
        StringBuilder vowelsSB = new StringBuilder("aei");

        addRemainingVowels(vowelsS);
        addRemainingVowels(vowelsSB);

        System.out.println(vowelsS); // aei
        System.out.println(vowelsSB); // aeiou
    }

    public static void addRemainingVowels(String vowels){
        // no effect on 'vowels' in main():
        vowels += "ou";
        vowels.concat("ou");
    }

    public static void addRemainingVowels(StringBuilder vowels){
        vowels.append("ou"); // changes 'vowelsSB' in main()
    }
}
