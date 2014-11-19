
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

/** 
 * �������� ����� � ������
 */
public class MarkUpType
{
    private String delimiter;
    private String word;
    private String weight;

    /** 
     * Get the 'Delimiter' element value. �����������, ����������� ����� Word. ����� �������������
     * 
     * @return value
     */
    public String getDelimiter() {
        return delimiter;
    }

    /** 
     * Set the 'Delimiter' element value. �����������, ����������� ����� Word. ����� �������������
     * 
     * @param delimiter
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /** 
     * Get the 'Word' element value. �������������� �����
     * 
     * @return value
     */
    public String getWord() {
        return word;
    }

    /** 
     * Set the 'Word' element value. �������������� �����
     * 
     * @param word
     */
    public void setWord(String word) {
        this.word = word;
    }

    /** 
     * Get the 'Weight' element value. ���������� �����. �������� �� 0 �� 16. ������ �� ���� ��������� ����� � ����� ����������� ������
     * 
     * @return value
     */
    public String getWeight() {
        return weight;
    }

    /** 
     * Set the 'Weight' element value. ���������� �����. �������� �� 0 �� 16. ������ �� ���� ��������� ����� � ����� ����������� ������
     * 
     * @param weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }
}
