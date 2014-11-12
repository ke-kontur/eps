
package ru.acs.fts.schemas.album.liquidationactcustomsmark;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ���������� ������� � ���� �� �����������
 */
public class LiquidationActCustomsMarkType extends BaseDocType
{
    private String customsMark;
    private String neededActions;
    private LocalDate actPresentDate;
    private ActRegNumberType actRegNumber;
    private PersonSignatureType customsPerson;
    private CUCustomsType customs;
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
     * Get the 'Customs' element value. �������� � ���������� ������
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. �������� � ���������� ������
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
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
