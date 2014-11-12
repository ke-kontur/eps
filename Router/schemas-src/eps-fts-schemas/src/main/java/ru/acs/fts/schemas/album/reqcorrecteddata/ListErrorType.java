
package ru.acs.fts.schemas.album.reqcorrecteddata;

/** 
 * Список ошибок, подлежащих исправлению
 */
public class ListErrorType
{
    private String errCode;
    private String errorName;
    private String errDescription;
    private String GTDGoodsNumber;
    private String errElement;
    private String errField;
    private String successContent;
    private String errLevel;
    private String codeOrder;
    private String errElementDesc;
    private String correctValue;

    /** 
     * Get the 'ErrCode' element value. Код ошибки.
     * 
     * @return value
     */
    public String getErrCode() {
        return errCode;
    }

    /** 
     * Set the 'ErrCode' element value. Код ошибки.
     * 
     * @param errCode
     */
    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    /** 
     * Get the 'ErrorName' element value. Наименование ошибки.
     * 
     * @return value
     */
    public String getErrorName() {
        return errorName;
    }

    /** 
     * Set the 'ErrorName' element value. Наименование ошибки.
     * 
     * @param errorName
     */
    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }

    /** 
     * Get the 'ErrDescription' element value. Подробное описание ошибки
     * 
     * @return value
     */
    public String getErrDescription() {
        return errDescription;
    }

    /** 
     * Set the 'ErrDescription' element value. Подробное описание ошибки
     * 
     * @param errDescription
     */
    public void setErrDescription(String errDescription) {
        this.errDescription = errDescription;
    }

    /** 
     * Get the 'GTDGoodsNumber' element value. Номер товара по ДТ/списку
     * 
     * @return value
     */
    public String getGTDGoodsNumber() {
        return GTDGoodsNumber;
    }

    /** 
     * Set the 'GTDGoodsNumber' element value. Номер товара по ДТ/списку
     * 
     * @param GTDGoodsNumber
     */
    public void setGTDGoodsNumber(String GTDGoodsNumber) {
        this.GTDGoodsNumber = GTDGoodsNumber;
    }

    /** 
     * Get the 'ErrElement' element value. Имя ошибочного узла/элемента/атрибута 
     * 
     * @return value
     */
    public String getErrElement() {
        return errElement;
    }

    /** 
     * Set the 'ErrElement' element value. Имя ошибочного узла/элемента/атрибута 
     * 
     * @param errElement
     */
    public void setErrElement(String errElement) {
        this.errElement = errElement;
    }

    /** 
     * Get the 'ErrField' element value. Номер графы ДТ/ДТС/КТС
     * 
     * @return value
     */
    public String getErrField() {
        return errField;
    }

    /** 
     * Set the 'ErrField' element value. Номер графы ДТ/ДТС/КТС
     * 
     * @param errField
     */
    public void setErrField(String errField) {
        this.errField = errField;
    }

    /** 
     * Get the 'SuccessContent' element value. Верное значение
     * 
     * @return value
     */
    public String getSuccessContent() {
        return successContent;
    }

    /** 
     * Set the 'SuccessContent' element value. Верное значение
     * 
     * @param successContent
     */
    public void setSuccessContent(String successContent) {
        this.successContent = successContent;
    }

    /** 
     * Get the 'ErrLevel' element value. Уровень ошибки
     * 
     * @return value
     */
    public String getErrLevel() {
        return errLevel;
    }

    /** 
     * Set the 'ErrLevel' element value. Уровень ошибки
     * 
     * @param errLevel
     */
    public void setErrLevel(String errLevel) {
        this.errLevel = errLevel;
    }

    /** 
     * Get the 'CodeOrder' element value. Код нормативного документа
     * 
     * @return value
     */
    public String getCodeOrder() {
        return codeOrder;
    }

    /** 
     * Set the 'CodeOrder' element value. Код нормативного документа
     * 
     * @param codeOrder
     */
    public void setCodeOrder(String codeOrder) {
        this.codeOrder = codeOrder;
    }

    /** 
     * Get the 'ErrElementDesc' element value. Описание поля в котором найдена ошибка
     * 
     * @return value
     */
    public String getErrElementDesc() {
        return errElementDesc;
    }

    /** 
     * Set the 'ErrElementDesc' element value. Описание поля в котором найдена ошибка
     * 
     * @param errElementDesc
     */
    public void setErrElementDesc(String errElementDesc) {
        this.errElementDesc = errElementDesc;
    }

    /** 
     * Get the 'CorrectValue' element value. Верное (ожидаемое) значение
     * 
     * @return value
     */
    public String getCorrectValue() {
        return correctValue;
    }

    /** 
     * Set the 'CorrectValue' element value. Верное (ожидаемое) значение
     * 
     * @param correctValue
     */
    public void setCorrectValue(String correctValue) {
        this.correctValue = correctValue;
    }
}
