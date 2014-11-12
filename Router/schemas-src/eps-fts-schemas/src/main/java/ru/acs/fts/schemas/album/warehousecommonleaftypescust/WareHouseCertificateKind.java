
package ru.acs.fts.schemas.album.warehousecommonleaftypescust;

/** 
 * Вид документа, на основании которого владелец СВХ осуществляет деятельность. lic_Certificate - Свидетельство о включении в реестр владельцев СВХ; lic_Licence - Лицензия владельца СВХ; lic_Permition - Разрешение ТО на временное хранение в ином месте; lic_PermZtk - Номер приказа о создании постоянной зоны таможенного контроля; lic_TempZtk - Номер приказа о создании временной зоны таможенного контроля.
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
