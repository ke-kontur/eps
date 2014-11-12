
package ru.acs.fts.schemas.album.warehousecommonleaftypescust;

/** 
 * Перечислимый тип вида выявленного несоответствия товара товаросопроводительным документам:mism_ResortGood - Товар есть в наличии, но его характеристики не соответствуют заявленным в товаросопроводительных документах; mism_MissedGood - Товар был заявлен в товаросопроводительных документах, но отсутствует по факту; mism_ExtraGood - Дополнительный (лишний) товар, отсутствовавший в товаросопроводительных документах, но выявленный по факту.
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
