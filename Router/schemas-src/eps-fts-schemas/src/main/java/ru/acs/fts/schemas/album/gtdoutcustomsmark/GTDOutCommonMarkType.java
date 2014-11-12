
package ru.acs.fts.schemas.album.gtdoutcustomsmark;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.RUESADCommonOfficialMarkType;

/** 
 * Служебные отметки ДТ 
 */
public class GTDOutCommonMarkType extends RUESADCommonOfficialMarkType
{
    private String stageDescription;
    private String identifierDescription;
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
