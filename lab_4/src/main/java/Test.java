import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String arg[]) {

        DiskClassLoader diskLoader = new DiskClassLoader("C:\\Users\\d4nyi\\.m2\\repository\\lab_4\\src\\main\\java");
        try {
            // Загружаем файл класса
            Class c = diskLoader.loadClass("Say");

            if(c != null){
                try {
                    Object obj = c.newInstance();
                    Method method = c.getDeclaredMethod("say",null);
                    // Вызываем метод say класса Test через отражение
                    method.invoke(obj, null);
                } catch (InstantiationException | IllegalAccessException
                        | NoSuchMethodException
                        | SecurityException |
                        IllegalArgumentException |
                        InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

