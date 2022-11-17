package String;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "Java       programming   language";
        System.out.println("Before removing the white spaces :"+str);
        str = str.replaceAll("\\s","");
        System.out.println("After removing the white spaces :"+str);


    }
}
