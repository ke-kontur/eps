
package ru.acs.fts.schemas.album.gtdincustomsmark;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.RUESADCommonOfficialMarkType;

/** 
 * Служебные отметки ДТ 
 */
public class GTDInCommonMarkType extends RUESADCommonOfficialMarkType
{
    private String stageDescription;
    private String identifierDescription;
    private String INPIGUID;
    private LocalDate goodsPresentDate;
    private String goodsPresentTime;
    private String paymentWayCode;
    private String guaranteeFoundation;

    /** 
     * Get the 'StageDescription' element value. Описание этапа.
     * 
     * @return value
     */
    public String getStageDescription() {
        return stageDescription;
    }

    /** 
     * Set the 'StageDescription' element value. Описание этапа.
     * 
     * @param stageDescription
     */
    public void setStageDescription(String stageDescription) {
        this.stageDescription = stageDescription;
    }

    /** 
     * Get the 'IdentifierDescription' element value. Описание типа примечания
     * 
     * @return value
     */
    public String getIdentifierDescription() {
        return identifierDescription;
    }

    /** 
     * Set the 'IdentifierDescription' element value. Описание типа примечания
     * 
     * @param identifierDescription
     */
    public void setIdentifierDescription(String identifierDescription) {
        this.identifierDescription = identifierDescription;
    }

    /** 
     * Get the 'INPI_GUID' element value. Идентификационный номер предварительной информации о товарах, направленной таможенными органами Турецкой Республики в ЕАИС таможенных органов Российской Федерации (глобальный идентификатор)
     * 
     * @return value
     */
    public String getINPIGUID() {
        return INPIGUID;
    }

    /** 
     * Set the 'INPI_GUID' element value. Идентификационный номер предварительной информации о товарах, направленной таможенными органами Турецкой Республики в ЕАИС таможенных органов Российской Федерации (глобальный идентификатор)
     * 
     * @param INPIGUID
     */
    public void setINPIGUID(String INPIGUID) {
        this.INPIGUID = INPIGUID;
    }

    /** 
     * Get the 'GoodsPresentDate' element value. Дата представления товаров
     * 
     * @return value
     */
    public LocalDate getGoodsPresentDate() {
        return goodsPresentDate;
    }

    /** 
     * Set the 'GoodsPresentDate' element value. Дата представления товаров
     * 
     * @param goodsPresentDate
     */
    public void setGoodsPresentDate(LocalDate goodsPresentDate) {
        this.goodsPresentDate = goodsPresentDate;
    }

    /** 
     * Get the 'GoodsPresentTime' element value. Время представления товаров
     * 
     * @return value
     */
    public String getGoodsPresentTime() {
        return goodsPresentTime;
    }

    /** 
     * Set the 'GoodsPresentTime' element value. Время представления товаров
     * 
     * @param goodsPresentTime
     */
    public void setGoodsPresentTime(String goodsPresentTime) {
        this.goodsPresentTime = goodsPresentTime;
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
}
