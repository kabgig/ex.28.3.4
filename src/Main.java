import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Jazz jazz = new Jazz();
        Yahoo annotation = jazz.getClass().getAnnotation(Yahoo.class);
        System.out.println(annotation.value());
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Yahoo{
        String value();
    }

    @Yahoo("Blue Note")
    public static class Jazz {

    }



}