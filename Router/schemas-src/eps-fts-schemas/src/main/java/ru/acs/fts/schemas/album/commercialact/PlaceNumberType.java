
package ru.acs.fts.schemas.album.commercialact;

/** 
 * �������� �������������� ���������� ���� ������ ���������, ���������� � ���������������������� ����������
 */
public class PlaceNumberType
{
    private String placeNumberByDocs;
    private String placeNumberByFact;

    /** 
     * Get the 'PlaceNumberByDocs' element value. ���������� �������� ���� �������� ���������������������� ����������
     * 
     * @return value
     */
    public String getPlaceNumberByDocs() {
        return placeNumberByDocs;
    }

    /** 
     * Set the 'PlaceNumberByDocs' element value. ���������� �������� ���� �������� ���������������������� ����������
     * 
     * @param placeNumberByDocs
     */
    public void setPlaceNumberByDocs(String placeNumberByDocs) {
        this.placeNumberByDocs = placeNumberByDocs;
    }

    /** 
     * Get the 'PlaceNumberByFact' element value. ���������� �������� ���� �����������
     * 
     * @return value
     */
    public String getPlaceNumberByFact() {
        return placeNumberByFact;
    }

    /** 
     * Set the 'PlaceNumberByFact' element value. ���������� �������� ���� �����������
     * 
     * @param placeNumberByFact
     */
    public void setPlaceNumberByFact(String placeNumberByFact) {
        this.placeNumberByFact = placeNumberByFact;
    }
}
