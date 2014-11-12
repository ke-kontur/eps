
package ru.acs.fts.schemas.album.esadin;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.RUESADCommonOfficialMarkType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.SolutionNumberType;

/** 
 * ДТ и ТД. Внутренний формат. Служебные отметки по ДТ.
 */
public class ESADinCommonOfficialMarkType extends RUESADCommonOfficialMarkType
{
    private String technologicalMarkTypeCode;
    private String recordSerialNumber;
    private String paymentWayCode;
    private String guaranteeFoundation;
    private SolutionNumberType solutionNumber;

    /** 
     * Get the 'TechnologicalMarkTypeCode' element value. Тип проставленной технологической отметки (1-внешняя, информация по которой может быть передана во внешнюю АИС, 2-внутренняя, информация которой доступна только в рамках ЕАИС)
     * 
     * @return value
     */
    public String getTechnologicalMarkTypeCode() {
        return technologicalMarkTypeCode;
    }

    /** 
     * Set the 'TechnologicalMarkTypeCode' element value. Тип проставленной технологической отметки (1-внешняя, информация по которой может быть передана во внешнюю АИС, 2-внутренняя, информация которой доступна только в рамках ЕАИС)
     * 
     * @param technologicalMarkTypeCode
     */
    public void setTechnologicalMarkTypeCode(String technologicalMarkTypeCode) {
        this.technologicalMarkTypeCode = technologicalMarkTypeCode;
    }

    /** 
     * Get the 'RecordSerialNumber' element value. Порядковый номер записи по идентификатору проставленной технологической отметки
     * 
     * @return value
     */
    public String getRecordSerialNumber() {
        return recordSerialNumber;
    }

    /** 
     * Set the 'RecordSerialNumber' element value. Порядковый номер записи по идентификатору проставленной технологической отметки
     * 
     * @param recordSerialNumber
     */
    public void setRecordSerialNumber(String recordSerialNumber) {
        this.recordSerialNumber = recordSerialNumber;
    }

    /** 
     * Get the 'PaymentWayCode' element value. Код способа обеспечения уплаты в соответствии с классификатором способов обеспечения уплаты таможенных пошлин, налогов
     * 
     * @return value
     */
    public String getPaymentWayCode() {
        return paymentWayCode;
    }

    /** 
     * Set the 'PaymentWayCode' element value. Код способа обеспечения уплаты в соответствии с классификатором способов обеспечения уплаты таможенных пошлин, налогов
     * 
     * @param paymentWayCode
     */
    public void setPaymentWayCode(String paymentWayCode) {
        this.paymentWayCode = paymentWayCode;
    }

    /** 
     * Get the 'GuaranteeFoundation' element value. Основание предоставления обеспечения уплаты таможенных  пошлин, налогов, специальных, антидемпинговых, компенсационных пошлин
     * 
     * @return value
     */
    public String getGuaranteeFoundation() {
        return guaranteeFoundation;
    }

    /** 
     * Set the 'GuaranteeFoundation' element value. Основание предоставления обеспечения уплаты таможенных  пошлин, налогов, специальных, антидемпинговых, компенсационных пошлин
     * 
     * @param guaranteeFoundation
     */
    public void setGuaranteeFoundation(String guaranteeFoundation) {
        this.guaranteeFoundation = guaranteeFoundation;
    }

    /** 
     * Get the 'SolutionNumber' element value. Номер решения
     * 
     * @return value
     */
    public SolutionNumberType getSolutionNumber() {
        return solutionNumber;
    }

    /** 
     * Set the 'SolutionNumber' element value. Номер решения
     * 
     * @param solutionNumber
     */
    public void setSolutionNumber(SolutionNumberType solutionNumber) {
        this.solutionNumber = solutionNumber;
    }
}
