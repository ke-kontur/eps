
package ru.acs.fts.schemas.album.ktsoutcustomsmark;

import org.joda.time.LocalDate;

/** 
 * ���-��������� ������� �����
 */
public class KTSOutCustomsMarkGeneralType
{
    private String KTS1FormNumber;
    private String GRNumber;
    private String paymentEnsuringModeCodeType;
    private String documentNumber;
    private LocalDate documentDate;
    private String markDescription;
    private SubscriptionType customsPerson;

    /** 
     * Get the 'KTS1FormNumber' element value. ����� ������ ����� ���-1
     * 
     * @return value
     */
    public String getKTS1FormNumber() {
        return KTS1FormNumber;
    }

    /** 
     * Set the 'KTS1FormNumber' element value. ����� ������ ����� ���-1
     * 
     * @param KTS1FormNumber
     */
    public void setKTS1FormNumber(String KTS1FormNumber) {
        this.KTS1FormNumber = KTS1FormNumber;
    }

    /** 
     * Get the 'GRNumber' element value. ����������� ����� (���������� �����) (C,D)
     * 
     * @return value
     */
    public String getGRNumber() {
        return GRNumber;
    }

    /** 
     * Set the 'GRNumber' element value. ����������� ����� (���������� �����) (C,D)
     * 
     * @param GRNumber
     */
    public void setGRNumber(String GRNumber) {
        this.GRNumber = GRNumber;
    }

    /** 
     * Get the 'PaymentEnsuringModeCodeType' element value. ��� ���� ����������� ������
     * 
     * @return value
     */
    public String getPaymentEnsuringModeCodeType() {
        return paymentEnsuringModeCodeType;
    }

    /** 
     * Set the 'PaymentEnsuringModeCodeType' element value. ��� ���� ����������� ������
     * 
     * @param paymentEnsuringModeCodeType
     */
    public void setPaymentEnsuringModeCodeType(
            String paymentEnsuringModeCodeType) {
        this.paymentEnsuringModeCodeType = paymentEnsuringModeCodeType;
    }

    /** 
     * Get the 'DocumentNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. ����� ���������
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'DocumentDate' element value. ���� ���������
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. ���� ���������
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    /** 
     * Get the 'MarkDescription' element value. ��������� ������
     * 
     * @return value
     */
    public String getMarkDescription() {
        return markDescription;
    }

    /** 
     * Set the 'MarkDescription' element value. ��������� ������
     * 
     * @param markDescription
     */
    public void setMarkDescription(String markDescription) {
        this.markDescription = markDescription;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public SubscriptionType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(SubscriptionType customsPerson) {
        this.customsPerson = customsPerson;
    }
}
