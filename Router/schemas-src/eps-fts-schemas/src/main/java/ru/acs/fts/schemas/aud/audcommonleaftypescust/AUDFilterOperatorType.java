
package ru.acs.fts.schemas.aud.audcommonleaftypescust;

/** 
 * Оператор фильтра.
 */
public enum AUDFilterOperatorType {
    EMPTY("empty"), NOT_EMPTY("not_empty"), EQUAL("equal"), NOT_EQUAL(
            "not_equal"), LIKE("like"), MORE_THAN("more_than"), MORE_THAN_OR_EQUAL(
            "more_than_or_equal"), LESS_THAN("less_than"), LESS_THAN_OR_EQUAL(
            "less_than_or_equal"), BETWEEN("between"), BETWEEN_OR_EQUAL(
            "between_or_equal");
    private final String value;

    private AUDFilterOperatorType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static AUDFilterOperatorType convert(String value) {
        for (AUDFilterOperatorType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
