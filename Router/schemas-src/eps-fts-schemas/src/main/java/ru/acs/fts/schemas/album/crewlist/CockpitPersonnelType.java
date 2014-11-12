
package ru.acs.fts.schemas.album.crewlist;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ��������� ������ �������
 */
public class CockpitPersonnelType extends PersonBaseType
{
    private String persNumeric;
    private String nationality;
    private String birthPlace;
    private LocalDate dateofBirth;
    private IdentityCardType document;

    /** 
     * Get the 'PersNumeric' element value. ���������� ����� (1- ����� ��������)
     * 
     * @return value
     */
    public String getPersNumeric() {
        return persNumeric;
    }

    /** 
     * Set the 'PersNumeric' element value. ���������� ����� (1- ����� ��������)
     * 
     * @param persNumeric
     */
    public void setPersNumeric(String persNumeric) {
        this.persNumeric = persNumeric;
    }

    /** 
     * Get the 'Nationality' element value. ����������� (����� ��� ������)
     * 
     * @return value
     */
    public String getNationality() {
        return nationality;
    }

    /** 
     * Set the 'Nationality' element value. ����������� (����� ��� ������)
     * 
     * @param nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /** 
     * Get the 'BirthPlace' element value. ����� ��������
     * 
     * @return value
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /** 
     * Set the 'BirthPlace' element value. ����� ��������
     * 
     * @param birthPlace
     */
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    /** 
     * Get the 'DateofBirth' element value. ���� ��������
     * 
     * @return value
     */
    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    /** 
     * Set the 'DateofBirth' element value. ���� ��������
     * 
     * @param dateofBirth
     */
    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    /** 
     * Get the 'Document' element value. ��� � ����� ���������, ��������������� �������� ����� �������
     * 
     * @return value
     */
    public IdentityCardType getDocument() {
        return document;
    }

    /** 
     * Set the 'Document' element value. ��� � ����� ���������, ��������������� �������� ����� �������
     * 
     * @param document
     */
    public void setDocument(IdentityCardType document) {
        this.document = document;
    }
}
