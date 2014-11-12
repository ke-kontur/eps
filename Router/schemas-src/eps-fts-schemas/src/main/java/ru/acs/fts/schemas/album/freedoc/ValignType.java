
package ru.acs.fts.schemas.album.freedoc;

/** 
 * Стили выравнивания по вертикали
 */
public enum ValignType {
    BOTTOM("Bottom"), MIDDLE("Middle"), TOP("Top");
    private final String value;

    private ValignType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static ValignType convert(String value) {
        for (ValignType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
