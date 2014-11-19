
package ru.acs.fts.schemas.album.warehousecommonleaftypescust;

/** 
 * ������������ ��� ���� ����������� �������������� ������ ���������������������� ����������:mism_ResortGood - ����� ���� � �������, �� ��� �������������� �� ������������� ���������� � ���������������������� ����������; mism_MissedGood - ����� ��� ������� � ���������������������� ����������, �� ����������� �� �����; mism_ExtraGood - �������������� (������) �����, ��������������� � ���������������������� ����������, �� ���������� �� �����.
 */
public enum GoodMismatchKind {
    MISM_RESORT_GOOD("mism_ResortGood"), MISM_MISSED_GOOD("mism_MissedGood"), MISM_EXTRA_GOOD(
            "mism_ExtraGood");
    private final String value;

    private GoodMismatchKind(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static GoodMismatchKind convert(String value) {
        for (GoodMismatchKind inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
