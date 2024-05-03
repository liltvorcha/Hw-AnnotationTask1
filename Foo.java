import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Foo {
  @Test (a = 10, b = 12)
  public int (sum int a, int b) {
    return a + b;
  }
}

public class Main {
  public static void main (String[] args) throws InvocationTargetException, IllegalAccessException {
    Foo foo = new Foo();
    Class<?> cls = foo.get.Class();

    Method[] methods = cls.getDeclaredMethods();

    for (Method m : methods) {
      if (m.isAnnotaionPresent(Test.class)) {
        Test test = m.getAnnotation(Test.class);
        int res = (Integer)m.invoke(foo, test.a(), test.b());
        System.out.println(res);
      }
    }
  }
}
