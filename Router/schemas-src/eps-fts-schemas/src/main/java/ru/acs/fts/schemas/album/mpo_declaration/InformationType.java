
package ru.acs.fts.schemas.album.mpo_declaration;

/** 
 * �������������� ����������
 */
public class InformationType
{
    private String weightDifference;
    private PackingStateType packingState;

    /** 
     * Get the 'WeightDifference' element value. ������� � ����
     * 
     * @return value
     */
    public String getWeightDifference() {
        return weightDifference;
    }

    /** 
     * Set the 'WeightDifference' element value. ������� � ����
     * 
     * @param weightDifference
     */
    public void setWeightDifference(String weightDifference) {
        this.weightDifference = weightDifference;
    }

    /** 
     * Get the 'PackingState' element value. �������� � ����������� ��������
     * 
     * @return value
     */
    public PackingStateType getPackingState() {
        return packingState;
    }

    /** 
     * Set the 'PackingState' element value. �������� � ����������� ��������
     * 
     * @param packingState
     */
    public void setPackingState(PackingStateType packingState) {
        this.packingState = packingState;
    }
}
