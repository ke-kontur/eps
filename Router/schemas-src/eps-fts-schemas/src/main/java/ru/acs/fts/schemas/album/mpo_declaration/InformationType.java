
package ru.acs.fts.schemas.album.mpo_declaration;

/** 
 * Дополнительная информация
 */
public class InformationType
{
    private String weightDifference;
    private PackingStateType packingState;

    /** 
     * Get the 'WeightDifference' element value. Разница в весе
     * 
     * @return value
     */
    public String getWeightDifference() {
        return weightDifference;
    }

    /** 
     * Set the 'WeightDifference' element value. Разница в весе
     * 
     * @param weightDifference
     */
    public void setWeightDifference(String weightDifference) {
        this.weightDifference = weightDifference;
    }

    /** 
     * Get the 'PackingState' element value. Сведения о целостности упаковки
     * 
     * @return value
     */
    public PackingStateType getPackingState() {
        return packingState;
    }

    /** 
     * Set the 'PackingState' element value. Сведения о целостности упаковки
     * 
     * @param packingState
     */
    public void setPackingState(PackingStateType packingState) {
        this.packingState = packingState;
    }
}
