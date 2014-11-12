
package ru.acs.fts.schemas.aud.audcommonleaftypescust;

/** 
 * Возможные значения для запроса версий документа архива.
 */
public enum AUDDocumentVersionsRequestType {
    ALL_VERSIONS("all_versions"), LAST_VERSION("last_version");
    private final String value;

    private AUDDocumentVersionsRequestType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static AUDDocumentVersionsRequestType convert(String value) {
        for (AUDDocumentVersionsRequestType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
