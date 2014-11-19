
package ru.acs.fts.schemas.album.addcustomerregrefusal;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����� � �������� ���������� � �������� �������������� ����������� �����.
 */
public class AddCustomerRegRefusalType extends BaseDocType
{
    private LocalDate refusalDate;
    private String GRN;
    private CUCustomsType destinationCustoms;
    private CustomsPersonType customsPerson;
    private List<RefuseReasonType> refuseReasonList = new ArrayList<RefuseReasonType>();
    private GTDIDType additionalNumber;
    private String documentModeID;

    /** 
     * Get the 'RefusalDate' element value. ���� �������� ������� �� ������.
     * 
     * @return value
     */
    public LocalDate getRefusalDate() {
        return refusalDate;
    }

    /** 
     * Set the 'RefusalDate' element value. ���� �������� ������� �� ������.
     * 
     * @param refusalDate
     */
    public void setRefusalDate(LocalDate refusalDate) {
        this.refusalDate = refusalDate;
    }

    /** 
     * Get the 'GRN' element value. C�������� ����� �������� � �������� 
     * 
     * @return value
     */
    public String getGRN() {
        return GRN;
    }

    /** 
     * Set the 'GRN' element value. C�������� ����� �������� � �������� 
     * 
     * @param GRN
     */
    public void setGRN(String GRN) {
        this.GRN = GRN;
    }

    /** 
     * Get the 'DestinationCustoms' element value. ���������� ����� ����������.
     * 
     * @return value
     */
    public CUCustomsType getDestinationCustoms() {
        return destinationCustoms;
    }

    /** 
     * Set the 'DestinationCustoms' element value. ���������� ����� ����������.
     * 
     * @param destinationCustoms
     */
    public void setDestinationCustoms(CUCustomsType destinationCustoms) {
        this.destinationCustoms = destinationCustoms;
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
     * Get the list of 'RefuseReason' element items. ������� ������
     * 
     * @return list
     */
    public List<RefuseReasonType> getRefuseReasonList() {
        return refuseReasonList;
    }

    /** 
     * Set the list of 'RefuseReason' element items. ������� ������
     * 
     * @param list
     */
    public void setRefuseReasonList(List<RefuseReasonType> list) {
        refuseReasonList = list;
    }

    /** 
     * Get the 'AdditionalNumber' element value. ����������� ����� ���������� � �������� ��������������
     * 
     * @return value
     */
    public GTDIDType getAdditionalNumber() {
        return additionalNumber;
    }

    /** 
     * Set the 'AdditionalNumber' element value. ����������� ����� ���������� � �������� ��������������
     * 
     * @param additionalNumber
     */
    public void setAdditionalNumber(GTDIDType additionalNumber) {
        this.additionalNumber = additionalNumber;
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
