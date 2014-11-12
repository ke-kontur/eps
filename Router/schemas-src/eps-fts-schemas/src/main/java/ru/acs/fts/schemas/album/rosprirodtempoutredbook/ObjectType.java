
package ru.acs.fts.schemas.album.rosprirodtempoutredbook;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Животные или растения, занесённые в Красную книгу
 */
public class ObjectType
{
    private List<String> nameList = new ArrayList<String>();
    private String numeric;
    private String country;
    private String purposeExport;
    private DocumentBaseType contract;
    private CountMarksType count;

    /** 
     * Get the list of 'Name' element items. Русское и латинское название животных  или растений, включенных Красную книгу Российской Федерации
     * 
     * @return list
     */
    public List<String> getNameList() {
        return nameList;
    }

    /** 
     * Set the list of 'Name' element items. Русское и латинское название животных  или растений, включенных Красную книгу Российской Федерации
     * 
     * @param list
     */
    public void setNameList(List<String> list) {
        nameList = list;
    }

    /** 
     * Get the 'Numeric' element value. Номер позиции товара по приложению разрешительного документа
     * 
     * @return value
     */
    public String getNumeric() {
        return numeric;
    }

    /** 
     * Set the 'Numeric' element value. Номер позиции товара по приложению разрешительного документа
     * 
     * @param numeric
     */
    public void setNumeric(String numeric) {
        this.numeric = numeric;
    }

    /** 
     * Get the 'Country' element value. Страна назначения
     * 
     * @return value
     */
    public String getCountry() {
        return country;
    }

    /** 
     * Set the 'Country' element value. Страна назначения
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /** 
     * Get the 'PurposeExport' element value. Цель вывоза
     * 
     * @return value
     */
    public String getPurposeExport() {
        return purposeExport;
    }

    /** 
     * Set the 'PurposeExport' element value. Цель вывоза
     * 
     * @param purposeExport
     */
    public void setPurposeExport(String purposeExport) {
        this.purposeExport = purposeExport;
    }

    /** 
     * Get the 'Contract' element value. Реквизиты контракта
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Реквизиты контракта
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the 'Count' element value. Количество животных (растений), их пол, возраст, метки и др.
     * 
     * @return value
     */
    public CountMarksType getCount() {
        return count;
    }

    /** 
     * Set the 'Count' element value. Количество животных (растений), их пол, возраст, метки и др.
     * 
     * @param count
     */
    public void setCount(CountMarksType count) {
        this.count = count;
    }
}
