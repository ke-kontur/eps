
package ru.acs.fts.schemas.album.prohibitedgoods;

/** 
 * �������� � ������� ������������� �������
 */
public class DrugsSubstanceInfoType extends ProhibitedSubjectInfoType
{
    private String drugsType;

    /** 
     * Get the 'DrugsType' element value. ��� �������������� ��������. 1 - �������������; 2 - �����������������; 3 - ������������; 4 - ��������
     * 
     * @return value
     */
    public String getDrugsType() {
        return drugsType;
    }

    /** 
     * Set the 'DrugsType' element value. ��� �������������� ��������. 1 - �������������; 2 - �����������������; 3 - ������������; 4 - ��������
     * 
     * @param drugsType
     */
    public void setDrugsType(String drugsType) {
        this.drugsType = drugsType;
    }
}
