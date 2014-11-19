
package ru.acs.fts.schemas.album.warehousecommonleaftypescust;

/** 
 * ������������ ��� ����� ��������� �������������� ������ ���������������������� ����������: mist_AtAcceptance - �������������� �������� �� ����� �������� ������; mist_AtKeeping - �������������� �������� � �������� ���������� �������� ������.
 */
public enum GoodMismatchStageType {
    MIST_AT_ACCEPTANCE("mist_AtAcceptance"), MIST_AT_KEEPING("mist_AtKeeping");
    private final String value;

    private GoodMismatchStageType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static GoodMismatchStageType convert(String value) {
        for (GoodMismatchStageType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
