
package ru.acs.fts.schemas.album.bartertransactionpasport;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Реквизиты и условия разрешение МВЭС России на отсрочку платежа
 */
public class PermitPaymentType extends DocumentBaseType
{
    private String deferment;

    /** 
     * Get the 'Deferment' element value. Описание отсрочки (свыше 180 дней) встречной поставки товаров, выполнения работ, услуг, передачи прав на результаты интеллектуальной деятельности согласно соответствующему разрешению МВЭС России. Указывается в той форме, в какой этот срок указан в данном разрешении.
     * 
     * @return value
     */
    public String getDeferment() {
        return deferment;
    }

    /** 
     * Set the 'Deferment' element value. Описание отсрочки (свыше 180 дней) встречной поставки товаров, выполнения работ, услуг, передачи прав на результаты интеллектуальной деятельности согласно соответствующему разрешению МВЭС России. Указывается в той форме, в какой этот срок указан в данном разрешении.
     * 
     * @param deferment
     */
    public void setDeferment(String deferment) {
        this.deferment = deferment;
    }
}
