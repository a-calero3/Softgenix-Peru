package org.malibu.inventario.ValidacionEntradas;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class FileExtensionValidator implements ConstraintValidator<ValidFileExtension, String> {
    private String[] allowedExtensions;

    @Override
    public void initialize(ValidFileExtension constraintAnnotation) {
        allowedExtensions = constraintAnnotation.allowedExtensions();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            // Permitir valores nulos o vacíos
            return true;
        }

        String fileExtension = getFileExtension(value);
        return Arrays.asList(allowedExtensions).contains(fileExtension);
    }

    private String getFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf(".");
        if (dotIndex > 0 && dotIndex < filename.length() - 1) {
            return filename.substring(dotIndex + 1).toLowerCase();
        }
        return "";
    }
}
