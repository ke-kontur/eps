
package ru.acs.fts.schemas.album.mistakeletter;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WareHouseReportLinkDataType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WarehouseOwnerType;

/** 
 * Письмо владельца СВХ о самостоятельно выявленных ошибках в отчетности по форме ДО-1
 */
public class MistakeLetterType extends BaseDocType
{
    private LetterDetailsType letterDetails;
    private WareHouseReportLinkDataType DO1Report;
    private WarehouseOwnerType warehouseOwner;
    private MistakesInfoType mistakesInfo;
    private PersonBaseType wareHousePerson;
    private String documentModeID;

    /** 
     * Get the 'LetterDetails' element value. Сведения о письме
     * 
     * @return value
     */
    public LetterDetailsType getLetterDetails() {
        return letterDetails;
    }

    /** 
     * Set the 'LetterDetails' element value. Сведения о письме
     * 
     * @param letterDetails
     */
    public void setLetterDetails(LetterDetailsType letterDetails) {
        this.letterDetails = letterDetails;
    }

    /** 
     * Get the 'DO1Report' element value. Сведения об отчете о принятии по форме ДО-1, в отношении которого составлено настоящее Письмо
     * 
     * @return value
     */
    public WareHouseReportLinkDataType getDO1Report() {
        return DO1Report;
    }

    /** 
     * Set the 'DO1Report' element value. Сведения об отчете о принятии по форме ДО-1, в отношении которого составлено настоящее Письмо
     * 
     * @param DO1Report
     */
    public void setDO1Report(WareHouseReportLinkDataType DO1Report) {
        this.DO1Report = DO1Report;
    }

    /** 
     * Get the 'WarehouseOwner' element value. Данные о владельце склада
     * 
     * @return value
     */
    public WarehouseOwnerType getWarehouseOwner() {
        return warehouseOwner;
    }

    /** 
     * Set the 'WarehouseOwner' element value. Данные о владельце склада
     * 
     * @param warehouseOwner
     */
    public void setWarehouseOwner(WarehouseOwnerType warehouseOwner) {
        this.warehouseOwner = warehouseOwner;
    }

    /** 
     * Get the 'MistakesInfo' element value. Сведения о выявленных ошибках
     * 
     * @return value
     */
    public MistakesInfoType getMistakesInfo() {
        return mistakesInfo;
    }

    /** 
     * Set the 'MistakesInfo' element value. Сведения о выявленных ошибках
     * 
     * @param mistakesInfo
     */
    public void setMistakesInfo(MistakesInfoType mistakesInfo) {
        this.mistakesInfo = mistakesInfo;
    }

    /** 
     * Get the 'WareHousePerson' element value. Уполномоченный сотрудник склада, подписавший настоящее Письмо
     * 
     * @return value
     */
    public PersonBaseType getWareHousePerson() {
        return wareHousePerson;
    }

    /** 
     * Set the 'WareHousePerson' element value. Уполномоченный сотрудник склада, подписавший настоящее Письмо
     * 
     * @param wareHousePerson
     */
    public void setWareHousePerson(PersonBaseType wareHousePerson) {
        this.wareHousePerson = wareHousePerson;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
