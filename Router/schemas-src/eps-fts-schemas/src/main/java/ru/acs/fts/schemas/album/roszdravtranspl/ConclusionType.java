
package ru.acs.fts.schemas.album.roszdravtranspl;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.sqcommonaggregatetypescust.DocumentType;

/** 
 * Сведения о заключениях на ввоз костного мозга и гемопоэтических стволовых клеток с целью проведения неродственной трансплантации
 */
public class ConclusionType
{
    private List<String> descriptionGoodList = new ArrayList<String>();
    private String country;
    private DocumentType conclusionDescription;
    private OrganizationBaseType owner;
    private OrganizationBaseType recipient;
    private DocumentType contractDescription;
    private SupplementaryQuantityType quantityGoods;

    /** 
     * Get the list of 'DescriptionGoods' element items. Описание товара
     * 
     * @return list
     */
    public List<String> getDescriptionGoodList() {
        return descriptionGoodList;
    }

    /** 
     * Set the list of 'DescriptionGoods' element items. Описание товара
     * 
     * @param list
     */
    public void setDescriptionGoodList(List<String> list) {
        descriptionGoodList = list;
    }

    /** 
     * Get the 'Country' element value. Страна происхождения
     * 
     * @return value
     */
    public String getCountry() {
        return country;
    }

    /** 
     * Set the 'Country' element value. Страна происхождения
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /** 
     * Get the 'ConclusionDescription' element value. Сведения о заключении
     * 
     * @return value
     */
    public DocumentType getConclusionDescription() {
        return conclusionDescription;
    }

    /** 
     * Set the 'ConclusionDescription' element value. Сведения о заключении
     * 
     * @param conclusionDescription
     */
    public void setConclusionDescription(DocumentType conclusionDescription) {
        this.conclusionDescription = conclusionDescription;
    }

    /** 
     * Get the 'Owner' element value. Сведения о держателе заключения
     * 
     * @return value
     */
    public OrganizationBaseType getOwner() {
        return owner;
    }

    /** 
     * Set the 'Owner' element value. Сведения о держателе заключения
     * 
     * @param owner
     */
    public void setOwner(OrganizationBaseType owner) {
        this.owner = owner;
    }

    /** 
     * Get the 'Recipient' element value. Сведения о грузополучателе
     * 
     * @return value
     */
    public OrganizationBaseType getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. Сведения о грузополучателе
     * 
     * @param recipient
     */
    public void setRecipient(OrganizationBaseType recipient) {
        this.recipient = recipient;
    }

    /** 
     * Get the 'ContractDescription' element value. Описание договора
     * 
     * @return value
     */
    public DocumentType getContractDescription() {
        return contractDescription;
    }

    /** 
     * Set the 'ContractDescription' element value. Описание договора
     * 
     * @param contractDescription
     */
    public void setContractDescription(DocumentType contractDescription) {
        this.contractDescription = contractDescription;
    }

    /** 
     * Get the 'QuantityGoods' element value. Количество товара
     * 
     * @return value
     */
    public SupplementaryQuantityType getQuantityGoods() {
        return quantityGoods;
    }

    /** 
     * Set the 'QuantityGoods' element value. Количество товара
     * 
     * @param quantityGoods
     */
    public void setQuantityGoods(SupplementaryQuantityType quantityGoods) {
        this.quantityGoods = quantityGoods;
    }
}
