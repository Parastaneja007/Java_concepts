package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE , ElementType.METHOD}) // it is applicable to both classes and meathods
@Retention(RetentionPolicy.RUNTIME)
public @interface important {
}
