package org.example;

/**
 * 2074407503
 * 2074407503
 * 0
 * 0
 * 999966131
 * 1989780873
 * 1480010240
 * 81628611
 */
public class AppTest {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        String str3 = null;
        String str4 = null;
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        String str5 = new String("");
        String str6 = new String("");
        System.out.println(System.identityHashCode(str5));
        System.out.println(System.identityHashCode(str6));

        String str7 = new String();
        String str8 = new String();
        System.out.println(System.identityHashCode(str7));
        System.out.println(System.identityHashCode(str8));
    }
}
