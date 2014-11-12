
package ru.acs.fts.schemas.album.warehousecommonleaftypescust;

/** 
 * Таможенный статус отчета
 */
public enum CustomDocumentState {
    DS_EDITING("ds_Editing"), DS_REBUILDING("ds_Rebuilding"), DS_ON_INSPECT(
            "ds_OnInspect"), DS_REGISTERED("ds_Registered");
    private final String value;

    private CustomDocumentState(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static CustomDocumentState convert(String value) {
        for (CustomDocumentState inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
