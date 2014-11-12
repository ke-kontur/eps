
package ru.acs.fts.schemas.album.postalmanifest;

/** 
 * Сведения о планируемой перегрузке или грузовых операциях в пути
 */
public class ReloadInfoType
{
    private String operationDescription;
    private ReloadPlaceType reloadPlace;

    /** 
     * Get the 'OperationDescription' element value. Описание операции с грузом
     * 
     * @return value
     */
    public String getOperationDescription() {
        return operationDescription;
    }

    /** 
     * Set the 'OperationDescription' element value. Описание операции с грузом
     * 
     * @param operationDescription
     */
    public void setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
    }

    /** 
     * Get the 'ReloadPlace' element value. Место проведения грузовых и иных операций
     * 
     * @return value
     */
    public ReloadPlaceType getReloadPlace() {
        return reloadPlace;
    }

    /** 
     * Set the 'ReloadPlace' element value. Место проведения грузовых и иных операций
     * 
     * @param reloadPlace
     */
    public void setReloadPlace(ReloadPlaceType reloadPlace) {
        this.reloadPlace = reloadPlace;
    }
}
