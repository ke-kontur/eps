
package ru.acs.fts.schemas.album.warehousecommonleaftypescust;

/** 
 * Вид меры таможенного контроля, применяемой к товарам на временном хранении
 */
public enum CustomsControlKind {
    CC_GOOD_KEEPING_LIMIT("cc_GoodKeepingLimit"), CC_INFO("cc_Info"), CC_SUSPEND_FREE_MODE(
            "cc_SuspendFreeMode"), CC_RESUME_FREE_MODE("cc_ResumeFreeMode"), CC_ARREST(
            "cc_Arrest");
    private final String value;

    private CustomsControlKind(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static CustomsControlKind convert(String value) {
        for (CustomsControlKind inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
