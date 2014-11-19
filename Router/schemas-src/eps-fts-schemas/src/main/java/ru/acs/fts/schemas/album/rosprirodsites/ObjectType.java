
package ru.acs.fts.schemas.album.rosprirodsites;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Животное или растение, включенное в приложение СИТЕС, на ввоз/вывоз которого выдано разрешение
 */
public class ObjectType
{
    private List<String> nameList = new ArrayList<String>();
    private String sampleInfo;
    private String appNumber;
    private String countryOrigin;
    private LocalDate issueDate;
    private String numeric;
    private SupplementaryQuantityType quantity;

    /** 
     * Get the list of 'Name' element items. Русское и латинское название животного или растения, включенного в приложения СИТЕС
     * 
     * @return list
     */
    public List<String> getNameList() {
        return nameList;
    }

    /** 
     * Set the list of 'Name' element items. Русское и латинское название животного или растения, включенного в приложения СИТЕС
     * 
     * @param list
     */
    public void setNameList(List<String> list) {
        nameList = list;
    }

    /** 
     * Get the 'SampleInfo' element value. Описание образцов, включая метки
     * 
     * @return value
     */
    public String getSampleInfo() {
        return sampleInfo;
    }

    /** 
     * Set the 'SampleInfo' element value. Описание образцов, включая метки
     * 
     * @param sampleInfo
     */
    public void setSampleInfo(String sampleInfo) {
        this.sampleInfo = sampleInfo;
    }

    /** 
     * Get the 'AppNumber' element value. Номер приложения СИТЕС
     * 
     * @return value
     */
    public String getAppNumber() {
        return appNumber;
    }

    /** 
     * Set the 'AppNumber' element value. Номер приложения СИТЕС
     * 
     * @param appNumber
     */
    public void setAppNumber(String appNumber) {
        this.appNumber = appNumber;
    }

    /** 
     * Get the 'CountryOrigin' element value. Страна происхождения
     * 
     * @return value
     */
    public String getCountryOrigin() {
        return countryOrigin;
    }

    /** 
     * Set the 'CountryOrigin' element value. Страна происхождения
     * 
     * @param countryOrigin
     */
    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    /** 
     * Get the 'IssueDate' element value. Дата выдачи разрешения
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата выдачи разрешения
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'Numeric' element value. Номер позиции 
     * 
     * @return value
     */
    public String getNumeric() {
        return numeric;
    }

    /** 
     * Set the 'Numeric' element value. Номер позиции 
     * 
     * @param numeric
     */
    public void setNumeric(String numeric) {
        this.numeric = numeric;
    }

    /** 
     * Get the 'Quantity' element value. Количество
     * 
     * @return value
     */
    public SupplementaryQuantityType getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество
     * 
     * @param quantity
     */
    public void setQuantity(SupplementaryQuantityType quantity) {
        this.quantity = quantity;
    }
}
