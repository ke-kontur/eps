
package ru.acs.fts.schemas.album.ktdin;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.RUESADCommonOfficialMarkType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.SolutionNumberType;

/** 
 * Служебные отметки по КТД
 */
public class KTDinCommonOfficialMarkType extends RUESADCommonOfficialMarkType
{
    private String technologicalMarkTypeCode;
    private String recordSerialNumber;
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
