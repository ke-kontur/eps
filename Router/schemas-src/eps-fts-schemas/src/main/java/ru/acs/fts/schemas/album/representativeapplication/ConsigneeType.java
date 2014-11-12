
package ru.acs.fts.schemas.album.representativeapplication;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Получатель
 */
public class ConsigneeType extends CUOrganizationType
{
    private String consigneeSign;

    /** 
     * Get the 'ConsigneeSign' element value. Признак получателя: 0 - по товаросопроводительным документам; 1 - по доверенности
     * 
     * @return value
     */
    public String getConsigneeSign() {
        return consigneeSign;
    }

    /** 
     * Set the 'ConsigneeSign' element value. Признак получателя: 0 - по товаросопроводительным документам; 1 - по доверенности
     * 
     * @param consigneeSign
     */
    public void setConsigneeSign(String consigneeSign) {
        this.consigneeSign = consigneeSign;
    }
}
