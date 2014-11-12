
package ru.acs.fts.schemas.album.legalentityinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUBranchDescriptionType;

/** 
 * Сведения об обособленном подразделении
 */
public class BranchDescriptionType extends CUBranchDescriptionType
{
    private String branchKind;
    private AddressType foreignAddress;
    private RecordDataType recordData;

    /** 
     * Get the 'BranchKind' element value. Вид подразделения: 0 - филиал; 1 - представительство
     * 
     * @return value
     */
    public String getBranchKind() {
        return branchKind;
    }

    /** 
     * Set the 'BranchKind' element value. Вид подразделения: 0 - филиал; 1 - представительство
     * 
     * @param branchKind
     */
    public void setBranchKind(String branchKind) {
        this.branchKind = branchKind;
    }

    /** 
     * Get the 'ForeignAddress' element value. Адрес места расположения за пределами территории РФ
     * 
     * @return value
     */
    public AddressType getForeignAddress() {
        return foreignAddress;
    }

    /** 
     * Set the 'ForeignAddress' element value. Адрес места расположения за пределами территории РФ
     * 
     * @param foreignAddress
     */
    public void setForeignAddress(AddressType foreignAddress) {
        this.foreignAddress = foreignAddress;
    }

    /** 
     * Get the 'RecordData' element value. Сведения о записи
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. Сведения о записи
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }
}
