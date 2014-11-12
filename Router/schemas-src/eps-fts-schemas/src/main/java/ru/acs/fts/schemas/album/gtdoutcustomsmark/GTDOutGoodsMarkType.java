
package ru.acs.fts.schemas.album.gtdoutcustomsmark;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsOfficialMarkType;

/** 
 * Служебные отметки по товарам.
 */
public class GTDOutGoodsMarkType extends ESADGoodsOfficialMarkType
{
    private String identifierDescription;
    private String stageDescription;
    private String code;

    /** 
     * Get the 'IdentifierDescription' element value. Описание технологической отметки
     * 
     * @return value
     */
    public String getIdentifierDescription() {
        return identifierDescription;
    }

    /** 
     * Set the 'IdentifierDescription' element value. Описание технологической отметки
     * 
     * @param identifierDescription
     */
    public void setIdentifierDescription(String identifierDescription) {
        this.identifierDescription = identifierDescription;
    }

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
}
