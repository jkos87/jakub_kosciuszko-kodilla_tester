package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCases {
    public static void main(String[] args) {
        Integer a = 110;
        Integer b = 116;

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println("-----------");
        String x = "This is string";
        String y = "This is string";
        System.out.println(x == y);
        System.out.println("-----------");
        Integer c = 100;
        Integer d = 100;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println( c == d);
        c= c + 10;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println( c == d);
        System.out.println("-----------");
         c = 10560;
         d = 10560;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println( c == d);
        System.out.println("xxxxxxxxxxxxxx");

        String s1 = "text";
        String s2 = "text";
        //String s2 = new String("text");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
