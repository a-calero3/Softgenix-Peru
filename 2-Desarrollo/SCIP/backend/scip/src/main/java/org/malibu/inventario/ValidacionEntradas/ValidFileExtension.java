package org.malibu.inventario.ValidacionEntradas;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = FileExtensionValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidFileExtension {
    String message() default "Archivo no válido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    String[] allowedExtensions();
}
