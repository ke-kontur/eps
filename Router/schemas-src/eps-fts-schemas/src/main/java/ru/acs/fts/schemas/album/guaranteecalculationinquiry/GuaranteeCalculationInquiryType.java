
package ru.acs.fts.schemas.album.guaranteecalculationinquiry;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.guaranteecommonaggregatetypescust.TotalAmountType;

/** 
 * ������ �� ������ ���� ����������� ������ ���������� ������, �������
 */
public class GuaranteeCalculationInquiryType extends BaseDocType
{
    private String documentDateTime;
    private String customsProcedure;
    private LocalDate checkDate;
    private String docSign;
    private CustomsType customsOffice;
    private CustomsPersonType customsOfficial;
    private TotalAmountType amountPaid;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
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
     * Get the 'CustomsProcedure' element value. ��� ���������� ��������� (����������� � ������������ � ��������������� ����� ���������� ��������)
     * 
     * @return value
     */
    public String getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. ��� ���������� ��������� (����������� � ������������ � ��������������� ����� ���������� ��������)
     * 
     * @param customsProcedure
     */
    public void setCustomsProcedure(String customsProcedure) {
        this.customsProcedure = customsProcedure;
    }

    /** 
     * Get the 'CheckDate' element value. ���� ��������
     * 
     * @return value
     */
    public LocalDate getCheckDate() {
        return checkDate;
    }

    /** 
     * Set the 'CheckDate' element value. ���� ��������
     * 
     * @param checkDate
     */
    public void setCheckDate(LocalDate checkDate) {
        this.checkDate = checkDate;
    }

    /** 
     * Get the 'DocSign' element value. �������: 0 - ��� ������������; 1 - ���. ����
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. �������: 0 - ��� ������������; 1 - ���. ����
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'CustomsOffice' element value. ��� ����������� ������, ��������������� ������ �� ������ ���� �����������
     * 
     * @return value
     */
    public CustomsType getCustomsOffice() {
        return customsOffice;
    }

    /** 
     * Set the 'CustomsOffice' element value. ��� ����������� ������, ��������������� ������ �� ������ ���� �����������
     * 
     * @param customsOffice
     */
    public void setCustomsOffice(CustomsType customsOffice) {
        this.customsOffice = customsOffice;
    }

    /** 
     * Get the 'CustomsOfficial' element value. ����������� ���� ����������� ������, �������������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsOfficial() {
        return customsOfficial;
    }

    /** 
     * Set the 'CustomsOfficial' element value. ����������� ���� ����������� ������, �������������� ������
     * 
     * @param customsOfficial
     */
    public void setCustomsOfficial(CustomsPersonType customsOfficial) {
        this.customsOfficial = customsOfficial;
    }

    /** 
     * Get the 'AmountPaid' element value. ���������� ����� �����
     * 
     * @return value
     */
    public TotalAmountType getAmountPaid() {
        return amountPaid;
    }

    /** 
     * Set the 'AmountPaid' element value. ���������� ����� �����
     * 
     * @param amountPaid
     */
    public void setAmountPaid(TotalAmountType amountPaid) {
        this.amountPaid = amountPaid;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. �������� ����� �������
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. �������� ����� �������
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
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
