package publicaccessmodifiers;

import methods.InstanceMethod;
import protectedaccessmodifier.ClassAProtected;

public class ClassAPublic {

    public String fname ="code"; //Declared Instance Variable
    public String lname ="buster"; //Declared Instance Variable
    public static void main(String[] args) {
        InstanceMethod i = new InstanceMethod();
        i.name();


    }

}
