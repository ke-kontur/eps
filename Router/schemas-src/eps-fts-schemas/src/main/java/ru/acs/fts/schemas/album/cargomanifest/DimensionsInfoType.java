
package ru.acs.fts.schemas.album.cargomanifest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DimensionsType;

/** 
 * ���������� � ���������  �����
 */
public class DimensionsInfoType
{
    private String weightCode;
    private String piecesNumber;
    private String weightQuantity;
    private DimensionsType dimensions;

    /** 
     * Get the 'WeightCode' element value. ��� ��������� ���� 
     * 
     * @return value
     */
    public String getWeightCode() {
        return weightCode;
    }

    /** 
     * Set the 'WeightCode' element value. ��� ��������� ���� 
     * 
     * @param weightCode
     */
    public void setWeightCode(String weightCode) {
        this.weightCode = weightCode;
    }

    /** 
     * Get the 'PiecesNumber' element value.
     * 
     * @return value
     */
    public String getPiecesNumber() {
        return piecesNumber;
    }

    /** 
     * Set the 'PiecesNumber' element value.
     * 
     * @param piecesNumber
     */
    public void setPiecesNumber(String piecesNumber) {
        this.piecesNumber = piecesNumber;
    }

    /** 
     * Get the 'WeightQuantity' element value. ��� 
     * 
     * @return value
     */
    public String getWeightQuantity() {
        return weightQuantity;
    }

    /** 
     * Set the 'WeightQuantity' element value. ��� 
     * 
     * @param weightQuantity
     */
    public void setWeightQuantity(String weightQuantity) {
        this.weightQuantity = weightQuantity;
    }

    /** 
     * Get the 'Dimensions' element value. ��������
     * 
     * @return value
     */
    public DimensionsType getDimensions() {
        return dimensions;
    }

    /** 
     * Set the 'Dimensions' element value. ��������
     * 
     * @param dimensions
     */
    public void setDimensions(DimensionsType dimensions) {
        this.dimensions = dimensions;
    }
}
