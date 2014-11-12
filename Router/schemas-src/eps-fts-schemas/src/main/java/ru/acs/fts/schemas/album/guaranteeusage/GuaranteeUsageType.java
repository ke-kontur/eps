
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
 * Запрос на резервирование денежных средств/Сведения по использованию гарантии
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
     * Get the 'DocumentSign' element value. Признак документа: 1 - запрос на резервирование; 2 - уведомление об использовании; 3 - продление срока; 4 - завершение использования
     * 
     * @return value
     */
    public String getDocumentSign() {
        return documentSign;
    }

    /** 
     * Set the 'DocumentSign' element value. Признак документа: 1 - запрос на резервирование; 2 - уведомление об использовании; 3 - продление срока; 4 - завершение использования
     * 
     * @param documentSign
     */
    public void setDocumentSign(String documentSign) {
        this.documentSign = documentSign;
    }

    /** 
     * Get the 'DateLimit' element value. Планируемый срок завершения использования обеспечения.
     * 
     * @return value
     */
    public LocalDate getDateLimit() {
        return dateLimit;
    }

    /** 
     * Set the 'DateLimit' element value. Планируемый срок завершения использования обеспечения.
     * 
     * @param dateLimit
     */
    public void setDateLimit(LocalDate dateLimit) {
        this.dateLimit = dateLimit;
    }

    /** 
     * Get the 'CustomsOffice' element value. Таможенный орган
     * 
     * @return value
     */
    public CustomsType getCustomsOffice() {
        return customsOffice;
    }

    /** 
     * Set the 'CustomsOffice' element value. Таможенный орган
     * 
     * @param customsOffice
     */
    public void setCustomsOffice(CustomsType customsOffice) {
        this.customsOffice = customsOffice;
    }

    /** 
     * Get the 'CustomsOfficial' element value. Должностное лицо ТО
     * 
     * @return value
     */
    public CustomsPersonType getCustomsOfficial() {
        return customsOfficial;
    }

    /** 
     * Set the 'CustomsOfficial' element value. Должностное лицо ТО
     * 
     * @param customsOfficial
     */
    public void setCustomsOfficial(CustomsPersonType customsOfficial) {
        this.customsOfficial = customsOfficial;
    }

    /** 
     * Get the 'CustomsDocument' element value. Идентификатор таможенной процедуры, в рамках которой осуществляется резервирование/использование обеспечения
     * 
     * @return value
     */
    public CustomsGuaranteeDocType getCustomsDocument() {
        return customsDocument;
    }

    /** 
     * Set the 'CustomsDocument' element value. Идентификатор таможенной процедуры, в рамках которой осуществляется резервирование/использование обеспечения
     * 
     * @param customsDocument
     */
    public void setCustomsDocument(CustomsGuaranteeDocType customsDocument) {
        this.customsDocument = customsDocument;
    }

    /** 
     * Get the list of 'GuaranteeDocument' element items. Информация о документе обеспечения
     * 
     * @return list
     */
    public List<CustomsGuaranteeDocType> getGuaranteeDocumentList() {
        return guaranteeDocumentList;
    }

    /** 
     * Set the list of 'GuaranteeDocument' element items. Информация о документе обеспечения
     * 
     * @param list
     */
    public void setGuaranteeDocumentList(List<CustomsGuaranteeDocType> list) {
        guaranteeDocumentList = list;
    }

    /** 
     * Get the 'ReservationAmount' element value. Резервируемая сумма денежных средств
     * 
     * @return value
     */
    public AmountType getReservationAmount() {
        return reservationAmount;
    }

    /** 
     * Set the 'ReservationAmount' element value. Резервируемая сумма денежных средств
     * 
     * @param reservationAmount
     */
    public void setReservationAmount(AmountType reservationAmount) {
        this.reservationAmount = reservationAmount;
    }

    /** 
     * Get the 'LiableTrader' element value. Участник ВЭД, несущий обязательства по обеспечению
     * 
     * @return value
     */
    public CUOrganizationType getLiableTrader() {
        return liableTrader;
    }

    /** 
     * Set the 'LiableTrader' element value. Участник ВЭД, несущий обязательства по обеспечению
     * 
     * @param liableTrader
     */
    public void setLiableTrader(CUOrganizationType liableTrader) {
        this.liableTrader = liableTrader;
    }

    /** 
     * Get the 'Reason' element value. Причина, по которой завершено использование обеспечения
     * 
     * @return value
     */
    public ReasonType getReason() {
        return reason;
    }

    /** 
     * Set the 'Reason' element value. Причина, по которой завершено использование обеспечения
     * 
     * @param reason
     */
    public void setReason(ReasonType reason) {
        this.reason = reason;
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
