
package ru.acs.fts.schemas.album.veterinarycertificate;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Отметки о ветеринарно-санитарном осмотре при погрузке, в пути следования и на месте назначения
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
     * Get the 'DateInspection' element value. Дата осмотра
     * 
     * @return value
     */
    public LocalDate getDateInspection() {
        return dateInspection;
    }

    /** 
     * Set the 'DateInspection' element value. Дата осмотра
     * 
     * @param dateInspection
     */
    public void setDateInspection(LocalDate dateInspection) {
        this.dateInspection = dateInspection;
    }

    /** 
     * Get the 'NamePlace' element value. Наименование пункта, где проводился ветеринарный осмотр (изъятие)
     * 
     * @return value
     */
    public String getNamePlace() {
        return namePlace;
    }

    /** 
     * Set the 'NamePlace' element value. Наименование пункта, где проводился ветеринарный осмотр (изъятие)
     * 
     * @param namePlace
     */
    public void setNamePlace(String namePlace) {
        this.namePlace = namePlace;
    }

    /** 
     * Get the 'ViewedProducts' element value. Осмотрено продуктов,сырья
     * 
     * @return value
     */
    public DescriptionType getViewedProducts() {
        return viewedProducts;
    }

    /** 
     * Set the 'ViewedProducts' element value. Осмотрено продуктов,сырья
     * 
     * @param viewedProducts
     */
    public void setViewedProducts(DescriptionType viewedProducts) {
        this.viewedProducts = viewedProducts;
    }

    /** 
     * Get the 'QuantitySeized' element value. Количество изъятых продуктов, сырья, в т.ч. из-за недоброкачественности, порчи и др.           
     * 
     * @return value
     */
    public DescriptionType getQuantitySeized() {
        return quantitySeized;
    }

    /** 
     * Set the 'QuantitySeized' element value. Количество изъятых продуктов, сырья, в т.ч. из-за недоброкачественности, порчи и др.           
     * 
     * @param quantitySeized
     */
    public void setQuantitySeized(DescriptionType quantitySeized) {
        this.quantitySeized = quantitySeized;
    }

    /** 
     * Get the 'QuantityPermitted' element value. Количество продуктов, сырья, разрешенных к дальнейшему следованию 
     * 
     * @return value
     */
    public DescriptionType getQuantityPermitted() {
        return quantityPermitted;
    }

    /** 
     * Set the 'QuantityPermitted' element value. Количество продуктов, сырья, разрешенных к дальнейшему следованию 
     * 
     * @param quantityPermitted
     */
    public void setQuantityPermitted(DescriptionType quantityPermitted) {
        this.quantityPermitted = quantityPermitted;
    }

    /** 
     * Get the 'PersonSignatureInspection' element value. Подпись должностного лица, производившего осмотр
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignatureInspection() {
        return personSignatureInspection;
    }

    /** 
     * Set the 'PersonSignatureInspection' element value. Подпись должностного лица, производившего осмотр
     * 
     * @param personSignatureInspection
     */
    public void setPersonSignatureInspection(
            PersonSignatureType personSignatureInspection) {
        this.personSignatureInspection = personSignatureInspection;
    }
}
