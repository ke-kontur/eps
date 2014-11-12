
package ru.acs.fts.schemas.album.freedoc;

/** 
 * Стили текста
 */
public enum TextStyleType {
    BOLD("Bold"), ITALIC("Italic"), NORMAL("Normal");
    private final String value;

    private TextStyleType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static TextStyleType convert(String value) {
        for (TextStyleType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
