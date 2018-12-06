import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class MainClass {


    public static void main(String[] args) {
        
        Class aClass = TheClass.class;
        Field[] fields = aClass.getFields();
        
        fields

        for(Annotation annotation : annotations){
            if(annotation instanceof MyAnnotation){
                MyAnnotation myAnnotation = (MyAnnotation) annotation;
                System.out.println("name: " + myAnnotation.name());
                System.out.println("value: " + myAnnotation.value());
            }
        }
    }
}
