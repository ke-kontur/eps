
package ru.acs.fts.schemas.album.gtdoutcustomsmark;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.RUESADDecisionType;

/** 
 * �������� ������� �� �� / �������.
 */
public class GTDOutResolutionType extends RUESADDecisionType
{
    private String resolutionDescription;
    private String personName;

    /** 
     * Get the 'ResolutionDescription' element value. �������� ��������� �������
     * 
     * @return value
     */
    public String getResolutionDescription() {
        return resolutionDescription;
    }

    /** 
     * Set the 'ResolutionDescription' element value. �������� ��������� �������
     * 
     * @param resolutionDescription
     */
    public void setResolutionDescription(String resolutionDescription) {
        this.resolutionDescription = resolutionDescription;
    }

    /** 
     * Get the 'PersonName' element value. ��� ������������ ���� ����������� ������
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ��� ������������ ���� ����������� ������
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
