
package ru.acs.fts.schemas.album.liquidationactin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ��� �� ����������� (���������� ������)
 */
public class LiquidationActInType extends BaseDocType
{
    private String customsMark;
    private String neededActions;
    private LocalDate actPresentDate;
    private LiquidationParticipantType residentOEZ;
    private LiquidationParticipantType liquidator;
    private CUCustomsType CUCustoms;
    private AddressType liquidationPlace;
    private List<WasteProductsType> wasteProductList = new ArrayList<WasteProductsType>();
    private List<ParticipatedPersonType> participatedPersonList = new ArrayList<ParticipatedPersonType>();
    private ApplicationRegNumberType applicationRegNumber;
    private ActRegNumberType actRegNumber;
    private PersonSignatureType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'CustomsMark' element value. ������� ������������ ���� ����������� ������: 0 - �������� �� �������������; 1 - ����� ���� � ��������
     * 
     * @return value
     */
    public String getCustomsMark() {
        return customsMark;
    }

    /** 
     * Set the 'CustomsMark' element value. ������� ������������ ���� ����������� ������: 0 - �������� �� �������������; 1 - ����� ���� � ��������
     * 
     * @param customsMark
     */
    public void setCustomsMark(String customsMark) {
        this.customsMark = customsMark;
    }

    /** 
     * Get the 'NeededActions' element value. ��������, ������� ���������� ��������� ��� ���������� ��������������
     * 
     * @return value
     */
    public String getNeededActions() {
        return neededActions;
    }

    /** 
     * Set the 'NeededActions' element value. ��������, ������� ���������� ��������� ��� ���������� ��������������
     * 
     * @param neededActions
     */
    public void setNeededActions(String neededActions) {
        this.neededActions = neededActions;
    }

    /** 
     * Get the 'ActPresentDate' element value. ���� ������������� ���� �� �����������
     * 
     * @return value
     */
    public LocalDate getActPresentDate() {
        return actPresentDate;
    }

    /** 
     * Set the 'ActPresentDate' element value. ���� ������������� ���� �� �����������
     * 
     * @param actPresentDate
     */
    public void setActPresentDate(LocalDate actPresentDate) {
        this.actPresentDate = actPresentDate;
    }

    /** 
     * Get the 'ResidentOEZ' element value. �������� ���/���������� ���
     * 
     * @return value
     */
    public LiquidationParticipantType getResidentOEZ() {
        return residentOEZ;
    }

    /** 
     * Set the 'ResidentOEZ' element value. �������� ���/���������� ���
     * 
     * @param residentOEZ
     */
    public void setResidentOEZ(LiquidationParticipantType residentOEZ) {
        this.residentOEZ = residentOEZ;
    }

    /** 
     * Get the 'Liquidator' element value. ����, �������������� �����������
     * 
     * @return value
     */
    public LiquidationParticipantType getLiquidator() {
        return liquidator;
    }

    /** 
     * Set the 'Liquidator' element value. ����, �������������� �����������
     * 
     * @param liquidator
     */
    public void setLiquidator(LiquidationParticipantType liquidator) {
        this.liquidator = liquidator;
    }

    /** 
     * Get the 'CUCustoms' element value. �������� � ���������� ������
     * 
     * @return value
     */
    public CUCustomsType getCUCustoms() {
        return CUCustoms;
    }

    /** 
     * Set the 'CUCustoms' element value. �������� � ���������� ������
     * 
     * @param CUCustoms
     */
    public void setCUCustoms(CUCustomsType CUCustoms) {
        this.CUCustoms = CUCustoms;
    }

    /** 
     * Get the 'LiquidationPlace' element value. ����� �����������
     * 
     * @return value
     */
    public AddressType getLiquidationPlace() {
        return liquidationPlace;
    }

    /** 
     * Set the 'LiquidationPlace' element value. ����� �����������
     * 
     * @param liquidationPlace
     */
    public void setLiquidationPlace(AddressType liquidationPlace) {
        this.liquidationPlace = liquidationPlace;
    }

    /** 
     * Get the list of 'WasteProducts' element items. ������, ���������� �� ������� � (���) ��������
     * 
     * @return list
     */
    public List<WasteProductsType> getWasteProductList() {
        return wasteProductList;
    }

    /** 
     * Set the list of 'WasteProducts' element items. ������, ���������� �� ������� � (���) ��������
     * 
     * @param list
     */
    public void setWasteProductList(List<WasteProductsType> list) {
        wasteProductList = list;
    }

    /** 
     * Get the list of 'ParticipatedPerson' element items. ����, �������������� ��� �����������
     * 
     * @return list
     */
    public List<ParticipatedPersonType> getParticipatedPersonList() {
        return participatedPersonList;
    }

    /** 
     * Set the list of 'ParticipatedPerson' element items. ����, �������������� ��� �����������
     * 
     * @param list
     */
    public void setParticipatedPersonList(List<ParticipatedPersonType> list) {
        participatedPersonList = list;
    }

    /** 
     * Get the 'ApplicationRegNumber' element value. ��������������� ����� ���������
     * 
     * @return value
     */
    public ApplicationRegNumberType getApplicationRegNumber() {
        return applicationRegNumber;
    }

    /** 
     * Set the 'ApplicationRegNumber' element value. ��������������� ����� ���������
     * 
     * @param applicationRegNumber
     */
    public void setApplicationRegNumber(
            ApplicationRegNumberType applicationRegNumber) {
        this.applicationRegNumber = applicationRegNumber;
    }

    /** 
     * Get the 'ActRegNumber' element value. ��������������� ����� ���� �� �����������
     * 
     * @return value
     */
    public ActRegNumberType getActRegNumber() {
        return actRegNumber;
    }

    /** 
     * Set the 'ActRegNumber' element value. ��������������� ����� ���� �� �����������
     * 
     * @param actRegNumber
     */
    public void setActRegNumber(ActRegNumberType actRegNumber) {
        this.actRegNumber = actRegNumber;
    }

    /** 
     * Get the 'CustomsPerson' element value. ������� ��������������� ���� ����������� ������
     * 
     * @return value
     */
    public PersonSignatureType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ������� ��������������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(PersonSignatureType customsPerson) {
        this.customsPerson = customsPerson;
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
