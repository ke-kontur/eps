
package ru.acs.fts.schemas.album.mistakeletter;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WareHouseReportLinkDataType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WarehouseOwnerType;

/** 
 * ������ ��������� ��� � �������������� ���������� ������� � ���������� �� ����� ��-1
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
     * Get the 'LetterDetails' element value. �������� � ������
     * 
     * @return value
     */
    public LetterDetailsType getLetterDetails() {
        return letterDetails;
    }

    /** 
     * Set the 'LetterDetails' element value. �������� � ������
     * 
     * @param letterDetails
     */
    public void setLetterDetails(LetterDetailsType letterDetails) {
        this.letterDetails = letterDetails;
    }

    /** 
     * Get the 'DO1Report' element value. �������� �� ������ � �������� �� ����� ��-1, � ��������� �������� ���������� ��������� ������
     * 
     * @return value
     */
    public WareHouseReportLinkDataType getDO1Report() {
        return DO1Report;
    }

    /** 
     * Set the 'DO1Report' element value. �������� �� ������ � �������� �� ����� ��-1, � ��������� �������� ���������� ��������� ������
     * 
     * @param DO1Report
     */
    public void setDO1Report(WareHouseReportLinkDataType DO1Report) {
        this.DO1Report = DO1Report;
    }

    /** 
     * Get the 'WarehouseOwner' element value. ������ � ��������� ������
     * 
     * @return value
     */
    public WarehouseOwnerType getWarehouseOwner() {
        return warehouseOwner;
    }

    /** 
     * Set the 'WarehouseOwner' element value. ������ � ��������� ������
     * 
     * @param warehouseOwner
     */
    public void setWarehouseOwner(WarehouseOwnerType warehouseOwner) {
        this.warehouseOwner = warehouseOwner;
    }

    /** 
     * Get the 'MistakesInfo' element value. �������� � ���������� �������
     * 
     * @return value
     */
    public MistakesInfoType getMistakesInfo() {
        return mistakesInfo;
    }

    /** 
     * Set the 'MistakesInfo' element value. �������� � ���������� �������
     * 
     * @param mistakesInfo
     */
    public void setMistakesInfo(MistakesInfoType mistakesInfo) {
        this.mistakesInfo = mistakesInfo;
    }

    /** 
     * Get the 'WareHousePerson' element value. �������������� ��������� ������, ����������� ��������� ������
     * 
     * @return value
     */
    public PersonBaseType getWareHousePerson() {
        return wareHousePerson;
    }

    /** 
     * Set the 'WareHousePerson' element value. �������������� ��������� ������, ����������� ��������� ������
     * 
     * @param wareHousePerson
     */
    public void setWareHousePerson(PersonBaseType wareHousePerson) {
        this.wareHousePerson = wareHousePerson;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
