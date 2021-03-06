package hardcoded.qual;

import org.checkerframework.framework.qual.ImplicitFor;
import org.checkerframework.framework.qual.LiteralKind;
import org.checkerframework.framework.qual.SubtypeOf;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.lang.model.type.TypeKind;

/**
 * Represents data that is not hardcoded.
 *
 * @see MaybeHardcoded
 * @see PolyHardcoded
 * @see trusted.qual.Trusted
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({MaybeHardcoded.class})
@ImplicitFor(
        literals={ LiteralKind.NULL },
        types={ TypeKind.NULL })
public @interface NotHardcoded {}
