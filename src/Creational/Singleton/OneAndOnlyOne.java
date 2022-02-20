package Creational.Singleton;

public class OneAndOnlyOne {

    private String resource =
            "           ,-~~-.___.\n" +
            "          / ()=(()   \\\n" +
            "         (   (        0\n" +
            "          \\._\\, ,----'\n" +
            "     ##XXXxxxxxxx\n" +
            "            /  ---'~;\n" +
            "           /    /~|-\n" +
            "         =(   ~~  |\n" +
            "   /~~~~~~~~~~~~~~~~~~~~~\\\n" +
            "  /_______________________\\\n" +
            " /_________________________\\\n" +
            "/___________________________\\\n" +
            "   |____________________|\n" +
            "   |____________________|\n" +
            "   |____________________|\n" +
            "   |                    |";
    private static OneAndOnlyOne singletonInstance;

    private OneAndOnlyOne(){

    }

    static {
        singletonInstance = new OneAndOnlyOne();
    }

    public static OneAndOnlyOne getSingletonInstance(){
        if(null == singletonInstance){
            singletonInstance = new OneAndOnlyOne();
        }
        return singletonInstance;
    }

    public String getResource(){
        return resource;
    }
}
