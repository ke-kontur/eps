
package ru.acs.fts.schemas.album.actinspectionin;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.PackingInformationType;

/** 
 * АТД - сведения об упаковках
 */
public class InspPackageType extends PackingInformationType
{
    private String packageDescription;
    private String packDestructFlag;
    private String packDestructDesc;
    private String recordNumber;

    /** 
     * Get the 'PackageDescription' element value. Описание упаковки и расфасовки товара
     * 
     * @return value
     */
    public String getPackageDescription() {
        return packageDescription;
    }

    /** 
     * Set the 'PackageDescription' element value. Описание упаковки и расфасовки товара
     * 
     * @param packageDescription
     */
    public void setPackageDescription(String packageDescription) {
        this.packageDescription = packageDescription;
    }

    /** 
     * Get the 'PackDestructFlag' element value. Признак наличия повреждений товаров и упаковки 0 - повреждений нет 1 - повреждения есть
     * 
     * @return value
     */
    public String getPackDestructFlag() {
        return packDestructFlag;
    }

    /** 
     * Set the 'PackDestructFlag' element value. Признак наличия повреждений товаров и упаковки 0 - повреждений нет 1 - повреждения есть
     * 
     * @param packDestructFlag
     */
    public void setPackDestructFlag(String packDestructFlag) {
        this.packDestructFlag = packDestructFlag;
    }

    /** 
     * Get the 'PackDestructDesc' element value. Описание повреждений упаковки
     * 
     * @return value
     */
    public String getPackDestructDesc() {
        return packDestructDesc;
    }

    /** 
     * Set the 'PackDestructDesc' element value. Описание повреждений упаковки
     * 
     * @param packDestructDesc
     */
    public void setPackDestructDesc(String packDestructDesc) {
        this.packDestructDesc = packDestructDesc;
    }

    /** 
     * Get the 'RecordNumber' element value. Порядковый номер записи в таблице БД
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. Порядковый номер записи в таблице БД
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }
}
