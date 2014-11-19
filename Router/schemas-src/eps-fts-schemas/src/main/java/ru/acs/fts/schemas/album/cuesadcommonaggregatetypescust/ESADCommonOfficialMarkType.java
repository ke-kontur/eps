
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �� � ��. ���������� ������. ��������� ������� �� ��
 */
public class ESADCommonOfficialMarkType
{
    private String GRNumber;
    private String stageMarkIdentifier;
    private String noteMarkIdentifier;
    private String informationTypeCode;
    private String markDescription;
    private LocalDate dateInf;
    private String timeInf;
    private String amount;
    private String paymentTypeCode;
    private String postponementProcent;
    private String code;
    private String currencyName;
    private String personName;
    private String LNP;
    private LocalDate goodsDevisionDate;
    private String goodsDevisionTime;
    private LocalDate deadline;
    private String customsCode;
    private LocalDate customsActionDate;
    private String documentIndicator;
    private String deadlineMonth;
    private DocumentBaseType documentInfo;
    private OrganizationBaseType commonMarkOrganization;

    /** 
     * Get the 'GRNumber' element value. ����������� ����� (���������� �����) (A,C,D,E1,E2,28)  ����� D/J ������������� 'D'. ������ E, E/J �������������:'E1' - ������� (������) ��������� ����� E(E/J); 'E2' - ������ (������) ��������� ����� E(E/J)
     * 
     * @return value
     */
    public String getGRNumber() {
        return GRNumber;
    }

    /** 
     * Set the 'GRNumber' element value. ����������� ����� (���������� �����) (A,C,D,E1,E2,28)  ����� D/J ������������� 'D'. ������ E, E/J �������������:'E1' - ������� (������) ��������� ����� E(E/J); 'E2' - ������ (������) ��������� ����� E(E/J)
     * 
     * @param GRNumber
     */
    public void setGRNumber(String GRNumber) {
        this.GRNumber = GRNumber;
    }

    /** 
     * Get the 'StageMarkIdentifier' element value. ������������� ������������� ��������������� ������� - 1 (����� �����)
     * 
     * @return value
     */
    public String getStageMarkIdentifier() {
        return stageMarkIdentifier;
    }

    /** 
     * Set the 'StageMarkIdentifier' element value. ������������� ������������� ��������������� ������� - 1 (����� �����)
     * 
     * @param stageMarkIdentifier
     */
    public void setStageMarkIdentifier(String stageMarkIdentifier) {
        this.stageMarkIdentifier = stageMarkIdentifier;
    }

    /** 
     * Get the 'NoteMarkIdentifier' element value. ������������� ������������� ��������������� �������  -  2 (��� ����������)
     * 
     * @return value
     */
    public String getNoteMarkIdentifier() {
        return noteMarkIdentifier;
    }

    /** 
     * Set the 'NoteMarkIdentifier' element value. ������������� ������������� ��������������� �������  -  2 (��� ����������)
     * 
     * @param noteMarkIdentifier
     */
    public void setNoteMarkIdentifier(String noteMarkIdentifier) {
        this.noteMarkIdentifier = noteMarkIdentifier;
    }

    /** 
     * Get the 'InformationTypeCode' element value. ��� ���� ���������� (SKRECC)
     * 
     * @return value
     */
    public String getInformationTypeCode() {
        return informationTypeCode;
    }

    /** 
     * Set the 'InformationTypeCode' element value. ��� ���� ���������� (SKRECC)
     * 
     * @param informationTypeCode
     */
    public void setInformationTypeCode(String informationTypeCode) {
        this.informationTypeCode = informationTypeCode;
    }

    /** 
     * Get the 'MarkDescription' element value. ��������� ������ / ����� ��������� 
     * 
     * @return value
     */
    public String getMarkDescription() {
        return markDescription;
    }

    /** 
     * Set the 'MarkDescription' element value. ��������� ������ / ����� ��������� 
     * 
     * @param markDescription
     */
    public void setMarkDescription(String markDescription) {
        this.markDescription = markDescription;
    }

    /** 
     * Get the 'DateInf' element value. ���� ������������ �������/ ���� �������� ������� � ��������� ����� �������� 
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. ���� ������������ �������/ ���� �������� ������� � ��������� ����� �������� 
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'TimeInf' element value. �����
     * 
     * @return value
     */
    public String getTimeInf() {
        return timeInf;
    }

    /** 
     * Set the 'TimeInf' element value. �����
     * 
     * @param timeInf
     */
    public void setTimeInf(String timeInf) {
        this.timeInf = timeInf;
    }

    /** 
     * Get the 'Amount' element value. ����� �������� ������� /��������� ����� ��������� ������������ ������� / ��������� ���������
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. ����� �������� ������� /��������� ����� ��������� ������������ ������� / ��������� ���������
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'PaymentTypeCode' element value. ��� ���� ������� (����, ������, � ������ ������ ������ ���������� ������, ������� ��� ��������� ������� ��� ���������� ����� ���������� �����)
     * 
     * @return value
     */
    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /** 
     * Set the 'PaymentTypeCode' element value. ��� ���� ������� (����, ������, � ������ ������ ������ ���������� ������, ������� ��� ��������� ������� ��� ���������� ����� ���������� �����)
     * 
     * @param paymentTypeCode
     */
    public void setPaymentTypeCode(String paymentTypeCode) {
        this.paymentTypeCode = paymentTypeCode;
    }

    /** 
     * Get the 'PostponementProcent' element value. ������� �� �������������� �������� / ��������� (����������� ��� 91, 93 ����� ���. ��������)
     * 
     * @return value
     */
    public String getPostponementProcent() {
        return postponementProcent;
    }

    /** 
     * Set the 'PostponementProcent' element value. ������� �� �������������� �������� / ��������� (����������� ��� 91, 93 ����� ���. ��������)
     * 
     * @param postponementProcent
     */
    public void setPostponementProcent(String postponementProcent) {
        this.postponementProcent = postponementProcent;
    }

    /** 
     * Get the 'Code' element value. �������� ��� ������ �������� ������� / ��� ������� ��������� / ��������� ��� ������ ����������: ��� ������ ����������� ��� ���� ���� ���������� "34"/ ��������� ��� ������ (��� �������� ��������� ���������) 
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. �������� ��� ������ �������� ������� / ��� ������� ��������� / ��������� ��� ������ ����������: ��� ������ ����������� ��� ���� ���� ���������� "34"/ ��������� ��� ������ (��� �������� ��������� ���������) 
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'CurrencyName' element value. ������������ ������ �������� ������� / �������� ����������� ������� ���������
     * 
     * @return value
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /** 
     * Set the 'CurrencyName' element value. ������������ ������ �������� ������� / �������� ����������� ������� ���������
     * 
     * @param currencyName
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    /** 
     * Get the 'PersonName' element value. ��� ����������, ����������� ������
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ��� ����������, ����������� ������
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'LNP' element value. ����� ��� ����������, ����������� ������
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ����� ��� ����������, ����������� ������
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the 'GoodsDevisionDate' element value. ���� ���������� ���������� �������� ������ �� ��������� ������ 
     * 
     * @return value
     */
    public LocalDate getGoodsDevisionDate() {
        return goodsDevisionDate;
    }

    /** 
     * Set the 'GoodsDevisionDate' element value. ���� ���������� ���������� �������� ������ �� ��������� ������ 
     * 
     * @param goodsDevisionDate
     */
    public void setGoodsDevisionDate(LocalDate goodsDevisionDate) {
        this.goodsDevisionDate = goodsDevisionDate;
    }

    /** 
     * Get the 'GoodsDevisionTime' element value. �����
     * 
     * @return value
     */
    public String getGoodsDevisionTime() {
        return goodsDevisionTime;
    }

    /** 
     * Set the 'GoodsDevisionTime' element value. �����
     * 
     * @param goodsDevisionTime
     */
    public void setGoodsDevisionTime(String goodsDevisionTime) {
        this.goodsDevisionTime = goodsDevisionTime;
    }

    /** 
     * Get the 'Deadline' element value. ����
     * 
     * @return value
     */
    public LocalDate getDeadline() {
        return deadline;
    }

    /** 
     * Set the 'Deadline' element value. ����
     * 
     * @param deadline
     */
    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    /** 
     * Get the 'CustomsCode' element value. ��� ����������� ������
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� ������
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'CustomsActionDate' element value. ���� ���������� ��������� ���������� ��������
     * 
     * @return value
     */
    public LocalDate getCustomsActionDate() {
        return customsActionDate;
    }

    /** 
     * Set the 'CustomsActionDate' element value. ���� ���������� ��������� ���������� ��������
     * 
     * @param customsActionDate
     */
    public void setCustomsActionDate(LocalDate customsActionDate) {
        this.customsActionDate = customsActionDate;
    }

    /** 
     * Get the 'DocumentIndicator' element value. ������� ���������. ����������� ��� �������� ������: - ���� ����������� �������� (�������) - '�', '�'; - ���� �� �������� ��������� ������ ���������� ����������� ('Z'); -��� ������������ ������� � ������ ���������� ����� E(E/J) ��� ������� 12 (E2 2 12)  ("0"-�������� ���������; "1"-�������� �� ���������) 
     * 
     * @return value
     */
    public String getDocumentIndicator() {
        return documentIndicator;
    }

    /** 
     * Set the 'DocumentIndicator' element value. ������� ���������. ����������� ��� �������� ������: - ���� ����������� �������� (�������) - '�', '�'; - ���� �� �������� ��������� ������ ���������� ����������� ('Z'); -��� ������������ ������� � ������ ���������� ����� E(E/J) ��� ������� 12 (E2 2 12)  ("0"-�������� ���������; "1"-�������� �� ���������) 
     * 
     * @param documentIndicator
     */
    public void setDocumentIndicator(String documentIndicator) {
        this.documentIndicator = documentIndicator;
    }

    /** 
     * Get the 'DeadlineMonth' element value. ���� ��������� / ����� � �������
     * 
     * @return value
     */
    public String getDeadlineMonth() {
        return deadlineMonth;
    }

    /** 
     * Set the 'DeadlineMonth' element value. ���� ��������� / ����� � �������
     * 
     * @param deadlineMonth
     */
    public void setDeadlineMonth(String deadlineMonth) {
        this.deadlineMonth = deadlineMonth;
    }

    /** 
     * Get the 'DocumentInfo' element value. ���������� � ��������� (�����, ����)
     * 
     * @return value
     */
    public DocumentBaseType getDocumentInfo() {
        return documentInfo;
    }

    /** 
     * Set the 'DocumentInfo' element value. ���������� � ��������� (�����, ����)
     * 
     * @param documentInfo
     */
    public void setDocumentInfo(DocumentBaseType documentInfo) {
        this.documentInfo = documentInfo;
    }

    /** 
     * Get the 'CommonMarkOrganization' element value. �������� �� ����������� (����) 
     * 
     * @return value
     */
    public OrganizationBaseType getCommonMarkOrganization() {
        return commonMarkOrganization;
    }

    /** 
     * Set the 'CommonMarkOrganization' element value. �������� �� ����������� (����) 
     * 
     * @param commonMarkOrganization
     */
    public void setCommonMarkOrganization(
            OrganizationBaseType commonMarkOrganization) {
        this.commonMarkOrganization = commonMarkOrganization;
    }
}
