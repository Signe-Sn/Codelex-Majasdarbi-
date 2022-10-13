package test.java.generics.practice.Exercise1;

public class Exercise1Main{

    public static void main(String[] args) {

        // can only make a list with String values, nothing else.
        WithoutGenerics list2 = new WithoutGenerics();
        list2.add(0, "Bob");
        System.out.println(list2.get(0));

        //can create many subclasses of generic abstract list with differing value types.
        //but can only store the type of value that the subclass defined.
        StringImplementation string = new StringImplementation();
        string.add(0, "Bob");
        string.add(1, "Nicole");
        System.out.println(string.get(1));

        IntegerImplementation integer = new IntegerImplementation();
        integer.add(0, 12);
        System.out.println(integer.get(0));

        DoubleImplementation double1 = new DoubleImplementation();
        double1.add(0, 4.5);
        System.out.println(double1.get(0));

        // can add any type of element to this generic list.
        GenericList list = new GenericList();
        list.add(0, "Bobsley");
        list.add(1, 14);
        list.add(2, 5.6);
        System.out.println(list.get(2));
        System.out.println(list.get(1));
    }
}
