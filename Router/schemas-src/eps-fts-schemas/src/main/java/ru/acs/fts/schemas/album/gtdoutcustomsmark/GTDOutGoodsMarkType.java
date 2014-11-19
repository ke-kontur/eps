
package ru.acs.fts.schemas.album.gtdoutcustomsmark;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsOfficialMarkType;

/** 
 * ��������� ������� �� �������.
 */
public class GTDOutGoodsMarkType extends ESADGoodsOfficialMarkType
{
    private String identifierDescription;
    private String stageDescription;
    private String code;

    /** 
     * Get the 'IdentifierDescription' element value. �������� ��������������� �������
     * 
     * @return value
     */
    public String getIdentifierDescription() {
        return identifierDescription;
    }

    /** 
     * Set the 'IdentifierDescription' element value. �������� ��������������� �������
     * 
     * @param identifierDescription
     */
    public void setIdentifierDescription(String identifierDescription) {
        this.identifierDescription = identifierDescription;
    }

    /** 
     * Get the 'StageDescription' element value. �������� �����.
     * 
     * @return value
     */
    public String getStageDescription() {
        return stageDescription;
    }

    /** 
     * Set the 'StageDescription' element value. �������� �����.
     * 
     * @param stageDescription
     */
    public void setStageDescription(String stageDescription) {
        this.stageDescription = stageDescription;
    }

    /** 
     * Get the 'Code' element value. ��� ��������� ��������� ����� ������� �������
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. ��� ��������� ��������� ����� ������� �������
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }
}
