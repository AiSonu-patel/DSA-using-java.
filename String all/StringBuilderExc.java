
public class StringBuilderExc {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str); // hello
        //hello -> mello
        str.setCharAt(0, 'm');
        System.out.println(str); // mello
        // mello world
        str.append(" World");
        System.out.println(str); // mello world
        // mello world --> meyllo world
        str.insert(2, 'y');
        System.out.println(str); // meyllo world
        // meyllo world --> mello world
        str.deleteCharAt(2);
        System.out.println(str); // mello world
        // mello world --> dlrow ollem
        str.reverse();
        System.out.println(str); // dlrow ollem
        // dlrow ollem --> mello world
        str.reverse();
        System.out.println(str); // mello world
        //  mello world --> world
        str.delete(0, 6);
        System.out.println(str); // world
        
    }
}
