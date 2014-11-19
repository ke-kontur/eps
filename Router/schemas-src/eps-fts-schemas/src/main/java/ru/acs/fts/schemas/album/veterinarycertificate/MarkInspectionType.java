
package ru.acs.fts.schemas.album.veterinarycertificate;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������� � �����������-���������� ������� ��� ��������, � ���� ���������� � �� ����� ����������
 */
public class MarkInspectionType
{
    private LocalDate dateInspection;
    private String namePlace;
    private DescriptionType viewedProducts;
    private DescriptionType quantitySeized;
    private DescriptionType quantityPermitted;
    private PersonSignatureType personSignatureInspection;

    /** 
     * Get the 'DateInspection' element value. ���� �������
     * 
     * @return value
     */
    public LocalDate getDateInspection() {
        return dateInspection;
    }

    /** 
     * Set the 'DateInspection' element value. ���� �������
     * 
     * @param dateInspection
     */
    public void setDateInspection(LocalDate dateInspection) {
        this.dateInspection = dateInspection;
    }

    /** 
     * Get the 'NamePlace' element value. ������������ ������, ��� ���������� ������������ ������ (�������)
     * 
     * @return value
     */
    public String getNamePlace() {
        return namePlace;
    }

    /** 
     * Set the 'NamePlace' element value. ������������ ������, ��� ���������� ������������ ������ (�������)
     * 
     * @param namePlace
     */
    public void setNamePlace(String namePlace) {
        this.namePlace = namePlace;
    }

    /** 
     * Get the 'ViewedProducts' element value. ��������� ���������,�����
     * 
     * @return value
     */
    public DescriptionType getViewedProducts() {
        return viewedProducts;
    }

    /** 
     * Set the 'ViewedProducts' element value. ��������� ���������,�����
     * 
     * @param viewedProducts
     */
    public void setViewedProducts(DescriptionType viewedProducts) {
        this.viewedProducts = viewedProducts;
    }

    /** 
     * Get the 'QuantitySeized' element value. ���������� ������� ���������, �����, � �.�. ��-�� ���������������������, ����� � ��.           
     * 
     * @return value
     */
    public DescriptionType getQuantitySeized() {
        return quantitySeized;
    }

    /** 
     * Set the 'QuantitySeized' element value. ���������� ������� ���������, �����, � �.�. ��-�� ���������������������, ����� � ��.           
     * 
     * @param quantitySeized
     */
    public void setQuantitySeized(DescriptionType quantitySeized) {
        this.quantitySeized = quantitySeized;
    }

    /** 
     * Get the 'QuantityPermitted' element value. ���������� ���������, �����, ����������� � ����������� ���������� 
     * 
     * @return value
     */
    public DescriptionType getQuantityPermitted() {
        return quantityPermitted;
    }

    /** 
     * Set the 'QuantityPermitted' element value. ���������� ���������, �����, ����������� � ����������� ���������� 
     * 
     * @param quantityPermitted
     */
    public void setQuantityPermitted(DescriptionType quantityPermitted) {
        this.quantityPermitted = quantityPermitted;
    }

    /** 
     * Get the 'PersonSignatureInspection' element value. ������� ������������ ����, �������������� ������
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignatureInspection() {
        return personSignatureInspection;
    }

    /** 
     * Set the 'PersonSignatureInspection' element value. ������� ������������ ����, �������������� ������
     * 
     * @param personSignatureInspection
     */
    public void setPersonSignatureInspection(
            PersonSignatureType personSignatureInspection) {
        this.personSignatureInspection = personSignatureInspection;
    }
}
