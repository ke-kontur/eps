
package ru.acs.fts.schemas.album.reservedamountrelease;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Информация о зарезервированной сумме по дополнению к договору поручительства
 */
public class ReservedAmountReleaseType extends BaseDocType
{
    private LocalDate reserveDate;
    private String reserveAmount;
    private LocalDate releaseReserveDate;
    private String releaseReason;
    private String operationIndicator;
    private AdditionalInfoType additionalInfo;
    private String documentModeID;

    /** 
     * Get the 'ReserveDate' element value. Дата резервирования  суммы
     * 
     * @return value
     */
    public LocalDate getReserveDate() {
        return reserveDate;
    }

    /** 
     * Set the 'ReserveDate' element value. Дата резервирования  суммы
     * 
     * @param reserveDate
     */
    public void setReserveDate(LocalDate reserveDate) {
        this.reserveDate = reserveDate;
    }

    /** 
     * Get the 'ReserveAmount' element value. Сумма, которая была зарезервирована/ высвобождена.
     * 
     * @return value
     */
    public String getReserveAmount() {
        return reserveAmount;
    }

    /** 
     * Set the 'ReserveAmount' element value. Сумма, которая была зарезервирована/ высвобождена.
     * 
     * @param reserveAmount
     */
    public void setReserveAmount(String reserveAmount) {
        this.reserveAmount = reserveAmount;
    }

    /** 
     * Get the 'ReleaseReserveDate' element value. Дата высвобождения зарезервированной суммы.
     * 
     * @return value
     */
    public LocalDate getReleaseReserveDate() {
        return releaseReserveDate;
    }

    /** 
     * Set the 'ReleaseReserveDate' element value. Дата высвобождения зарезервированной суммы.
     * 
     * @param releaseReserveDate
     */
    public void setReleaseReserveDate(LocalDate releaseReserveDate) {
        this.releaseReserveDate = releaseReserveDate;
    }

    /** 
     * Get the 'ReleaseReason' element value. Причина высвобождения зарезервированной суммы.
     * 
     * @return value
     */
    public String getReleaseReason() {
        return releaseReason;
    }

    /** 
     * Set the 'ReleaseReason' element value. Причина высвобождения зарезервированной суммы.
     * 
     * @param releaseReason
     */
    public void setReleaseReason(String releaseReason) {
        this.releaseReason = releaseReason;
    }

    /** 
     * Get the 'OperationIndicator' element value. Индикатор типа совершаемой операции: 1 - резервирование суммы, 0 - высвобождение зарезервированной суммы
     * 
     * @return value
     */
    public String getOperationIndicator() {
        return operationIndicator;
    }

    /** 
     * Set the 'OperationIndicator' element value. Индикатор типа совершаемой операции: 1 - резервирование суммы, 0 - высвобождение зарезервированной суммы
     * 
     * @param operationIndicator
     */
    public void setOperationIndicator(String operationIndicator) {
        this.operationIndicator = operationIndicator;
    }

    /** 
     * Get the 'AdditionalInfo' element value. Сведения о дополнении к договору поручительства
     * 
     * @return value
     */
    public AdditionalInfoType getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'AdditionalInfo' element value. Сведения о дополнении к договору поручительства
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(AdditionalInfoType additionalInfo) {
        this.additionalInfo = additionalInfo;
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
