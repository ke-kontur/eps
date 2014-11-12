
package ru.acs.fts.schemas.album.guaranteecalculationinquiry;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.guaranteecommonaggregatetypescust.TotalAmountType;

/** 
 * Запрос на расчет сумм обеспечения уплаты таможенных пошлин, налогов
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
     * Get the 'DocumentDateTime' element value. Дата и время формирования электронного документа
     * 
     * @return value
     */
    public String getDocumentDateTime() {
        return documentDateTime;
    }

    /** 
     * Set the 'DocumentDateTime' element value. Дата и время формирования электронного документа
     * 
     * @param documentDateTime
     */
    public void setDocumentDateTime(String documentDateTime) {
        this.documentDateTime = documentDateTime;
    }

    /** 
     * Get the 'CustomsProcedure' element value. Код таможенной процедуры (заполняется в соответствии с Классификатором видов таможенных процедур)
     * 
     * @return value
     */
    public String getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. Код таможенной процедуры (заполняется в соответствии с Классификатором видов таможенных процедур)
     * 
     * @param customsProcedure
     */
    public void setCustomsProcedure(String customsProcedure) {
        this.customsProcedure = customsProcedure;
    }

    /** 
     * Get the 'CheckDate' element value. Дата проверки
     * 
     * @return value
     */
    public LocalDate getCheckDate() {
        return checkDate;
    }

    /** 
     * Set the 'CheckDate' element value. Дата проверки
     * 
     * @param checkDate
     */
    public void setCheckDate(LocalDate checkDate) {
        this.checkDate = checkDate;
    }

    /** 
     * Get the 'DocSign' element value. Признак: 0 - без особенностей; 1 - физ. лица
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак: 0 - без особенностей; 1 - физ. лица
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'CustomsOffice' element value. Код таможенного органа, сформировавшего запрос на расчет сумм обеспечения
     * 
     * @return value
     */
    public CustomsType getCustomsOffice() {
        return customsOffice;
    }

    /** 
     * Set the 'CustomsOffice' element value. Код таможенного органа, сформировавшего запрос на расчет сумм обеспечения
     * 
     * @param customsOffice
     */
    public void setCustomsOffice(CustomsType customsOffice) {
        this.customsOffice = customsOffice;
    }

    /** 
     * Get the 'CustomsOfficial' element value. Должностное лицо таможенного органа, сформировавшее запрос
     * 
     * @return value
     */
    public CustomsPersonType getCustomsOfficial() {
        return customsOfficial;
    }

    /** 
     * Set the 'CustomsOfficial' element value. Должностное лицо таможенного органа, сформировавшее запрос
     * 
     * @param customsOfficial
     */
    public void setCustomsOfficial(CustomsPersonType customsOfficial) {
        this.customsOfficial = customsOfficial;
    }

    /** 
     * Get the 'AmountPaid' element value. Уплаченные ранее суммы
     * 
     * @return value
     */
    public TotalAmountType getAmountPaid() {
        return amountPaid;
    }

    /** 
     * Set the 'AmountPaid' element value. Уплаченные ранее суммы
     * 
     * @param amountPaid
     */
    public void setAmountPaid(TotalAmountType amountPaid) {
        this.amountPaid = amountPaid;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. Товарная часть запроса
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. Товарная часть запроса
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
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
