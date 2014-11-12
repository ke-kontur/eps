
package ru.acs.fts.schemas.album.guaranteeusage;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.guaranteecommonaggregatetypescust.AmountType;
import ru.acs.fts.schemas.album.guaranteecommonaggregatetypescust.CustomsGuaranteeDocType;

/** 
 * ������ �� �������������� �������� �������/�������� �� ������������� ��������
 */
public class GuaranteeUsageType extends BaseDocType
{
    private String documentDateTime;
    private String documentSign;
    private LocalDate dateLimit;
    private CustomsType customsOffice;
    private CustomsPersonType customsOfficial;
    private CustomsGuaranteeDocType customsDocument;
    private List<CustomsGuaranteeDocType> guaranteeDocumentList = new ArrayList<CustomsGuaranteeDocType>();
    private AmountType reservationAmount;
    private CUOrganizationType liableTrader;
    private ReasonType reason;
    private String documentModeID;

    /** 
     * Get the 'DocumentDateTime' element value. ���� � ����� ������������ ������������ ���������
     * 
     * @return value
     */
    public String getDocumentDateTime() {
        return documentDateTime;
    }

    /** 
     * Set the 'DocumentDateTime' element value. ���� � ����� ������������ ������������ ���������
     * 
     * @param documentDateTime
     */
    public void setDocumentDateTime(String documentDateTime) {
        this.documentDateTime = documentDateTime;
    }

    /** 
     * Get the 'DocumentSign' element value. ������� ���������: 1 - ������ �� ��������������; 2 - ����������� �� �������������; 3 - ��������� �����; 4 - ���������� �������������
     * 
     * @return value
     */
    public String getDocumentSign() {
        return documentSign;
    }

    /** 
     * Set the 'DocumentSign' element value. ������� ���������: 1 - ������ �� ��������������; 2 - ����������� �� �������������; 3 - ��������� �����; 4 - ���������� �������������
     * 
     * @param documentSign
     */
    public void setDocumentSign(String documentSign) {
        this.documentSign = documentSign;
    }

    /** 
     * Get the 'DateLimit' element value. ����������� ���� ���������� ������������� �����������.
     * 
     * @return value
     */
    public LocalDate getDateLimit() {
        return dateLimit;
    }

    /** 
     * Set the 'DateLimit' element value. ����������� ���� ���������� ������������� �����������.
     * 
     * @param dateLimit
     */
    public void setDateLimit(LocalDate dateLimit) {
        this.dateLimit = dateLimit;
    }

    /** 
     * Get the 'CustomsOffice' element value. ���������� �����
     * 
     * @return value
     */
    public CustomsType getCustomsOffice() {
        return customsOffice;
    }

    /** 
     * Set the 'CustomsOffice' element value. ���������� �����
     * 
     * @param customsOffice
     */
    public void setCustomsOffice(CustomsType customsOffice) {
        this.customsOffice = customsOffice;
    }

    /** 
     * Get the 'CustomsOfficial' element value. ����������� ���� ��
     * 
     * @return value
     */
    public CustomsPersonType getCustomsOfficial() {
        return customsOfficial;
    }

    /** 
     * Set the 'CustomsOfficial' element value. ����������� ���� ��
     * 
     * @param customsOfficial
     */
    public void setCustomsOfficial(CustomsPersonType customsOfficial) {
        this.customsOfficial = customsOfficial;
    }

    /** 
     * Get the 'CustomsDocument' element value. ������������� ���������� ���������, � ������ ������� �������������� ��������������/������������� �����������
     * 
     * @return value
     */
    public CustomsGuaranteeDocType getCustomsDocument() {
        return customsDocument;
    }

    /** 
     * Set the 'CustomsDocument' element value. ������������� ���������� ���������, � ������ ������� �������������� ��������������/������������� �����������
     * 
     * @param customsDocument
     */
    public void setCustomsDocument(CustomsGuaranteeDocType customsDocument) {
        this.customsDocument = customsDocument;
    }

    /** 
     * Get the list of 'GuaranteeDocument' element items. ���������� � ��������� �����������
     * 
     * @return list
     */
    public List<CustomsGuaranteeDocType> getGuaranteeDocumentList() {
        return guaranteeDocumentList;
    }

    /** 
     * Set the list of 'GuaranteeDocument' element items. ���������� � ��������� �����������
     * 
     * @param list
     */
    public void setGuaranteeDocumentList(List<CustomsGuaranteeDocType> list) {
        guaranteeDocumentList = list;
    }

    /** 
     * Get the 'ReservationAmount' element value. ������������� ����� �������� �������
     * 
     * @return value
     */
    public AmountType getReservationAmount() {
        return reservationAmount;
    }

    /** 
     * Set the 'ReservationAmount' element value. ������������� ����� �������� �������
     * 
     * @param reservationAmount
     */
    public void setReservationAmount(AmountType reservationAmount) {
        this.reservationAmount = reservationAmount;
    }

    /** 
     * Get the 'LiableTrader' element value. �������� ���, ������� ������������� �� �����������
     * 
     * @return value
     */
    public CUOrganizationType getLiableTrader() {
        return liableTrader;
    }

    /** 
     * Set the 'LiableTrader' element value. �������� ���, ������� ������������� �� �����������
     * 
     * @param liableTrader
     */
    public void setLiableTrader(CUOrganizationType liableTrader) {
        this.liableTrader = liableTrader;
    }

    /** 
     * Get the 'Reason' element value. �������, �� ������� ��������� ������������� �����������
     * 
     * @return value
     */
    public ReasonType getReason() {
        return reason;
    }

    /** 
     * Set the 'Reason' element value. �������, �� ������� ��������� ������������� �����������
     * 
     * @param reason
     */
    public void setReason(ReasonType reason) {
        this.reason = reason;
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
