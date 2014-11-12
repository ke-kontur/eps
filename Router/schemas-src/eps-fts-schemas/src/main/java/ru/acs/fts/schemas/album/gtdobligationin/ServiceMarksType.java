
package ru.acs.fts.schemas.album.gtdobligationin;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.RUESADCommonOfficialMarkType;

/** 
 * ��������� �������
 */
public class ServiceMarksType extends RUESADCommonOfficialMarkType
{
    private String stageDescription;
    private String identifierDescription;

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
     * Get the 'IdentifierDescription' element value. �������� ���� ����������
     * 
     * @return value
     */
    public String getIdentifierDescription() {
        return identifierDescription;
    }

    /** 
     * Set the 'IdentifierDescription' element value. �������� ���� ����������
     * 
     * @param identifierDescription
     */
    public void setIdentifierDescription(String identifierDescription) {
        this.identifierDescription = identifierDescription;
    }
}
