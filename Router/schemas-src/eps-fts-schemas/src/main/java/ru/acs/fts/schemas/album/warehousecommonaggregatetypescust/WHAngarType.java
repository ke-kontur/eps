
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * Комплексный тип для расширенного описания данных о размещении товара на СВХ
 */
public class WHAngarType extends WHPlaceBaseType
{
    private String parking;
    private String angar;
    private String WHPackind;
    private String cell;

    /** 
     * Get the 'Parking' element value. Парковочное место
     * 
     * @return value
     */
    public String getParking() {
        return parking;
    }

    /** 
     * Set the 'Parking' element value. Парковочное место
     * 
     * @param parking
     */
    public void setParking(String parking) {
        this.parking = parking;
    }

    /** 
     * Get the 'Angar' element value. Ангар
     * 
     * @return value
     */
    public String getAngar() {
        return angar;
    }

    /** 
     * Set the 'Angar' element value. Ангар
     * 
     * @param angar
     */
    public void setAngar(String angar) {
        this.angar = angar;
    }

    /** 
     * Get the 'WHPackind' element value. Номер стеллажа или полки (для товара) / номер места в ангаре (для контейнера)
     * 
     * @return value
     */
    public String getWHPackind() {
        return WHPackind;
    }

    /** 
     * Set the 'WHPackind' element value. Номер стеллажа или полки (для товара) / номер места в ангаре (для контейнера)
     * 
     * @param WHPackind
     */
    public void setWHPackind(String WHPackind) {
        this.WHPackind = WHPackind;
    }

    /** 
     * Get the 'Cell' element value. Номер ячейки (заполняется при указании сведений о товаре)
     * 
     * @return value
     */
    public String getCell() {
        return cell;
    }

    /** 
     * Set the 'Cell' element value. Номер ячейки (заполняется при указании сведений о товаре)
     * 
     * @param cell
     */
    public void setCell(String cell) {
        this.cell = cell;
    }
}
