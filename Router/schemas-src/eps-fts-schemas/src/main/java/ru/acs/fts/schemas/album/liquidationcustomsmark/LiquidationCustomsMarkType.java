
package ru.acs.fts.schemas.album.liquidationcustomsmark;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ������� ����������� ������ �� ��������� �� ����������� ������� � (���) ��������, ��������� � ����������
 */
public class LiquidationCustomsMarkType extends BaseDocType
{
    private LocalDate composeDate;
    private String customsDecision;
    private LocalDate liquidationDate;
    private String customsControl;
    private List<String> refusalReasonList = new ArrayList<String>();
    private ApplicationRegNumberType applicationRegNumber;
    private CustomsPersonType customsPerson;
    private CUCustomsType customs;
    private DocumentBaseType prolongFoundation;
    private String documentModeID;

    /** 
     * Get the 'ComposeDate' element value. ���� ������������ ���������� �������
     * 
     * @return value
     */
    public LocalDate getComposeDate() {
        return composeDate;
    }

    /** 
     * Set the 'ComposeDate' element value. ���� ������������ ���������� �������
     * 
     * @param composeDate
     */
    public void setComposeDate(LocalDate composeDate) {
        this.composeDate = composeDate;
    }

    /** 
     * Get the 'CustomsDecision' element value. ��� ������� ����������� ������: 1 - ���������� �� �����������; 2 - ��������� ����� �����������; 3 - ����� � ������ ����������; 4 - ����� � ��������� ����� �����������
     * 
     * @return value
     */
    public String getCustomsDecision() {
        return customsDecision;
    }

    /** 
     * Set the 'CustomsDecision' element value. ��� ������� ����������� ������: 1 - ���������� �� �����������; 2 - ��������� ����� �����������; 3 - ����� � ������ ����������; 4 - ����� � ��������� ����� �����������
     * 
     * @param customsDecision
     */
    public void setCustomsDecision(String customsDecision) {
        this.customsDecision = customsDecision;
    }

    /** 
     * Get the 'LiquidationDate' element value. ���� �����������
     * 
     * @return value
     */
    public LocalDate getLiquidationDate() {
        return liquidationDate;
    }

    /** 
     * Set the 'LiquidationDate' element value. ���� �����������
     * 
     * @param liquidationDate
     */
    public void setLiquidationDate(LocalDate liquidationDate) {
        this.liquidationDate = liquidationDate;
    }

    /** 
     * Get the 'CustomsControl' element value. ������� ������������� ���������� ����������� ����������
     * 
     * @return value
     */
    public String getCustomsControl() {
        return customsControl;
    }

    /** 
     * Set the 'CustomsControl' element value. ������� ������������� ���������� ����������� ����������
     * 
     * @param customsControl
     */
    public void setCustomsControl(String customsControl) {
        this.customsControl = customsControl;
    }

    /** 
     * Get the list of 'RefusalReasons' element items. ������� ������������� ������ ���������� �� �����������/������ � ��������� �����
     * 
     * @return list
     */
    public List<String> getRefusalReasonList() {
        return refusalReasonList;
    }

    /** 
     * Set the list of 'RefusalReasons' element items. ������� ������������� ������ ���������� �� �����������/������ � ��������� �����
     * 
     * @param list
     */
    public void setRefusalReasonList(List<String> list) {
        refusalReasonList = list;
    }

    /** 
     * Get the 'ApplicationRegNumber' element value. ��������������� ����� ��������� �� �����������
     * 
     * @return value
     */
    public ApplicationRegNumberType getApplicationRegNumber() {
        return applicationRegNumber;
    }

    /** 
     * Set the 'ApplicationRegNumber' element value. ��������������� ����� ��������� �� �����������
     * 
     * @param applicationRegNumber
     */
    public void setApplicationRegNumber(
            ApplicationRegNumberType applicationRegNumber) {
        this.applicationRegNumber = applicationRegNumber;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Customs' element value. �������������� ���������� �����
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. �������������� ���������� �����
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'ProlongFoundation' element value. ��������� ��������� ����� �����������
     * 
     * @return value
     */
    public DocumentBaseType getProlongFoundation() {
        return prolongFoundation;
    }

    /** 
     * Set the 'ProlongFoundation' element value. ��������� ��������� ����� �����������
     * 
     * @param prolongFoundation
     */
    public void setProlongFoundation(DocumentBaseType prolongFoundation) {
        this.prolongFoundation = prolongFoundation;
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
