
package ru.acs.fts.schemas.album.commercialact;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описание подробностей об обстоятельствах выявления несоответствий
 */
public class DiscrepancyDetailsType
{
    private String recipientFlag;
    private String carrierFlag;
    private String leaksFlag;
    private List<String> leaksDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'RecipientFlag' element value. Признак присутствия представителя грузополучателя в момент выявления несоответствий: 0 - не присутствует; 1 - присутствует
     * 
     * @return value
     */
    public String getRecipientFlag() {
        return recipientFlag;
    }

    /** 
     * Set the 'RecipientFlag' element value. Признак присутствия представителя грузополучателя в момент выявления несоответствий: 0 - не присутствует; 1 - присутствует
     * 
     * @param recipientFlag
     */
    public void setRecipientFlag(String recipientFlag) {
        this.recipientFlag = recipientFlag;
    }

    /** 
     * Get the 'CarrierFlag' element value. Признак присутствия представителя перевозчика в момент выявления несоответствий: 0 - не присутствует; 1 - присутствует
     * 
     * @return value
     */
    public String getCarrierFlag() {
        return carrierFlag;
    }

    /** 
     * Set the 'CarrierFlag' element value. Признак присутствия представителя перевозчика в момент выявления несоответствий: 0 - не присутствует; 1 - присутствует
     * 
     * @param carrierFlag
     */
    public void setCarrierFlag(String carrierFlag) {
        this.carrierFlag = carrierFlag;
    }

    /** 
     * Get the 'LeaksFlag' element value. Признак наличия повреждений упаковок товаров: 0 - не присутствует; 1 - присутствует
     * 
     * @return value
     */
    public String getLeaksFlag() {
        return leaksFlag;
    }

    /** 
     * Set the 'LeaksFlag' element value. Признак наличия повреждений упаковок товаров: 0 - не присутствует; 1 - присутствует
     * 
     * @param leaksFlag
     */
    public void setLeaksFlag(String leaksFlag) {
        this.leaksFlag = leaksFlag;
    }

    /** 
     * Get the list of 'LeaksDescription' element items. Описание повреждений упаковок товаров
     * 
     * @return list
     */
    public List<String> getLeaksDescriptionList() {
        return leaksDescriptionList;
    }

    /** 
     * Set the list of 'LeaksDescription' element items. Описание повреждений упаковок товаров
     * 
     * @param list
     */
    public void setLeaksDescriptionList(List<String> list) {
        leaksDescriptionList = list;
    }
}
