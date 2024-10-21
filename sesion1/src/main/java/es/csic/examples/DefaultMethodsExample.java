package es.csic.examples;

interface TestInterface
{
    // Método abstracto
    public void sum(int a, int b);

    // Default method
    default void logMessage()
    {
        System.out.println("Log: Default Method");
    }
}

class DefaultMethodsExample implements TestInterface
{
    public void sum(int a, int b)
    {
        int res = a+b;
        System.out.println(res);
    }

    public static void main(String args[])
    {
        DefaultMethodsExample d = new DefaultMethodsExample();
        d.sum(1, 9);
        d.logMessage();
    }

}