
package ru.acs.fts.schemas.album.customsbrokercertificate;

/** 
 * Ограничения сферы деятельности
 */
public class FieldRestrictionsType
{
    private String goodsRestriction;
    private String transportRestriction;
    private String regionRestriction;
    private String procedureRestriction;

    /** 
     * Get the 'GoodsRestriction' element value. Ограничения по видам товаров в соответствии с ТН ВЭД ТС
     * 
     * @return value
     */
    public String getGoodsRestriction() {
        return goodsRestriction;
    }

    /** 
     * Set the 'GoodsRestriction' element value. Ограничения по видам товаров в соответствии с ТН ВЭД ТС
     * 
     * @param goodsRestriction
     */
    public void setGoodsRestriction(String goodsRestriction) {
        this.goodsRestriction = goodsRestriction;
    }

    /** 
     * Get the 'TransportRestriction' element value. Ограничения по видам транспорта
     * 
     * @return value
     */
    public String getTransportRestriction() {
        return transportRestriction;
    }

    /** 
     * Set the 'TransportRestriction' element value. Ограничения по видам транспорта
     * 
     * @param transportRestriction
     */
    public void setTransportRestriction(String transportRestriction) {
        this.transportRestriction = transportRestriction;
    }

    /** 
     * Get the 'RegionRestriction' element value. Ограничения по региону деятельности
     * 
     * @return value
     */
    public String getRegionRestriction() {
        return regionRestriction;
    }

    /** 
     * Set the 'RegionRestriction' element value. Ограничения по региону деятельности
     * 
     * @param regionRestriction
     */
    public void setRegionRestriction(String regionRestriction) {
        this.regionRestriction = regionRestriction;
    }

    /** 
     * Get the 'ProcedureRestriction' element value. Ограничения по видам таможенных операций
     * 
     * @return value
     */
    public String getProcedureRestriction() {
        return procedureRestriction;
    }

    /** 
     * Set the 'ProcedureRestriction' element value. Ограничения по видам таможенных операций
     * 
     * @param procedureRestriction
     */
    public void setProcedureRestriction(String procedureRestriction) {
        this.procedureRestriction = procedureRestriction;
    }
}
