
package ru.acs.fts.schemas.album.warehousecommonleaftypescust;

/** 
 * Вид отчета ДО2
 */
public enum DO2ReportKind {
    ACT_DELIVERY("act_Delivery"), ACT_WRITTEN_OFF("act_WrittenOff");
    private final String value;

    private DO2ReportKind(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static DO2ReportKind convert(String value) {
        for (DO2ReportKind inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}
