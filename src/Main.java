import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        AnnotationExample map = new AnnotationExample();
        Author annotation = map.getClass().getAnnotation(Author.class);
        System.out.println("Author: " + annotation.value());
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Author {
        String value();
    }

    @Author("Stephen King")
    public static class AnnotationExample {
    }
}