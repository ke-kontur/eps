
package ru.acs.fts.schemas.album.freedoc;

/** 
 * Стили выравнивания по горизонтали
 */
public enum AlignType {
    CENTER("Center"), LEFT("Left"), RIGHT("Right");
    private final String value;

    private AlignType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static AlignType convert(String value) {
        for (AlignType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
