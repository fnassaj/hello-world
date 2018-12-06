import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainClass {
    public MainClass() {
        super();
    }

    public static void main(String[] args) {
        
        Class steuerfall = Steuerfall.class;
        Field[] fields = steuerfall.getFields();

//        for(Annotation annotation : fields){
//            if(annotation instanceof SFAnnotations){
//                SFAnnotations myAnnotation = (SFAnnotations) annotation;
//                System.out.println("name: " + myAnnotation.name());
//                System.out.println("value: " + myAnnotation.value());
//            }
//        }
        
    }
}
