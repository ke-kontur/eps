
package ru.acs.fts.schemas.album.mistakeletter;

import org.joda.time.LocalDate;

/** 
 * �������� � ������
 */
public class LetterDetailsType
{
    private String letterName;
    private String letterNumber;
    private LocalDate letterDate;
    private String letterOrderNumber;

    /** 
     * Get the 'LetterName' element value. ������������ ������ (������, ����������� � ���������� ������� � �.�.)
     * 
     * @return value
     */
    public String getLetterName() {
        return letterName;
    }

    /** 
     * Set the 'LetterName' element value. ������������ ������ (������, ����������� � ���������� ������� � �.�.)
     * 
     * @param letterName
     */
    public void setLetterName(String letterName) {
        this.letterName = letterName;
    }

    /** 
     * Get the 'LetterNumber' element value. ����� ������ 
     * 
     * @return value
     */
    public String getLetterNumber() {
        return letterNumber;
    }

    /** 
     * Set the 'LetterNumber' element value. ����� ������ 
     * 
     * @param letterNumber
     */
    public void setLetterNumber(String letterNumber) {
        this.letterNumber = letterNumber;
    }

    /** 
     * Get the 'LetterDate' element value. ���� ������ 
     * 
     * @return value
     */
    public LocalDate getLetterDate() {
        return letterDate;
    }

    /** 
     * Set the 'LetterDate' element value. ���� ������ 
     * 
     * @param letterDate
     */
    public void setLetterDate(LocalDate letterDate) {
        this.letterDate = letterDate;
    }

    /** 
     * Get the 'LetterOrderNumber' element value. ���������� ����� ������ (��� ������� ������� � �������), ������������� � ��������� ������� ���������� ������ � ��������, ������� � ������ ������
     * 
     * @return value
     */
    public String getLetterOrderNumber() {
        return letterOrderNumber;
    }

    /** 
     * Set the 'LetterOrderNumber' element value. ���������� ����� ������ (��� ������� ������� � �������), ������������� � ��������� ������� ���������� ������ � ��������, ������� � ������ ������
     * 
     * @param letterOrderNumber
     */
    public void setLetterOrderNumber(String letterOrderNumber) {
        this.letterOrderNumber = letterOrderNumber;
    }
}
