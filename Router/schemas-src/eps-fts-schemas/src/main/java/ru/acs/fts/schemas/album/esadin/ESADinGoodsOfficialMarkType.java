
package ru.acs.fts.schemas.album.esadin;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsOfficialMarkType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.SolutionNumberType;

/** 
 * ДТ и ТД. Внутренний формат. Служебные отметки по товару.
 */
public class ESADinGoodsOfficialMarkType extends ESADGoodsOfficialMarkType
{
    private String technologicalMarkTypeCode;
    private String recordNumber;
    private String code;
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
     * Get the 'RecordNumber' element value. Порядковый номер записи по идентификатору проставленной технологической отметки
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. Порядковый номер записи по идентификатору проставленной технологической отметки
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    /** 
     * Get the 'Code' element value. Код основания продления срока выпуска товаров
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. Код основания продления срока выпуска товаров
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
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
