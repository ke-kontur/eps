
package ru.acs.fts.schemas.album.rosprirodtempoutredbook;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * ���������� �������� (��������), �� ���, �������, ����� � ��.
 */
public class CountMarksType extends SupplementaryQuantityType
{
    private String additionalMarks;

    /** 
     * Get the 'AdditionalMarks' element value. �������������� ������ (���, �������, ����� � ��.)
     * 
     * @return value
     */
    public String getAdditionalMarks() {
        return additionalMarks;
    }

    /** 
     * Set the 'AdditionalMarks' element value. �������������� ������ (���, �������, ����� � ��.)
     * 
     * @param additionalMarks
     */
    public void setAdditionalMarks(String additionalMarks) {
        this.additionalMarks = additionalMarks;
    }
}
