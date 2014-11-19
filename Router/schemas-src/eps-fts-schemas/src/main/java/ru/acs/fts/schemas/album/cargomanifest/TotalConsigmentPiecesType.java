
package ru.acs.fts.schemas.album.cargomanifest;

/** 
 * �������� �� ����� ���������� ������ �� ��������� ��� ��������� ��������
 */
public class TotalConsigmentPiecesType
{
    private String shipmentDescriptionCode;
    private String numberPieces;

    /** 
     * Get the 'ShipmentDescriptionCode' element value.
     * 
     * @return value
     */
    public String getShipmentDescriptionCode() {
        return shipmentDescriptionCode;
    }

    /** 
     * Set the 'ShipmentDescriptionCode' element value.
     * 
     * @param shipmentDescriptionCode
     */
    public void setShipmentDescriptionCode(String shipmentDescriptionCode) {
        this.shipmentDescriptionCode = shipmentDescriptionCode;
    }

    /** 
     * Get the 'NumberPieces' element value. ���������� ���� ������ �� ���������
     * 
     * @return value
     */
    public String getNumberPieces() {
        return numberPieces;
    }

    /** 
     * Set the 'NumberPieces' element value. ���������� ���� ������ �� ���������
     * 
     * @param numberPieces
     */
    public void setNumberPieces(String numberPieces) {
        this.numberPieces = numberPieces;
    }
}
