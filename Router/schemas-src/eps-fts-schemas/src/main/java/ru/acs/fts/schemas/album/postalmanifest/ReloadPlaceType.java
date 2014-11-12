
package ru.acs.fts.schemas.album.postalmanifest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ����� ���������� �������� � ���� ��������
 */
public class ReloadPlaceType extends CustomsType
{
    private String reloadPlaceDescription;

    /** 
     * Get the 'ReloadPlaceDescription' element value. ����� ���������� �������� � ���� ��������
     * 
     * @return value
     */
    public String getReloadPlaceDescription() {
        return reloadPlaceDescription;
    }

    /** 
     * Set the 'ReloadPlaceDescription' element value. ����� ���������� �������� � ���� ��������
     * 
     * @param reloadPlaceDescription
     */
    public void setReloadPlaceDescription(String reloadPlaceDescription) {
        this.reloadPlaceDescription = reloadPlaceDescription;
    }
}
