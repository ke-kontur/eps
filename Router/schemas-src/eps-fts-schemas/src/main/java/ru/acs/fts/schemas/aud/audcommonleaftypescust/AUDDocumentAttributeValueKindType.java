
package ru.acs.fts.schemas.aud.audcommonleaftypescust;

/** 
 * ������������� ���� �������� ��������� ���������.
 */
public enum AUDDocumentAttributeValueKindType {
    STRING("string"), INTEGER("integer"), REAL("real"), DATETIME("datetime"), DATE(
            "date"), TIME("time"), BOOLEAN("boolean"), DURATION("duration");
    private final String value;

    private AUDDocumentAttributeValueKindType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static AUDDocumentAttributeValueKindType convert(String value) {
        for (AUDDocumentAttributeValueKindType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
