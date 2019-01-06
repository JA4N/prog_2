package Annotationen.Uebung;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Wo kann die Annotation genutzt werden
@Target(ElementType.TYPE)
//Wer kann die Annotation sehen ?
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    //Es Wird ein String zurückgegeben
    String value();
}
