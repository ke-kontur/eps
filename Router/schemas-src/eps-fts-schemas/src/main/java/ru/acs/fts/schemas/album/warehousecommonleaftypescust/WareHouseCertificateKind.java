
package ru.acs.fts.schemas.album.warehousecommonleaftypescust;

/** 
 * ��� ���������, �� ��������� �������� �������� ��� ������������ ������������. lic_Certificate - ������������� � ��������� � ������ ���������� ���; lic_Licence - �������� ��������� ���; lic_Permition - ���������� �� �� ��������� �������� � ���� �����; lic_PermZtk - ����� ������� � �������� ���������� ���� ����������� ��������; lic_TempZtk - ����� ������� � �������� ��������� ���� ����������� ��������.
 */
public enum WareHouseCertificateKind {
    LIC_CERTIFICATE("lic_Certificate"), LIC_LICENCE("lic_Licence"), LIC_PERMITION(
            "lic_Permition"), LIC_PERM_ZTK("lic_PermZtk"), LIC_TEMP_ZTK(
            "lic_TempZtk");
    private final String value;

    private WareHouseCertificateKind(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static WareHouseCertificateKind convert(String value) {
        for (WareHouseCertificateKind inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
