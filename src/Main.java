import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main (String[] args) throws InvocationTargetException, IllegalAccessException {
        final Class<?> cls = TextContainer.class;
        TextContainer tc = new TextContainer();

        SaveTo st = cls.getAnnotation(SaveTo.class);
        Method[] methods = cls.getMethods();
        for (Method method: methods){
            if (method.isAnnotationPresent(Saver.class)){
                method.invoke(tc, st.path());
            }
        }

    }

}
