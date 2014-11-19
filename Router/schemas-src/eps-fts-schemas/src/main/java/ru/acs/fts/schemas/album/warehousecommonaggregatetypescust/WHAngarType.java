
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * ����������� ��� ��� ������������ �������� ������ � ���������� ������ �� ���
 */
public class WHAngarType extends WHPlaceBaseType
{
    private String parking;
    private String angar;
    private String WHPackind;
    private String cell;

    /** 
     * Get the 'Parking' element value. ����������� �����
     * 
     * @return value
     */
    public String getParking() {
        return parking;
    }

    /** 
     * Set the 'Parking' element value. ����������� �����
     * 
     * @param parking
     */
    public void setParking(String parking) {
        this.parking = parking;
    }

    /** 
     * Get the 'Angar' element value. �����
     * 
     * @return value
     */
    public String getAngar() {
        return angar;
    }

    /** 
     * Set the 'Angar' element value. �����
     * 
     * @param angar
     */
    public void setAngar(String angar) {
        this.angar = angar;
    }

    /** 
     * Get the 'WHPackind' element value. ����� �������� ��� ����� (��� ������) / ����� ����� � ������ (��� ����������)
     * 
     * @return value
     */
    public String getWHPackind() {
        return WHPackind;
    }

    /** 
     * Set the 'WHPackind' element value. ����� �������� ��� ����� (��� ������) / ����� ����� � ������ (��� ����������)
     * 
     * @param WHPackind
     */
    public void setWHPackind(String WHPackind) {
        this.WHPackind = WHPackind;
    }

    /** 
     * Get the 'Cell' element value. ����� ������ (����������� ��� �������� �������� � ������)
     * 
     * @return value
     */
    public String getCell() {
        return cell;
    }

    /** 
     * Set the 'Cell' element value. ����� ������ (����������� ��� �������� �������� � ������)
     * 
     * @param cell
     */
    public void setCell(String cell) {
        this.cell = cell;
    }
}
