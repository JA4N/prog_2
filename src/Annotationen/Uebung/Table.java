package Annotationen.Uebung;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Sichtbarkeit der Annotation
@Retention(RetentionPolicy.RUNTIME)
//Wo kann die Annotation genutzt werden?
@Target(ElementType.TYPE)

public @interface Table {

    //Es wird ein String zurückgegeben
    String value();

}
