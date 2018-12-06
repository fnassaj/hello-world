import java.lang.annotation.Annotation;

public class MainClass {
    public MainClass() {
        super();
    }

    public static void main(String[] args) {       
       
        Class steuerfall = Steuerfall.class;
        Annotation[] sfAnnotations = steuerfall.getAnnotations();

        for(Annotation sfAnnotation : sfAnnotations){
//            if(sfAnnotation instanceof SFAnnotations){
                SFAnnotations myAnnotation = (SFAnnotations) sfAnnotation;
                System.out.println("name: " + myAnnotation.name());
                System.out.println("value: " + myAnnotation.value());
//            }else
//            System.out.println("stop");
        }
        
        
        Class aClass = Steuerfall.class;
        Annotation annotation = aClass.getAnnotation(SFAnnotations.class);

        if(annotation instanceof SFAnnotations){
            SFAnnotations myAnnotation = (SFAnnotations) annotation;
            System.out.println("name: " + myAnnotation.name());
            System.out.println("value: " + myAnnotation.value());
        }
        
    }
}
