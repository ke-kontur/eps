
package ru.acs.fts.schemas.album.commercialact;

import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHSuppQuantityType;

/** 
 * �������� �������������� ���� ������ ���������, ���������� � ���������������������� ����������
 */
public class BruttoVolQuantType
{
    private WHSuppQuantityType bruttoVolQuantByDocs;
    private WHSuppQuantityType bruttoVolQuantByFact;

    /** 
     * Get the 'BruttoVolQuantByDocs' element value. ��� ������/����� �������� ���������������������� ����������
     * 
     * @return value
     */
    public WHSuppQuantityType getBruttoVolQuantByDocs() {
        return bruttoVolQuantByDocs;
    }

    /** 
     * Set the 'BruttoVolQuantByDocs' element value. ��� ������/����� �������� ���������������������� ����������
     * 
     * @param bruttoVolQuantByDocs
     */
    public void setBruttoVolQuantByDocs(WHSuppQuantityType bruttoVolQuantByDocs) {
        this.bruttoVolQuantByDocs = bruttoVolQuantByDocs;
    }

    /** 
     * Get the 'BruttoVolQuantByFact' element value. ��� ������/����� �����������
     * 
     * @return value
     */
    public WHSuppQuantityType getBruttoVolQuantByFact() {
        return bruttoVolQuantByFact;
    }

    /** 
     * Set the 'BruttoVolQuantByFact' element value. ��� ������/����� �����������
     * 
     * @param bruttoVolQuantByFact
     */
    public void setBruttoVolQuantByFact(WHSuppQuantityType bruttoVolQuantByFact) {
        this.bruttoVolQuantByFact = bruttoVolQuantByFact;
    }
}
