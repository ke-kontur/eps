package ru.acs.fst.router;

import org.apache.camel.component.bean.XPathAnnotationExpressionFactory;
import org.apache.camel.language.LanguageAnnotation;
import org.apache.camel.language.NamespacePrefix;
import org.w3c.dom.NodeList;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@LanguageAnnotation(language = "xpath", factory = XPathAnnotationExpressionFactory.class)
public @interface CustomsXPath {
    String value();
    // You can add the namespaces as the default value of the annotation

    NamespacePrefix[] namespaces() default {
            @NamespacePrefix(prefix = "soap", uri = "http://www.w3.org/2001/06/soap-envelope"),
            @NamespacePrefix(prefix = "rou", uri = "urn:customs.ru:Envelope:RoutingInf:1.0"),
            @NamespacePrefix(prefix = "app", uri = "urn:customs.ru:Envelope:ApplicationInf:1.0")};

    Class<?> resultType() default NodeList.class;
}
