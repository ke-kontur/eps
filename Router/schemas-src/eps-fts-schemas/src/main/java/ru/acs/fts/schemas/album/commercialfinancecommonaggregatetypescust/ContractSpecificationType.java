
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Спецификация к контракту
 */
public class ContractSpecificationType
{
    private String ID;
    private LocalDate issueDate;
    private List<SpecificationGoodsExtendedType> specificationGoodsExtendedList = new ArrayList<SpecificationGoodsExtendedType>();

    /** 
     * Get the 'ID' element value. Номер документа
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' element value. Номер документа
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /** 
     * Get the 'IssueDate' element value. Дата составления документа
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата составления документа
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the list of 'SpecificationGoodsExtended' element items. Описание и дополнительные характеристики товаров из спецификации к контракту
     * 
     * @return list
     */
    public List<SpecificationGoodsExtendedType> getSpecificationGoodsExtendedList() {
        return specificationGoodsExtendedList;
    }

    /** 
     * Set the list of 'SpecificationGoodsExtended' element items. Описание и дополнительные характеристики товаров из спецификации к контракту
     * 
     * @param list
     */
    public void setSpecificationGoodsExtendedList(
            List<SpecificationGoodsExtendedType> list) {
        specificationGoodsExtendedList = list;
    }
}
