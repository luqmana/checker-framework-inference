package ostrusted;

import javax.lang.model.util.Elements;

import ostrusted.qual.OsTrusted;
import ostrusted.qual.OsUntrusted;

import org.checkerframework.javacutil.AnnotationUtils;

import trusted.TrustedChecker;

/**
 * 
 * @author sdietzel
 * [2]  CWE-78  Improper Neutralization of Special Elements used in an OS Command ('OS Command Injection')
 */
public class OsTrustedChecker extends TrustedChecker {

    @Override
    protected void setAnnotations() {
        final Elements elements = processingEnv.getElementUtils();      //TODO: Makes you think a utils is being returned

        UNTRUSTED = AnnotationUtils.fromClass(elements, OsUntrusted.class);
        TRUSTED   = AnnotationUtils.fromClass(elements, OsTrusted.class);
    }
}