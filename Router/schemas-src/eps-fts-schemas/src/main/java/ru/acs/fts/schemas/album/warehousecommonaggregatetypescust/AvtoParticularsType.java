
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * ����������� ��� ��� �������� ������������ ��� �������������� ����������
 */
public class AvtoParticularsType
{
    private String trailerIdentifier;
    private String secondTrailerIdentifier;

    /** 
     * Get the 'TrailerIdentifier' element value. ������������� (�����) ���������� ������������� ��������
     * 
     * @return value
     */
    public String getTrailerIdentifier() {
        return trailerIdentifier;
    }

    /** 
     * Set the 'TrailerIdentifier' element value. ������������� (�����) ���������� ������������� ��������
     * 
     * @param trailerIdentifier
     */
    public void setTrailerIdentifier(String trailerIdentifier) {
        this.trailerIdentifier = trailerIdentifier;
    }

    /** 
     * Get the 'SecondTrailerIdentifier' element value. ������������� (�����) ������� ���������� ������������� ��������
     * 
     * @return value
     */
    public String getSecondTrailerIdentifier() {
        return secondTrailerIdentifier;
    }

    /** 
     * Set the 'SecondTrailerIdentifier' element value. ������������� (�����) ������� ���������� ������������� ��������
     * 
     * @param secondTrailerIdentifier
     */
    public void setSecondTrailerIdentifier(String secondTrailerIdentifier) {
        this.secondTrailerIdentifier = secondTrailerIdentifier;
    }
}
