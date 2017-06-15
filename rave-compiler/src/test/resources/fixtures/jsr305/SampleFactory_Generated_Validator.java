package fixtures;

import com.uber.rave.BaseValidator;
import com.uber.rave.InvalidModelException;
import com.uber.rave.RaveError;
import fixtures.jsr305.UseOfJSR305;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;

@Generated(
        value = "com.uber.rave.compiler.RaveProcessor",
        comments = "https://github.com/uber-common/rave"
)
public final class SampleFactory_Generated_Validator extends BaseValidator {
    SampleFactory_Generated_Validator() {
        addSupportedClass(UseOfJSR305.class);
        registerSelf();
    }

    @Override
    protected void validateAs(Object object, Class<?> clazz) throws InvalidModelException {
        if (!clazz.isInstance(object)) {
            throw new IllegalArgumentException(object.getClass().getCanonicalName() + "is not of type" + clazz.getCanonicalName());
        }
        if (clazz.equals(UseOfJSR305.class)) {
            validateAs((UseOfJSR305) object);
            return;
        }
        throw new IllegalArgumentException(object.getClass().getCanonicalName() + " is not supported by validator " + this.getClass().getCanonicalName());
    }

    private void validateAs(UseOfJSR305 object) throws InvalidModelException {
        BaseValidator.ValidationContext context = getValidationContext(UseOfJSR305.class);
        List<RaveError> raveErrors = null;
        context.setValidatedItemName("getNotNullField()");
        raveErrors = mergeErrors(raveErrors, checkNullable(object.getNotNullField(), false, context));
        context.setValidatedItemName("getCanBeNullField()");
        raveErrors = mergeErrors(raveErrors, checkNullable(object.getCanBeNullField(), true, context));
        if (raveErrors != null && !raveErrors.isEmpty()) {
            throw new InvalidModelException(raveErrors);
        }
    }

    public static void validateInternalFor_fixtures_jsr305_UseOfJSR305(String notNullField,
            String canBeNullField) throws InvalidModelException {
        BaseValidator.ValidationContext context = getValidationContext(UseOfJSR305.class);
        List<RaveError> raveErrors = null;
        context.setValidatedItemName("notNullField");
        raveErrors = mergeErrors(raveErrors, checkNullable(notNullField, true, context));
        context.setValidatedItemName("canBeNullField");
        raveErrors = mergeErrors(raveErrors, checkNullable(canBeNullField, true, context));
        if (raveErrors != null && !raveErrors.isEmpty()) {
            throw new InvalidModelException(raveErrors);
        }
    }
}
