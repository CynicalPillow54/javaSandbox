package OutputToConsole;

public class StringMethods {
    public static void main(String[] args) {
        String yourName;
        yourName = "Akhil Seeram";

        System.out.println("The input String : " + yourName);

        var nameLength = yourName.length();
        System.out.println("The length of the String is : " + nameLength);

        var firstCharacter = yourName.charAt(0);
        var lastCharacter = yourName.charAt(nameLength-1);
        System.out.println("The first character is : " + firstCharacter + " and the last character is : " + lastCharacter);

        var upperCase = yourName.toUpperCase();
        System.out.println("The String in Upper Case is : " + upperCase);

        var nameReplaced = yourName.replace("a", "*");
        System.out.println("The string with the letter a replaced with * is : " + nameReplaced);

        var charOccursAt = yourName.indexOf('e');
        System.out.println("The index of the first occurrence of letter e is : " + charOccursAt);
    }
}

