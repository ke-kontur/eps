
package ru.acs.fts.schemas.album.customsreprescontract;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������� � ���������� �������������
 */
public class CustomsRepresentativType extends CUOrganizationType
{
    private DocumentBaseType customsRepresCertificate;

    /** 
     * Get the 'CustomsRepresCertificate' element value. ������������� � ��������� � ������ ���������� ��������������
     * 
     * @return value
     */
    public DocumentBaseType getCustomsRepresCertificate() {
        return customsRepresCertificate;
    }

    /** 
     * Set the 'CustomsRepresCertificate' element value. ������������� � ��������� � ������ ���������� ��������������
     * 
     * @param customsRepresCertificate
     */
    public void setCustomsRepresCertificate(
            DocumentBaseType customsRepresCertificate) {
        this.customsRepresCertificate = customsRepresCertificate;
    }
}
