
package ru.acs.fts.schemas.album.coordinationrequests;

import org.joda.time.LocalDate;

/** 
 * Информация о товаре и сработавшем на нем профиле риска, содержащем данную меру по минимизации риска
 */
public class GoodsPRInfoType
{
    private String goodsNumber;
    private String PRRegKind;
    private String PRRegCustomCode;
    private LocalDate PRRegDate;
    private String PRRegNumber;
    private String PRVersion;
    private String PRPointCode;

    /** 
     * Get the 'GoodsNumber' element value. Порядковый номер товара, для которого необходимо применить меру по конкретному ПР. Для партии товаров - 0.
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. Порядковый номер товара, для которого необходимо применить меру по конкретному ПР. Для партии товаров - 0.
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the 'PRRegKind' element value. Тип профиля риска (часть рег. номера)
     * 
     * @return value
     */
    public String getPRRegKind() {
        return PRRegKind;
    }

    /** 
     * Set the 'PRRegKind' element value. Тип профиля риска (часть рег. номера)
     * 
     * @param PRRegKind
     */
    public void setPRRegKind(String PRRegKind) {
        this.PRRegKind = PRRegKind;
    }

    /** 
     * Get the 'PRRegCustomCode' element value. Код ТО, в котором зарегистрирован ПР (часть рег. номера)
     * 
     * @return value
     */
    public String getPRRegCustomCode() {
        return PRRegCustomCode;
    }

    /** 
     * Set the 'PRRegCustomCode' element value. Код ТО, в котором зарегистрирован ПР (часть рег. номера)
     * 
     * @param PRRegCustomCode
     */
    public void setPRRegCustomCode(String PRRegCustomCode) {
        this.PRRegCustomCode = PRRegCustomCode;
    }

    /** 
     * Get the 'PRRegDate' element value. Дата регистрации ПР (часть рег. номера)
     * 
     * @return value
     */
    public LocalDate getPRRegDate() {
        return PRRegDate;
    }

    /** 
     * Set the 'PRRegDate' element value. Дата регистрации ПР (часть рег. номера)
     * 
     * @param PRRegDate
     */
    public void setPRRegDate(LocalDate PRRegDate) {
        this.PRRegDate = PRRegDate;
    }

    /** 
     * Get the 'PRRegNumber' element value. Порядковый номер ПР (часть рег. номера)
     * 
     * @return value
     */
    public String getPRRegNumber() {
        return PRRegNumber;
    }

    /** 
     * Set the 'PRRegNumber' element value. Порядковый номер ПР (часть рег. номера)
     * 
     * @param PRRegNumber
     */
    public void setPRRegNumber(String PRRegNumber) {
        this.PRRegNumber = PRRegNumber;
    }

    /** 
     * Get the 'PRVersion' element value. Номер версии ПР (часть рег. номера)
     * 
     * @return value
     */
    public String getPRVersion() {
        return PRVersion;
    }

    /** 
     * Set the 'PRVersion' element value. Номер версии ПР (часть рег. номера)
     * 
     * @param PRVersion
     */
    public void setPRVersion(String PRVersion) {
        this.PRVersion = PRVersion;
    }

    /** 
     * Get the 'PRPointCode' element value. Момент выявления ПР. Допустимые значения: 00 – при регистрации ДТ; 10 – выпуск товаров (первоначально принимаемое решение, за исключением выпуска под обеспечение уплаты таможенных платежей); 11 – выпуск под обеспечение уплаты таможенных платежей (хотя бы по одному из товаров первоначальное решение 11); 20 – окончательный выпуск товаров (смена первоначально принятого решения о выпуске под обеспечение на окончательный выпуск). 99 – в процессе проведения таможенного оформления и таможенного контроля (самостоятельно выявленный ПР)'
     * 
     * @return value
     */
    public String getPRPointCode() {
        return PRPointCode;
    }

    /** 
     * Set the 'PRPointCode' element value. Момент выявления ПР. Допустимые значения: 00 – при регистрации ДТ; 10 – выпуск товаров (первоначально принимаемое решение, за исключением выпуска под обеспечение уплаты таможенных платежей); 11 – выпуск под обеспечение уплаты таможенных платежей (хотя бы по одному из товаров первоначальное решение 11); 20 – окончательный выпуск товаров (смена первоначально принятого решения о выпуске под обеспечение на окончательный выпуск). 99 – в процессе проведения таможенного оформления и таможенного контроля (самостоятельно выявленный ПР)'
     * 
     * @param PRPointCode
     */
    public void setPRPointCode(String PRPointCode) {
        this.PRPointCode = PRPointCode;
    }
}
