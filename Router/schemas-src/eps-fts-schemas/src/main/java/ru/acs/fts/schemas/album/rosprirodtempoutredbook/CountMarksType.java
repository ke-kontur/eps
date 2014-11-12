
package ru.acs.fts.schemas.album.rosprirodtempoutredbook;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Количество животных (растений), их пол, возраст, метки и др.
 */
public class CountMarksType extends SupplementaryQuantityType
{
    private String additionalMarks;

    /** 
     * Get the 'AdditionalMarks' element value. Дополнительные данные (пол, возраст, метки и др.)
     * 
     * @return value
     */
    public String getAdditionalMarks() {
        return additionalMarks;
    }

    /** 
     * Set the 'AdditionalMarks' element value. Дополнительные данные (пол, возраст, метки и др.)
     * 
     * @param additionalMarks
     */
    public void setAdditionalMarks(String additionalMarks) {
        this.additionalMarks = additionalMarks;
    }
}
