package luvml.semantic;

public class TagNameFromClass {
    // allows tag elements name to get refactored automatically when class is refactored
    public static String tagNameFromClass(Class clzz){
        String n = clzz.getSimpleName();
        if(n.endsWith("_E")) n = n.substring(0,n.length()-2);
        if(n.length()>0)
            n = Character.toLowerCase(n.charAt(0))+n.substring(1);
        return n;
    }
}
