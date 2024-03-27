package ExceptionHandlingBasic;

public class ExceptionHandlingMethods {
    public static void main(String[] args) {
        ExceptionHandlingMethods em = new ExceptionHandlingMethods();
        String x = "";
        String y = "abcd";
        System.out.println("foo() null");
        em.foo(null);
        System.out.println("bar() null");
        em.bar(null);
        System.out.println("empty string");
        em.foo(x);
        System.out.println("abcd");
        em.foo(y);

    }
    // null pointer exception
    public void foo(String x) {
        try {
            System.out.println("First character of String value from foo() method: " + x.charAt(0));
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
    // null pointer exception
    public void bar(String x){
        if (x == null){
            System.out.println("2 - Null pointer");
        }
        System.out.println("First Character - bar() method" + x.charAt(0));

    }
}
